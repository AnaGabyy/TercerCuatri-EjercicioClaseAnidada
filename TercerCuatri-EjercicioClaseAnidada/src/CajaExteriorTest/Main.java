package CajaExteriorTest;

import CajaExterior.CajaExterior;

public class Main {

    public static void main(String[] args) {

        /*Supongamos que tienes una caja (clase OuterClass) que contiene un objeto
        (variable de instancia x) y una pequeña caja dentro de ella (clase InnerClass). La
        pequeña caja (clase InnerClass) también tiene un objeto dentro de ella (variable de
        instancia y).
        La caja grande (clase OuterClass) tiene una etiqueta con una función printX() que
        muestra el valor del objeto dentro de la caja grande (x). La pequeña caja (clase
        InnerClass) tiene una etiqueta con una función printY() que muestra el valor del
        objeto dentro de ella (y).
        Para crear la pequeña caja (clase InnerClass), debes abrir la caja grande (clase
        OuterClass) y crear la pequeña caja (clase InnerClass) dentro de ella utilizando la
        función createInner(). Luego, para ver el objeto dentro de la pequeña caja, debes
        abrir la pequeña caja y usar la función printY().*/

        // Crear una nueva CajaExterior
        CajaExterior cajaExterior = new CajaExterior();

        // Mostrar el valor de x
        cajaExterior.mostrarX();

        // Crear una nueva CajaInterior
        CajaExterior.CajaInterior cajaInterior = cajaExterior.crearInterior();

        // Mostrar el valor de y
        cajaInterior.mostrarY();


    }
}


