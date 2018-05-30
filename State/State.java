public interface State {
	public void lock(DoorContext context);
	public void unlock(DoorContext context);
	public void openDoor(DoorContext context);
	public void closeDoor(DoorContext context);
}
