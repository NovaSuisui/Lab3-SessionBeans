/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempcalclient;

import beans.TempCalSessionBeanRemote;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author SK
 */
public class Main {

    @EJB
    private static TempCalSessionBeanRemote tempCalSessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter F : ");
        double tempInF = in.nextDouble();
        System.out.print("Temp in C : " + tempCalSessionBean.fToC(tempInF));
    }
    
}
