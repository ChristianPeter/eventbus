package sol.neptune.springeventbus;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sol.neptune.springeventbus.app.Publisher;
import sol.neptune.springeventbus.config.ApplicationConfig;

public class Main {

	public static void main(final String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		final Publisher publisher = context.getBean(Publisher.class);
		for (int i = 0; i < 10; i++) {
                        System.out.println("publish: " +i);
			publisher.publishNewUUID();
		}
		context.close();
	}

}