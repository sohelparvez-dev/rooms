public class House {
	private Room[] rooms;

	// Constructor Do Not Modify
	public House(Room[] rooms) {
		this.rooms = rooms;
	}

	/***
	 * Calculates the sum of the squareFeet of all the rooms in rooms
	 * 
	 * @return sum
	 */
	public int totalSquareFeet() {
                int totalSquareFeets = 0;
                for(Room room: rooms) {
                    totalSquareFeets = totalSquareFeets + (room.getLength()* room.getWidth());
                }
		return totalSquareFeets;

	}

	/***
	 * Calculates the average square footage per room based on the ratio of square
	 * footage of each room and the total number of rooms
	 * 
	 * @return average
	 */
	public double averageSquareFootagePerRoom() {
		return totalSquareFeet()/rooms.length;
	}

	/***
	 * Returns a SORTED list of room names in lexicographic order
	 * 
	 * @return sorted String Array
	 */
	public String[] roomNames() {
            String[] names = new String[rooms.length];
            for(int i = 0; i < rooms.length; ++i) {
                names[i] = rooms[i].getName();
            }
            
            for(int i = 0; i < names.length-1; ++i) {
                for (int j = i + 1; j < names.length; ++j) {
                    
                    if (names[i].compareTo(names[j]) > 0) {
                        
                        String temp = names[i];
                        names[i] =names[j];
                        names[j] = temp;
                        
                    }
                }
            }
            return names;
	}
}
