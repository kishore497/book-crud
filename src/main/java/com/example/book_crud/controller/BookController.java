package com.example.book_crud.controller;

import com.example.book_crud.model.Book;
import com.example.book_crud.service.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("get/{bookId}")
    public Book getBook(@PathVariable int bookId) {
        return bookService.getBook(bookId);
    }

    @PutMapping("/update/{bookId}")
    public Book updateBook(@RequestBody Book book,@PathVariable int bookId) {
        return bookService.updateBook(book, bookId);
    }

    @DeleteMapping("/delete/{bookId}")
    public void deleteBook(@PathVariable int bookId) {
        bookService.deleteBook(bookId);
    }

}
