import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(5757)) {
            System.out.println("waiting for a client to connect...");
            try(Socket socket = server.accept()){
                System.out.println("client connected from port: "+socket.getLocalPort()+" successfully");
                String res="";
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                String test =(String)objectInputStream.readObject();


                while(!test.equals("over")){
                    res+=test+'\n';
                    objectOutputStream.writeObject(res);
                    test =(String)objectInputStream.readObject();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
