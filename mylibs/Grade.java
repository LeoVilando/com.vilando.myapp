package mylibs;

public class Grade {
    private double quiz;
    private double ola;
    private double fe;
    
    public Grade(double quiz, double ola, double fe) {
        this.quiz = quiz;
        this.ola = ola;
        this.fe = fe;
    }
    
    public double computeGrade() {
        return (quiz * 0.3) + (ola * 0.3) + (fe * 0.4);
    }
    
}