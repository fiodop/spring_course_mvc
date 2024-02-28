package com.Artem.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showMyView(){
        return "MyView";
    }
    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "askEmpDetailsView";
    }

@RequestMapping("/showDetails")
public String showEmpDetails(@ModelAttribute("employee")Employee emp){
    return "showEmpDetailsView";
}


}
