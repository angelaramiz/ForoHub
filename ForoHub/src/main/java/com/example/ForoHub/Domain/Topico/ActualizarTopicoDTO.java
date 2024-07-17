package com.example.ForoHub.Domain.Topico;

import java.time.LocalDateTime;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        String status,
        String curso
) {

}