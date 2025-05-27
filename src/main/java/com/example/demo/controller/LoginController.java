package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    // ✅ Show login page at "/"
    @GetMapping("/")
    public String showLoginForm() {
        return "index"; // shows index.html from templates
    }

    // ✅ Handle login POST to "/dashboard"
    @PostMapping("/dashboard")
    public String handleLogin(@RequestParam String email,
                              @RequestParam String password,
                              Model model) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("email", email);
            return "dashboard"; // go to dashboard.html
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "index"; // stay on index.html
        }
    }
}
