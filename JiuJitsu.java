public class JiuJitsu extends Training {

  private int numPartners;
  private int numSubs;

  public JiuJitsu(String sport, int time, int numPartners, int numSubs) {
    super(sport, time);
    this.numPartners = numPartners;
    this.numSubs = numSubs;
  }

  @Override
  public int caloriesBurned() {
    if (super.getTime() >= 0 && super.getTime() <= 10) {
      return 110;
    } else if (super.getTime() > 10 && super.getTime() <= 20) {
      return 185;
    } else if (super.getTime() > 20 && super.getTime() <= 30) {
      return 335;
    } else if (super.getTime() > 30 && super.getTime() <= 40) {
      return 385;
    } else {
      return 535;
    }
  }

  @Override
  public String trainingSummary() {
    System.out.println();
    String s = "JIU JITSU CLASS: \n";
    s += "Made " + numSubs + " Submissions\n";
    s += "Trained for " + super.getTime() + " minutes\n";
    s += "Burned " + caloriesBurned() + " calories";
    return s;
  }

  public int getNumPartners() {
    return numPartners;
  }

  public int getNumSubs() {
    return numSubs;
  }

  public void setNumPartners(int numParnters) {
  }

  public void setNumSubs(int numSubs) {
    this.numSubs = numSubs;
  }

  @Override
  public String toString() {
    return super.toString() + " You rolled with " + this.numPartners + " training partners and had " + this.numSubs
        + " submissions!";
  }
}