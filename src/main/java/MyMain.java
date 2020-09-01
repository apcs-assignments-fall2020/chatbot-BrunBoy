import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("What's ur name?");
        String name=scan.next();
        System.out.println("Hey "+name+", what's ur favorite food?");
        String food=scan.next();
        System.out.println("I like "+food+" too");
        System.out.println("What's ur favorite shade of blue " +name+" ?");
        String shadeOfBlue=scan.next();
        System.out.println("Oh, I don't really like "+shadeOfBlue+" .");
        System.out.println("What's your favorite color in general "+name+" ?");
        String colorInGeneral=scan.next();
        System.out.println("I love "+colorInGeneral);
        System.out.println("Ok. Final question. Are you quirky "+name+"? Say 'quirky' if yes or 'not' if no.");
        String quirky=scan.next();
        System.out.println("We'll get along great then "+name+". I am "+quirky+" too.");



        scan.close();
    }
}
