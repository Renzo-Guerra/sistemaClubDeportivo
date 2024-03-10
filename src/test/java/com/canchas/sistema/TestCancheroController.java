package com.canchas.sistema;

import com.canchas.sistema.controladores.CancheroControlador;
import com.canchas.sistema.modelo.entidades.Cancha;
import com.canchas.sistema.servicios.CanchaServicio;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CancheroControlador.class)
public class TestCancheroController {
    private static final String END_POINT = "/canchero";

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;
    @MockBean
    private CanchaServicio mockCanchaServicio;

    @Test
    void crearCanchaConValoresValidos() throws Exception {
        Cancha nuevaCancha = new Cancha("futbol", "lateral derecho", 10, 60);

        String requestBody = mapper.writeValueAsString(nuevaCancha);

        mockMvc.perform(post(END_POINT)
                .contentType("application/json")
                .content(requestBody))
                .andExpect(status().isCreated());
    }
}
