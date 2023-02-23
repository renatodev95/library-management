package com.librarymanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String author;

    @NotNull
    private Integer publicationYear;

    @NotNull
    @NotBlank
    private String genre;

    @NotNull
    private Integer pageCount;

    @NotNull
    @NotBlank
    private String thumbnailUrl;

    @NotNull
    @NotBlank
    private String publisher;
}
