package Creational_and_Structural_Patterns.Factory_Pattern;

public class KnifeFactory {
    // Factory method to create Knife objects based on type
    public Knife getKnife(String knifeType) {
        if(knifeType == null) {
            return null;
        }
        if(knifeType.equalsIgnoreCase("STEAK")) {
            return new SteakKnife();
        } else if(knifeType.equalsIgnoreCase("FILLET")) {
            return new FilletKnife();
        }

        return null;
    }

}
