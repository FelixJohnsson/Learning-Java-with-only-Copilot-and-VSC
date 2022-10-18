// Chat bot - 1.0

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        String name = CollectString.main();
        Timeout.main(1);
        Greet.main(name);
    }
}

class CollectString {
    public static String main() {
        System.out.println("What is your name?");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            return name;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}

class Greet {
    public static void main(String name) {
        System.out.println("Hello, " + name);
    }
}

class Timeout {
    public static void main(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}