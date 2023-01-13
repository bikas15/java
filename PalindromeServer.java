/*name=bikas banjade
rollno=201705
bese day */
import java.io.*;
import java.net.*;
public class PalindromeServer {
public static void main(String[] args) throws IOException {
ServerSocket serverSocket = new ServerSocket (3600);
Socket clientSocket = serverSocket.accept();
PrintWriter out = new PrintWriter (clientSocket. getOutputStream() ,  true);
BufferedReader in = new BufferedReader (new InputStreamReader (clientSocket. getInputStream())) ;
String inputLine;
while ((inputLine = in.readLine ( )) != null) {
if (isPalindrome (inputLine)) {
System.out.println("Palindrome");}
 else {
System.out.println("Not a Palindrome");
}}}
public static boolean isPalindrome (String s) {
int i = 0, j = s.length() - 1;
while (i < j){
if (s.charAt (i)!= s.charAt(j)) {
return false;
}
i++;
j--;
}
return true;
}}