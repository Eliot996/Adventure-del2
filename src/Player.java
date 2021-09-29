import java.util.ArrayList;

public class Player {

    private String playerName;
    private int HP;
    private int maxHP = 5;
    private Room currentRoom;
    private ArrayList<Item> itemsInInventory = new ArrayList<>();

    public Player(){
        this.HP = maxHP;

    }

    public String goTo(String userInput){
        if ((userInput.equals("north") || userInput.equals("n")) && getCurrentRoom().hasNorth()){
            setCurrentRoom(getCurrentRoom().getNorth());
            return getCurrentRoom().getDescription();
        }
        if(userInput.equals("south") || userInput.equals("s") && getCurrentRoom().hasSouth()){
            setCurrentRoom(getCurrentRoom().getSouth());
            return getCurrentRoom().getDescription();
        }
        if((userInput.equals("east") || userInput.equals("e")) && getCurrentRoom().hasEast()){
            setCurrentRoom(getCurrentRoom().getEast());
            return getCurrentRoom().getDescription();
        }
        if((userInput.equals("west") || userInput.equals("w")) && getCurrentRoom().hasWest()){
            setCurrentRoom(getCurrentRoom().getWest());
            return getCurrentRoom().getDescription();
        }
        return "You cannot go that direction in this room";
    }

    // TODO: add info to getInfo
    public String getInfo(){
        StringBuilder info = new StringBuilder();
        info.append("Health: \t" + HP + "/" + maxHP);
        return info.toString();
    }

    //placeholder TODO: add inventory to player
    public String getInventory(){
        return null;
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
