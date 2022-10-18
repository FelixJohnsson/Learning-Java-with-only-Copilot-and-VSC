public class world {
    public static int horizontalSizeOfWorld = 100;
    public static int verticalSizeOfWorld = 16;
    public static String[][] map = new String[horizontalSizeOfWorld][verticalSizeOfWorld];

    private static String[] generateLayer () {
        String[] layer = new String[horizontalSizeOfWorld];
        for (int i = 0; i < horizontalSizeOfWorld; i++) {
            if(i == 0) layer[i] = "|";
            else if(i == horizontalSizeOfWorld - 1) layer[i] = "|";
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
        for(int i = 0; i < verticalSizeOfWorld; i++){
            String[] layer = generateLayer();
            map[i] = layer;
        }
    }

    public static void drawMap () {
        System.out.print("\033[H\033[2J");
        for(int i = 0; i < verticalSizeOfWorld; i++){
            for(int j = 0; j < horizontalSizeOfWorld; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static void map() {
    }
}
