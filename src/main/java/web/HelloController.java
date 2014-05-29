package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.HotelRepository;

@RestController
public class HelloController {

    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hotel/count")
    public long count() {
        return hotelRepository.count();
    }

}
