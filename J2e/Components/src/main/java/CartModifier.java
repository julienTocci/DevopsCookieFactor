import javax.ejb.Local;


@Local
public interface CartModifier {

	boolean add(Customer c,Item item);

	boolean remove(Customer c, Item item);

}
