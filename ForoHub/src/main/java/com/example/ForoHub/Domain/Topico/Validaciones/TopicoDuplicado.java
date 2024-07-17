package com.example.ForoHub.Domain.Topico.Validaciones;

import com.example.ForoHub.Domain.Topico.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TopicoDuplicado implements ValidadorDeTopicos{

    @Autowired
    private TopicoRepository repositorio;

    @Override
    public void validarTopico(String titulo, String mensaje) {

        if (repositorio.existsByTituloAndMensaje(titulo, mensaje)){
            throw new ValidationException("Este topico ya existe");
        }

    }

}