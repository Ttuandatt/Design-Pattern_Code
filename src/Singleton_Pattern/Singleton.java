package Singleton_Pattern;

public class Singleton {
    private static Singleton uniqueInstance;
    private String cardBackDesign;
    private String tableColor;

    // Private constructor to prevent instantiation
    private Singleton(){
        cardBackDesign = "Blue";
        tableColor = "Green";
    }

    // Only allow one instance to be created
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    // getters and setters
    public String getCardBackDesign() {
        return cardBackDesign;
    }
    public void setCardBackDesign(String cardBackDesign) {
        this.cardBackDesign = cardBackDesign;
    }
    public String getTableColor() {
        return tableColor;
    }
    public void setTableColor(String tableColor) {
        this.tableColor = tableColor;
    }

}
