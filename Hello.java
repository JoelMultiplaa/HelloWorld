import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class spil {
    public static void main(String[] args){

    Random random = new random();
int numberToguess = random.nextInt();
        int guess = 0;
Scanner keyboard = new Scanner(System.in);
System.out.println("gæt et tal fra 1 til 10");
do{
    System.out.print("Enter et tal:");
    guess = keyboard.nextInt();
    if(guess > numberToguess);
        System.out.println("For højt");

    }
while(guess!=numberToguess);
System.out.println("Du gættede rigtig");
}
