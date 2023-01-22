import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;


    public Shape() {
        points = new ArrayList<>();
    }
    public void addPoint(Point point) {
        points.add(point);
    }
    
    public void getPoints() {
        for (int i = 0; i < points.size(); i++) {
            System.out.println(points.get(i).getX() + " " + points.get(i).getY());
        }
    }

    public double calculatePer() {
        double per = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            per += Point.distance(points.get(i), points.get(i+1));
        }
        per += Point.distance(points.get(points.size() - 1), points.get(0));
        return per;
    }

    public double findLongestLine(){
        double max = 0;
        for (int i = 0; i < points.size() - 1; i++){
            if (max < Point.distance(points.get(i), points.get(i+1))){
                max = Point.distance(points.get(i), points.get(i+1));
            }
        }
        if (max < Point.distance(points.get(points.size() - 1), points.get(0))){
            max = Point.distance(points.get(points.size() - 1), points.get(0));
        }
        return max;
    }

    public double avgLength(){
        return (calculatePer()/(points.size()));
    }

}
