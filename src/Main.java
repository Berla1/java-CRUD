public class Main {
    public static void main(String[] args) {
        User u = new User();

        u.setNome("Gustavo2");
        u.setIdade(19);

        new UserDAO().cadastrarUser(u);
    }


}
