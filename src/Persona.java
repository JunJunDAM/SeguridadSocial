/**
 * Created by DAM on 21/9/16.
 */
import java.util.List;

public class Persona {

    private String DNI;
    private int num_SeguridadScial;
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Persona(String DNI, int num_SeguridadScial, String nombre, String apellido, int edad, double salario) {
        this.DNI = DNI;
        this.num_SeguridadScial = num_SeguridadScial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNum_SeguridadScial() {
        return num_SeguridadScial;
    }

    public void setNum_SeguridadScial(int num_SeguridadScial) {
        this.num_SeguridadScial = num_SeguridadScial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", num_SeguridadScial=" + num_SeguridadScial +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
