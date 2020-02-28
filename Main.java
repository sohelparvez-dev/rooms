
public class Main {
    
    public static void main(String[] args) {
        
        Room[] rooms = new Room[10];
        Room room1 = new Room("Den", 125, 100);
        Room room2 = new Room("Basement", 200, 150);
        Room room3 = new Room("Living", 110, 95);
        Room room4 = new Room("Drawing", 210, 180);
        Room room5 = new Room("Kitchen", 125, 100);
        Room room6 = new Room("Dining", 100, 80);
        Room room7 = new Room("Bedroom", 200, 125);
        Room room8 = new Room("Entryway", 300, 175);
        Room room9 = new Room("Hallway", 400, 280);
        Room room10 = new Room("Bathroom", 60, 40);
        
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        rooms[5] = room6;
        rooms[6] = room7;
        rooms[7] = room8;
        rooms[8] = room9;
        rooms[9] = room10;
        
        House house = new House(rooms);
        System.out.println("=======Total Square Feet============");
        System.out.println("Total Square Feet is "+house.totalSquareFeet());
        System.out.println("====================================");
        
        System.out.println("=======Total Square Feet============");
        System.out.println("Total Square Feet is "+house.averageSquareFootagePerRoom());
        System.out.println("====================================");
        
        
        System.out.println("=======lexicographic order============");
        String[] names =house.roomNames();
        for(int x = 0; x < names.length; x++) {
            System.out.println(names[x]);
        }            
        System.out.println("====================================");
        
        
        
        
    }
    
}
