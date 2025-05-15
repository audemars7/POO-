
package BusinessEntity;

public class DetalleCompraBE {
    private int idDetalle;
    private int idCompra;
    private int idProductor;
    private double kilos;
    private double precioKg;
    private double montoTotal;

    public DetalleCompraBE() {}

    public DetalleCompraBE(int idDetalle, int idCompra, int idProductor, double kilos, double precioKg, double montoTotal) {
        this.idDetalle = idDetalle;
        this.idCompra = idCompra;
        this.idProductor = idProductor;
        this.kilos = kilos;
        this.precioKg = precioKg;
        this.montoTotal = montoTotal;
    }

    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }

    public int getIdCompra() { return idCompra; }
    public void setIdCompra(int idCompra) { this.idCompra = idCompra; }

    public int getIdProductor() { return idProductor; }
    public void setIdProductor(int idProductor) { this.idProductor = idProductor; }

    public double getKilos() { return kilos; }
    public void setKilos(double kilos) { this.kilos = kilos; }

    public double getPrecioKg() { return precioKg; }
    public void setPrecioKg(double precioKg) { this.precioKg = precioKg; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }
}
