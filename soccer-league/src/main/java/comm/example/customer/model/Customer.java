package comm.example.customer.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Customer {
	private String type=null;
	private int id=-1;
	private String name=null;

}
