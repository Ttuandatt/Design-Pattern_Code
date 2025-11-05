package Creational_and_Structural_Patterns.Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        Singleton p1 = Singleton.getInstance();
        p1.setCardBackDesign("Dragon");
        p1.setTableColor("Red");
        System.out.println("Player 1 card design & color: " + p1.getCardBackDesign() + " & " + p1.getTableColor());

        Singleton p2 = Singleton.getInstance();
        p2.setCardBackDesign("Lion");
        p2.setTableColor("Orange");
        System.out.println("Player 2 card design & color: " + p2.getCardBackDesign() + " & " + p2.getTableColor());

        System.out.println("Player 1 card design & color after Player 2 changes: " + p1.getCardBackDesign() + " & " + p1.getTableColor());
    }
}
