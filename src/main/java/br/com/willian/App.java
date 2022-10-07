package br.com.willian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )
    throws IOException
    {

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("Digite um numero x: ");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("Digite um numero y: ");
            int y = Integer.parseInt(reader.readLine());
            
            var resultado = (x * 8 + y) - x + y / 100;
            System.out.println("(" + x + " * 8 - " + y + ") - " + x + " + " + y + " / 100");
            System.out.println("O resultado da equacao e de : " + resultado);

            // System.out.println("Digite um numero: ");
            // int numero = Integer.parseInt(reader.readLine());
            // var resultado = numero + 1000;
            // System.out.println("O resultado de ("+ numero + ") + 1000 e de: " + resultado);
            
            // // Mostrando na tela
            // System.out.println("Digite o teu nome ");

            // // Mostrando dado capturado
            // var nome = reader.readLine();
            // System.out.println("O nome digitado foi : " + nome);
 
        // Reading data using readLine
        // String name = reader.readLine();

        // int numero1 = 3;
        // var numero2 = 5;

        // int soma = numero1 + numero2;

        // System.out.println( "O resultado da operacao e: " + soma );
    }
}
