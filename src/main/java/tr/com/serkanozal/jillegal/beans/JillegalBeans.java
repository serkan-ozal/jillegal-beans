/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans;

import tr.com.serkanozal.jillegal.beans.initializer.BeansInitializer;

public class JillegalBeans {

	public static String VERSION = "1.0.0-RELEASE";

	private JillegalBeans() {
		
	}
	
	public static void init() {
		BeansInitializer.init();
	}
	
}
