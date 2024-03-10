package com.canchas.sistema.modelo.entidadesIDs;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class IdHorarioCancha implements Serializable {
    @Id
    private Long idHorario;
    @Id
    private Long idCancha;
}
