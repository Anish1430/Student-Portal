package com.Anish.Create.a.Portal.service;

import com.Anish.Create.a.Portal.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
}