package com.demo.lms.lms.model;

import jakarta.persistence.*;
import lombok.*;

// Book Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String author;

    private boolean borrowed = false;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User borrowedBy;
}

