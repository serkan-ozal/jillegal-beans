/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.service;

import org.apache.log4j.Logger;

import tr.com.serkanozal.jillegal.beans.factory.BeanFactory;

class DefaultBeanService implements BeanService {

	private final Logger logger = Logger.getLogger(getClass());
	
	@Override
	public <T> T getBean(Class<T> beanClass) {
		try {
			return beanClass.newInstance();
		} 
		catch (InstantiationException e) {
			logger.error("Error occurred while creating an instance of " + beanClass.getName(), e);
		} 
		catch (IllegalAccessException e) {
			logger.error("Error occurred while creating an instance of " + beanClass.getName(), e);
		}
		return null;
	}

	@Override
	public <T> void registerBeanFactory(Class<T> beanClass, BeanFactory<T> beanFactory) {
		throw new UnsupportedOperationException(
				"\"void registerBeanFactory(Class<T> beanClass, BeanFactory<T> beanFactory)\"" +  
				" is not supported by " + getClass().getName() + " !");
	}

	@Override
	public <T> void unregisterBeanFactory(Class<T> beanClass) {
		throw new UnsupportedOperationException(
				"\"void unregisterBeanFactory(Class<T> beanClass)\"" +  
				" is not supported by " + getClass().getName() + " !");
	}

	@Override
	public <T> void unregisterBeanFactory(BeanFactory<T> beanFactory) {
		throw new UnsupportedOperationException(
				"\"void unregisterBeanFactory(BeanFactory<T> beanFactory)\"" +  
				" is not supported by " + getClass().getName() + " !");
	}

	@Override
	public <T> BeanFactory<T> getBeanFactory(Class<T> beanClass) {
		throw new UnsupportedOperationException(
				"\"BeanFactory<T> getBeanFactory(Class<T> beanClass)\"" +  
				" is not supported by " + getClass().getName() + " !");
	}

}
