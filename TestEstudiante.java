
/**
 *  Para probar Git Github desde BlueJ
 *  
 */
public class TestEstudiante
{

    /**
     *  Punto de entrada a la aplicación
     */
    public static void main(String[] args) {
        System.out.println("Creamos varios objetos Estudiante");
        Estudiante e1 = new Estudiante("Maite", 9);
        e1.printEstudiante();
        Estudiante e2 = new Estudiante("Ana Isabel", 8);
        e2.printEstudiante();
        Estudiante e3 = new Estudiante("Juan", 6);
        e3.printEstudiante();

    }
}
