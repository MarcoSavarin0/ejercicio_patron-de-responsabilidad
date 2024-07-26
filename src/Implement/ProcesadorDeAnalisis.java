package Implement;

import Model.Producto;

public class ProcesadorDeAnalisis {
    private AnalistaDeCalidad iniciaCadena;

    public ProcesadorDeAnalisis(){
        iniciaCadena = new AnalistaLote();
        AnalistaDeCalidad peso = new AnalistaPeso();
        AnalistaDeCalidad envase = new AnalistaEnvase();

        iniciaCadena.setSiguienteProceso(peso);
        peso.setSiguienteProceso(envase);
    }
    public void comprobarProducto(Producto prod){
        System.out.println("se inicio el proceso de analisis de calidad");
        iniciaCadena.comprobarProducto(prod);
    }
}
