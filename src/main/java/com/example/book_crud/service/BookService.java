package com.example.book_crud.service;

import com.example.book_crud.model.Book;
import com.example.book_crud.repo.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBook(int bookId) {
        return bookRepository.findById(bookId).get();
    }

    public Book updateBook(Book book, int bookId) {
        book.setBookId(bookId);
        return bookRepository.save(book);
    }

    public void deleteBook(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
