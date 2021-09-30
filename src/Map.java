public class Map {
    //Creation of the rooms
    public Room[] map;

    public Map(){
        //Creating the array
        map = new Room[18];

        //Creating the room objects
        map[0] = new Room("The basement",
                "This room is dark and smells awful...I would highly recommend you to leave.");

        map[1] = new Room("Room 007",
                "The name of this room sounds cool, maybe there is something of use in here?");

        map[2] = new Room("Maybe",
                "Is this even a room? Doesn't look like one to me, but you are welcome to explore.");

        map[3] = new Room("The dungeon",
                "oh boy... this room looks similar to the basement, but feels way worse to be " +
                "in. If you didn't like the first room, then you'll definitely hate this room.");

        map[4] = new Room(Color.RESET_COLOR + "The magical room",
                "Congratulations! You have found the magical room, well done player \uD83D\uDC4F");

        map[5] = new Room("The laboratory",
                "There are a bunch of dangerous chemicals scattered around this room. " +
                "Be careful, you could harm yourself.");

        map[6] = new Room(Color.RESET_COLOR + "The safe room",
                "Can you believe that? Finally a room that is cozy and safe." +
                " There are even some food and drinks to give you some well-deserved energy! ❤");

        map[7] = new Room(Color.BRIGHT_RED + "The red room",
                "This room is full of torture devices and items that " +
                "could be of use \uD83D\uDE0F");

        map[8] = new Room(Color.RESET_COLOR + "The 'magical-ish room'",
                "Looks like you've found the 'magical room', " +
                "but something seems totally off...\uD83D\uDE1F");

        map[9] = new Room("The library", "There is lots of wisdom in here XD");

        map[10] = new Room("The spaceship", "There are a bunch of alien technology scattered around here.");

        map[11] = new Room("The spider room", "Does not look like spider-man is in here...but you know what is? " +
                "SPIDERS");

        map[12] = new Room("The Casino", "This is a place for games");

        map[13] = new Room("The corridor", "This is something");

        map[14] = new Room("Dead end", "Looks like you've travelled too far. Better find your way back");

        map[15] = new Room("The secret tunnel", "This is a long and dark tunnel. I'm wondering where this tunnel" +
                "will lead us...");

        map[16] = new Room("The attic", "Dust... Dust everywhere");

        map[17] = new Room("The cursed room", "Legend has it that whoever enters this room, never gets out again");

        //Connected the rooms.
        //Connected room1 with room2, room4, room10
        map[0].setEast(map[1]);
        map[0].setSouth(map[3]);
        map[0].setNorth(map[9]);

        //Connected room2 with room3 and room11
        //Connected room3 with room6
        map[1].setEast(map[2]);
        map[1].setNorth(map[10]);
        map[2].setSouth(map[5]);

        //Connected room4 with room18
        // Connected room6 with room9
        //Connected room7 with room4
        map[3].setWest(map[17]);
        map[5].setSouth(map[8]);
        map[6].setNorth(map[3]);


        //Connected room7 with room12
        // Connected room12 with room16
        // Connected room16 with room15
        map[6].setSouth(map[11]);
        map[11].setSouth(map[15]);
        map[15].setEast(map[14]);

        //Connected room8 with room7
        //Connected room8 with room5
        //Connected room9 with room8
        map[7].setWest(map[6]);
        map[7].setNorth(map[4]);
        map[8].setWest(map[7]);

        //Connected room6 with room13
        //Connected room9 with room14
        //Connected room17 with room17
        map[5].setEast(map[12]);
        map[8].setSouth(map[13]);
        map[13].setEast(map[16]);

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