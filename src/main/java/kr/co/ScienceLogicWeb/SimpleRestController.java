package kr.co.ScienceLogicWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @RequestMapping("/article")
    public String createArticle(){
        return "SOME MESSAGE";
    }


}
