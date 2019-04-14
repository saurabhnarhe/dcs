import java.rmi.*;

public class MyClient {
    public static void main(String args[]) {
        try {
            String str1 = "MIT";
            String str2 = "-COE";
            Adder stub = (Adder)Naming.lookup("rmi://localhost:5000/shack");
            System.out.println(stub.concat(str1,str2));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
