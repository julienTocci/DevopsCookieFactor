import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import java.io.Serializable;

@ManagedBean
public class StatisticsBean implements Serializable {

	@EJB private transient Database memory;

	public int getProcessed() {
		return memory.howManyCarts();
	}

}
