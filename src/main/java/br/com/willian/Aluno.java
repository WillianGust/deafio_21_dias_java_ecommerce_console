package br.com.willian;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }


    public List<Double> getNotas() {
      if(this.notas == null){
        this.notas = new ArrayList<Double>();
      }

      return notas;
    }

    public void setNotas(List<Double> notas) {
      this.notas = notas;
    }

    public String situacao(){
      var media = this.media();
      if ( media >= 7) return "Aprovado";
      else if (media >= 5 && media <=6) return "Recuperacao";
      else return "Reprovado";
    }

    public double media(){
      double calculoMedia = 0;
      for (Double nota: this.getNotas()){
        calculoMedia += nota;
      }
      calculoMedia = calculoMedia / this.getNotas().size();
      return calculoMedia;
    }

    public String notasFormatada(){
      String notasSeparadasPorVigula = "";
      for (Double nota: this.getNotas()){
        notasSeparadasPorVigula += nota + ",";
      }
        return notasSeparadasPorVigula.substring(0,notasSeparadasPorVigula.length() - 1);
    }
}
