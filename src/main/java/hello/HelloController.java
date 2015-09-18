package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by patrick on 2015/9/17.
 */

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "greetings from Srping boot";
    }
}
