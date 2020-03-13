
package br.edu.fafic.sd;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    
    public static void main(String[] args) {
        
        try {
            Registry reg = LocateRegistry.createRegistry(3000);
            reg.rebind("login", new LoginImpl());
            System.out.println("Servidor inicado...");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
