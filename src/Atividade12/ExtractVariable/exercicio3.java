package Atividade12.ExtractVariable;

public class exercicio3 {
    public void avaliarEntrega(boolean entregouNoPrazo, double nota, boolean justificativaAceita){
        boolean validacaoAtraso = !entregouNoPrazo && justificativaAceita;
        boolean avaliacaoDireta = entregouNoPrazo && nota>=6.0;
        boolean avaliacaoComAtraso = validacaoAtraso && nota >= 7.0;
        if(avaliacaoDireta || avaliacaoComAtraso){
            System.out.println("Trabalho aceito");
        } else {
            System.out.println("Trabalho recusado");
        }
    }
}
