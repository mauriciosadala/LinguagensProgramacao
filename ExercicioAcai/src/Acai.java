public class Acai {

   int tamanho;
   double valor;
   boolean acrescimo;

   public Acai(int tamanho, boolean acrescimo){
       tamanho = tamanho;
       acrescimo = acrescimo;
       if(tamanho == 300){
           valor = 8.0;
       }
       else if (tamanho ==500){
           valor = 10.0;
       }
       else if (tamanho == 700){
           valor = 12.0;
       }
       if (acrescimo){
           valor += 2.0;
       }

   }
   public double calculaValor(){
       return valor;
   }
}


