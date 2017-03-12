import javax.ejb.Local;
import java.util.Set;

@Local
public interface CartProcessor {

    Set<Item> contents(Customer c);

    double price(Customer c);

    String validate(Customer c) throws PaymentException, EmptyCartException;


}
