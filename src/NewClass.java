/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faisal
 */
import java.util.*;

public class NewClass {

    public static void main(String args[]) {
        Calendar dateTime = Calendar.getInstance();
        System.out.printf("%tr\n",dateTime);
        System.out.printf("%1$tA,%1$tB%1$td,%1$tY\n",dateTime);
        System.out.printf("%1$ta,%1$tb%1$te,%1$ty\n",dateTime);
        System.out.printf("%1$tZ%1$tI:%1$tM:%1$tS",dateTime);
    }
}
