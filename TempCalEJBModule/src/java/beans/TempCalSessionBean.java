/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author SK
 */
@Stateless
public class TempCalSessionBean implements TempCalSessionBeanRemote {

    @Override
    public double fToC(double tempInF) {
        return (5.0 / 9.0) * (tempInF - 32.0);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
