/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trekplanner;

/**
 *
 * @author ADMIN
 */
public class UserData {
    
    public static int check = 0;
    public static int verify = 0;
    public static int cost = 0;
    public static String CheckSignIn;
    
    public static void setChecksignIn(String name){
        CheckSignIn = name;
    }
    
    public static String getCheckSignIn(){
        if(check == 1)
            return CheckSignIn;
        else 
            return null; 
    }
}
