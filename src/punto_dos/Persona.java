package punto_dos;

public abstract class Persona {
    private String id;
    private String nombre;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
