package com.codegym.demo.controller;

import com.codegym.demo.model.Category;
import com.codegym.demo.model.Product;
import com.codegym.demo.service.IProductService;
import com.codegym.demo.service.category.ICategorySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private ICategorySevice categorySevice;

    @ModelAttribute("categories")
    private Iterable<Category> categories(){
        return categorySevice.findAll();
    }


    @GetMapping("")
    public ModelAndView fillAll(){
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("list", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView  showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return  modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView  createP(@ModelAttribute Product product){
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return  modelAndView;
    }

}
