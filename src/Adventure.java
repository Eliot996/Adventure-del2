import java.util.Scanner;

public class Adventure {

    private final Map mapOfGame;
    private final Player player;
    Scanner input = new Scanner(System.in);

    public Adventure(){
        mapOfGame = new Map();
        player = new Player();
        player.setCurrentRoom(mapOfGame.getMap()[0]);

    }

    public void play(){

        boolean gameActive = true;
        System.out.println(Color.VIBRANT_PURPLE + "Welcome to the adventure game!" +
                "\nThere are many different rooms to travel between, some rooms are better than others," +
                " but your main goal should be to find the 'magical room'. " +
                "\nIf you at any point need assistance, just type 'help' and a useful guide will magically appear" +
                "\n I wish you the best of luck! See you on the other side \uD83D\uDE09");
        System.out.println();
        System.out.println(Color.RESET_COLOR + "You are currently in " + player.getCurrentRoom().getDescription());
        System.out.println("Which direction would you like to go?");

        while(gameActive){
            String userInput = input.nextLine().trim().toLowerCase();
            if(userInput.startsWith("go")){
                userInput = userInput.substring(3);
                System.out.println(player.goTo(userInput));
            }else

                if (userInput.startsWith("exit")){
                System.out.println(Color.BRIGHT_RED + "Leaving already? :(");
                System.out.println("Hopefully we'll see each other again :) ");
                gameActive = false;
            }else

                if (userInput.startsWith("look")) {
                System.out.println(look());
            }else

                if (userInput.startsWith("help")){
                System.out.println(helpPlayer());
            }else

                if (userInput.startsWith("info")){
                System.out.println(player.getInfo());
            }else

                if (userInput.startsWith("take ")){
                userInput = userInput.substring(5);
                System.out.println("You have taken " + player.takeItem(userInput).getShortName());
            }else

                if (userInput.startsWith("drop ")){
                    userInput = userInput.substring(5);
                    System.out.println("You have dropped " + player.dropItem(userInput).getShortName());
            }else

                if (userInput.startsWith("inventory")) {
                    System.out.println(player.getFormattedInventory());
                }
                else

                if (userInput.startsWith("inspect ")){
                    userInput = userInput.substring(8);
                    System.out.println(inspect(userInput));
                }
                else{
                    System.out.println("I don't understand that");
                }
        }
    }

    public String look(){
        return player.getCurrentRoom().getDescription() + "\n" +
                player.getCurrentRoom().getItems();
    }

    public String inspect(String itemName){
        for (Item item : player.getItemsInInventory()) { // loops through the arrayList itemsInInventory, and set item to the current item
            if (item.getShortName().equalsIgnoreCase(itemName)){ //check if it is in item with the shortName of itemName
                return item.getDescription(); //returns the description of the item.
            }
        }

        /*   NOTE TIL GÜLER
        for (int i = 0; i < player.getItemsInInventory().size(); i++) {
            if (player.getItemsInInventory().get(i).getShortName().equalsIgnoreCase(itemName)){ //check if it is in item with the shortName of itemName
                return player.getItemsInInventory().get(i).getDescription(); //returns the description of the item.
            }
        }
         */

        return "There is no item by that name in your inventory";
    }

    public String helpPlayer(){ // Could be done better, but for right now, this works OK.
        // TODO: add inventory, take, drop, info
        return Color.BRIGHT_GREEN + """
                Here is some help for you. Hopefully this will make your journey easier:
                1) To move in and out of different rooms, combine 'go' with a direction,
                   such as north, south, east or west, or simply use the starting letter of the direction.
                5) type 'look', to get a description of the room you are in.
                6) type 'exit', to end the game.
                I wish you the best of luck!
               """;
    }

    public static void main(String[] args) {

        Adventure game = new Adventure();
        game.play();

    }
}
