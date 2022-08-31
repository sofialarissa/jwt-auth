package br.com.sofialarissa.jwt.controller;

import br.com.sofialarissa.jwt.model.CourseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping
    public CourseResponse getCourse() {
        return new CourseResponse("Segurança e Proteção de Software e de Informação", "Sofia Larissa", LocalDateTime.now());
    }

}
