package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/welcome")
public class Hello {
    @GetMapping
    public String hello(@RequestParam String name,Model model){
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/2")
    public String hello2(){
        return "hello2";
    }
    @GetMapping("/3")
    public String hello3(){
        return "hello3";
    }
}
