package fr.unice.polytech.isa.tcf;

import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.entities.Item;

import javax.ejb.Local;


@Local
public interface CartModifier {

	boolean add(Customer c, Item item);

	boolean remove(Customer c, Item item);

}
