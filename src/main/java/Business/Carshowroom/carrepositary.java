package Business.Carshowroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carrepositary extends JpaRepository<detailcar, Integer> {

}
