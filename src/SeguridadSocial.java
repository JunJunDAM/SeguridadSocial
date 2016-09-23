/**
 * Created by DAM on 21/9/16.
 */
import java.util.List;
import java.util.ArrayList;

public class SeguridadSocial {
    private List<Persona> personaList;
    public SeguridadSocial() {
        personaList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {
        int repetido = 0;
        String dni = persona.getDNI();
        int num_seguridadSocial = persona.getNum_SeguridadScial();
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        int edad = persona.getEdad();
        double salario = persona.getSalario();


        for(int i = 0; i < personaList.size(); i++) {
            Persona p = personaList.get(i);
            if (p.getDNI().equalsIgnoreCase(persona.getDNI())) {
                repetido ++;
            }
        }

        if(repetido == 0){
            personaList.add(persona);
            System.out.print("Persona dada de alta, ");
        }

    }

    public void bajaPersona(String dni) {

        Persona aux = null;

        for(Persona p : personaList) {
            if (dni.equalsIgnoreCase(p.getDNI())) {
                aux = p;
                System.out.println("Persona dada de baja");
            }
        }

        if(aux != null){
            personaList.remove(aux);
        }

    }

    public Persona obtenerPersonaPorDNI(String dni) {
        int existe = 0;
        for(Persona p : personaList) {
            if (dni.equalsIgnoreCase(p.getDNI())) {
                existe ++;
                return p;

            }
        }
        if(existe == 0){
            System.out.println("DNI no registrado");
        }
        return null;
    }

    public Persona obtenerPersonaPorNumSS(int numSS) {
        int existe = 0;
        for(Persona p : personaList) {
            if (numSS == p.getNum_SeguridadScial()) {
                existe ++;
                return p;
            }
        }
        if(existe == 0){
            System.out.println("Numero de la SeguridadSocial no encontrado");
        }
        return null;
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        ArrayList<Persona>temporal = new ArrayList();

        for(Persona p : personaList){

            if(p.getSalario() > min && p.getSalario() < max){
                temporal.add(p);
            }
        }
        return temporal;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        ArrayList<Persona>temporal = new ArrayList();

        for(Persona p : personaList){
            if(p.getEdad() > edad){
                temporal.add(p);
            }
        }
        return temporal;
    }

    public List<Persona> obtenerTodas(){
        return personaList;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" + "personaList= " + personaList + '}';
    }

}
