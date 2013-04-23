/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import tr.com.serkanozal.jillegal.beans.factory.BeanFactory;

public class BeanServiceImpl implements BeanService {

	protected final Logger logger = Logger.getLogger(getClass());
	
	protected BeanService defaultBeanService = new DefaultBeanService();
	protected Map<Class<?>, BeanFactory<?>> beanClassFactoryMap = new HashMap<Class<?>, BeanFactory<?>>();
	
	public BeanService getDefaultBeanService() {
		return defaultBeanService;
	}
	
	public void setDefaultBeanService(BeanService defaultBeanService) {
		this.defaultBeanService = defaultBeanService;
	}

	@Override
	public <T> T getBean(Class<T> beanClass) {
		BeanFactory<T> beanFactory = getBeanFactory(beanClass);
		if (beanFactory != null) {
			return beanFactory.getBean();
		}
		else {
			return defaultBeanService.getBean(beanClass);
		}
	}
	
	@Override
	public <T> void registerBeanFactory(Class<T> beanClass, BeanFactory<T> beanFactory) {
		beanClassFactoryMap.put(beanClass, beanFactory);
	}

	@Override
	public <T> void unregisterBeanFactory(Class<T> beanClass) {
		beanClassFactoryMap.remove(beanClass);
	}

	@Override
	public <T> void unregisterBeanFactory(BeanFactory<T> beanFactory) {
		unregisterBeanFactory(beanFactory.getBeanClass());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> BeanFactory<T> getBeanFactory(Class<T> beanClass) {
		return (BeanFactory<T>) beanClassFactoryMap.get(beanClass);
	}

}
