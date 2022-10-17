import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Torneo Da Vinci");

        Date comienzoDeCursada = new Date();
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);


        Date finDeCursada = new Date();
        finDeCursada.setYear(2022);
        finDeCursada.setMonth(11); //Enero 0, Dic 11
        finDeCursada.setDate(5);


        Season torneoDaVinci = new Season("Torneo 2022", comienzoDeCursada, finDeCursada);

        torneoDaVinci.setStartDate(comienzoDeCursada);
        torneoDaVinci.setEndDate(finDeCursada);
    }
}
