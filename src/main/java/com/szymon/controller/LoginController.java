package com.szymon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by RENT on 2017-03-20.
 */
@Controller
public class LoginController {
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public ModelAndView modelAndView() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

}
