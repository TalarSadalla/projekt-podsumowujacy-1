package com.szymon.controller;

import com.szymon.model.Product;
import com.szymon.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping("/products/{id}")
    public ModelAndView modelAndView(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("product");
        Product productById = productsService.findProductById(id);
        modelAndView.addObject("product", productById);
        if (productById == null) {
            modelAndView = null;
        }
        return modelAndView;
    }
}
