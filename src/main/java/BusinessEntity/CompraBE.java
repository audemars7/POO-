
package BusinessEntity;

import java.util.Date;

public class CompraBE {
    private int idCompra;
    private Date fecha;

    public CompraBE() {}

    public CompraBE(int idCompra, Date fecha) {
        this.idCompra = idCompra;
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
