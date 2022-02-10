/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.servicios.Menu;

/**
 *
 * @author Skpo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        try {
            Menu.menu();
        } catch (Exception e) {
            throw e;
//            e.printStackTrace();
        }

    }

}
