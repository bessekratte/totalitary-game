package pl.kierznowski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.kierznowski.data.LoginUser;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("login")
    public String successLogin(Model model) {
        model.addAttribute("user", new LoginUser());
        return "login";
    }

    @RequestMapping("home")
    public String showHomePage(ModelAndView modelAndView) {
        return "home";
    }

}