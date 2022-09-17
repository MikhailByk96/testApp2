package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testapp.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Long> {

    UserModel findByLogin(String login);
}
