package Logica;

/**
 *
 * @author Luis Eduardo Fagúndez Pedrozo
 */

public abstract class Socio {
	//Atributos    
    private int codigo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String mutualista;
    public enum ActivoAlumno {SI,NO};
    private ActivoAlumno activo;

    public Socio(int codigo, String nombre, String apellido, String telefono, String direccion, String mutualista,ActivoAlumno activo){
	this.codigo = codigo;
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefono = telefono;
	this.direccion = direccion;
	this.mutualista = mutualista;
	this.activo = activo;
    }
    
    public Socio(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMutualista() {
        return mutualista;
    }

    public ActivoAlumno getActivo() {
        return activo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMutualista(String mutualista) {
        this.mutualista = mutualista;
    }

    public void setActivo(ActivoAlumno activo) {
        this.activo = activo;
    }
    
}
