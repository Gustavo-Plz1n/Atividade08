/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade08;

import java.util.Scanner;

/**
 *
 * @author 322121746
 */
public class Atividade08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double salario,horas,salariomes;
        System.out.println("Insira seu salario ");
        salario = leia.nextDouble();
        System.out.println("Insira o tempo trabalhado ");
        horas = leia.nextDouble();
        salariomes = (salario*horas);
        System.out.println("O Seu  salario do mes e de " + salariomes );
        
        
        
    }
    
}
