
package br.edu.fafic.sd;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        try {
          ILogin login = (ILogin) Naming.lookup("rmi://100.64.184.5:3000/telalogin");
        do{
            System.out.println("Usuário: ");  
            String usuario = sc.nextLine();
            System.out.println("Senha: ");
            String senha = sc.nextLine();
            System.out.println(login.logar(usuario, senha));
            System.out.println("Digite 1 para sair:");
            opcao = sc.nextInt();
        }while(opcao == 0);   
        
        
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
