package Creational_and_Structural_Patterns.Factory_Pattern;

public class SteakKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening Steak Knife");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Steak Knife");
    }

    @Override
    public void pack() {
        System.out.println("Packing Steak Knife");
    }
}
