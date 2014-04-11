package sol.neptune.springeventbus.event;

import java.util.UUID;

public class NewUUIDEvent {

	private final UUID uuid;

	public NewUUIDEvent(final UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUuid() {
		return uuid;
	}

}