public class world {
    public static int height = 100;
    public static int width = 16;
    public static String[][] map = new String[height][width];

    private static String[] generateLayer () {
        String[] layer = new String[height];
        for (int i = 0; i < height; i++) {
            if(i == 0) layer[i] = "|";
            else if(i == height - 1) layer[i] = "|";
            else {
                int randomInt = (int) (Math.random() * 20);
                if (randomInt == 1) layer[i] = "^";
                else if (randomInt == 2) layer[i] = "*";
                else layer[i] = "_";
            }
        }
        return layer;
    }

    public static void generateMap () {
        for(int i = 0; i < width; i++){
            String[] layer = generateLayer();
            map[i] = layer;
        }
    }

    public static void drawMap () {
        System.out.print("\033[H\033[2J");
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static void map() {
    }
}
