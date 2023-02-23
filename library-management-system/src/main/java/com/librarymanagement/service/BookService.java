package com.librarymanagement.service;

import com.librarymanagement.dto.BookDTO;
import com.librarymanagement.dto.mapper.BookMapper;
import com.librarymanagement.exception.RecordNotFoundException;
import com.librarymanagement.repository.BookRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Validated
@Service
public class BookService {
    
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }
    
    public List<BookDTO> list() {
        return bookRepository.findAll().stream().map(bookMapper::toDTO).toList();
    }
    
    public BookDTO findById(@PathVariable @NotNull @Positive Long id) {
        return bookRepository.findById(id).map(bookMapper::toDTO).orElseThrow(() -> new RecordNotFoundException(id));
    }
    
    public BookDTO create(@Valid @NotNull BookDTO bookDTO) {
        return bookMapper.toDTO(bookRepository.save(bookMapper.toEntity(bookDTO)));
    }
}
