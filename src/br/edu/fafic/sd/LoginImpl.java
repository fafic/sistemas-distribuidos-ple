
package br.edu.fafic.sd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginImpl extends UnicastRemoteObject implements ILogin {

    public LoginImpl()throws RemoteException{
        
    }
    
    @Override
    public String logar(String usuario, String senha) throws RemoteException {
        if(usuario.equalsIgnoreCase("admin")
                && senha.equalsIgnoreCase("admin")
                ){
            return "Seja Bem-Vindo Luciano";
        }
            return "Login ou senha inválidos!";
    }
    
}
