package pl.kierznowski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.kierznowski.data.Player;

@Controller
public class LoginController {

/*
    @ModelAttribute("player")
    public Player getPlayer() {
        return new Player();
    }

*/
    @PostMapping("/logged")
    public String successLogin(@ModelAttribute("player") Player player, final Model model) {
        System.out.println(player);
        model.addAttribute("player", player);
        return "success";
    }

    @GetMapping("/")
    public String showLoginPage(Model model) {
        model.addAttribute("player", new Player());
        return "login";
    }

}