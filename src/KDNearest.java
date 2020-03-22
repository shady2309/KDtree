import java.util.Scanner;

class KDTNearest {

    public static void main(String args[]) {
        int numpoints = 5;

        KDTree kdt = new KDTree(numpoints);
        double x[] = new double[2];

        x[0] = 1.9;
        x[1] = 5.9;
        kdt.add(x);

        x[0] = 1.4;
        x[1] = 2.8;
        kdt.add(x);

        x[0] = 4.7;
        x[1] = 11.1;
        kdt.add(x);

        x[0] = 8.7;
        x[1] = 15.3;
        kdt.add(x);

        x[0] = 5.1;
        x[1] = 4.0;
        kdt.add(x);

        System.out.println("Enter the co-ordinates of the point: (one after the other)");
        Scanner scan = new Scanner(System.in);
        double sx = scan.nextDouble();
        double sy = scan.nextDouble();

        double s[] = {sx, sy};
        KDNode kdn = kdt.find_nearest(s);
        System.out.println("The nearest neighbor is: ");
        System.out.println("(" + kdn.x[0] + " , " + kdn.x[1] + ")");
    }
}
