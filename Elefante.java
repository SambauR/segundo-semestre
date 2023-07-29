package herencia;

public class Elefante extends AnimalComplejo {

    //atributos
    private float tamOrejasCm;
    private float tamColmillosCm;
    private String colorPiel;

    //constructor
    public Elefante() {
        super();
        tamOrejasCm = 60;
        tamColmillosCm = 180;
        colorPiel = "Gris oscuro";
    }

    public Elefante(float tamOrejasCm, float tamColmillosCm, String colorPiel,
            int numPatas, boolean genero, String alimentacion, float temperaturaCorpolarC) {
        super(numPatas, genero, alimentacion, temperaturaCorpolarC);
        this.tamOrejasCm = tamOrejasCm;
        this.tamColmillosCm = tamColmillosCm;
        this.colorPiel = colorPiel;

    }

    //metodos
    public void refrescarse() {
        System.out.println("El elefante se baña en lodo y agita sus orejas para"
                + " refescarse");
    }

    public void dormir() {
        System.out.println("El elefante duerme de pie");
    }

    public void comer() {
        System.out.println("El elefante come con la trompa");
    }

    //gets and sets
    public float getTamOrejasCm() {
        return tamOrejasCm;
    }

    public void setTamOrejasCm(float tamOrejasCm) {
        this.tamOrejasCm = tamOrejasCm;
    }

    public float getTamColmillosCm() {
        return tamColmillosCm;
    }

    public void setTamColmillosCm(float tamColmillosCm) {
        this.tamColmillosCm = tamColmillosCm;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

}
