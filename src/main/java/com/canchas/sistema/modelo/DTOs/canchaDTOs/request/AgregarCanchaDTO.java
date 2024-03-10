package com.canchas.sistema.modelo.DTOs.canchaDTOs.request;

import lombok.NonNull;


public record AgregarCanchaDTO (@NonNull() String deporte,
                               @NonNull() String ubicacionPredio,
                               int capacidadMaxima,
                               int duracionTurnoMinutos){ }
