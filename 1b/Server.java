
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Adder {
    Server() throws RemoteException {
        super();
    }
    @Override
    public int add(int i, int j) throws RemoteException {
        return i+j;
    }
    
    public static void main(String args[]) throws RemoteException {
        try {
            Registry reg = LocateRegistry.createRegistry(9999);
            reg.rebind("test", new Server());
            System.out.println("Server running...");
        } catch(RemoteException e) {
            System.out.println(e);
        }
    }
    
}
