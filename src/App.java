// Chat bot - 1.0
public class App {
    public static void main(String[] args) throws Exception {
        world.generateMap();
        animals.generateAnimal();
        int x = (int) (Math.random() * world.horizontalSizeOfWorld-1);
        int y = (int) (Math.random() * world.verticalSizeOfWorld-1);
        String animal = animals.generateAnimal();
        world.map[y][x] = animal;
        world.drawMap();

        while (true){
            world.map[y][x] = "_";
            String decision = animals.whereToMoveAnimal();
            if (decision == "Right") x++;
            else if (decision == "Left") x--;
            else if (decision == "Up") y--;
            else if (decision == "Down") y++;
            else if (decision == "LeftUp") {x--; y--;}
            else if (decision == "LeftDown") {x--; y++;}
            else if (decision == "RightUp") {x++; y--;}
            else if (decision == "RightDown") {x++; y++;}
            else if (decision == "Resting") {}
            world.map[y][x] = animal;
            world.drawMap();
            Thread.sleep(1000);
        }
    }
}