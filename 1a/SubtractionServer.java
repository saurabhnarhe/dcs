
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public interface SubtractionServer {
    public static void main(String args[]) {
        try {
            ServerSocket ss       = new ServerSocket(3000);
            Socket s              = ss.accept();
            DataInputStream dis   = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            int i = dis.readInt();
            int j = dis.readInt();
            
            dout.writeInt(i-j);
            
            s.close();
            ss.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
