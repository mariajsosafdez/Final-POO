package punto_dos;

public class Administrador extends Persona{

    public Administrador(String id, String nombre) {
        setId(id);
        this.setNombre(validarNombreBase(nombre));
    }
    public String validarNombreBase(String nombre) {
        if (nombre.equalsIgnoreCase("daniela") ||nombre.equalsIgnoreCase("valeria") || nombre.equalsIgnoreCase("valentina") || nombre.equalsIgnoreCase("isaac")){
            throw new InvalidNameException("No puede ser admin");
        }
        return nombre;
    }
}
