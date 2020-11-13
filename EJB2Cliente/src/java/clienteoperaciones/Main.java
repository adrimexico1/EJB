/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteoperaciones;

import java.util.Properties;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import org.uv.OperacionesRemote;

/**
 *
 * @author adrian
 */
public class Main {

    @EJB
    private static OperacionesRemote operaciones;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            String host = "192.168.100.10";
            String port = "3700";
            Properties prop = new Properties();
            prop.put("org.omg.CORBA.ORBInitialHost", host);
            prop.put("org.omg.CORBA.ORBInitialPort", port);
            InitialContext context = new InitialContext(prop);
            OperacionesRemote greeting = (OperacionesRemote) context.doLookup("java:global/EJB2-ejb/Operaciones");
            int x = 5;
            int y = 5;
            System.out.println(operaciones.Suma(x, y));
            System.out.println(operaciones.Resta(x, y));
            System.out.println(operaciones.Multiplicacion(x, y));
            System.out.println(operaciones.Division(x, y));
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
