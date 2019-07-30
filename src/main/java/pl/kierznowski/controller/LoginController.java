package pl.kierznowski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/index")
    public String login(Model model) {
        model.addAttribute("name", "Janek");
        return "login";
    }
}