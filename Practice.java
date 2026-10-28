import java.util.Scanner;

public class Practice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String userinput = scan.nextLine();
        int n = scan.nextInt();
        char c = userinput.charAt(n);

        if(
            c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
        ) {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is not a vowel.");
        }
        scan.close();
    }
}