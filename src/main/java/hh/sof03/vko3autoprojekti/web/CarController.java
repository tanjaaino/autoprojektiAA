package hh.sof03.vko3autoprojekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof03.vko3autoprojekti.domain.Car;

@Controller
public class CarController {

 // tyhjän autolomakkeen muodostus
 @RequestMapping(value = "/newcar", method = RequestMethod.GET)
 public String getNewForm(Model model){
    model.addAttribute("car", new Car());
    return "newcarform"; // newcarform.html
 }
 
 // autolomakkeelle syötettyjen tietojen vastaanotto
 @RequestMapping(value = "/savecar", method = RequestMethod.POST)
 public String saveCar(@ModelAttribute Car car, Model model){
    //System.out.println("Auton tiedot" + car);
    model.addAttribute("car", car);
    return "result";  // result.html

 }
}
