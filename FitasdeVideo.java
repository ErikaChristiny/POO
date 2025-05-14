public class FitasdeVideo {
    //Atributos
    private String Titulo;
    private double preco;

    //Construtor
    public FitasdeVideo (String Titulo, double preco){
        this.Titulo = Titulo;
        this.preco = preco;
    }
    //Métodos
    public String getTitulo(){
        return Titulo;
    }
    public double getpreco(){
        return preco;
    }
    public double getValorAluguel(int numeroDeDiasAlugada){
        return preco * numeroDeDiasAlugada;
    }
    public void imprimir(int numeroDeDiasAlugada){
        System.out.printf("Titulo; %S\n", Titulo);
        System.out.printf("Preço do aluguel por dia; RS %.2f\n", preco);
        System.out.printf("Valor do aluguel para %d dias: RS %.2f\n", numeroDeDiasAlugada, getValorAluguel(numeroDeDiasAlugada));
    }
    
}
