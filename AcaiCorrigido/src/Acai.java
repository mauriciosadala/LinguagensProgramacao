public class Acai {
    public String tamanho;
    public double valor;
    public boolean acrescimoSorvete;

    public double CalculaValor(Boolean acrescimoSorvete, String tamanho){
        if(tamanho.equals("P")){
            valor = 8.00;
        }
        else if(tamanho.equals("M")){
                valor = 10.0;
        }
        else if(tamanho.equals("G")){
            valor = 12.0;
        }
        if(acrescimoSorvete){
            valor += 2.0;
        }
        return valor;
    }
}
