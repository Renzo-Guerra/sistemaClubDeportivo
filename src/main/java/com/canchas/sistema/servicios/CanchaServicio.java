package com.canchas.sistema.servicios;

import com.canchas.sistema.advice.excepciones.ExcDeporteInvalido;
import com.canchas.sistema.modelo.DTOs.canchaDTOs.request.AgregarCanchaDTO;
import com.canchas.sistema.modelo.DTOs.canchaDTOs.response.CanchaAgregadaDTO;
import com.canchas.sistema.repositorios.CanchaRepositorio;
import com.canchas.sistema.modelo.entidades.Cancha;
import com.canchas.sistema.utils.Horario;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
public class CanchaServicio {
    private final CanchaRepositorio canchaRepositorio;
    public CanchaServicio(CanchaRepositorio canchaRepositorio){
        this.canchaRepositorio = canchaRepositorio;
    }

    public CanchaAgregadaDTO agregarCancha(@Validated AgregarCanchaDTO request) throws ExcDeporteInvalido {
        String deporteSeleccionado = request.deporte().toLowerCase();
        this.tipoCanchaValida(deporteSeleccionado);
        Cancha nuevaCancha =  this.canchaRepositorio.save(new Cancha(deporteSeleccionado, request.ubicacionPredio(), request.capacidadMaxima(), request.duracionTurnoMinutos()));

        return new CanchaAgregadaDTO(nuevaCancha.getId(), nuevaCancha.getDeporte(), nuevaCancha.getUbicacionPredio(), nuevaCancha.getCapacidadMaxima(), nuevaCancha.getDuracionTurnoMinutos());
    }

    public void reservarCancha(String tipoCancha,int mes, int dia, Horario horarioInicio, int cantIntegrantes) throws ExcDeporteInvalido{
        tipoCancha = tipoCancha.toLowerCase();
        this.tipoCanchaValida(tipoCancha);
    }

    public void tipoCanchaValida(String tipoCancha) throws ExcDeporteInvalido {
        if(!tipoCancha.equals("futbol") &&
           !tipoCancha.equals("tenis") &&
           !tipoCancha.equals("bochas")) throw new ExcDeporteInvalido(tipoCancha);
    }

    public List<CanchaAgregadaDTO> traerCanchas() {
        return this.canchaRepositorio.traerTodasLasCanchas();
    }
}
