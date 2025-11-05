package punto_dos;

import java.math.BigDecimal;

public class Cliente extends Persona {
    private BigDecimal montoCompra;

    public Cliente(String id, String nombre, BigDecimal montoCompra) {
        this.setId(id);
        this.setNombre(validarNombreBase(nombre));
        this.montoCompra = montoCompra;
    }

    public Cliente() {
    }

    public BigDecimal getMontoCompra() {
        return montoCompra;
    }
    public String validarNombreBase(String nombre) {
        if (nombre.equalsIgnoreCase("bryan") || nombre.equalsIgnoreCase("brayan")) {
            throw new InvalidNameException("No se le puede vender");
        }
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "Nombre:" + getNombre() + " | Monto de compra: " + montoCompra;
    }
}
