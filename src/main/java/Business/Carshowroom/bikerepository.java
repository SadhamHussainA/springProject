package Business.Carshowroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.stereotype.Repository;

@Repository
public interface bikerepository extends JpaRepository<bikedetail, Integer> {

}
