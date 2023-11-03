public class Overload {
    public static String IdentifyTypeParameter(String parameter){
        return "This is a string";
    }

    public static String IdentifyTypeParameter(int parameter) {
        return "This is an integer";
    }

    public static String IdentifyTypeParameter(double parameter) {
        return "This is a double";
    }

    public static String IdentifyTypeParameter(Object parameter) {
        return "This is an Object";
    }

    public static String IdentifyTypeParameter(boolean parameter) {
        return "This is an boolean";
    }
}
