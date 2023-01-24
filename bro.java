import java.util.Scanner;

public class bro {
   
    public static void main(String[]args){

        // int x = 123; //initialization 
        // float y = 3.14f;
        // String name ="I like the new language";

        // System.out.println("I like to eat:"+y);
        // System.out.println(x);
        // System.out.println(name);
        
        // String x = "Brenda";
        // String y = "Giovanni";
        // String temp;

        // temp=x;
        // x=y;
        // y=temp;
      

        // System.out.println("Brenda: "+x);
        // System.out.println("Giovanni: "+y);

            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your name? ");
            String name = scanner.nextLine();
            System.out.println("How old are you? ");
            int age = scanner.nextInt();

            System.out.println("Hello "+name);
            System.out.println("You are "+age+" years old");




    }
}
