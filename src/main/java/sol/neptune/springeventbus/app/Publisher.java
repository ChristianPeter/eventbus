package sol.neptune.springeventbus.app;

import com.google.common.eventbus.AsyncEventBus;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import sol.neptune.springeventbus.event.NewUUIDEvent;

@Component
public class Publisher {

	private final AsyncEventBus eventBus;

	@Autowired
	public Publisher(final AsyncEventBus eventBus) {
		this.eventBus = eventBus;
	}

	public void publishNewUUID() {
		final UUID uuid = UUID.randomUUID();
		final NewUUIDEvent event = new NewUUIDEvent(uuid);
		eventBus.post(event);
	}

}