package com.mycompany.project_cacao;

import BusinessEntity.ProductorBE;
import DataAccessObject.ConexionMySQL;
import DataAccessObject.ProductorDAO;
import java.sql.Connection;

public class TestProductor {
    public static void main(String[] args) {
        try {
            Connection conn = ConexionMySQL.getConnection();
            System.out.println("✅ Conexión exitosa");

            ProductorDAO dao = new ProductorDAO(); 
            ProductorBE p = new ProductorBE();
            p.setNombre("Cacao Santa María");

            dao.Create(p); 
            System.out.println("✅ Productor insertado correctamente");

            conn.close();
        } catch (Exception e) {
            System.err.println("❌ Error:");
            e.printStackTrace();
        }
    }
}
