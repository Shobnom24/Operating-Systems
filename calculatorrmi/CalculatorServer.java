
package calculatorrmi;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;


public class CalculatorServer {
    public static void main(String[] args) throws RemoteException,NotBoundException{
        /*
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", new CalculatorRmi());
            System.out.println("Server is Running");
        } catch (Exception e) {
             System.out.println("Server nt connected "+e);
        }*/
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", new CalculatorRmi());
            System.out.println("Server is Running");
        
    }
}
