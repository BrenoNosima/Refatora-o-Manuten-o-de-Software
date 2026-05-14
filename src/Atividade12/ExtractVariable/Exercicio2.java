package Atividade12.ExtractVariable;

public class Exercicio2 {
    public void verificarAcesso(boolean usuarioAtivo, boolean senhaCorreta, boolean admin, boolean bloqueado){
        boolean acessoUsuario = (usuarioAtivo && senhaCorreta && !bloqueado);
        boolean acessoAdmin = (admin && senhaCorreta);
        if (acessoAdmin || acessoUsuario){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
