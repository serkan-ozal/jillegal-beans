/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.config.service;

import tr.com.serkanozal.jillegal.beans.config.provider.BeansConfigProvider;
import tr.com.serkanozal.jillegal.beans.config.provider.annotation.BeansAnnotationBasedConfigProvider;
import tr.com.serkanozal.jillegal.beans.config.provider.properties.BeansPropertiesBasedConfigProvider;
import tr.com.serkanozal.jillegal.beans.config.provider.xml.BeansXmlBasedConfigProvider;
import tr.com.serkanozal.jillegal.core.config.service.BaseConfigService;

public class BeansConfigServiceImpl extends BaseConfigService<BeansConfigProvider> implements BeansConfigService {

	@Override
	protected void init() {
		addConfigProviderIfAvailable(new BeansAnnotationBasedConfigProvider());
		addConfigProviderIfAvailable(new BeansXmlBasedConfigProvider());
		addConfigProviderIfAvailable(new BeansPropertiesBasedConfigProvider());
	}

}
