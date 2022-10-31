import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    Match( ){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
    }


    Match(Date date, String location){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
        this.setDate(date);
        this.setLocation(location);
    }

    Match(Date date, String location, Team localTeam, Team visitantTeam){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
        this.setDate(date);
        this.setLocation(location);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }

    public void setLocation(String location){
        this.location = location;
        return;
    }
    public String getLocation(){
        return this.location;
    }

    public void setDate(Date date){
        this.date = date;
        return;
    }
    public Date getdate(){
        return this.date;
    }
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }
    public Team getLocalTeam(){
        return this.localTeam;
    }
    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }



    public Team getVisitantTeam() {
        return visitantTeam;
    }


    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public int getVisitantGoalCounter() {
        return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    public void makeGoal (Team team, Player player) {
        if (team.getName() == this.getLocalTeam().getName()) {
            this.localGoalCounter++;
            //setLocalGoalCounter(getLocalGoalCounter()+1);
        }
        if (team.getName() == this.getVisitantTeam().getName()) {
            this.visitantGoalCounter++;
    }
        player.incrementGoalCounter();
    }


    public String generateMarker(){
        return String.format("%s (%d) - (%d) %s",
        this.getLocalTeam().getName(),
        this.getLocalGoalCounter(),
        this.getVisitantGoalCounter(),
        this.getVisitantTeam().getName()
    );

       // return this.getLocalGoalCounter() + "-" + this.getVisitantGoalCounter();
    }
}
