/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemploselect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marce
 */
public class Conecta {
    
    public Connection fazConexao(){
        Connection c=null;
        try {
            String url,user,password;
            user="root";
            password="usbw";
            url = "jdbc:mysql://localhost:3307/test";
            c = DriverManager.getConnection(url, user, password);
            System.out.println("Deu certo");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Deu Errado");
        }
        return c;
    }
    
}
