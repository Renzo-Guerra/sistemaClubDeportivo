package com.canchas.sistema.repositorios;

import com.canchas.sistema.modelo.DTOs.canchaDTOs.request.AgregarCanchaDTO;
import com.canchas.sistema.modelo.DTOs.canchaDTOs.response.CanchaAgregadaDTO;
import com.canchas.sistema.modelo.entidades.Cancha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CanchaRepositorio extends JpaRepository<Cancha, Long> {
    @Query("""
            SELECT new com.canchas.sistema.modelo.DTOs.canchaDTOs.response.CanchaAgregadaDTO(c.id, c.deporte, c.ubicacionPredio, c.capacidadMaxima, c.duracionTurnoMinutos)
            FROM Cancha c
            """)
    List<CanchaAgregadaDTO> traerTodasLasCanchas();

}