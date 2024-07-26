package Implement;

import Model.Producto;

public class AnalistaPeso extends AnalistaDeCalidad{

    @Override
    void comprobarProducto(Producto prod) {
        if (prod.getPeso() >= 1200 && prod.getPeso()<=1300){
            System.out.println("Paso la calidad de PESO");
            System.out.println("sera reenviado a envase");
            getSiguienteProceso().comprobarProducto(prod);
        }else {
            System.out.println("EL PESO NO PASO LA CALIDAD" );
        }
    }
}
