package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @RequestMapping(value = "/")
//    public String greeting(ModelMap map){
//        map.addAttribute("greeting","Welcome to stackroute!");
//        return "index";
//    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView login() {
    //return new ModelAndView("login", "command", new User());
        ModelAndView model= new ModelAndView("login");
        return model;
    }


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam("user")String user, @RequestParam("password") String password)
    {
        ModelAndView model=new ModelAndView("index");
        User user1=new User();
        user1.setUsername(user);
        user1.setPassword(password);
        model.addObject("msg1",user1.getUsername());
        //model.addAttribute("password", user.getPassword());
        return model;
    }

}
