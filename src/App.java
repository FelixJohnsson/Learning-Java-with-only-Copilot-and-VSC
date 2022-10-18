// Chat bot - 1.0
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            world.main();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}

class Animal {
    public class Legs {
        public String resting = " UU ";
        public String right = "  U U";
        public String left = "U U  ";
        public String current = resting;
    }
    public String name;
    public String type;
    public String sound;
    public int age;
    public String color;
    public String hat;
    public String head;
    public String body;
    public Legs legs;

    public Animal(String name, String type, String sound, int age, String color) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.age = age;
        this.color = color;
        this.hat = " __";
        this.head = "(oo)";
        this.body = "(__)";
        this.legs = new Legs();
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
}

class world {
    public static int index = 15;
    public static void main () {
        newWorld();
        
        Animal animal = new Animal("Latjo", "Penguin", "Beep", 5, "Blue");
        int randomInt = (int) (Math.random() * 3);
        if (randomInt == 1) {
            animal.legs.current = animal.legs.left;
            index--;
        }
        if (randomInt == 2) {
            animal.legs.current = animal.legs.right;
            index++;
        }
        else {
            animal.legs.current = animal.legs.resting;
        }
        updateWorldWithAnimal(animal, index);
    }
    public static void newWorld (){
        System.out.print("\033[H\033[2J");
        String[] layer = {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
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
    public static void updateWorldWithAnimal (Animal animal, int index) {
        System.out.print("\033[H\033[2J");
        String[] layer = {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        for(var i = 0; i < 4; i++) {
            if(i == 0) {
                layer[index] = animal.hat;
            }
            if(i == 1) {
                layer[index] = animal.head;
            }
            if(i == 2) {
                layer[index] = animal.body;
            }
            if(i == 3) {
                layer[index] = animal.legs.current;
            }
            printLayerArray(layer);
        }
    }
}