import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User u = new User();

        System.out.print("Digite o nome do usuario que deseja cadastrar: ");
        u.setNome(scanner.next());
        System.out.print("Digite a idade do usuario que deseja cadastrar: ");
        u.setIdade(scanner.nextInt());

        new UserDAO().cadastrarUser(u);
    }


}
