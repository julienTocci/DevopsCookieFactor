import javax.ejb.Local;

@Local
public interface ControlledPayment extends Payment{

	void useBankReference(BankAPI bank);
}
