package io.andres.personalsoft.EmpresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {

    private Producto produ;

    @Before
    public void setUp() throws Exception {
        produ = new Producto("AA23", 23000, "Cacheteros", "S", "Azul", "Algodon");
    }

    @Test
    public void getciu() {
        Assert.assertEquals("El código ingresado no es el correcto", "AA23", produ.getciu());
    }

    @Test
    public void getPrecio() {
        Assert.assertEquals("El precio no es el correcto", 23000, produ.getPrecio(), 0);
    }

    @Test
    public void setPrecio() {
        produ.setPrecio(23000);
        Assert.assertEquals("El precio no es el correcto", 23000, produ.getPrecio(), 0);
    }
}