package me.theaulait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by MyRiceBowl on 12/5/15.
 */
public class Words {
    public String Picked() {
        String[] Words = {"love", "joyful", "windy", "helpful", "calm", "win" };
        Random random = new Random();
        int position = random.nextInt(Words.length); // get a number in position
        String word = Words[position]; // get the word from the position
        return word;
    }
}
