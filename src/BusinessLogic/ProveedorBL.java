package BusinessLogic;

import BusinessEntity.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class ProveedorBL {
    private List<Proveedor> proveedores = new ArrayList<>();

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public List<Proveedor> listarProveedores() {
        return proveedores;
    }

    public Proveedor buscarPorNombre(String nombre) {
        for (Proveedor p : proveedores) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
} 