package proyectoFinal;

//Codigo para un barco persquero diseñado para el caso ideal
public class BarcoPesquero implements Timon, Ancla, RedPesca, Motor, PalancaVel {

    //Atributos
    private String nombre;
    private int numSalvavidas;
    private int estadoAncla; // 0: ancla abajo y 1 ancla arriba 
    private int anguloGiroTimon;
    private float velocidadKmH;
    private int estadoRed; // 0:abajo, 1:arriba, 2: rota
    private boolean encendido; //true: encendido, false: apagado

    //constructores
    public BarcoPesquero() {
        nombre = "Pecesito barco";
        numSalvavidas = 2;
        estadoAncla = 0;
        anguloGiroTimon = 0;
        velocidadKmH = 0;
        estadoRed = 1;
        encendido = false;
    }

    public BarcoPesquero(String nombre, int numSalvavidas, int estadoAncla,
            int anguloGiroTimon, int velocidadKmH, int estadoRed, boolean encedido) {
        this.nombre = nombre;
        this.numSalvavidas = numSalvavidas;
        this.estadoAncla = estadoAncla;
        this.anguloGiroTimon = anguloGiroTimon;
        this.velocidadKmH = velocidadKmH;
        this.estadoRed = estadoRed;
        this.encendido = encendido;
    }

    public void girarTimon(int anguloGiro) {
        anguloGiroTimon = anguloGiro / 2;
        if (anguloGiroTimon < 0) {
            anguloGiroTimon *= (-1);
            System.out.println("El barco esta girando a la izquierda "
                    + anguloGiroTimon + " grados");
        } else if (anguloGiroTimon > 0) {
            System.out.println("El barco esta girando a la derecha "
                    + anguloGiroTimon + " grados");
        } else {
            System.out.println("El barco va recto");
        }
    }

    public void subirAncla() {
        if (estadoAncla == 0) {
            System.out.println("El ancla estaba abajo, ya la subiste ahora puedes"
                    + " zarpar, buen viaje!!");
        }
        if (estadoAncla == 1) {
            System.out.println("El anlca ya está arriba, no la puedes subir");
        }
    }

    public void bajarAncla() {
        if (estadoAncla == 0) {
            System.out.println("El ancla ya está abajo, no la puedes bajar ");
        }
        if (estadoAncla == 1) {
            System.out.println("El ancla estaba arriba, ya la "
                    + "bajaste");
            estadoAncla = 0;
        }
    }

    public void subirRed(int pesoKg) {
        if (estadoRed == 1) {
            System.out.println("La red está arriba, no la puedes subir más");
        }
        if (estadoRed == 0 && pesoKg >= 100000) {
            System.out.println("La red está subiendo con la carga");
            estadoRed = 1;
        }
        if (estadoRed == 0 || pesoKg < 100) {
            System.out.println("No podemos subir la red porque no está lo"
                    + " suficientemente llena");
        }
        if (pesoKg > 500000) {
            System.out.println("La red se rompió");
            estadoRed = 2;
        }

    }

    public void bajarRed(int pesoKg) {
        if (estadoRed == 0) {
            System.out.println("La red ya estaba abajo");
            estadoRed = 0;
        }
        if (estadoRed == 1 && pesoKg > 0) {
            System.out.println("Asegúrate de tener vacía la red");
        }
        if (estadoRed == 1 && pesoKg == 0) {
            System.out.println("La red está bajando");
            estadoRed = 0;
        }

    }

    public void romperse(int pesoKg) {
        System.out.println("La red está rota");
    }

    public void encender() {      
        if (encendido) {
            System.out.println("El barco ya estaba encendido");
        }
        if (!encendido) {
            System.out.println("Has encendido el barco");
            setEncendido(true);
        }

    }

    public void apagar() {
        if (!encendido) {
            System.out.println("El barco ya estaba apagado");
        }
        if (encendido) {
            System.out.println("Has apagado el barco");
            setEncendido(false);
        }
        

    }

    public void aumentarVelocidad(int fuerzaPalanca) {
        if (encendido = true && estadoAncla == 1) {
            if (velocidadKmH >= 0) {
                velocidadKmH = fuerzaPalanca;
                System.out.println("El barco está acelerando a"
                        + " una velocidad de: " + velocidadKmH + "Km/h");
            }
        } else {
            System.out.println("Debes encender el barco primero y levantar el ancla revisa"
                    + " ambos estados");
        }
        if (velocidadKmH >= 56) {
            System.out.println("Alcanzaste la velocidad máxima");
        }
        if(velocidadKmH > 56){
            System.out.println("Si sigues acelerando puedes dañar el motor"
                    + "\n reduce la velocidad!!!");
        }

    }

    public void disminuirVelocidad(int fuerzaPalanca) {
        if (velocidadKmH > 0) {
            velocidadKmH = fuerzaPalanca / 2;
            System.out.println("El barco redujó su"
                    + " velocidad a: " + velocidadKmH + "Km/h");
        }
        if (velocidadKmH == 0) {
            System.out.println("El barco ya no puede bajar más la velocidad, baja el ancla"
                    + "para bajar del barco");
        }
    }

    //gets and sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSalvavidas() {
        return numSalvavidas;
    }

    public void setNumSalvavidas(int NumSalvavidas) {
        this.numSalvavidas = numSalvavidas;
    }

    public int getEstadoAncla() {
        return estadoAncla;
    }

    public void setEstadoAncla(int estadoAncla) {
        this.estadoAncla = estadoAncla;
    }

    public int getAnguloGiroTimon() {
        return anguloGiroTimon;
    }

    public void setAnguloGiroTimon(int anguloGiroTimon) {
        this.anguloGiroTimon = anguloGiroTimon;
    }

    public float getVelocidadKmH() {
        return velocidadKmH;
    }

    public void setVelocidadKmH(float velocidadKmH) {
        this.velocidadKmH = velocidadKmH;
    }

    public int getEstadoRed() {
        return estadoRed;
    }

    public void setEstadoRed(int estadoRed) {
        this.estadoRed = estadoRed;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
