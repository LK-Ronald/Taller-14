public class Estudiante extends Persona {
    private String cursando;

    public Estudiante(String nombre, String cursando) {
        super(nombre);
        this.cursando = cursando;
    }

    @Override
    public void presentarse(){
        System.out.println("Me llamo " + super.nombre + " y me encuentro cursando "+this.cursando);
    }
}
