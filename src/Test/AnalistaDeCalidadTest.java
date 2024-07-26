package Test;

import Implement.ProcesadorDeAnalisis;
import Model.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDeCalidadTest {
    @Test
    @DisplayName("INICIANDO UNA PRUEBA DE CALIDAD CORRECTA")
    void caso1(){
        Producto producto = new Producto("Auto",1002,"sano",1225);
        ProcesadorDeAnalisis procesarCalidad = new ProcesadorDeAnalisis();
        procesarCalidad.comprobarProducto(producto);
    }
    @Test
    @DisplayName("INICIANDO UNA PRUEBA DE CALIDAD INCORRECTA, POR EL LOTE")
    void caso2(){
        Producto producto = new Producto("Auto",999,"sano",1225);
        ProcesadorDeAnalisis procesarCalidad = new ProcesadorDeAnalisis();
        procesarCalidad.comprobarProducto(producto);
    }

}