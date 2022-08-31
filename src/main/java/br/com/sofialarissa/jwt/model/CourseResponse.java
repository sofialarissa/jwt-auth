package br.com.sofialarissa.jwt.model;

import java.time.LocalDateTime;

public class CourseResponse {

    public String name;
    public String professor;
    public LocalDateTime date;

    public CourseResponse(String name, String professor, LocalDateTime date) {
        this.name = name;
        this.professor = professor;
        this.date = date;
    }

}
