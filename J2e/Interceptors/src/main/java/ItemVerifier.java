import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ItemVerifier {

	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {
		Item it = (Item) ctx.getParameters()[1];

		if (it.getQuantity() <= 0) {
			throw new UncheckedException("Inconsistent quantity!", null);
		}

		return ctx.proceed();
	}

}
