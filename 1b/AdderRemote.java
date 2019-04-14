import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote() throws RemoteException {
        super();
    }
    public String concat(String x, String y) {
        return "This is Concatenated String:"+x+y;
    }
}
