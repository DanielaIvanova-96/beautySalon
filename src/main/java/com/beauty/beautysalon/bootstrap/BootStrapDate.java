package com.beauty.beautysalon.bootstrap;

import com.beauty.beautysalon.model.User;
import com.beauty.beautysalon.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BootStrapDate implements CommandLineRunner {
    private UserRepository userRepository;

    public BootStrapDate(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> listOfUsers = (List<User>) userRepository.findAll();
    }
}
