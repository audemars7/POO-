package BusinessLogic;

import BusinessEntity.CacaoTipo;
import BusinessEntity.CacaoEstado;
import java.util.HashMap;
import java.util.Map;

public class PrecioBL {
    private Map<CacaoTipo, Map<CacaoEstado, Double>> precios = new HashMap<>();

    public void actualizarPrecio(CacaoTipo tipo, CacaoEstado estado, double precio) {
        precios.computeIfAbsent(tipo, k -> new HashMap<>()).put(estado, precio);
    }

    public double obtenerPrecio(CacaoTipo tipo, CacaoEstado estado) {
        return precios.getOrDefault(tipo, new HashMap<>()).getOrDefault(estado, 0.0);
    }
} 