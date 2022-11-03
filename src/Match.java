import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private MatchResult result;

    Match( ){
       this.result = new MatchResult();
    }

    Match(Date date, String location){
        this.result = new MatchResult();
        this.setDate(date);
        this.setLocation(location);
    }

    Match(Date date, String location, Team localTeam, Team visitantTeam){
        this.result = new MatchResult();
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

    public Team getVisitantTeam() {
        return visitantTeam;
    }

    public void makeGoal (Team team, Player player) {
        if (team.getName() == this.getLocalTeam().getName()) {
            this.result.incrementLocalCounter();

        }
        if (team.getName() == this.getVisitantTeam().getName()) {
            this.result.incrementVisitantCounter();
    }
        player.incrementGoalCounter();
    }

    public String generateMarker(){
        return String.format(" %s %s %s ",
                this.getLocalTeam().getName(),
                this.result.generateMarker(),
                this.getVisitantTeam().getName()
        );

       // return this.getLocalGoalCounter() + "-" + this.getVisitantGoalCounter();
    }
}
