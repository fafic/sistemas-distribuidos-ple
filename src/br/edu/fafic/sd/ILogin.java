
package br.edu.fafic.sd;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ILogin extends Remote {
    
    
    public String logar(String usuario, String senha)throws RemoteException;
    
}
