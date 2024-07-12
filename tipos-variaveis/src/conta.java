public class conta {
    //variavel da classe conta
     double saldo= 10.65;

      public void sacar(Double valor){

        //variavel local de método 
         double novoSaldo = saldo - valor;}

         public void imprimirSaldo(){

            //disponivel em toda classe
             System.out.println(saldo);

             //somente o método sacar conhce esta variavel

            // System.out.println(novoSaldo);
         }
      }

