package com.canchas.sistema.advice.excepciones;

public class ExcDeporteInvalido extends Exception {
    public ExcDeporteInvalido(String deporteIngresado) {
        super("Error: Se ingreso '" + deporteIngresado + "' como deporte. El deporte debe ser 'futbol', 'tenis' o 'bochas'.");
    }
}
