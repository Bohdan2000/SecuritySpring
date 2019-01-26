package springsecurity.springsecurity.Service;


import org.springframework.security.core.userdetails.UserDetailsService;
import springsecurity.springsecurity.models.User;

public interface UserService extends UserDetailsService {

    void save(User user);

}
