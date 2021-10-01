public class Map {
    //Creation of the rooms
    public Room[] map;

    public Map(){
        //Creating the array
        map = new Room[26];

        //Creating the room objects
        map[0] = new Room("Sleeping chambers", "Cold and dark.");

        map[1] = new Room("Corridor2", "This is a long and dimly lit passage, which  may lead to several " +
                "different rooms.");

        map[2] = new Room("Corridor1", "This is a long and dimly lit passage, which may lead to several " +
                "different rooms.");

        map[3] = new Room("Corridor3", "This is a long and dimly lit passage, which may lead to several " +
                "different rooms.");

        map[4] = new Room("The catacombs", "Dimly lit, nerve wracking and unwelcoming. Human bones and skulls are " +
                "dispersed all around.");

        map[5] = new Room("Lavatory", "This room contains a toilet that is used by the entire castle. As you would expect, " +
                "it smells disgusting ");

        map[6] = new Room("The oak room", "...");

        map[7] = new Room("The royal chambers", "This room is decorated with expensive paintings and accessories. " +
                "Beautiful brass chandelier hanging from the ceiling.");

        map[8] = new Room("Boudoirs", "...");

        map[9] = new Room("The throne room", "A luxurious room with a large yet elegant looking throne in the middle");

        map[10] = new Room("Oratory", "A small room reserved for private worship with an altar and pews.");

        map[11] = new Room("Corridor4", "This is a long and dimly lit passage, which  may lead to several " +
                "different rooms.");

        map[12] = new Room("The observatory", "...");

        map[13] = new Room("Corridor5", "This is a long and dimly lit passage, which  may lead to several " +
                "different rooms.");

        map[14] = new Room("The library", "Tall bookshelves, filled with well organized books. This place seems nice to be in.");

        map[15] = new Room("The court yard", "A roofless area that is enclosed by tall walls, that are made with " +
                "stones.");

        map[16] = new Room("The guard room", "...");

        map[17] = new Room("Corridor6", "This is a long and dimly lit passage, which  may lead to several " +
                "different rooms.");

        map[18] = new Room("The vault", "Extraordinary room filled with luxurious items. " +
                "The treasure must be in here somewhere :D");

        map[19] = new Room("Royal mages quarters", "There are spell books scattered everywhere and countless potions " +
                "in every corner of the room. I could be extra careful in here. ");

        map[20] = new Room("The great hall", "A large and stunning hall. The stone walls are decorated with magnificent " +
                "paintings");

        map[21] = new Room("The entrance", "There is a large wooden gate with a wrought iron chandelier hanging from the loft.");

        map[22] = new Room("The kitchen", "Rusty and odd shaped pots hanging on the walls.");

        map[23] = new Room("The pantry", "...");

        map[24] = new Room("The servant chambers", "...");

        map[25] = new Room("The storage room", "...");


        //Connected room1 with room2.
        //Connected room2 with room3 and room4.
        //Connected room4 with room5 and room6.
        map[0].setWest(map[1]);
        map[1].setNorth(map[2]);
        map[1].setSouth(map[3]);
        map[3].setEast(map[4]);
        map[3].setSouth(map[5]);

        //Connected room4 with room26.
        //Connected room3 with room10, room7 and room17.
        //Connected room7 with room8.
        map[3].setWest(map[25]);
        map[2].setNorth(map[9]);
        map[2].setEast(map[6]);
        map[2].setWest(map[16]);
        map[6].setEast(map[7]);

        //Connected room7 with room13.
        //Connected room8 with room9.
        //Connected room13 with room12.
        //Connected room12 with room11 and room14.
        map[6].setNorth(map[12]);
        map[7].setNorth(map[8]);
        map[12].setWest(map[11]);
        map[11].setSouth(map[10]);
        map[11].setWest(map[13]);

        //Connected room14 with room15, room16 and room18.
        //Connected room16 with room17.
        //Connected room18 with room19.
        map[13].setNorth(map[14]);
        map[13].setSouth(map[15]);
        map[15].setSouth(map[16]);
        map[13].setWest(map[17]);
        map[17].setNorth(map[18]);

        //Connected room18 with room20.
        //Connected room20 with room21.
        //Connected room 21 with room22 and room23.
        map[17].setSouth(map[19]);
        map[19].setSouth(map[20]);
        map[20].setWest(map[21]);
        map[20].setSouth(map[22]);

        //Connected room23 with room24 and room25.
        //Connected room25 with room26.
        map[22].setWest(map[23]);
        map[22].setEast(map[24]);
        map[24].setNorth(map[25]);




        //Added different items to different rooms
        map[16].addItem(new Item("sword","a really heavy and shiny sword", "This sword will kill with skill", 7));
        map[18].addItem(new Item("treasure","a jar of gold", "you've gotten the jar of gold!", 15));
        map[19].addItem(new Item("potion","potion to heal", "This magical potion will heal your injuries", 10));
        map[22].addItem(new Item("beer","a cold pint of beer", "This will quench your thirst", 3));
        map[22].addItem(new Item("tart","a warm and delicious tart", "This will give you with some well-deserved energy", 3));

    }

    public Room[] getMap() {
        return map;
    }
}