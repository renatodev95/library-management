package com.librarymanagement;

import com.librarymanagement.model.Book;
import com.librarymanagement.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepository) {
        return args -> {
            bookRepository.deleteAll();
            Book b = new Book();
            b.setTitle("O guia do mochileiro das galáxias (O mochileiro das galáxias – Livro 1)");
            b.setAuthor("Douglas Adams");
            b.setPublicationYear(2007);
            b.setGenre("Ficção Científica");
            b.setPageCount(208);
            b.setThumbnailUrl("https://m.media-amazon.com/images/I/41D2p1NDFkL._SY344_BO1,204,203,200_QL70_ML2_.jpg");
            b.setIsbn(Long.valueOf("9788599296578"));
            b.setPublisher("Editora Arqueiro");
            b.setLanguage("Português");
            bookRepository.save(b);
        };
    }
}
