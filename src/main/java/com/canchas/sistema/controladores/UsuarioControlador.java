package com.canchas.sistema.controladores;

import com.canchas.sistema.modelo.DTOs.canchaDTOs.request.AgregarCanchaDTO;
import com.canchas.sistema.modelo.DTOs.canchaDTOs.response.CanchaAgregadaDTO;
import com.canchas.sistema.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/usuario")
public class UsuarioControlador {
    private UsuarioServicio usuarioServicio;

    @Autowired
    public UsuarioControlador(UsuarioServicio usuarioServicio){
        this.usuarioServicio = usuarioServicio;
    }


//    public ResponseEntity<CanchaAgregadaDTO> agregarCancha(@RequestBody @Validated AgregarCanchaDTO request){
//        return new ResponseEntity<CanchaAgregadaDTO>(this.usuarioServicio.reservarCancha(request), HttpStatus.CREATED);
//    }
}
