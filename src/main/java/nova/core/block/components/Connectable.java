package nova.core.block.components;

import nova.core.util.Direction;

public interface Connectable {
	Connectable.Type canConnect(Class<?> type, Direction side);

	public enum Type {
		DEFAULT, FORCE, DENY;
	}
}
