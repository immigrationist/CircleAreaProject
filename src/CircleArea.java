public class CircleArea {
    public static void main(String[] args) {
        int radius;
        final double pi = 3.14;
        double area = 0.0;
        char radiusCharacterCode = '0';

        try{
            System.out.println("Enter radius");
            radiusCharacterCode = (char)System.in.read();
            radius = radiusCharacterCode - '0';
            area = pi * radius * radius;
            System.out.println("The area is " + area);
        }
        catch(Exception e){
            System.out.println("Keyboard malfunctioned");
        }
    }
}
