package sol.neptune.springeventbus.app;

import sol.neptune.springeventbus.app.Subscriber;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.UUID;

import org.junit.Test;

import com.google.common.eventbus.EventBus;

import sol.neptune.springeventbus.event.NewUUIDEvent;

public class SubscriberTest {

	@Test
	public void testReceiveUUIDs() {

		final Subscriber subscriber = mock(Subscriber.class);

		final EventBus eventBus = new EventBus();
		eventBus.register(subscriber);

		final NewUUIDEvent event = new NewUUIDEvent(UUID.randomUUID());
		eventBus.post(event);

		verify(subscriber).receiveUUIDs(any(NewUUIDEvent.class));
		verifyNoMoreInteractions(subscriber);

	}

}
