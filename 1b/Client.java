
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    
    public static void main(String args[]) throws RemoteException {
      try {
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost", 9999);
            Adder stub = (Adder)reg.lookup("test");
            System.out.println("Enter two numbers to add : \n");
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println("Addition is = " + stub.add(i, j));
        } catch (Exception e) {
            
        }
    }
    
}
