package Business.Carshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bikeservice {
       @Autowired
       bikerepository brep;
       public bikedetail bike(bikedetail d1) {
    	   return brep.save(d1);
       }
       
}
