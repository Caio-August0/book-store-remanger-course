package com.caio.bookstoreremagercourse.repository;

import com.caio.bookstoreremagercourse.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
