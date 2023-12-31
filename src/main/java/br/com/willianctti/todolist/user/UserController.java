package br.com.willianctti.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel usermodel) {

        var passwordHashed= BCrypt.withDefaults()
        .hashToString(12, usermodel.getPassword().toCharArray());

        usermodel.setPassword((passwordHashed));

        var userCreated = this.userRepository.save(usermodel);
        return userCreated;
    }
}
