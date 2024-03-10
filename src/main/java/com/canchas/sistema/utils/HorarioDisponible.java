package com.canchas.sistema.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HorarioDisponible {
    private Horario horarioApertura;
    private Horario horarioCierre;

    public HorarioDisponible(Horario horarioApertura, Horario horarioCierre) {
        if(horarioApertura == null || horarioCierre == null) throw new Error("Se intento asignar un null a horario!");

        this.setHorarioApertura(horarioApertura);
        this.setHorarioCierre(horarioCierre);
    }

    public HorarioDisponible(HorarioDisponible nuevoHorarioDisponible) {
        if(nuevoHorarioDisponible == null) throw new Error("Se intento asignar un null a horario!");

        this.setHorarioApertura(nuevoHorarioDisponible.getHorarioApertura());
        this.setHorarioCierre(nuevoHorarioDisponible.getHorarioCierre());
    }

    @Override
    public String toString() {
        return "{" + "apertura = " + this.getHorarioApertura() + " | " + " cierre = " + this.getHorarioCierre() + '}';
    }
}
