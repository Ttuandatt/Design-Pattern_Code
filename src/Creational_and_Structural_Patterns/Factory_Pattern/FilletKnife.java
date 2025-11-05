package Creational_and_Structural_Patterns.Factory_Pattern;

public class FilletKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening Fillet Knife");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Fillet Knife");
    }

    @Override
    public void pack() {
        System.out.println("Packing Fillet Knife");
    }
}
