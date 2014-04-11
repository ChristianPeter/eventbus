package sol.neptune.springeventbus.app;

import sol.neptune.springeventbus.app.Publisher;
import com.google.common.eventbus.AsyncEventBus;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;


import sol.neptune.springeventbus.event.NewUUIDEvent;

public class PublisherTest {

	@Test
	public void testPublishNewUUID() {

		final AsyncEventBus eventBus = mock(AsyncEventBus.class);

		new Publisher(eventBus).publishNewUUID();

		verify(eventBus).post(any(NewUUIDEvent.class));
		verifyNoMoreInteractions(eventBus);

	}

}
