package med.voll.api.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloContoller {

	@GetMapping
	public String olsMundo() {
		return "Helllo World";
	}
}
