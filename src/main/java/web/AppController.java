package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: john
 * @version: 1.0 2014-05-30 13:37
 */
@Controller
public class AppController {

    @RequestMapping({"/", "index"})
    public String index() {
        return "index";
    }

    @RequestMapping({"home"})
    public String home() {
        return "home";
    }


}
