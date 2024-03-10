package com.canchas.sistema.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "cancha")
public class Cancha {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String deporte;
    private String ubicacionPredio;
    private int capacidadMaxima;
    private int duracionTurnoMinutos;

    public Cancha(@NonNull String deporte, @NonNull String ubicacionPredio, int capacidadMaxima, int duracionTurnoMinutos){
        this.deporte = deporte;
        this.ubicacionPredio = ubicacionPredio;
        this.capacidadMaxima = capacidadMaxima;
        this.duracionTurnoMinutos = duracionTurnoMinutos;
    }
}
