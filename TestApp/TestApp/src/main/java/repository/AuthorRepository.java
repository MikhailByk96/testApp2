package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testapp.model.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
}
