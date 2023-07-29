package herencia;

public class Mono extends AnimalComplejo {

    //atributos
    private String colorPelo;
    private double pesoKg;
    private double alturaM;

    //constructor
    public Mono() {
        super();
        colorPelo = "Cafe";
        pesoKg = 0.1;
        alturaM = 0.15;
    }

    public Mono(String colorPelo, double pesoKg, double alturaM,
            int numPatas, boolean genero, String alimentacion, float temperaturaCorpolarC) {
        super(numPatas, genero, alimentacion, temperaturaCorpolarC);
        this.alturaM = alturaM;
        this.colorPelo = colorPelo;
        this.pesoKg = pesoKg;
    }

    //metodos
    public void trasladarse() {
        System.out.println("El mono se mueve por los árboles");
    }

    //gets and sets
    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(double alturaM) {
        this.alturaM = alturaM;
    }

}
