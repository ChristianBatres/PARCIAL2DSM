package sv.edu.udb.parcial2dsm.datos;

public class Orden {
    private String orden;
    private String cantidad;
    private String precio;
    String key;

    public Orden() {
    }

    public Orden(String orden, String cantidad, String precio) {
        this.orden = orden;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
