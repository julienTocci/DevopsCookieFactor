import javax.ejb.Local;

@Local
public interface CustomerRegistration {

	void register(String name, String creditCard)
			throws AlreadyExistingCustomerException;

}

