/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author Admin
 */
public class angka {

    public static void main(String[] args) {

        int i;

        // For
        for (i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }

        // While
        i = 1;
        while (i <= 10) {
            System.out.println(Integer.toString(i));
            i++;
        }

        // Do While
        i = 1;
        do {
            System.out.println(Integer.toString(i));
            i++;
        } while (i <= 10);
    }
}