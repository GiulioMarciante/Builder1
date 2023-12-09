//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setaddress("Via delle pesche 25");
        builder.setage(43);
        builder.setfirstName("Paolo");
        builder.setlastName("Bitta");
        builder.setmarried(true);

        Person person1 = builder.build();
        System.out.println("\n" + person1);

        Builder builder2 = new Builder();
        builder2.setaddress("Via delle more 12");
        builder2.setage(40);
        builder2.setfirstName("Luca");
        builder2.setlastName("Nervi");
        builder2.setmarried(false);

        Person person2 = builder2.build();
        System.out.println("\n" + person2);
    }
}