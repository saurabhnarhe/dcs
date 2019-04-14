
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) {
        try {
            ServerSocket ss       = new ServerSocket(5000);
            Socket s              = ss.accept();
            DataInputStream dis   = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            int i    = dis.readInt();
            int j    = dis.readInt();
            int ch   = dis.readInt();
            int port = 2000;
            
            switch(ch) {
                case 1:
                    port = 2000;
                    break;
                case 2: 
                    port = 3000;
                    break;
                default: 
                    System.out.println("Wrong choice...");
            }
            
            Socket as              = new Socket("localhost", port);
            DataInputStream adis   = new DataInputStream(as.getInputStream());
            DataOutputStream adout = new DataOutputStream(as.getOutputStream());
            adout.writeInt(i);
            adout.writeInt(j);
            dout.writeInt(adis.readInt());
            
            s.close();
            ss.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
