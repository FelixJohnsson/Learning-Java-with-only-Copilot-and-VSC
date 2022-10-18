// Chat bot - 1.0

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        world.main();
        TimeUnit.SECONDS.sleep(5);
    }
}


class Animal {
    public String name;
    public String type;
    public String sound;
    public int age;
    public String color;

    public Animal(String name, String type, String sound, int age, String color) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.age = age;
        this.color = color;
    }

    public void makeSound() {
        System.out.println(this.sound);
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Sound: " + this.sound);
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
    }

    public void printAnimal () {
            System.out.print("\033[H\033[2J");
            System.out.println("  __    ");
            System.out.println(" (oo)   ");
            System.out.println(" (__)   ");
            System.out.println("  UU    ");
    }

    public void walkRight () {
        System.out.print("\033[H\033[2J");
        System.out.println("   __    ");
        System.out.println("  (oo)   ");
        System.out.println("  (__)   ");
        System.out.println("   U U    ");
    }

    public void walkLeft () {
        System.out.print("\033[H\033[2J");
        System.out.println("  __    ");
        System.out.println(" (oo)   ");
        System.out.println(" (__)   ");
        System.out.println(" U U    ");
    }
}

class world {
    public static void main () {
        newWorld();
    }
    public static void newWorld (){
        System.out.print("\033[H\033[2J");
        String[] layer = {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"};
        for (var i = 0; i < 4; i++) {
            printLayerArray(layer);
        }

    }
    public static void printLayerArray (String[] layer) {
        for (int i = 0; i < layer.length; i++) {
            System.out.print(layer[i]);
        }
        System.out.println();
    }   
}
