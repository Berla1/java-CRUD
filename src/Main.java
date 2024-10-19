
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.setUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
    }


}
