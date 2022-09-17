package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testapp.model.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Long> {
}
