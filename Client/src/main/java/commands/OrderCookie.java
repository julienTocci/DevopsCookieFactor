package commands;

public class OrderCookie extends CartManagement {

	@Override
	public String identifier() { return "order"; }

	@Override
	public void execute() throws Exception {
		shell.system.carts.addItemToCustomerCart(customerName, item);
	}

	@Override
	public String describe() {
		return "Order some cookies for a given customer (order CUSTOMER QUANTITY RECIPE)";
	}
}
