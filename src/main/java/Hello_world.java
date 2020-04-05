import java.util.Scanner;

public class Hello_world
{
    public static void main(String[] arg)
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please, give me your name");
        if(inputScanner.hasNext()) {
            String input = inputScanner.nextLine();
            System.out.println("Hello, " + input);
        }else{
            System.out.println("Incorrect input");
        }
    }
}
