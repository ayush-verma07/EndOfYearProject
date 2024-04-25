package fhs.project.studentapp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/course")
	public String course() {
		return "course";
	}

	@GetMapping("/academics")
	public String academics() {
		return "academics";
	}

	@GetMapping("/community")
	public String community() {
		return "community";
	}

	@GetMapping("/college")
	public String college() {
		return "college";
	}

	@GetMapping("/settings")
	public String settings() {
		return "settings";
	}

    @GetMapping("/")
	public String index(Model model) {
		return "login";
	}

}
