public class Rectangle {
    int width;
    int length;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    Rectangle(){
        this(2,4);
    }

    Rectangle(int lengthAndWidth){
        this(lengthAndWidth, lengthAndWidth);
    }

    public int calculateOppervlakte(){
        return length*width;
    }

    public int calculateOmtrek(){
        return length+length+width+width;
    }

    public int calculateOppervlakte(int length, int width){
        return length*width;
    }

    public int calculateOmtrek(int length, int width){
        return length+length+width+width;
    }

    public String hoevaakPastRectinRect(int length, int width){
        if (calculateOppervlakte(this.length, this.width)/calculateOppervlakte(length, width) > 0) {
            return String.valueOf(calculateOppervlakte(this.length, this.width) / calculateOppervlakte(length, width));
        }
        return "Mag geen negatieve waarde hebben";

    }

    public static String hoevaakPastRectinRect(Rectangle rectangle1, Rectangle rectangle2){
       if (rectangle1.calculateOppervlakte() > rectangle2.calculateOppervlakte()){
           return String.valueOf(rectangle1.calculateOppervlakte()/rectangle2.calculateOppervlakte());
       }
       return "Let op! Rectangle 1 moet groter zijn dan Rectangle 2";
    }

    public static String hoevaakPastStatischeRectInRect(Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.calculateOppervlakte() > rectangle2.calculateOppervlakte()){
            return String.valueOf(Math.floor(rectangle1.width/ rectangle2.width)*Math.floor(rectangle1.length/rectangle2.length));
        }
        return "Let op! Rectangle 1 moet groter zijn dan Rectangle 2";
    }

    public double omHoeveelMeterPaal(int aantalPalen){
        return (double) calculateOmtrek() /aantalPalen;
    }

    public int hoeveelPalen(double aantalMeter){
        return (int)Math.round(calculateOmtrek()/aantalMeter);
    }

}
