package jovace.mytube.srvusuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@Autowired
	IdentityBean id;
	
	@GetMapping("/")
	public String mainPage(Model model) {
		System.out.println("He llegado hasta aqui (?)");
		model.addAttribute("mensaje", id);
		return "main";
	}
	
	@GetMapping("/sayHi")
	@ResponseBody
	public String sayHi() {
		return "Hi!";
	}

}
