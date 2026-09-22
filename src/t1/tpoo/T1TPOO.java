package t1.tpoo;

import java.util.Scanner;

public class T1TPOO {

    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        Alumno a1 = new Alumno();
        System.out.println("Ingrese su nombre");
        a1.setNombre(sc.nextLine());
 
        System.out.println("Ingrese Tipo de documento DNI o Carnet");
        a1.setTipoDeDocumento(sc.nextLine());
        
    
        while (true)
        {
         if (a1.getTipoDeDocumento().equalsIgnoreCase("DNI")){
             System.out.println("Ingrese DNI");
               String NumDoc = sc.nextLine();
             if(a1.getTipoDeDocumento().equalsIgnoreCase("DNI") && NumDoc.length()==8);
             a1.setNumeroDeDocumento(NumDoc);
         }else {
             System.out.println("Ingrese Carnet");
             String NumDoc = sc.nextLine();
             if(a1.getTipoDeDocumento().equalsIgnoreCase("Carnet") && NumDoc.length()==11);
             a1.setNumeroDeDocumento(NumDoc);
         }
         return;
    }
 }
}   

