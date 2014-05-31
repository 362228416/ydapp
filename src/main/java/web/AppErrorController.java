package web;

import org.springframework.boot.actuate.web.BasicErrorController;
import org.springframework.boot.actuate.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * @author: john
 * @version: 1.0 2014-06-01 3:01
 */
@Controller
public class AppErrorController extends BasicErrorController {
    @Override
    public String getErrorPath() {
        System.out.println("getErrorPath");
        return super.getErrorPath();
    }

    @Override
    public Map<String, Object> extract(RequestAttributes attributes, boolean trace, boolean log) {
        System.out.println("extract");
        Map<String, Object> map = super.extract(attributes, trace, log);
        System.out.println(map);
        return map;
    }
}
