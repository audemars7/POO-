package DataAccessObject;

import BusinessEntity.DetalleCompraBE;
import java.sql.*;
import java.util.*;
import interfaces.IBaseDAO;

public class DetalleCompraDAO extends ConexionMySQL implements IBaseDAO<DetalleCompraBE> {
    @Override
    public boolean Create(DetalleCompraBE input) {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO DetalleCompra(id_compra, id_productor, kilos, precio_kg, monto_total) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, input.getIdCompra());
            ps.setInt(2, input.getIdProductor());
            ps.setDouble(3, input.getKilos());
            ps.setDouble(4, input.getPrecioKg());
            ps.setDouble(5, input.getMontoTotal());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public DetalleCompraBE Read(String id) {
        DetalleCompraBE detalle = null;
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM DetalleCompra WHERE id_detalle=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                detalle = new DetalleCompraBE();
                detalle.setIdDetalle(rs.getInt("id_detalle"));
                detalle.setIdCompra(rs.getInt("id_compra"));
                detalle.setIdProductor(rs.getInt("id_productor"));
                detalle.setKilos(rs.getDouble("kilos"));
                detalle.setPrecioKg(rs.getDouble("precio_kg"));
                detalle.setMontoTotal(rs.getDouble("monto_total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detalle;
    }

    @Override
    public List<DetalleCompraBE> ReadAll() {
        List<DetalleCompraBE> lista = new ArrayList<>();
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM DetalleCompra";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleCompraBE d = new DetalleCompraBE();
                d.setIdDetalle(rs.getInt("id_detalle"));
                d.setIdCompra(rs.getInt("id_compra"));
                d.setIdProductor(rs.getInt("id_productor"));
                d.setKilos(rs.getDouble("kilos"));
                d.setPrecioKg(rs.getDouble("precio_kg"));
                d.setMontoTotal(rs.getDouble("monto_total"));
                lista.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean Update(DetalleCompraBE input) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE DetalleCompra SET id_compra=?, id_productor=?, kilos=?, precio_kg=?, monto_total=? WHERE id_detalle=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, input.getIdCompra());
            ps.setInt(2, input.getIdProductor());
            ps.setDouble(3, input.getKilos());
            ps.setDouble(4, input.getPrecioKg());
            ps.setDouble(5, input.getMontoTotal());
            ps.setInt(6, input.getIdDetalle());
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
            String sql = "DELETE FROM DetalleCompra WHERE id_detalle=?";
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
