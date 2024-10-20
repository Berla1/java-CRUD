package services;

import dao.UserDAO;
import models.User;

import java.util.List;
import java.util.Scanner;

public class UserService {

    Scanner scanner = new Scanner(System.in); // scanner

    UserDAO userDAO = new UserDAO();
    public void setUser() {
        User u = new User();

        System.out.print("Digite o nome do usuario que deseja cadastrar: ");
        u.setNome(scanner.next());
        System.out.print("Digite a idade do usuario que deseja cadastrar: ");
        u.setIdade(scanner.nextInt());
        System.out.println("--------------------------------------------------------------");

        userDAO.postUser(u);
    }

    public void getUser() {
        List<User> usuarios = userDAO.getUsers();

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (User usuario : usuarios) {
                System.out.println("ID: " + usuario.getId());
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Idade: " + usuario.getIdade());
                System.out.println("--------------------------------------------------------------");
            }
        }
    }

    public void updateUser(){
        User u = new User();

        System.out.print("Digite o nome do usuário que deseja alterar: ");
        u.setNome(scanner.next());
        System.out.print("Digite a idade do usuário: ");
        u.setIdade(scanner.nextInt());
        System.out.print("Digite o ID do usuário para alterar com sucesso: ");
        u.setId(scanner.nextInt());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Usuário alterado com sucesso!");

        userDAO.updateUser(u);
    }

    public void deleteUser(){

        System.out.print("Digite o ID do usuário que deseja deletar: ");
        int id = scanner.nextInt();
        userDAO.deleteUser(id);
        System.out.println("Usuário deletado com sucesso!");
    }

}

