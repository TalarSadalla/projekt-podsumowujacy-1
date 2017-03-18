package com.szymon.controller;

import com.szymon.model.Product;
import com.szymon.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by RENT on 2017-03-18.
 */
@Controller
public class ProductFormController {


    @Autowired
    private ProductsService productsService;



    @RequestMapping(value="/product-form", method= RequestMethod.GET)
    public ModelAndView modelAndView() {
        ModelAndView modelAndView = new ModelAndView("productForm");
        modelAndView.addObject("categories",productsService.findAllCategories());
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @RequestMapping(value="/product-form", method= RequestMethod.POST)
    public ModelAndView modelAndView(@ModelAttribute Product product) {

        productsService.save(product);
        return modelAndView();
    }
}
