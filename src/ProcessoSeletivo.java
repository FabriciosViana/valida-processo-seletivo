import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoDeCandidatos();
    }

    static void selecaoDeCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + "este valor de salário " + salarioPretendido);
            if(salarioPretendido <= salarioBase){
                candidatosSelecionados++;
                System.out.println("----------------------------------------------");
                System.out.println("O candidato " + candidato + " foi selecionado");
            }
            candidatoAtual++;
        }
    }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}


/*Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o salário pretentido pelo candidato.
Vamos elaborar um controle de fluxo onde:
Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;
Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.*/