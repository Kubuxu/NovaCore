package nova.core.block;

import nova.core.game.Game;
import nova.core.item.ItemStack;
import nova.core.util.Identifiable;
import nova.core.util.transform.Cuboid;
import nova.core.util.transform.Vector3i;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Block implements Identifiable {
	private final BlockAccess blockAccess;
	private final Vector3i position;

	public Block(BlockAccess blockAccess, Vector3i position) {
		this.blockAccess = blockAccess;
		this.position = position;
	}

	public Collection<ItemStack> getDroppedStacks() {
		ArrayList<ItemStack> list = new ArrayList<>();
		list.add(new ItemStack(Game.instance.get().itemManager.getItemFromBlock(this))); // -100 style points.
		return list;
	}

	public Cuboid getBoundingBox() {
		return new Cuboid(position, position.add(1));
	}

	public BlockAccess getBlockAccess() {
		return blockAccess;
	}

	public Vector3i getPosition() {
		return position;
	}

	public int getX() {
		return position.x;
	}

	public int getY() {
		return position.y;
	}

	public int getZ() {
		return position.z;
	}

	public boolean isCube() {
		return true;
	}

	public boolean isOpaqueCube() {
		return isCube();
	}

	public void onNeighborChange(Vector3i neighborPosition) {

	}

	public void onPlaced(BlockChanger changer) {

	}

	public void onRemoved(BlockChanger changer) {

	}
}
