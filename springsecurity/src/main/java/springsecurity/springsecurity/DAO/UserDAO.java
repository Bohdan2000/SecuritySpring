package springsecurity.springsecurity.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.springsecurity.models.User;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
