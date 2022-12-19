package Business.Carshowroom;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.annotations.FilterJoinTable;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class detailcar {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carregno;
	private String carname;
	private String carmodel;
	private int caryear;
	private String ownername;
	private int carlength;
	private int carweight;
	
	@OneToMany(fetch =FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="bikecarinfo",joinColumns = @JoinColumn(name="carinfo"),inverseJoinColumns = @JoinColumn(name="bikeinfo"))
	@Nullable
	
	public Collection<bikedetail> cb=new ArrayList<bikedetail>();
	
}
