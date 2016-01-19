package algorithms.strings.palindromeindex;

import java.util.Scanner;

/**
 * Created by buyan on 1/19/16.
 */
public class Solution {

    private static boolean isPalindrome(String word){
        int i = 0;
        do {
            if (word.charAt(i) != word.charAt(word.length()-1-i))
                return false;
        } while(++i < word.length()/2);

        return true;
    }

    private static int getPalindromeIndex(String word) {
        int index = -1;
        if (isPalindrome(word))
            return index;

        while(++index < word.length()) {
            if (isPalindrome(word.substring(0,index) + word.substring(index+1)))
                return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        while(testCases-->0)
            System.out.println(getPalindromeIndex(stdin.next()));
    }
}