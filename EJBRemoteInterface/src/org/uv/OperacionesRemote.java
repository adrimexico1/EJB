/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv;

import javax.ejb.Remote;

/**
 *
 * @author adrian
 */
@Remote
public interface OperacionesRemote {

    Integer Suma(int x, int y);

    Integer Resta(int x, int y);

    Integer Division(int x, int y);

    Integer Multiplicacion(int x, int y);
    
}
