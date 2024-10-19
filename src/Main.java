import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        boolean fisish = false;

        do {
            System.out.println("1 | Ver usuários cadastrados");
            System.out.println("2 | Cadastrar usuário");
            System.out.println("3 | Atualizar usuário por ID");
            System.out.println("4 | Deletar usuário por ID");
            System.out.println("5 | Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            System.out.println("--------------------------------------------------------------");

            switch (opcao) {
                case 1:
                    userService.getUser();
                    break;
                case 2:
                    userService.setUser();
                    break;
                case 3:
                    userService.updateUser();
                    break;
                case 4:
                    userService.deleteUser();
                    break;
                case 5:
                    fisish = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (!fisish);
    }
}
