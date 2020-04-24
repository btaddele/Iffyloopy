import java.util.Scanner;

public class Iffy {
    public static void main(String[] args) {
        String words;
        boolean redEyes;
        String ans;

        Scanner input = new Scanner(System.in);

        for(int x=0; x<5; x++){
            System.out.print("enter a random word: ");
            words = input.nextLine();
        }
        System.out.println("Are your eyes red?");
        ans = input.nextLine();

        if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
            System.out.println("Get some sleep!");
        } else {
            System.out.println("You look great!");
        }





    }
}
