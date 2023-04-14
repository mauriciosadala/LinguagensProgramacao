import java.util.ArrayList;
import java.util.List;
public class Pedido {
    Cliente c;
    Massa m;
    List<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

    public double CalculaValor(){
        //Pegando o valor inicial da massa para o calculo
        double valorInicial = m.valor;
        //Pegando o tamanho da lista que corresponde
        //a quantidade de ingredientes escolhidos
        int qdteIngredientesEscolhidos = listaIngredientes.size();
        //sabemos que cada ingrediente adicionado acrescenta 2 reais entao ...
        double valorTotalIngredientes = qdteIngredientesEscolhidos * 2;
        double valorTotalPedido = valorInicial + valorTotalIngredientes;
        return valorTotalPedido;
    }
}
