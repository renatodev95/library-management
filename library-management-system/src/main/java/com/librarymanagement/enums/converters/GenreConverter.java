package com.librarymanagement.enums.converters;

import com.librarymanagement.enums.Genre;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class GenreConverter implements AttributeConverter<Genre, String> {
    
    @Override
    public String convertToDatabaseColumn(Genre genre) {
        if (genre == null) {
            return null;
        }
        return genre.getValue();
    }

    @Override
    public Genre convertToEntityAttribute(String value) {
        if (value == null) {
            return null;
        }
        return Stream.of(Genre.values())
                .filter(genre -> genre.getValue().equals(value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
