package sol.neptune.springeventbus.config;

import com.google.common.eventbus.AsyncEventBus;
import java.util.concurrent.Executors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("sol.neptune.springeventbus")
public class ApplicationConfig {

	@Bean
	AsyncEventBus eventBus() {
		return new AsyncEventBus(Executors.newCachedThreadPool());
	}

}