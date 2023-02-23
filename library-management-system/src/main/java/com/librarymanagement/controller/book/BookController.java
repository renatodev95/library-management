package com.librarymanagement.controller.book;

import com.librarymanagement.dto.BookDTO;
import com.librarymanagement.service.BookService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("api/book")
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public @ResponseBody List<BookDTO> listAll() {
        return bookService.list();
    }
    
    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable @NotNull @Positive Long id) {
        return bookService.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public BookDTO create(@RequestBody @Valid @NotNull BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }
}
