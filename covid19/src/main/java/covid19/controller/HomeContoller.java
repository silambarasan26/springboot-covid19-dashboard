package covid19.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import covid19.service.ICovid19DataService;

@Controller
public class HomeContoller {

	@Autowired
	ICovid19DataService covid19DataService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("stateWiseList", covid19DataService.getStateWiseList());
		return "home";
	}

}
