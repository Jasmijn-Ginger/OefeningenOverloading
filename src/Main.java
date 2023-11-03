public class Main {
    public static void main(String[] args) {

        System.out.println(Overload.IdentifyTypeParameter("These are words"));
        System.out.println(Overload.IdentifyTypeParameter(1));
        System.out.println(Overload.IdentifyTypeParameter(3.69));
        System.out.println(Overload.IdentifyTypeParameter(Integer.valueOf(9)));
        System.out.println(Overload.IdentifyTypeParameter(true));

        Overload overload = new Overload();
        System.out.println(Overload.IdentifyTypeParameter(overload));

        System.out.println(Something.PrintValues("a", 2, "c"));
        System.out.println(Something.PrintValues("a", 2));
        System.out.println(Something.PrintValues(2));

        Rectangle rectangle = new Rectangle(10,10);
        System.out.println(rectangle.hoevaakPastRectinRect(1,2));

        Rectangle rectangle1 = new Rectangle(2,6);
        Rectangle rectangle2 = new Rectangle(1, 3);
        Rectangle rectangle3 = new Rectangle(2, 4);
        System.out.println(Rectangle.hoevaakPastRectinRect(rectangle1, rectangle2));

        Circle circle1 = new Circle(3);
        System.out.println(circle1.omHoeveelMeterPaal(9));
        //heap is woordenboek
        //stack is schrift

        System.out.println(rectangle.omHoeveelMeterPaal(10));
        System.out.println(rectangle.hoeveelPalen(2));
        System.out.println(circle1.hoeveelPalen(2));

        System.out.println(Rectangle.hoevaakPastStatischeRectInRect(rectangle1, rectangle3));

    }
}