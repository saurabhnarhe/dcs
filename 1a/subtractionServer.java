import java.io.*;
import java.net.*;
import java.util.Scanner;
public class subtractionServer {
public static void main(String[] args) {
	try {
		ServerSocket ss = new ServerSocket(2222);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		int i = dis.readInt();
		int j = dis.readInt();
		int num = i - j;
		dout.writeInt(num);

		//System.out.println("Sum " + num);
		ss.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
