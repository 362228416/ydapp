package web;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String index(@RequestParam(required = false, defaultValue = "") String keyword,
                        @RequestParam(required = false, defaultValue = "0") int page,
                        @RequestParam(required = false, defaultValue = "10") int size, Model model) {
        Page<User> pageData = userRepository.findByLoginnoContainingOrNameContainingOrTelephoneContainingOrEmailContaining(keyword, keyword, keyword, keyword, new PageRequest(page, size));
        model.addAttribute("pageData", pageData);
        model.addAttribute("keyword", keyword);
        return "users/index";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable String id, Model model) {
        model.addAttribute("model", userRepository.findOne(id));
        return "users/form";
    }

    @RequestMapping("/form")
    public String form(User user, BindingResult result, Model model) {
        return "users/form";
    }

    @RequestMapping("/create")
    public String create(User user, Model model) {
        user = userRepository.save(user);
        model.addAttribute("user", user);
        return "users/form";
    }


}
