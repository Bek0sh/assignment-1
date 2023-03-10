public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
    setX(x);
    setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distance(Point p, Point p1) {
        return Math.sqrt(Math.pow(p1.x - p.x, 2) + Math.pow(p1.y - p.y, 2));
    }

}
