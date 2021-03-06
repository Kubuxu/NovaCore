package nova.core.game;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import nova.core.block.BlockManager;
import nova.core.item.ItemManager;
import nova.core.world.WorldManager;

import java.util.Optional;

@Singleton
public class Game {

	/**
	 * Use only when injection is not a solution. For example when performance
	 * is a concern. Treat as -100 style points. Must be initialized by code handling launch and dependency injection entry point.
	 */
	public static Optional<Game> instance = Optional.empty();

	public final BlockManager blockManager;
	public final ItemManager itemManager;
	public final WorldManager worldManager;

	@Inject
	private Game(BlockManager blockManager, ItemManager itemManager, WorldManager worldManager) {
		this.blockManager = blockManager;
		this.itemManager = itemManager;
		this.worldManager = worldManager;
	}

}
