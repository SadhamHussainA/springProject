package Business.Carshowroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class showroonservice {
	@Autowired
	carrepositary crep;
	public detailcar carinfo(detailcar cardata) {
		return crep.save(cardata);
	}
   public List<detailcar> location(){
	   return crep.findAll();
   }
}
