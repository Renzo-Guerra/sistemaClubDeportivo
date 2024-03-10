package com.canchas.sistema.modelo.DTOs.canchaDTOs.response;

import lombok.*;


public record CanchaAgregadaDTO (@NonNull Long id,
                                 @NonNull String deporte,
                                 @NonNull String ubicacionPredio,
                                 int capacidadMaxima,
                                 int duracionTurnoMinutos){ }
