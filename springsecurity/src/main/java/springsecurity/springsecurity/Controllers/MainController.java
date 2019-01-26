package springsecurity.springsecurity.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import springsecurity.springsecurity.Service.ServiceImpl.UserServiceImpl;
import springsecurity.springsecurity.Service.UserService;
import springsecurity.springsecurity.models.User;

@Controller
public class MainController {

    @GetMapping("/")
    public String Home(){
        return "Home";
    }

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userServiceImpl.save(user);
        return "redirect:/login";
    }
    @PostMapping("/successURL")
    public String successURL(){
        return "redirect:/saveUser";
    }
}
