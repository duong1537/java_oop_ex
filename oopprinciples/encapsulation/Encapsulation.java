package oopprinciples.encapsulation;

public class Encapsulation {

    private double processScore;
    private double midScore;
    private double endScore;
    public String evaluate = "Unknown";

    public Encapsulation() {
    }

    public void setProcess(double processScore) {
        this.processScore = processScore;
    }

    public void setMid(double midScore) {
        this.midScore = midScore;
    }

    public void setEnd(double endScore) {
        this.endScore = endScore;
    }

    public double getProcess() {
        return this.processScore;
    }

    public double getMid() {
        return this.midScore;
    }

    public double getEnd() {
        return this.endScore;
    }

    public double getResult(double process, double mid, double end) {
        double score = this.processScore * process + this.midScore * mid + this.endScore * end;
        if (score > 4) {
            this.evaluate = "Passed";
        } else {
            this.evaluate = "Fail";
        }
        return score;
    }
}