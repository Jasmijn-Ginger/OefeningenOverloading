public class Circle {
    int radius;

    Circle (int radius){
        this.radius = radius;
    }

    public int calculateDiameter(){
        return radius*2;
    }

    public int calculateDiameter(int radius){
        return radius*2;
    }

    //Vraag 2.4
    public int changeRadius(int diameter){
        return diameter/2;
    }

    public double calculateOmtrek(){
        return Math.PI*(radius*2);
    }

    public double calculateOppervlakte(){
        return Math.pow(radius, 2)*Math.PI;
    }

    public double calculateOmtrek(int radius){
        return Math.PI*(radius*2);
    }

    public double calculateOppervlakte(int radius){
        return Math.pow(radius, 2)*Math.PI;
    }

    public double omHoeveelMeterPaal(int aantalPalen){
        return calculateOmtrek(radius)/aantalPalen;
    }

    public int hoeveelPalen(double aantalMeter){
        return (int)Math.round(calculateOmtrek(radius)/aantalMeter);
    }

}
