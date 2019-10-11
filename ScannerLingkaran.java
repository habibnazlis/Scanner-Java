import java.util.Scanner;

public class ScannerLingkaran {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Phi = ");
        double phi = sc.nextDouble();

        System.out.print("Jari-jari = ");
        int r = sc.nextInt();

        double keliling = 2 * phi * r;
        System.out.print("Keliling Lingkaran = 2 x phi x r = " + 2 + " x " + phi + " x " + r);
        System.out.println(" = " + keliling);

        System.out.print("Luas Lingkaran = phi x r x r = " + phi + " x " + r + " x "+ r);

        r = (int) Math.pow(r, 2);
        double luas = phi * r;
        System.out.println(" = " + luas);
    }
}
