/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.config.provider.xml;

import tr.com.serkanozal.jillegal.beans.config.provider.BeansConfigProvider;

public class BeansXmlBasedConfigProvider implements BeansConfigProvider {

	public static final String XML_FILE_NAME = "jillegal-beans.xml";
	
	@Override
	public boolean isAvailable() {
		// TODO Check about if there is "jillegal-beans.xml" file 
		return true;
	}
	
}
