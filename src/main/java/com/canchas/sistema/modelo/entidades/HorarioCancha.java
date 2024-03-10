package com.canchas.sistema.modelo.entidades;

import com.canchas.sistema.modelo.entidadesIDs.IdHorarioCancha;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(IdHorarioCancha.class)
public class HorarioCancha {
    @Id
    private Long idHorario;
    @Id
    private Long idCancha;
    @NonNull
    private String dia;
    @NonNull
    private Date inicio;
    @NonNull
    private Date fin;
}
