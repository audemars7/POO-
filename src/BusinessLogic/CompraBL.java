package BusinessLogic;

import BusinessEntity.Compra;
import BusinessEntity.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class CompraBL {
    private List<Compra> compras = new ArrayList<>();

    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public List<Compra> listarCompras() {
        return compras;
    }

    public double calcularTotal(Compra compra) {
        return compra.getCantidadKilos() * compra.getPrecioPorKilo();
    }

    public boolean validarProveedor(Proveedor proveedor) {
        return proveedor != null && proveedor.getNombre() != null && !proveedor.getNombre().isEmpty();
    }

    public boolean registrarCompra(Compra compra) {
        if (!validarProveedor(compra.getProveedor())) {
            System.out.println("Proveedor no válido.");
            return false;
        }
        agregarCompra(compra);
        System.out.println("Compra registrada correctamente.");
        return true;
    }

    public void actualizarPrecioSemana(Compra compra, double nuevoPrecio) {
        compra.setPrecioPorKilo(nuevoPrecio);
        System.out.println("Precio actualizado para la compra.");
    }
} 