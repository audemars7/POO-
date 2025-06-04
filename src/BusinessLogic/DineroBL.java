package BusinessLogic;

import BusinessEntity.MovimientoDinero;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DineroBL {
    private List<MovimientoDinero> movimientos = new ArrayList<>();

    public void agregarMovimiento(MovimientoDinero movimiento) {
        movimientos.add(movimiento);
    }

    public List<MovimientoDinero> listarMovimientos() {
        return movimientos;
    }

    public double calcularSaldoDia(Date fecha) {
        double saldo = 0;
        for (MovimientoDinero m : movimientos) {
            if (m.getFecha().equals(fecha)) {
                saldo += m.getMonto();
            }
        }
        return saldo;
    }
} 