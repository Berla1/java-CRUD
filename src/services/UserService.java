package services;

import dao.UserDAO;
import models.User;

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

    public void getUser(){
        for(User usuario : userDAO.getUsers()){

           System.out.println("ID: " + usuario.getId());
           System.out.println("model.User: " + usuario.getNome());
           System.out.println("Idade: " + usuario.getIdade());
           System.out.println("--------------------------------------------------------------");
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

