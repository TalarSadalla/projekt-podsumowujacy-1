package com.szymon.controller;

import com.szymon.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

    @Autowired
    private LinkService linkService;

    @RequestMapping("shop")
    public ModelAndView shop() {
        ModelAndView modelAndView = new ModelAndView("shop");
        modelAndView.addObject("navigationLinks", linkService.fetchLinks());

        return modelAndView;
    }
}
