package CajaExterior;

//Clase CajaExterior (OuterClass)
public class CajaExterior {

        private int x = 10;

        // Función para mostrar el valor de x
        public void mostrarX() {
            System.out.println("El valor de x es " + x);
        }

        // Función para crear una nueva CajaInterior
        public CajaInterior crearInterior() {
            return new CajaInterior();
        }

        // Clase dentro de Caja exterior usada como beneficio de que no se sabe como es el valor de "y"
        /*InnerClass. La clase interna debe ser privada, de este modo cuando tenga que llamarla debo
        llamar primero a la clase externa (la contenedora)*/
        private class CajaInterior {
            private int y = 20;

            // Función para mostrar el valor de y
            public void mostrarY() {
                System.out.println("El valor de y es " + y);
            }
        }

}
