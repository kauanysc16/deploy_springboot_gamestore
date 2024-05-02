package br.com.kauanysc16.gamestore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/home")
    public String gethome() {
        return "index";
    }
    
}
