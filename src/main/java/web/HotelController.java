package web;

import model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.HotelRepository;

@Controller
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping("/hotel/count")
    @ResponseBody
    public long count() {
        return hotelRepository.count();
    }

    @RequestMapping("/hotel/{id}")
    public String view(@PathVariable long id, Model model) {
        Hotel hotel = hotelRepository.findOne(id);
        model.addAttribute("model", hotel);
        return "hotel/view";
    }

}
