/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;
import java.util.*;

/**
 *
 * @author Milind
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date(1_000_000_000_000L);  // a trillion!
        String s = d.toString();
        System.out.println("Print date : " +s );
        d.setTime(d.getTime()+3600000); //3600000 milli Sec => Hour
        System.out.println("New Time : " +d.toString());
   
    }
    
}
