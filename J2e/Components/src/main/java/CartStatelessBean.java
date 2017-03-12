import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Stateless(name = "cart-stateless")
public class CartStatelessBean extends CartBean {

	@PersistenceContext private EntityManager entityManager;

	@Override
	public boolean add(Customer customer, Item item) {
		Customer c = entityManager.merge(customer);
		c.setCart(updateCart(c, item));
		return true;
	}

	@Override
	public Set<Item> contents(Customer customer) {
		Customer c = entityManager.merge(customer);
		return c.getCart();
	}

}
