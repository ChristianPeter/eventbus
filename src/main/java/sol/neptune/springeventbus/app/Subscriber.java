package sol.neptune.springeventbus.app;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.google.common.eventbus.Subscribe;

import sol.neptune.springeventbus.event.NewUUIDEvent;

@Component
public class Subscriber{

	@Subscribe
	public void receiveUUIDs(final NewUUIDEvent event) {
		final UUID uuid = event.getUuid();      
		System.out.println(uuid);
	}


}