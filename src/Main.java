public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();

        p1.x = 5;
        p1.y = 6;
        System.out.println(p1);
        p1.translate(400,500);
        Point p2 = p1.translated(-400, -500);
        System.out.println(p2.toSvg());
    }

}