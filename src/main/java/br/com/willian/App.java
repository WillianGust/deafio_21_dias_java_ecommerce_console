package br.com.willian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


      // Dia 5 - Tipo primitivos variaveis

        // double restoDivisao = 3.5/2;

        // System.out.println("O resto da divisao e: " + restoDivisao);

        // var hojeEstaVentando = false;
        // System.out.println("Esta frio hoje? " + hojeEstaVentando);
        
        // var moeda = 4.5;
        // var inteiro = 4;
        // var stringNumero = "8";

        // var valor = moeda * inteiro;
        // var valor2 = moeda - inteiro;

        
        // Conversao String para numero CASTING da soma ficar correta 
        // var valor3 = moeda + inteiro + Double.parseDouble(stringNumero);
        // System.out.println("Resultado " + valor3);
        
        // var rotulo = "Nome: ";
        // var nome = "Willian";
        // var resultado = String.format("O valor de nome e: %s e o valor de rotulo e : %s", nome, rotulo);
        // System.out.println(resultado);

        // var calculo = 4.5555;
        // System.out.printf("O valor e %.2f", calculo); // Mostra numeros com duas casas decimais

        /* EXERCICIO
         *  Joao tem um armazem de um programa qua solicite
         * o nome de seu cliente
         * o endereco do cliente
         * o nome do material de cosntrucao
         * o valor do material de construcao
         * a quantidade que o cliente deseja
         * no final do programa, mostrar um relatorio com o valor total do produto comprado
         * 
         * RELATORIO
         * 
         * --------------------
         * Cliente: Joao
         * Endereco: Rua ...
         * Comprou o material: XXXXno valor de 
         * O valor total da compra foi : R& XXXX
         * -------------------
         */

        //  Tabuada
        
        // System.out.println("=====[TABUADA]=========");
        // System.out.println("Digite um numero");
        
        //   int num = Integer.parseInt(reader.readLine());

        // for(int i=0; i<=10;i++){
        //   System.out.println(num + " x " + i + " = " + (num * i));
        // }

       /* System.out.println("=====[TABUADA]=========");
        System.out.println("Digite um numero que voce deseja ver na tabuada");
          int num = Integer.parseInt(reader.readLine());
        System.out.println("Digite a quantidade de vezes que quer multiplicar a tabuada");
          int fator = Integer.parseInt(reader.readLine());
        

        for(int i=0; i<=fator;i++){
          System.out.println(num + " x " + i + " = " + (num * i));
        }*/


        // System.out.println("==============[ CALCULO PRODUTO/CLIENTE]==============");
        // // System.out.println("Ola Joao seja muito bem vindo, comecemos?");
        // System.out.println("Digite o nome do seu cliente ");
        // var nome = reader.readLine();

        // System.out.println("Digite o endereco do seu cliente ");
        // var endereco = reader.readLine();

        // System.out.println("Digite o nome do produto ");
        // var produto = reader.readLine();

        // System.out.printf("Digite o valor do produto (%s):", produto);
        // var valor = Double.parseDouble(reader.readLine());

        // System.out.printf("Digite a quantidade do produto (%s):", produto);
        // var quantidade = Integer.parseInt(reader.readLine());

        // var valorTotal = valor * quantidade;
       
       
        // System.out.println("----------------------------------");

        // System.out.printf("Cliente: %s \n", nome);
        // System.out.printf("Endereco: %s \n", endereco);
        // System.out.printf("Comprou o material: %s valor de R$ %s \n", produto, valor);
        // System.out.printf("O valor total da compra foi : R$ %.2f \n", valorTotal);
        // if(valorTotal > 100){
        //   System.out.printf("O pedido foi maior que R$ 100,00, voce tera um desconto em sua proxima compra conosco \n");
        // }

        // System.out.println("----------------------------------");

         

        // Exercicio dia 4
        // 

            // System.out.println("Digite um numero: ");
            // int numero = Integer.parseInt(reader.readLine());
            // var resultado = numero + 1000;
            // System.out.println("O resultado de ("+ numero + ") + 1000 e de: " + resultado);
            
            // // Mostrando na tela
            // System.out.println("Digite o teu nome ");

            // // Mostrando dado capturado
            // var nome = reader.readLine();
            // System.out.println("O nome digitado foi : " + nome);
 
        // Criando Funcao
        // equacaoCalculo();
        //aula1 ();
        // exercicioAlunosEscola();

        
        var alunoDaniel = new Aluno();
        alunoDaniel.setNome("Daniel");
        alunoDaniel.getNotas().add(7.9);
        alunoDaniel.getNotas().add(9.9);

        var alunoAna = new Aluno();
        alunoAna.setNome("Ana");
        alunoAna.getNotas().add(6.0);
        alunoAna.getNotas().add(10.0);

        alunoDaniel.media();
        alunoDaniel.situacao();
        alunoAna.media();
        alunoAna.situacao();

        System.out.println(alunoDaniel.media());
        System.out.println(alunoDaniel.situacao());

        System.out.println(alunoAna.media());
        System.out.println(alunoAna.situacao());
    }
    

    private static void exercicioAlunosEscola() {
      Scanner ler = new Scanner(System.in);
    	List<Aluno> alunos = new ArrayList<Aluno>();
    	
    	do {
            //		Coleta
            Aluno aluno = new Aluno();
            
            System.out.println("Digite o nome do aluno");
            aluno.setNome(ler.next());
            for(int i = 1; i <= 4; i++) {
                System.out.println("Digite a nota "+i+": ");
                aluno.getNotas().add(ler.nextDouble());
            }
            
            alunos.add(aluno);
            
            //    	adição?
            System.out.println("Adicionar novo usuário: \nSim ou Não");
            String opcao = ler.next();
            if(opcao.toLowerCase().equals("nao")) break;
            
    	}while(true);
    	
        //    	Visualização
    	System.out.println("#".repeat(10)+"[ Relatório ]"+"#".repeat(10));
    	for(Aluno aluno: alunos) {
    		System.out.println("Nome: "+ aluno.getNome()+"\n"
    				+ "Notas: "+ aluno.notasFormatada()+ "\n"
    				+ "Média: " + aluno.media() + "\n"
    				+ "Situação: "+aluno.situacao() + "\n");
    	}
    	System.out.println("#".repeat(33)+"\n");
    }

    private static void equacaoCalculo() throws NumberFormatException, IOException {
      BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("Digite um numero x: ");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("Digite um numero y: ");
            int y = Integer.parseInt(reader.readLine());
            
            var resultado = (x * 8 + y) - x + y / 100;
            System.out.println("(" + x + " * 8 - " + y + ") - " + x + " + " + y + " / 100");
            System.out.println("O resultado da equacao e de : " + resultado);
    }

    private static void aula1() {
      // Reading data using readLine

        int numero1 = 3;
        var numero2 = 5;

        int soma = numero1 + numero2;

        System.out.println( "O resultado da operacao e: " + soma );
    }
} 
