public class animals {
    public static String[] types = new String[10];

    public static String generateAnimal () {
        types[1] = "c";
        types[2] = "b";
        types[3] = "f";
        types[4] = "s";
        types[5] = "l";
        types[6] = "e";
        types[7] = "t";
        types[8] = "m";
        types[9] = "r";
        int randomInt = (int) (Math.random() * 9);
        return types[randomInt];
    }
    public static String whereToMoveAnimal () {
        String decision = "Resting";
        int randomInt = (int) (Math.random() * 9);
        if(randomInt == 1) decision = "Left";
        else if(randomInt == 2) decision = "Right";
        else if(randomInt == 3) decision = "Up";
        else if(randomInt == 4) decision = "Down";
        else if(randomInt == 5) decision = "LeftUp";
        else if(randomInt == 6) decision = "LeftDown";
        else if(randomInt == 7) decision = "RightUp";
        else if(randomInt == 8) decision = "RightDown";
        else if(randomInt == 9) decision = "Resting";
        return decision;
    }
}
