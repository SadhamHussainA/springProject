package Business.Carshowroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class showroomcontroller {
	@Autowired
	showroonservice sser;
	
	@Autowired
	bikeservice bser;
	
	@PostMapping("/create")
	public String b1(@RequestBody detailcar d2) {
		return sser.carinfo(d2).getCarname()+ "it's created ";
	}
	@PostMapping("/new")
	public String c1(@RequestBody bikedetail b2) {
		return bser.bike(b2).getBikemodel()+ "it's updated";
	}
	@GetMapping("/list")
	public List<detailcar> location1(){
		return sser.location();
	}
}
