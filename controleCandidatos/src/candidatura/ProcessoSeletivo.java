package candidatura;
 
 import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo"); 
         selecaoCandidatos();

       /*analisarCandidato(1900.0);
         analisarCandidato(2200.0);
         analisarCandidato(2000.0);*/
    }

     static void selecaoCandidatos(){
        String [] candidatos = { "Marcia", "Yasmin", "Natalia", "Vinycius", "Daniela", " Sara", "Carolina", "Keila", "Rodrigo","Sofia"};
      int candidatosSelecionados = 0;
      int candidatoAtual = 0; 
       double  salarioBase = 2000.0;

       while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
         String candidato = candidatos[candidatoAtual]; 

          double salarioPretendido = valorPretendido();
 
          System.out.println( "O candidato " + candidato + " Solicitou este valor de salario " +  salarioPretendido);

           if( salarioBase >= salarioPretendido){
             System.out.println(" o candidato " + candidato + " foi selecionado para a vaga");

              candidatosSelecionados++;
           } 
            candidatoAtual++;
       }
    
    }
 

      static double valorPretendido(){
         return ThreadLocalRandom.current().nextDouble(1800, 2200);
      }
     static void analisarCandidato( double salarioPretendido){

         double salarioBase = 2000.0;
          if(salarioBase > salarioPretendido){
          System.err.println("Ligar para o candidato");
           } else if( salarioBase == salarioPretendido) 

             System.out.println(" Ligar para o candidato com contra proposta");

           else{
             System.out.println("Aguardando o resultado dos demais candidatos");
           }

     } 
}