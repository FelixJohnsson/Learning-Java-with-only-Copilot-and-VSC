// Chat bot - 1.0
public class App {
    public static void main(String[] args) throws Exception {
        world.generateMap();
        Animal animal = new Animal("Bear", world.height/2, world.width/2);
        world.map[animal.y][animal.x] = animal.mapChar;
        while(true) {
            world.map[animal.y][animal.x] = animal.mapChar;
            world.drawMap();
            animal.moveAnimal();
            Thread.sleep(500);
        }
    }
}


// Generate empty map
// Animal generation
    // Animal decides where to move depending on x, y
    // Animal moves
    // Animal eats
        // Map updates with new animal position
