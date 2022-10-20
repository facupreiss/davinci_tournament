import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Torneo Da Vinci");

        Date comienzoDeCursada = new Date(2022,7,18);
        Date finDeCursada = new Date(2022,11,5);
        Date fechaParcial = new Date(2022,8,29);


        Season torneoDaVinci = new Season("Torneo 2022", comienzoDeCursada, finDeCursada);

        torneoDaVinci.setStartDate(comienzoDeCursada);
        torneoDaVinci.setEndDate(finDeCursada);

        Team equipoPoo = new Team("Profes POO");
        Team estudiantesPoo = new Team("Estudiantes POO");

        Match primerParcial = new Match(fechaParcial,"Aula 116", equipoPoo, estudiantesPoo );




    }
}
