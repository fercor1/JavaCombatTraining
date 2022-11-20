public abstract class Training {

  private String sport;
  private int time;

  public Training(String sport, int time) {
    this.sport = sport;
    this.time = time;
  }

  public abstract int caloriesBurned();

  public abstract String trainingSummary();

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  @Override
  public String toString() {
    System.out.println();
    return "Great job!  You trained in " + this.sport.toLowerCase() + " for " + this.time + " minutes!";
  }
}