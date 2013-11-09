package di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Model m = new SimpleModel();
		View v = ctx.getBean("messageRenderer", View.class);
		v.displayMessage();
	}
}