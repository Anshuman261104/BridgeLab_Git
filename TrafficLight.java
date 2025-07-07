// 07-07-2025//

import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine().trim().toLowerCase();
        String message;
        switch (color) {
            case "red":
                message = "STOP!";
                break;
            case "yellow":
                message = "GET READY!";
                break;
            case "green":
                message = "GO!";
                break;
            default:
                message = "Invalid color! Please enter Red, Yellow, or Green.";
        }
        System.out.println(message);
        scanner.close();
    }
}
