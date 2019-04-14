
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        try {
           Socket s              = new Socket("localhost", 5000);
           DataInputStream dis   = new DataInputStream(s.getInputStream());
           DataOutputStream dout = new DataOutputStream(s.getOutputStream());
           Scanner sc            = new Scanner(System.in);
           
           System.out.println("Enter 2 numbers: ");
           int i = sc.nextInt();
           int j = sc.nextInt();
           System.out.println("1. Add \n2. Subtract \n Enter your choice: ");
           int ch = sc.nextInt();
           
           dout.writeInt(i);
           dout.writeInt(j);
           dout.writeInt(ch);
           
           System.out.println("Answer is = " + dis.readInt());
           
           s.close();
           
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
