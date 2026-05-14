package Atividade12.ExtractVariable;

public class exercicio5 {
    public void verificarReserva(boolean salaDisponivel, int participantes, boolean eventoInstitucional){
        boolean reservaComum = salaDisponivel && participantes <= 40;
        boolean reservaEvento = eventoInstitucional && participantes <= 60;
        if(reservaEvento || reservaComum){
            System.out.println("Reserva permitida");
        } else {
            System.out.println("Reserva recusada");
        }
    }
}
