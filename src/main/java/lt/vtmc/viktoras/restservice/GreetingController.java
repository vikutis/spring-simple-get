package lt.vtmc.viktoras.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	
	//http://localhost:8080/greeting?name=Viktor
	@GetMapping("/greeting")
	public Greeting greetin(@RequestParam(value = "name", defaultValue = "Bevardis") String name, @RequestParam(value = "secondname", defaultValue = "Bepavardis") String secondname) {
		return new Greeting(name + " " +  secondname);
	}
	
	//http://localhost:8080/labas?name=petras&secondname=antanaitis
	@GetMapping("/labas")
	public Labas sveikinsim(@RequestParam(value = "name", defaultValue = "Bevardis") String name, @RequestParam(value = "secondname", defaultValue = "Bepavardis") String secondname) {
		return new Labas(name + " " +  secondname);
	}
}