/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nisanisaan.project.Modul3.guided;

/**
 *
 * @author Admin
 */
public class Circle01 {
    public static final double PI = 3.14159;
    
    public static double radiansToDegress(double rads){
        return rads * 100 / PI;
    }
    
    public double r;
    
    public double area(){
        return PI * r * r;
    }
    
    public double circumference(){
        return 2 * PI * r;
    }
    
}
