/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.service;

import tr.com.serkanozal.jillegal.beans.factory.BeanFactory;

public interface BeanService {

	<T> T getBean(Class<T> beanClass);
	<T> void registerBeanFactory(Class<T> beanClass, BeanFactory<T> beanFactory);
	<T> void unregisterBeanFactory(Class<T> beanClass);
	<T> void unregisterBeanFactory(BeanFactory<T> beanFactory);
	<T> BeanFactory<T> getBeanFactory(Class<T> beanClass);
	
}
