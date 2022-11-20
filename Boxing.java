
public class Boxing extends Training {

  private int numRounds;
  private int numPounds;

  public Boxing(String sport, int time, int numRounds, int numPounds) {
    super(sport, time);
    this.numRounds = numRounds;
    this.numPounds = numPounds;
  }

  @Override
  public int caloriesBurned() {
    if (super.getTime() >= 0 && super.getTime() <= 10) {
      return 150;
    } else if (super.getTime() > 10 && super.getTime() <= 20) {
      return 225;
    } else if (super.getTime() > 20 && super.getTime() <= 30) {
      return 375;
    } else if (super.getTime() > 30 && super.getTime() <= 40) {
      return 425;
    } else {
      return 575;
    }
  }

  @Override
  public String trainingSummary() {
    System.out.println();
    String s = "BOXING CLASS:\n";
    s += "Went " + numRounds + " Rounds\n";
    s += "Boxed for " + super.getTime() + " minutes\n";
    s += "Burned " + caloriesBurned() + " calories";
    return s;
  }

  public int getNumRounds() {
    return numRounds;
  }

  public int getNumPounds() {
    return numPounds;
  }

  public void setNumRounds(int numRounds) {
    this.numRounds = numRounds;
  }

  public void setNumPounds(int numPounds) {
    this.numPounds = numPounds;
  }

  @Override
  public String toString() {
    return super.toString() + " You went " + this.numRounds + " rounds, and finished weighing in at " + this.numPounds
        + " pounds!";
  }
}