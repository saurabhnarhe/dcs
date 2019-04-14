import java.io.*;
import java.net.*;
import java.util.Scanner;
public class server {
public static void main(String[] args) {
	int sum=0;
	int sub=0;
	int client = 1236;
	int additionServer = 1111;
	int subtractionServer = 2222;
	try {
		ServerSocket ss = new ServerSocket(client);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dout2=new DataOutputStream(s.getOutputStream());
		int i = dis.readInt();
		int j = dis.readInt();
		int ch = dis.readInt();
		//int num = i + j;

		//System.out.println("Sum " + num);
		switch(ch){
			case 1:
				Socket s1=new Socket("localhost",additionServer);
				DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
				DataInputStream din = new DataInputStream(s1.getInputStream());
				dout.writeInt(i);
				dout.writeInt(j);
				sum = din.readInt();
				s1.close();
				dout2.writeInt(sum);
			break;
			case 2:
				Socket s11=new Socket("localhost",subtractionServer);
				DataOutputStream dout1=new DataOutputStream(s11.getOutputStream());
				DataInputStream din1 = new DataInputStream(s11.getInputStream());
				dout1.writeInt(i);
				dout1.writeInt(j);
				sub = din1.readInt();
				s11.close();
				dout2.writeInt(sub);
			break;
		}
		ss.close();
	
} catch (Exception e) {
System.out.println(e);
}
}
}
