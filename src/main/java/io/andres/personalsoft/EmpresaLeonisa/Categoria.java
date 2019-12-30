package io.andres.personalsoft.EmpresaLeonisa;

public class Categoria {

    private String tipoPrenda;
    private String talla;
    private String color;
    private String material;

    public Categoria(String tipoPrenda, String talla, String color, String material) {
        this.tipoPrenda = tipoPrenda;
        this.color = color;
        this.material = material;
        this.talla = talla;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
