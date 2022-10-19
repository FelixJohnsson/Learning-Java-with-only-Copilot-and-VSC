public class Animal {
    public String type;
    public String mapChar; 
    public int x; // VERTICAL
    public int y; // HORIZONTAL
    public Animal(String type, int x, int y) {
        this.type = type;
        this.mapChar = type.substring(0, 1);
        this.x = x;
        this.y = y;
    }
    public void moveAnimal () {
        int randomInt = (int) (Math.random() * 9);
        if(randomInt == 1) {
            if(x + 1 < world.width) {
                world.map[y][x] = "_";
                x++;
            }
        }
        else if(randomInt == 2) {
            if(x - 1 > 0) {
                world.map[y][x] = "_";
                x--;
            }
        }
        else if(randomInt == 3) {
            if(y + 1 < world.height) {
                world.map[y][x] = "_";
                y++;
            }
        }
        else if(randomInt == 4) {
            if(y - 1 > 0) {
                world.map[y][x] = "_";
                y--;
            }
        }
        else if(randomInt == 5) {
            if(x < world.width && y + 1 < world.height) {
                world.map[y][x] = "_";
                x++;
                y++;
            }
        }
        else if(randomInt == 6) {
            if(x - 1 > 0 && y - 1 > 0) {
                world.map[y][x] = "_";
                x--;
                y--;
            }
        }
        else if(randomInt == 7) {
            if(x < world.width && y - 1 > 0) {
                world.map[y][x] = "_";
                x++;
                y--;
            }
        }
        else if(randomInt == 8) {
            if(x - 1 > 0 && y + 1 < world.height) {
                world.map[y][x] = "_";
                x--;
                y++;
            }
        } else {}

    }
}