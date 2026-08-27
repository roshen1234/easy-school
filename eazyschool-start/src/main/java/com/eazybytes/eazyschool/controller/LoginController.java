package com.eazybytes.eazyschool.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String displayLoginPage(@RequestParam(required = false) String error,Model model) {

        log.info("value of error is"+error);
        if("true".equals(error))
        {
            log.info("entered");
            String errorMessge="Username or password is wrong";
            model.addAttribute("errorMessge",errorMessge);
        }
        return "login.html";
    }

}