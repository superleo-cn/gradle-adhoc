/**
 * Created by superleo on 16/5/15.
 */

package com.leo;

public class MyUtil {

    public String getName(){
        return "Hello Leo 2015";
    }

    public static void main(String [] args){
        System.out.println(MyUtil.class.getResource("/aa.xml").getPath());
    }
}
