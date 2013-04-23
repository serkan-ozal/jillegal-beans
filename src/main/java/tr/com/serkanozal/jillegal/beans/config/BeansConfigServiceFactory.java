/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.config;

import tr.com.serkanozal.jillegal.beans.config.service.BeansConfigService;
import tr.com.serkanozal.jillegal.beans.config.service.BeansConfigServiceImpl;

public class BeansConfigServiceFactory {

	private static BeansConfigService beansConfigService = new BeansConfigServiceImpl();
	
	private BeansConfigServiceFactory() {
		
	}
	
	public static BeansConfigService getBeansConfigService() {
		return beansConfigService;
	}
	
	public static void setBeansConfigService(BeansConfigService beansConfigService) {
		BeansConfigServiceFactory.beansConfigService = beansConfigService;
	}
	
}
