/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv;

import javax.ejb.Stateless;

/**
 *
 * @author adrian
 */
@Stateless
public class Operaciones implements OperacionesRemote {

    @Override
    public Integer Suma(int x, int y) {
        return x+y;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer Resta(int x, int y) {
        return x-y;
    }

    @Override
    public Integer Division(int x, int y) {
        return x/y;
    }

    @Override
    public Integer Multiplicacion(int x, int y) {
        return x*y;
    }
    
    
}
