import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User u = new User();

        System.out.print("Digite o nome do usuario que deseja cadastrar: ");
        u.setNome(scanner.next());
        System.out.print("Digite a idade do usuario que deseja cadastrar: ");
        u.setIdade(scanner.nextInt());
        System.out.println("--------------------------------------------------------------");

        new UserDAO().cadastrarUser(u);

        UserDAO userDAO = new UserDAO();
        for(User usuario : userDAO.getUsers()){
            System.out.println("ID: " + usuario.getId());
            System.out.println("User: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("--------------------------------------------------------------");
        }
    }


}
