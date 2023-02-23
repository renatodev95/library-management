package com.librarymanagement;

import com.librarymanagement.dto.BookDTO;
import com.librarymanagement.dto.mapper.BookMapper;
import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.service.BookLoaderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LibraryManagementSystemApplication {

    private final BookLoaderService bookLoaderService;
    private final BookMapper bookMapper;

    public LibraryManagementSystemApplication(BookLoaderService bookLoaderService, BookMapper bookMapper) {
        this.bookLoaderService = bookLoaderService;
        this.bookMapper = bookMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepository) {
        return args -> {
            bookRepository.deleteAll();
            List<BookDTO> bookDTOS = bookLoaderService.loadBooksFromFile("books.json");
            for (BookDTO bookDTO : bookDTOS) {
                bookRepository.save(bookMapper.toEntity(bookDTO));
            }
            
        };
    }
}
