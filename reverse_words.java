/*
Write a method reverseWords() that takes a message as an array of characters and reverses the order of the words in place. 
*/

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static void reverseWords(char[] message) {

        // decode the message by reversing the words
        reverseChars(message,0,message.length-1);
        int currWordStartIndex=0;
        for(int i=0;i<=message.length;i++){
            if(i==message.length||message[i]==' '){
                reverseChars(message,currWordStartIndex,i-1);
                currWordStartIndex=i+1;
            }
        }

    }
    public static void reverseChars(char[] message,int left,int right){
        while(left<right){
            char temp=message[left];
            message[left]=message[right];
            message[right]=temp;
            left++;
            right--;
        }
        
    }
