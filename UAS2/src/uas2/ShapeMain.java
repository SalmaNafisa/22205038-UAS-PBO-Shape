package uas2;
import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Perhitungan Luas Lingkaran: ");
        System.out.println("=====================================");
        System.out.println("Masukkan warna lingkaran");
        String colorCircle = scanner.nextLine();
        System.out.println("Masukkan radius lingkaran");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(colorCircle, radius);
        System.out.println("Luas Lingkaran: " + circle.getArea());
        System.out.println("");
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("======================================");
        System.out.println("Masukkan warna persegi panjang: ");
        scanner.nextLine();
        String colorRectangle = scanner.nextLine();
        System.out.println("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();
        System.out.println("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(colorRectangle, length, width);
        System.out.println("Luas persegi panjang: " + rectangle.getArea());
        
        scanner.close();
    }
    
}
