public class Main {
    public static void main(String[] args) {
        nullTest(null,null);
    }
    public static Integer nullTest(Integer numerator, Integer denominator) {
        try {
            if(numerator == null) {
                throw new Exception("Numerator is null");
            } else {
                System.out.println("Numerator is " + numerator + " and is not null");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        try {
            if(denominator == null) {
                throw new Exception("Denominator is null");
            } else {
                System.out.println("Denominator is " + denominator + " and is not null");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return numerator;
    }
}