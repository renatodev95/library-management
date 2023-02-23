package com.librarymanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookDTO(
        @JsonProperty("_id") Long id,
        @NotNull @NotBlank String title,
        @NotNull @NotBlank String author,
        @NotNull Integer publicationYear,
        @NotNull @NotBlank String genre,
        @NotNull Integer pageCount,
        @NotNull @NotBlank String thumbnailUrl,
        @NotNull @NotBlank String publisher
) {

}
