package com.sha.springbootmicroservice1course.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

//Note that the model package is responsible for persisting data into the database using either hibernate or jpa
@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "subtitle", length = 100, nullable = false)
    private String subtitle;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;
}
