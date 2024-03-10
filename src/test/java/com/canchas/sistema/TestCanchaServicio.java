package com.canchas.sistema;

import com.canchas.sistema.advice.excepciones.ExcDeporteInvalido;
import com.canchas.sistema.servicios.CanchaServicio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCanchaServicio {
    private CanchaServicio canchaServicio;
    @Autowired
    public TestCanchaServicio(CanchaServicio canchaServicio){
        this.canchaServicio = canchaServicio;
    }

    @Test
    void tipoCanchaInvalida() {
        Assertions.assertThrows(ExcDeporteInvalido.class, () -> this.canchaServicio.tipoCanchaValida("volley"));
    }

    @Test
    void tipoCanchaValida() {
        try{
            this.canchaServicio.tipoCanchaValida("futbol");
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
