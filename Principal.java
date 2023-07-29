package herencia;

public class Principal {

    public static void main(String[] args) {

        AnimalComplejo ac1 = new AnimalComplejo();
        Leon l1 = new Leon(true, 0, 4, true, "carnivoro", 28.5f);
        System.out.println("el genero del leon L1 es:" + l1.getGenero());
        System.out.println("entonces su melena es:" + l1.isMelena());
        ac1.comer("carne");
    }
}
