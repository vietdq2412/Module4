package controller;
import Model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/customer")
public class Controller {
    @GetMapping
    public String test() {
        return "test";
    }

    @GetMapping("/")
    public String test1() {
        return "test1";
    }

    @PostMapping("Create")
    public Customer createCus(){
        Customer customer = new Customer();
        return customer;
    }
}
