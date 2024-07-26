package Implement;

import Model.Producto;

public class AnalistaEnvase extends AnalistaDeCalidad {

    @Override
    void comprobarProducto(Producto prod) {
        if (prod.getEnvasado().equals("sano") || prod.getEnvasado().equals("casi sano")) {
            System.out.println("Paso la calidad de ENVASADO");
            System.out.println("EL PRODUCTO ESTA EN OPTIMAS CONDICIONES!");
        } else {
            System.out.println("EL ENVASE NO PASO LA CALIDAD");
        }
    }
}
