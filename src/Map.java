public class Map {
    //Creation of the rooms
    public Room[] map;

    public Map(){
        //Creating the array
        map = new Room[26];

        //Creating the room objects
        map[0] = new Room("Sleeping chambers", "...");

        map[1] = new Room("Corridor2", "...");

        map[2] = new Room("Corridor1", "...");

        map[3] = new Room("Corridor3", "...");

        map[4] = new Room("The catacombs", "...");

        map[5] = new Room("Lavatory", "...");

        map[6] = new Room("The oak room", "...");

        map[7] = new Room("The royal chambers", "...");

        map[8] = new Room("Boudoirs", "...");

        map[9] = new Room("The throne room", "...");

        map[10] = new Room("Oratory", "...");

        map[11] = new Room("Corridor4", "...");

        map[12] = new Room("The observatory", "...");

        map[13] = new Room("Corridor5", "...");

        map[14] = new Room("The library", "...");

        map[15] = new Room("The court yard", "...");

        map[16] = new Room("The guard room", "...");

        map[17] = new Room("Corridor6", "...");

        map[18] = new Room("The vault", "...");

        map[19] = new Room("Royal mages quarters", "...");

        map[20] = new Room("The great hall", "...");

        map[21] = new Room("The entrance", "...");

        map[22] = new Room("The kitchen", "...");

        map[23] = new Room("The pantry", "...");

        map[24] = new Room("The servant chambers", "...");

        map[25] = new Room("The storage room", "...");


        map[0].setWest(map[1]);
        map[1].setNorth(map[2]);
        map[1].setSouth(map[3]);


        map[3].setEast(map[4]);
        map[3].setSouth(map[5]);
        map[3].setWest(map[25]);


        map[2].setNorth(map[9]);
        map[2].setEast(map[6]);
        map[2].setWest(map[16]);
        map[6].setEast(map[7]);
        map[6].setNorth(map[12]);
        map[7].setNorth(map[8]);
        map[12].setWest(map[11]);
        map[11].setSouth(map[10]);
        map[11].setWest(map[13]);
        map[13].setNorth(map[14]);
        map[13].setSouth(map[15]);
        map[15].setSouth(map[16]);
        map[13].setWest(map[17]);
        map[17].setNorth(map[18]);
        map[17].setSouth(map[19]);
        map[19].setSouth(map[20]);
        map[20].setWest(map[21]);
        map[20].setSouth(map[22]);
        map[22].setWest(map[23]);
        map[22].setEast(map[24]);
        map[24].setNorth(map[25]);




        //Added different items to different rooms
        map[1].addItem(new Item("gun","agent 007's gun", "This gun will kill with skill"));
        map[4].addItem(new Item("treasure","a jar of dirt", "you've gotten a jar of dirt!"));
        map[5].addItem(new Item("potion","potion to heal", "This magical potion will heal your injuries"));
        map[6].addItem(new Item("pepsi max","a cold can of pepsi max", "This will quench your thirst"));
        map[6].addItem(new Item("Cinnamon bun","a warm and delicious cinnamon bun", "This will "));
        map[7].addItem(new Item("whip","a leather whip", "wipe out your enemies"));
        map[8].addItem(new Item("treasure","a wannabe jar of dirt", "maybe you've the jar of dirt... maybe you don't"));
    }

    public Room[] getMap() {
        return map;
    }
}