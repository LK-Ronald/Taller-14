public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Jose");
        Persona estudiante = new Estudiante("Maria", "Sexto");
        Persona profesor = new Profesor("Carlos", "Matematicas");

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

    }
}
