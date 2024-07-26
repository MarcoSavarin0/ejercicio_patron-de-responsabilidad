package Implement;

import Model.Producto;

public class AnalistaLote extends AnalistaDeCalidad {

    @Override
    void comprobarProducto(Producto prod) {
        if (prod.getLote() >= 1000 && prod.getLote() <= 2000) {
            System.out.println("Paso la calidad de LOTE");
            System.out.println("sera reenviado a peso");
            getSiguienteProceso().comprobarProducto(prod);
        } else {
            System.out.println("EL LOTE NO PASO LA CALIDAD");
        }
    }
}
