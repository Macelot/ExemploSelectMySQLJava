/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemploselect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c;
        Conecta conecta;
        conecta = new Conecta();
        c = conecta.fazConexao();
        try {
            String comando = "SELECT * from usuarios100 "
                    + "WHERE salario > 30000 "
                    + "ORDER BY salario DESC "
                    + "LIMIT 0,30;";
            Statement stmt = c.createStatement();
            
            ResultSet result;
            result = stmt.executeQuery(comando);
            System.out.printf("%7s","Id");
            System.out.printf("%30s","Nome");
            System.out.printf("%12s","Salário");
            System.out.println("");
            while(result.next()){
                System.out.printf("%7d",result.getInt("id"));
                System.out.printf("%30s",result.getString("nome"));
                System.out.printf("%13.2f",result.getFloat("salario"));
                System.out.println("");
            }
            
        } catch (Exception e) {
        
        }
        
    }
    
}
