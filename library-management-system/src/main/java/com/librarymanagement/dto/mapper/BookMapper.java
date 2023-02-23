package com.librarymanagement.dto.mapper;

import com.librarymanagement.dto.BookDTO;
import com.librarymanagement.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookDTO toDTO(Book book) {
        if (book == null) {
            return null;
        }
        return new BookDTO(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublicationYear(),
                book.getGenre(),
                book.getPageCount(),
                book.getThumbnailUrl(),
                book.getPublisher());
    }

    public Book toEntity(BookDTO bookDTO) {

        if (bookDTO == null) {
            return null;
        }

        Book book = new Book();
        if (bookDTO.id() != null) {
            book.setId(bookDTO.id());
        }
        book.setTitle(bookDTO.title());
        book.setAuthor(bookDTO.author());
        book.setPublicationYear(bookDTO.publicationYear());
        book.setGenre(bookDTO.genre());
        book.setPageCount(bookDTO.pageCount());
        book.setThumbnailUrl(bookDTO.thumbnailUrl());
        book.setPublisher(bookDTO.publisher());
        return book;
    }
}
