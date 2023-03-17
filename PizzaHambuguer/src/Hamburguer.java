public class Hamburguer {

    private String nome;
    private Double valor;
    private boolean artesanal;

    public double calcularValor(boolean artesanal){
        if(artesanal){
            return getValor() + 8.00;
        }
        return getValor();
    }

    public String ConsultarNome(){
        return getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isArtesanal() {
        return artesanal;
    }

    public void setArtesanal(boolean artesanal) {
        this.artesanal = artesanal;
    }
}
