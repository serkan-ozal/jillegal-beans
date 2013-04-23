/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.beans.initializer;

import tr.com.serkanozal.jillegal.agent.JillegalAgent;
import tr.com.serkanozal.jillegal.beans.transformer.BeansClassTransformer;

public class BeansInitializer {

	private static volatile boolean initialized = false;
	
	private BeansInitializer() {
		
	}
	
	public synchronized static void init() {
		if (initialized == false) {
			JillegalAgent.init();
			initInternal();
			initialized = true;
		}
	}
	
	private static void initInternal() {
		JillegalAgent.getInstrumentation().addTransformer(new BeansClassTransformer(), true);
	}
	
}
