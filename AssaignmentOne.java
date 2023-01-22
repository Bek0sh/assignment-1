import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssaignmentOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\agent\\project2\\src\\file1.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Point p = Parser.parsePoint(s);
            shape.addPoint(p);
        }
            shape.getPoints();
            System.out.println(shape.calculatePer());
            System.out.println(shape.findLongestLine());
            System.out.println(shape.avgLength());

        }


    }
