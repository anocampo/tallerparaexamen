package io.andres.personalsoft.EmpresaLeonisa;

public class Producto {

    private String ciu;
    private int precio;
    private Categoria categ;

    public Producto(String ciu, int precio, String tipoPrenda, String talla, String color, String Material) {
        categ = new Categoria(tipoPrenda, talla, color, Material);
        this.ciu = ciu;
        this.precio = precio;
    }

    public Producto() {

    }

    public String getciu() {
        return ciu;
    }

    public int getPrecio() {
        return precio;

    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
