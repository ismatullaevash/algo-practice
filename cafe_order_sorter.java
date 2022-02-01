/*
Given all three arrays, write a method to check that my service is first-come, first-served. All food should come out in the same order customers requested it.
*/


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {

        // check if we're serving orders first-come, first-served
        
        
        int takeOutIndex=0;
        int dineInIndex=0;
        int servedOrderIndex=0;
        
        
        if(servedOrders.length < takeOutOrders.length + dineInOrders.length || servedOrders.length == 0)
        {
            return false;
        }
        
        while(true)
        {
            if(servedOrderIndex == servedOrders.length)
            {
                return true;
            }
            
        if ((takeOutIndex < takeOutOrders.length) && (takeOutOrders[takeOutIndex] == servedOrders[servedOrderIndex])) {
        takeOutIndex++;

        // if we still have orders in dineInOrders
        // and the current order in dineInOrders is the same
        // as the current order in servedOrders
        } else if ((dineInIndex < dineInOrders.length)
                && (dineInOrders[dineInIndex] == servedOrders[servedOrderIndex])) {
            dineInIndex++;

        // if the current order in servedOrders doesn't match
        // the current order in takeOutOrders or dineInOrders, then we're not
        // serving in first-come, first-served order.
        } else {
            return false;
        }
            
            
            servedOrderIndex++;
        }

        
    }
