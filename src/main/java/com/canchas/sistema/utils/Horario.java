package com.canchas.sistema.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor()
public class Horario {
    private int hora;
    private int minuto;

    private boolean horaValida(int hora){
        return (hora >= 0 && hora <= 23);
    }

    private boolean minutoValido(int minuto){
        return (minuto >= 0 && minuto <= 59);
    }

    public void setHora(int hora) throws Error {
        if(!this.horaValida(hora)) throw new Error("Hora invalida!");

        this.hora = hora;
    }

    public void setMinuto(int minuto) throws Error {
        if(!this.minutoValido(minuto)) throw new Error("Minuto invalido!");

        this.minuto = minuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return hora == horario.hora && minuto == horario.minuto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, minuto);
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }
}
