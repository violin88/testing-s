package de.rieckpil.courses.book.management;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Long, Book> {
}
