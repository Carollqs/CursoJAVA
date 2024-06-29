public class MinhaPrimeiraClasse {
    
    public static void  main (String [] args){


         String  primeiroNome = "Carolina";
          String segundoNome = "Queiroz"; 
          String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
           System.out.println(nomeCompleto);

          //System.out.print("Minha primeira classe");

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}




// Notes da aula:: 

/*convenções de escrita 
 todo Arquivo.java -  1º letra maiuscula 
  * Nome da classe  No arquivo: 
  deve possuir o mesmo nome do arquivo 

  exemplo:

  arquvio: CeuAzul.java 

  classe:
   public class CeuAzul{
   }

   * Nome de variavel: 
   *  - letra minuscula - Camel Case 
   * Se for uma palavra composta, qntNuvens
    


   -> SALVO  este caso::

     final String BR = "Brasil";
     final double PI = 3.14;
     final int ESTADOS_BRASILEIRO = 27;

      a palavra reservada "final" e a variavel toda em letras maiusculas,
       significa que seu conteúdo  não pode ser alterado  de maneira nenhuma. 
    (é uma vairavel constante HAHAHA )


  -> Declaração de Métodos 

   TipoRetorno Nome parametros
 
   exemplo:
    
   int somar( int numUm, int num2)

   String formatarCep(long cep)

   */


   /*
    ->   <- 


    */