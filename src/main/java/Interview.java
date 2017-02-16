/**
 * Created by coco1 on 2017/2/16.
 */
package tcpTest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

    public class Interview {
        public static void main(String args[]) throws IOException {
            String clientSentence;
            String capitalizedSentence;
            @SuppressWarnings("resource")
            ServerSocket welcomeSocket = new ServerSocket(8080);
            while (true) {
                Socket connectionSocket = welcomeSocket.accept();
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                clientSentence = inFromClient.readLine();
                System.out.print(clientSentence);
                capitalizedSentence = clientSentence.toUpperCase() + '\n';
                outToClient.writeBytes(capitalizedSentence);
            }
        }
    }

