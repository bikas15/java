/*name=bikas banjade
rollno=201705
bese day */
import java.io.*; import java.net.*;
import java.util.Scanner;
public class PalindromeClient {
    public static void main(String[] args) throws IOException {
Socket clientSocket = new Socket ("localhost",6000);
PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
BufferedReader in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
Scanner sc = new Scanner (System. in);
String input;
while (true) {
System.out .print("Enter a string to check: ");
input = sc.nextLine();
System.out.println(input);
System.out.println(in.readLine());
}
    }
}