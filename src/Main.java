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

        Player profeSergio = new Player("Sergio Medina", "Arquero");
        Player profeSuplente = new Player("Suplente", "Defender");
        Player profeBase = new Player ("Victor Golemba", "Delantero");
        Player profePert = new Player ("Lautaro Cciapero", "Mediocampista");
        Player profeWeb = new Player ("Juan Carloni", "Lateral");

        Player estFacuPreiss = new Player ("Facundo Preiss", "Mediocampista");
        Player estKevin = new Player ("Daniel Kevin Colina", "Defensor");
        Player estFacuNeiman = new Player ("Facundo Ezequiel Neiman", "Delantero");
        Player estLucasEmens = new Player ("Lucas Patricio Emens", "Defensa");
        Player estSantiFazio = new Player ("Santino Tomás Fazio", "Arquero");


        Team equipoPoo = new Team("Profes POO");
        equipoPoo.addPlayer(profeSergio);
        equipoPoo.addPlayer(profeSuplente);
        equipoPoo.addPlayer(profeBase);
        equipoPoo.addPlayer(profePert);
        equipoPoo.addPlayer(profeWeb);

        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(estFacuPreiss);
        estudiantesPoo.addPlayer(estKevin);
        estudiantesPoo.addPlayer(estFacuNeiman);
        estudiantesPoo.addPlayer(estLucasEmens);
        estudiantesPoo.addPlayer(estSantiFazio);


        Match primerParcial = new Match(fechaParcial,"Aula 116", equipoPoo, estudiantesPoo );



    }
}
