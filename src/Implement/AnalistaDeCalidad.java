package Implement;

import Model.Producto;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad siguienteProceso;

    abstract void comprobarProducto(Producto prod);

    public AnalistaDeCalidad getSiguienteProceso() {
        return siguienteProceso;
    }

    public void setSiguienteProceso(AnalistaDeCalidad siguienteProceso) {
        this.siguienteProceso = siguienteProceso;
    }

}
