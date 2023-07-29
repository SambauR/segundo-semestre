package herencia;

public class Leon extends AnimalComplejo {

    // atributos
    private boolean melena;
    private int posManada; //-1: sin manada
                           // 0: si tiene manada
                           // 1: alfa de la manada
    // constructor

    public Leon() {
        super();
        melena = super.getGenero();
        posManada = 0;

    }

    public Leon(boolean melena, int posManada, int numPatas, boolean genero,
            String alimentacion, float temperaturaCorpolarC) {
        super(numPatas, genero, alimentacion, temperaturaCorpolarC);
        this.melena = genero;
        this.posManada = posManada;
    }

    // metodos
    public void banarse() {
        System.out.println("El leon se limpia con su lengua ");
    }

    //gets and sets
    public boolean isMelena() {
        return melena;
    }

    public int getPosManada() {
        return posManada;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }

    public void setPosManada(int posManada) {
        this.posManada = posManada;
    }

}
