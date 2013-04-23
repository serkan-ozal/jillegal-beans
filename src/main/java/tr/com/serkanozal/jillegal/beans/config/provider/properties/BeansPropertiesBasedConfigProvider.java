/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.config.provider.properties;

import tr.com.serkanozal.jillegal.beans.config.provider.BeansConfigProvider;

public class BeansPropertiesBasedConfigProvider implements BeansConfigProvider {

	public static final String PROPERTIES_FILE_NAME = "jillegal-beans.properties";
	
	@Override
	public boolean isAvailable() {
		// TODO Check about if there is "jillegal-beans.properties" file 
		return true;
	}
	
}
