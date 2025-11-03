public class Profesor extends Persona{
    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse(){
        System.out.println("Mi nombre es "+super.nombre+" y soy profesor de "+this.materia);
    }
}
