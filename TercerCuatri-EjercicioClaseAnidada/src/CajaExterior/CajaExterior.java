package CajaExterior;

//Clase CajaExterior (OuterClass)
public class CajaExterior implements Mostrar{

    private int x = 10;

    // Función para mostrar el valor de x
    @Override
    public void mostrar() {
        System.out.println("El valor de x es " + x);
    }

    // Función para crear una nueva CajaInterior
    public CajaInterior crearInterior() {
        return new CajaInterior();
    }

    // Clase dentro de Caja exterior usada como beneficio de que no se sabe como es el valor de "y"
    /*InnerClass. La clase interna debe ser privada, de este modo cuando tenga que llamarla debo
    llamar primero a la clase externa (la contenedora)*/
    public class CajaInterior implements Mostrar {
        private int y = 20;
        @Override
        public void mostrar() {
            System.out.println("El valor de y es " + y);
        }
    }

}
