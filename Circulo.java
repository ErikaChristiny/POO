public class Circulo {
    //Atributos
    private int raio;

    //Construtor
    public Circulo ( int raio){
        this.raio = raio;
    }

    //Métodos
    public float calcularArea(){
        return 3.141516f * raio * raio;
    }
    public float calcularPerimetro(){
    return 2 * 3.141516f * raio;
    }   
    public void imprimir(){                  
    System.out.printf("raio: %d, Àrea: %.2f, perimetro: %.2f", raio, calcularArea(), calcularPerimetro());
    }


}
