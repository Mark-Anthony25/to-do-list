package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class Index {
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }



}
