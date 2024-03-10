package com.canchas.sistema.controladores;

import com.canchas.sistema.advice.excepciones.ExcDeporteInvalido;
import com.canchas.sistema.modelo.DTOs.canchaDTOs.request.AgregarCanchaDTO;
import com.canchas.sistema.modelo.DTOs.canchaDTOs.response.CanchaAgregadaDTO;
import com.canchas.sistema.modelo.entidades.Cancha;
import com.canchas.sistema.servicios.CanchaServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/canchero")
public class CancheroControlador {
    private final CanchaServicio canchaServicio;

    public CancheroControlador(CanchaServicio canchaServicio){
        this.canchaServicio = canchaServicio;
    }

    @PostMapping("/cancha")
    public ResponseEntity<CanchaAgregadaDTO> agregarCancha(@RequestBody @Validated AgregarCanchaDTO request) throws ExcDeporteInvalido {
        return new ResponseEntity<>(this.canchaServicio.agregarCancha(request), HttpStatus.CREATED);
    }

    @GetMapping("/canchas")
    public ResponseEntity<List<CanchaAgregadaDTO>> traerCanchas(){
        return new ResponseEntity<List<CanchaAgregadaDTO>>(this.canchaServicio.traerCanchas(), HttpStatus.OK);
    }
}
