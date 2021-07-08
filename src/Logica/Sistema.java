package Logica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luis Eduardo Fagúndez Pedrozo
 */

public class Sistema {
    
    private static Sistema objeto = null;
    
    private ArrayList<Alumno>coleccionAlumnos;
    
    private Sistema(){
        coleccionAlumnos = new ArrayList<>();
    }
    
    public static Sistema getInstance(){
        if(objeto==null){
            objeto = new Sistema();
        }
        return objeto;
    }
    
    public void agregar(Alumno alumno) throws Exception{
        if(!coleccionAlumnos.contains(alumno))
        coleccionAlumnos.add(alumno);
        else
            throw new Exception("El codigo de usuario ya existe");
    }
    
    public void borrar(Alumno alumno){
        coleccionAlumnos.remove(alumno);
    }
    
    public Iterator<Alumno> listadoAlumno(){
        return coleccionAlumnos.iterator();
    }
    
    public Alumno buscar(int codigo){
        Alumno alumno = new Alumno(codigo);
        int indice = coleccionAlumnos.indexOf(alumno);
        if(indice >= 0){
            return coleccionAlumnos.get(indice);
        }
        else
            return null;
    }
 
}
