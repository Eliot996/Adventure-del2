import java.util.ArrayList;

public class Player {

    private String playerName;
    private int HP;
    private int maxHP = 5;
    private Room currentRoom;
    Room currentRoom2;
     int weightLimit = 10;
    private ArrayList<Item> itemsInInventory = new ArrayList<>();

    public Player(){
        this.HP = maxHP;

    }

    public String goTo(String userInput){
        if ((userInput.equals("north") || userInput.equals("n")) && getCurrentRoom().hasNorth()){
            currentRoom = currentRoom.getNorth();
            return currentRoom.visitRoom();
        }
        if(userInput.equals("south") || userInput.equals("s") && getCurrentRoom().hasSouth()){
            currentRoom = currentRoom.getSouth();
            return currentRoom.visitRoom();
        }
        if((userInput.equals("east") || userInput.equals("e")) && getCurrentRoom().hasEast()){
            currentRoom = currentRoom.getEast();
            return currentRoom.visitRoom();
        }
        if((userInput.equals("west") || userInput.equals("w")) && getCurrentRoom().hasWest()){
            currentRoom = currentRoom.getWest();
            return currentRoom.visitRoom();
        }
        return "You cannot go that direction in this room";
    }

    // TODO: add info to getInfo
    public String getInfo(){
        StringBuilder info = new StringBuilder();
        info.append("Health: \t" + HP + "/" + maxHP);
        return info.toString();
    }

    public String getFormattedInventory(){
        if (itemsInInventory.size() > 0){
            StringBuilder items = new StringBuilder("You have these items in your inventory:\n");

            for (Item item : itemsInInventory) {
                items.append(item.getLongName()).append("\n");
            }
            return items.toString();
        }
        return "You don't have any items in your inventory. Try picking something up with the 'take' command";
    }

    public Item dropItem (String itemName){
        for (Item item : itemsInInventory) {
            if (item.getShortName().equalsIgnoreCase(itemName)){
                itemsInInventory.remove(item);
                currentRoom.addItem(item);
                return item;
            }
        }
        return null;
    }

    public Item takeItem (String itemName){
        for (Item item : currentRoom.getItemsInRoom()) {
            if (item.getShortName().equalsIgnoreCase(itemName)){
                currentRoom.removeItem(item);
                itemsInInventory.add(item);
                return item;
            }
        }

        return null;
    }

    public Boolean weightLimitOnItem(Item item){
        int currentItemWeight = 0;
        for (int i = 0; i < itemsInInventory.size(); i++) {
            currentItemWeight += itemsInInventory.get(i).getWeight();
            if(currentItemWeight>=weightLimit){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Item> getItemsInInventory() {
        return itemsInInventory;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public void setMaxHP( int maxHP){
        this.maxHP = maxHP;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
