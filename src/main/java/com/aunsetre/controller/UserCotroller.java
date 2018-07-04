package com.aunsetre.controller;
import com.aunsetre.service.UserService;
import com.aunsetre.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserCotroller {
    @Autowired
    private UserService userService;
    @RequestMapping("/login.html")
    public String login(@RequestParam String account,
                        @RequestParam String password, Model model){
         User user=userService.login(account,password);
        if (null!=user){
            model.addAttribute("loginFlag","true");
            String aa="asd";
            return "index";
        }
       return "login";
    }


}
