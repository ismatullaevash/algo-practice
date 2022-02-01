/*
Write a method that takes an array of characters and reverses the letters in place. 
*/

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static void reverse(char[] arrayOfChars) {

        // reverse input array of characters in place
        int first = 0;
        int last = arrayOfChars.length-1;
        while (first < last) {
            char temp = arrayOfChars[first];
            arrayOfChars[first] = arrayOfChars[last];
            arrayOfChars[last] = temp;
            first++;
            last--;
        }

    }
