package Creational_and_Structural_Patterns.Factory_Pattern;

public class KnifeStore {
    public static void main(String[] args) {
        KnifeFactory shapeFactory = new KnifeFactory();

        Knife knife1 = shapeFactory.getKnife("STEAK");
        knife1.sharpen();
        knife1.polish();
        knife1.pack();

        Knife knife2 = shapeFactory.getKnife("FILLET");
        knife2.sharpen();
        knife2.polish();
        knife2.pack();
    }
}
