package Atividade12.ExtractVariable;

public class exercicio4 {
    public void verificarDesconto(double totalCompra, boolean clientePremium, int quantidadeItens){
        boolean quantiaMinima = quantidadeItens >= 3;
        boolean descontoComun = totalCompra >= 300 || quantiaMinima;
        boolean descontoPremium = clientePremium || totalCompra >= 150;
        if(descontoPremium || descontoComun){
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("Sem desconto");
        }
    }
}
