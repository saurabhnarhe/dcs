
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public int add(int i, int j) throws RemoteException;
}
