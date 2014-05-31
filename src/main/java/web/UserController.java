package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "") String keyword, Model model) {
//        Page<User> all = userRepository.findAll(new PageRequest(1, 10));
        Object all = userRepository.findByLoginnoLike(keyword, new PageRequest(1, 10));
        model.addAttribute("list", all);
        model.addAttribute("keyword", keyword);
        return "users/index";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable String id, Model model) {
        model.addAttribute("model", userRepository.findOne(id));
        return "users/view";
    }

    @RequestMapping("/form")
    public String form() {
        return "users/form";
    }


}
