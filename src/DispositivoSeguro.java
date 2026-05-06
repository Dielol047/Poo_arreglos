public class DispositivoSeguro {

    private String nombre;

    private String direccionIp;

    private int nivelRiesgo;

    private boolean activo;

    public DispositivoSeguro(String nombre, String direccionIp, int nivelRiesgo, boolean activo) {
        setNombre(nombre);
        this.direccionIp = direccionIp;
        setNivelRiesgo(nivelRiesgo);
        this.activo = activo;
    }

    public String setNombre(String nombre) {
        if (nombre == null) {
            return "No se permiten nulos en el nombre";
        }
        if (nombre.trim().isEmpty()) {
            return "El nombre no puede ser vacio";
        }
        if (nombre.length() < 2) {
            return "El nombre no puede tener menos de 2 caracteres";
        }
        this.nombre = nombre;
        return "Nombre actualizado";
    }

    public String getNombre() {
        return nombre;
    }

    public String setNivelRiesgo(int nivel) {
        if (nivel >= 1 && nivel <= 10) {
            this.nivelRiesgo = nivel;
            return "Nivel de riesgo actualizado";
        } else {
            return "Nivel fuera de rango (1-10)";
        }
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getActivo() {
        return activo;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }
}
