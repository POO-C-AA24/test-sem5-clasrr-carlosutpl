
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utpl
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Terreno arrayTerreno[] = new Terreno[2];
        int i = 0;
        while(true){
            System.out.println("Dame ancho alto y vmc");
            arrayTerreno[i] = new Terreno(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            i++;
            
            System.out.println("Desea maa terreno? S/N");
            String opc = sc.next();
            
            if(opc == "N" || (i >= arrayTerreno.length)) break;
            
        }
        
        System.out.println("Terrenos");
        for(Terreno terreno : arrayTerreno){
            terreno.calcularArea();
            terreno.calcularCostoFinal();
            System.out.println(terreno);
        }
    }
}
