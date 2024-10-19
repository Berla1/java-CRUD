import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner
        UserService userService = new UserService();

        userService.setUser();
        userService.getUser();
        userService.updateUser();
    }
}
