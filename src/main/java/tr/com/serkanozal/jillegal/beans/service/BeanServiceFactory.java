/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.service;

public class BeanServiceFactory {

	private static BeanService beanService = new BeanServiceImpl();
	
	private BeanServiceFactory() {
		
	}
	
	public static BeanService getBeanService() {
		return beanService;
	}
	
	public static void setBeanService(BeanService beanService) {
		BeanServiceFactory.beanService = beanService;
	}

}
