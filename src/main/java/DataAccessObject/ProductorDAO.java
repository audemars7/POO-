package DataAccessObject;

import interfaces.IBaseDAO;
import BusinessEntity.ProductorBE;

import java.sql.*;
import java.util.*;

public class ProductorDAO extends ConexionMySQL implements IBaseDAO<ProductorBE> {

    @Override
    public boolean Create(ProductorBE input) {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO Productor(nombre) VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, input.getNombre());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ProductorBE Read(String id) {
        ProductorBE p = null;
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM Productor WHERE id_productor=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p = new ProductorBE();
                p.setIdProductor(rs.getInt("id_productor"));
                p.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public List<ProductorBE> ReadAll() {
        List<ProductorBE> lista = new ArrayList<>();
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM Productor";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductorBE p = new ProductorBE();
                p.setIdProductor(rs.getInt("id_productor"));
                p.setNombre(rs.getString("nombre"));
                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean Update(ProductorBE input) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE Productor SET nombre=? WHERE id_productor=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, input.getNombre());
            ps.setInt(2, input.getIdProductor());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Delete(String id) {
        try (Connection conn = getConnection()) {
            String sql = "DELETE FROM Productor WHERE id_productor=?";
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
