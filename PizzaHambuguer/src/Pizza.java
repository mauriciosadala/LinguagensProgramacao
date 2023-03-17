public class Pizza {

    private String nome;
    private double valor;
    private boolean possuiBorda;

    public double CalcularValor(Boolean possuiBorda){
        if (possuiBorda){
            return getValor() + 5.00;
        }
        return getValor();
    }

    public String consultarNome(){
        return getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPossuiBorda() {
        return possuiBorda;
    }

    public void setPossuiBorda(boolean possuiBorda) {
        this.possuiBorda = possuiBorda;
    }
}
