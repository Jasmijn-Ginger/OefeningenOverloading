public class Something {

    public static String PrintValues(String a, int b, String c){
        return a + " - " + b + " - " + c;
    }

    public static String PrintValues(String a, int b){
        return PrintValues(a, b, "Oh no, you are missing String c!");
    }

    public static String PrintValues(int b){
        return PrintValues("Oh no, you are missing String a!", b, "Oh no, you are missing String c!");
    }

}
