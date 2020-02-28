

public class Room {
	private String name;
	private int length, width;

	public Room() {
		this.name = "undefined";
		this.length = -1;
		this.width = -1;
	}

	public Room(String name, int length, int width) {
		this.name = name.toLowerCase();
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSquareFeet() {
		return this.length * this.width;
	}

}
