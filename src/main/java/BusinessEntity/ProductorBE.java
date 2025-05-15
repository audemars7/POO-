
package BusinessEntity;

public class ProductorBE {
    private int idProductor;
    private String nombre;

    public ProductorBE() {}

    public ProductorBE(int idProductor, String nombre) {
        this.idProductor = idProductor;
        this.nombre = nombre;
    }

    public int getIdProductor() {
        return idProductor;
    }

    public void setIdProductor(int idProductor) {
        this.idProductor = idProductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
