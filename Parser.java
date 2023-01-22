public class Parser {
    public static Point parsePoint(String s){
        s = s.replaceAll(",", "");
        String[] strMas = s.split("[ ]");
        int[] coordts = new int[strMas.length];
        for (int i = 0; i < strMas.length; i++) {
            coordts[i] = Integer.parseInt(strMas[i]);
        }
        return new Point(coordts[0], coordts[1]);
    }
}

