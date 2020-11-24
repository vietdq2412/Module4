package com.codegym.cms.controller;

import com.codegym.cms.sevice.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping
    public ModelAndView showCustomerList(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customerList",customerService.listAllCustomer());
        return modelAndView;
    }
}
