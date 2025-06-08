package DataAccessObject;

import interfaces.IBaseDAO;
import BusinessEntity.CompraBE;
import java.sql.*;
import java.util.*;


public class CompraDAO extends ConexionMySQL implements IBaseDAO<CompraBE> {
    public boolean Create(CompraBE input) {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO Compra(fecha) VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(input.getFecha().getTime()));
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public CompraBE Read(String id) {
        CompraBE compra = null;
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM Compra WHERE id_compra = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                compra = new CompraBE();
                compra.setIdCompra(rs.getInt("id_compra"));
                compra.setFecha(rs.getDate("fecha"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return compra;
    }

    public List<CompraBE> ReadAll() {
        List<CompraBE> lista = new ArrayList<>();
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM Compra";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CompraBE c = new CompraBE();
                c.setIdCompra(rs.getInt("id_compra"));
                c.setFecha(rs.getDate("fecha"));
                lista.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean Update(CompraBE input) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE Compra SET fecha=? WHERE id_compra=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(input.getFecha().getTime()));
            ps.setInt(2, input.getIdCompra());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Delete(String id) {
        try (Connection conn = getConnection()) {
            String sql = "DELETE FROM Compra WHERE id_compra=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
        