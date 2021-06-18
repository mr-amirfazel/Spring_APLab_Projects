import javax.security.sasl.SaslClient;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try(Socket client = new Socket("127.0.0.1",5757)) {
                System.out.println("connected to server");
                System.out.println("write your text //send \'\'over\'\' to finish task//");
                OutputStream out = client.getOutputStream();
                InputStream in = client.getInputStream();
                ObjectOutputStream outputStream = new ObjectOutputStream(out);
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                String data = scanner.nextLine();
                while(!data.equals("over")){
                   outputStream.writeObject(data);
                   System.out.println((String)objectInputStream.readObject());
                    data = scanner.nextLine();

                }
                outputStream.writeObject(data);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
             }


    }
}
