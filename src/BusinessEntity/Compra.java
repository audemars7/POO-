package BusinessEntity;

import java.util.Date;

public class Compra {
    private int id;
    private Proveedor proveedor;
    private CacaoTipo tipo;
    private CacaoEstado estado;
    private double cantidadKilos;
    private double precioPorKilo;
    private Date fecha;

    // Constructor
    public Compra(int id, Proveedor proveedor, CacaoTipo tipo, CacaoEstado estado, double cantidadKilos, double precioPorKilo, Date fecha) {
        this.id = id;
        this.proveedor = proveedor;
        this.tipo = tipo;
        this.estado = estado;
        this.cantidadKilos = cantidadKilos;
        this.precioPorKilo = precioPorKilo;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public CacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CacaoTipo tipo) {
        this.tipo = tipo;
    }

    public CacaoEstado getEstado() {
        return estado;
    }

    public void setEstado(CacaoEstado estado) {
        this.estado = estado;
    }

    public double getCantidadKilos() {
        return cantidadKilos;
    }

    public void setCantidadKilos(double cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
} 