
package examen1;

import javax.swing.JOptionPane;

public class Persona {
    private String nomPersona;
    private int anhoNac; 

    public void ingresaDatos(){
        setNomPersona(JOptionPane.showInputDialog("Digite su nombre "));
        setAnhoNac(Integer.parseInt(JOptionPane.showInputDialog("Digite su año de nacimiento")));
    }
    public void imprimeDatos(){
        System.out.println("Nombre del cliente: "+ getNomPersona());
        System.out.println("Año de nacimiento del cliente: "+ getAnhoNac());
        System.out.println("Edad: "+calculaEdad());
        
    }
    public int calculaEdad(){
        int edad;
        edad= 2024-getAnhoNac();
        return edad;
    }
    
    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public int getAnhoNac() {
        return anhoNac;
    }

    public void setAnhoNac(int anhoNac) {
        this.anhoNac = anhoNac;
    }
}
