
package examen1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Persona p = new Persona();
        char seguir='s';
        int opc;
        char opc2;
        int voto, mayorVotos1=0;
        int mayorVotos2=0, mayorVotos3=0, mayorVotos4=0, mayorVotos5=0;
        
        int libro1=0;
        int libro2=0;
        int libro3=0;
        int libro4=0;
        int libro5=0;
        //Verifica persona mayor
        int mayor=0;
        
        
        
                
        while(seguir=='s'|| seguir=='S'){
            
            System.out.println("Vista Previa de Libros Disponibles");
            opc2=JOptionPane.showInputDialog("Ingrese una letra ").charAt(0);
            if(opc2=='l' || opc2=='L'){
                System.out.println("Libros con L");
                System.out.println("");
                System.out.println("La sombra del viento");
                System.out.println("Los pilares de la tierra");
            }else if(opc2=='c' || opc2=='C'){
                System.out.println("Libros con C");
                System.out.println("");
                System.out.println("Cien años de soledad");
            }else if(opc2=='e' || opc2=='E'){
                System.out.println("Libros con E");
                System.out.println("");
                System.out.println("El alquimista");
            }else if(opc2=='o' || opc2=='O'){
                System.out.println("Libros con O");
                System.out.println("");
                System.out.println("Orgullo y prejuicio");
            }else{
                System.out.println("No contamos con ningun libro que contenga esa letra inicial");
            }
            System.out.println(" ");
            System.out.println("*******************************************************************");
            
            p.ingresaDatos();
            
            opc=Integer.parseInt(JOptionPane.showInputDialog("Digite cual libro desea\n1.Cien años de soledad\n2.El alquimista\n3.La sombra del viento\n4.Orgullo y prejuicio\n5.Los pilares de la tierra"));
            
            switch(opc){
                case 1: 
                    
                    libro1=libro1+1;
                    p.imprimeDatos();
                    System.out.println("Ha seleccionado el libro: Cien años de soledad");
                    //Valida si han votado y almacena en la contadora
                    voto=Integer.parseInt(JOptionPane.showInputDialog("Desea votar?\n1.si\n2.no"));
                    if(voto==1)
                        mayorVotos1=mayorVotos1+1;
                        
                    else
                        System.out.println("No votó");
                    break;  
                    
                case 2: 
                    libro2=libro1+2;
                    p.imprimeDatos();
                    System.out.println("Ha seleccionado el libro: El alquimista");
                    
                    //Valida si han votado y almacena en la contadora
                    voto=Integer.parseInt(JOptionPane.showInputDialog("Desea votar?\n1.si\n2.no"));
                    if(voto==1)
                        mayorVotos2=mayorVotos2+1;
                        
                    else
                        System.out.println("No votó");
                    break;  
                case 3: 
                    libro3=libro3+1;
                    p.imprimeDatos();
                    System.out.println("Ha seleccionado el libro: La sombra del viento");
                    
                    //Valida si han votado y almacena en la contadora
                    voto=Integer.parseInt(JOptionPane.showInputDialog("Desea votar?\n1.si\n2.no"));
                    if(voto==1)
                        mayorVotos3=mayorVotos3+1;
                        
                    else
                        System.out.println("No votó");
                    break;
                case 4: 
                    libro4=libro4+1;
                    p.imprimeDatos();
                    System.out.println("Ha seleccionado el libro: Orgullo y prejuicio");
                    
                    //Valida si han votado y almacena en la contadora
                    voto=Integer.parseInt(JOptionPane.showInputDialog("Desea votar?\n1.si\n2.no"));
                    if(voto==1)
                        mayorVotos4=mayorVotos4+1;
                        
                    else
                        System.out.println("No votó");
                    break;
                case 5: 
                    libro5=libro5+1;
                    p.imprimeDatos();
                    System.out.println("Ha seleccionado el libro: Los pilares de la tierra");
                    
                    //Valida si han votado y almacena en la contadora
                    voto=Integer.parseInt(JOptionPane.showInputDialog("Desea votar?\n1.si\n2.no"));
                    if(voto==1)
                        mayorVotos5=mayorVotos5+1;
                        
                    else
                        System.out.println("No votó");
                    break;
                default: 
                    break; 
            }//Cierre del switch   
            seguir=JOptionPane.showInputDialog("Existe otra persona que quiera un libro? s/n").charAt(0);
                if(p.calculaEdad()>p.calculaEdad()){
                    System.out.println("La persona con más edad entrevistada fue: "+ p.getNomPersona()+ " nació en "+p.getAnhoNac()+ " y tiene "+p.calculaEdad()+" años");
                }
        }//Cierre del while   
        System.out.println(" ");
        System.out.println("*******************************************************************");
        if(mayorVotos1>mayorVotos2 || mayorVotos1>mayorVotos3 || mayorVotos1>mayorVotos4 || mayorVotos1>mayorVotos5){
            System.out.println("El libro con mayor cantidad de votos fue: Cien años de soledad");
        }else if(mayorVotos2>mayorVotos1 || mayorVotos2>mayorVotos3 || mayorVotos2>mayorVotos4 || mayorVotos2>mayorVotos5){
            System.out.println("El libro con mayor cantidad de votos fue: El alquimista");
        }else if(mayorVotos3>mayorVotos1 || mayorVotos3>mayorVotos2 || mayorVotos3>mayorVotos4 || mayorVotos3>mayorVotos5){
            System.out.println("El libro con mayor cantidad de votos fue: La sombra del viento");
        }else if(mayorVotos4>mayorVotos1 || mayorVotos4>mayorVotos2 || mayorVotos4>mayorVotos3 || mayorVotos4>mayorVotos5){
            System.out.println("El libro con mayor cantidad de votos fue: Orgullo y prejuicio");
        }else if(mayorVotos5>mayorVotos1 || mayorVotos5>mayorVotos2 || mayorVotos5>mayorVotos3 || mayorVotos5>mayorVotos4){
            System.out.println("El libro con mayor cantidad de votos fue: Orgullo y prejuicio");
        }else
            System.out.println("No se votó por ningun libro");
        System.out.println(" ");
        System.out.println("*******************************************************************");
        System.out.println("Cantidad de Personas que escogieron Cien años de soledad: "+libro1);
        System.out.println("Cantidad de Personas que escogieron El alquimista : "+libro2);
        System.out.println("Cantidad de Personas que escogieron La sombra del viento: "+libro3);
        System.out.println("Cantidad de Personas que escogieron Orgullo y prejuicio: "+libro4);
        System.out.println("Cantidad de Personas que escogieron Los pilares de la tierra: "+libro5);
        System.out.println(" ");
        System.out.println("*******************************************************************");     
            
    }//Cierre del main 
        
}//Cierre de la clase


//Hola
