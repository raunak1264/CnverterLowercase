package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "Harry bhai";
        String uname = name.toLowerCase();
        System.out.println(uname);
        System.out.println(uname.replace(" ","_"));
        System.out.println("letter = Dear "+ name.replace("<|name|>", name)+" thanks a lot");
        System.out.println("Letter = \"Dear Harry, This Java course is nice Thanks\"");
        String name2 = "I am  a   coder.";
        System.out.println(name2.indexOf("  "));
        System.out.println(name2.indexOf("     "));
        //System.out.println(name2.contains("  " ) && name2.contains("   "));// did not work for me
        System.out.println(name2.formatted());
        if(name2.contains(" v ")){
            System.out.println("the statement contains double space");}
            else if(name2.contains(" 3  ")){
                System.out.println("this has 3 spaces");}
                else{
                    System.out.println(" No double or tripple spaces");
                }


                }
            }


        }

