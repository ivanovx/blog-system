package pro.ivanov.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.ivanov.blog.inputModel.LoginModel;

@Controller
public class UserController {

    @RequestMapping(value = "/user/login")
    public String login(Model model) {

        model.addAttribute("user", new LoginModel("csyntax", "csyntax"));

        return "user/login";
    }
}