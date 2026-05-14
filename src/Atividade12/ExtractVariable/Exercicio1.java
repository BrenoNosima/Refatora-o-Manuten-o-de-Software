package Atividade12.ExtractVariable;

public class Exercicio1 {
    public void verificarAprovacao(double notaFinal, int frequencia, boolean fezRecuperacao){
        boolean temFrequenciaMinima = frequencia>=75;
        boolean passouNaMedia = notaFinal >= 6.0;
        boolean passaDireto = passouNaMedia && temFrequenciaMinima;
        boolean passaComSub = (fezRecuperacao && notaFinal >= 5.0 && frequencia >= 80);
        if(passaDireto || passaComSub){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}

