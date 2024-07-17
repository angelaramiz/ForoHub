package com.example.ForoHub.Domain.Topico;

import java.time.LocalDateTime;

public record ResponseTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion
) {

    public ResponseTopicoDTO(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion()
        );
    }
}