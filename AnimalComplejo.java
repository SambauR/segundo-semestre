package herencia;

public class AnimalComplejo {

    //atributos
    private int numPatas;
    private boolean genero;
    private String alimentacion;// carne, hierba
    private float temperaturaCorporalC;

    //constructores
    public AnimalComplejo() {
        this.numPatas = 0;
        this.genero = true;//true: macho, false: hembra
        this.alimentacion = "carnivoro";
        this.temperaturaCorporalC = 35.5f;
    }

    public AnimalComplejo(int numPatas, boolean genero, String alimentacion,
            float temperaturaCorpolarC) {
        this.numPatas = numPatas;
        this.genero = genero;
        this.alimentacion = alimentacion;
        this.temperaturaCorporalC = temperaturaCorpolarC;
    }
    //metodos

    public String reproducirse(AnimalComplejo animal) {
        String respuesta;

        if (this.genero != animal.getGenero()) {
            respuesta = "reproduccion con exito";

        } else {
            respuesta = "Sin reproduccion";
        }
        return respuesta;
    }

    public void comer(String tipoComida) { //carne, hierba

        if (this.alimentacion == "herbivoro" && tipoComida == "hierba") {
            System.out.println("el animal complejo come:" + tipoComida);
        } else {
            if (this.alimentacion == "carnivoro" && tipoComida == "carne") {
                System.out.println("el animal complejo come:" + tipoComida);

            } else {
                if (this.alimentacion == "omnivoro" && (tipoComida == "carne" || tipoComida == "hierba")) {
                    System.out.println("el animal complejo es omnivoro y se comio" + tipoComida);
                } else {
                    System.out.println("el animal complejo es " + this.alimentacion + " y se comio la : " + tipoComida);
                }
            }
        }

    }

    // gets and sets
    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public float getTemperaturaCorporalC() {
        return temperaturaCorporalC;
    }

    public void setTemperaturaCorporalC(float temperaturaCorporalC) {
        this.temperaturaCorporalC = temperaturaCorporalC;
    }

}
