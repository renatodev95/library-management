package com.librarymanagement.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.librarymanagement.dto.BookDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class BookLoaderService {
    private final ObjectMapper objectMapper;

    public BookLoaderService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<BookDTO> loadBooksFromFile(String filename) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);

        TypeReference<List<BookDTO>> typeReference = new TypeReference<>() {
        };
        return objectMapper.readValue(inputStream, typeReference);
    }
}
