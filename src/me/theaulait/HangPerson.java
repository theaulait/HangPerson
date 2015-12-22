package me.theaulait;

import java.util.Scanner;

/**
 * Created by MyRiceBowl on 12/9/15.
 */
public class HangPerson {

    public static void hangPerson(){
        String line = "";
        int count = 8;
        char guess;
        Words word = new Words();
        String secretWord = word.Picked();
        int letter = secretWord.length();
        for(int i = 0; i < secretWord.length(); i ++){
            line += "_";
        }
        System.out.println("Welcome to Hangperson");
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Your word has " + letter + " letters. " + line + " You have " + count + " tries left.");
            String guessChar = input.nextLine().toLowerCase();
            guess = guessChar.charAt(0);
            if(guessChar.length() != 1){
                System.out.println("You did not enter a letter. Please enter again!");
            }
            if(secretWord.indexOf(guess) == -1){
                System.out.println("There are no " + guess);
                --count;
            }
            if(count == 0){
                System.out.println("Oh no, the person is dead. You lose! Better luck next time.");
                System.out.println("Your word  was: " + secretWord);
                break;
            }
            else if(secretWord.indexOf(guess) != -1){
                System.out.println("You got it!");
                for(int i = 0; i < secretWord.length(); i++){
                    if(secretWord.charAt(i) == guess){
                        line = line.substring(0, i) + guess + line.substring(i + 1, line.length());
                    }
                }
            }

        }while(line.contains("_"));

        if(secretWord.equals(line)){
            System.out.println("You won!");
            System.out.println("You got the word: " + secretWord);
        }
    }

}
