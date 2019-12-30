package io.andres.personalsoft.EmpresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {

    private Categoria categ;

    @Before
    public void setUp() throws Exception {
        categ = new Categoria("Cacheteros","S","Azul","Algodon");
    }

    @Test
    public void getTipoPrenda() {
        Assert.assertEquals("La prenda ingresada no es la correcta","Cacheteros",categ.getTipoPrenda());
    }

    @Test
    public void getTalla() {
        Assert.assertEquals("La talla ingresada no es la correcta","S",categ.getTalla());
    }

    @Test
    public void getColor() {
        Assert.assertEquals("El color ingresado no es el correcto","Azul",categ.getColor());
    }

    @Test
    public void getMaterial() {
        Assert.assertEquals("El material ingresado no es el correcto", "Algodon",categ.getMaterial());
    }
}