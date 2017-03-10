import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;
import exceptions.PaymentException;

import javax.ejb.Local;
import java.util.Set;

@Local
public interface Payment {

	String payOrder(Customer customer, Set<Item> items) throws PaymentException ;

}
