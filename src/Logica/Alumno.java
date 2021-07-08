package Logica;

/**
 *
 * @author Luis Eduardo Fagúndez Pedrozo
 * @version 0.01
 */

public class Alumno extends Socio{
    
    private String grado;
    private int cuota;

    public Alumno(int codigo, String nombre, String apellido, String telefono, String direccion, String mutualista,ActivoAlumno activo, String grado, int cuota) {
        super(codigo, nombre, apellido, telefono, direccion, mutualista, activo);
        this.grado = grado;
        this.cuota = cuota;
    }
    
    public Alumno(int codigo){
        super(codigo);   
    }

    public String getGrado() {
        return grado;
    }

    public int getCuota() {
        return cuota;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "DATOS DEL ALUMNO:" + " Código: " + getCodigo() + " Nombre: " + getNombre() + " Apellido: " + getApellido() + " Telefono: " + getTelefono() + " Dirección: " + getDireccion() + " Mutualista: " + getMutualista() + " Activo: " + getActivo() + " Grado: " + getGrado() + " Cuota: $" + getCuota();
    }

    @Override
    public boolean equals(Object obj) {
        boolean valido=false;
        if(obj instanceof Alumno){
            Alumno alumno=(Alumno)obj;
            valido=(super.getCodigo()==alumno.getCodigo());
        }
        return valido;
    }
    
}
