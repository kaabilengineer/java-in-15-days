import java.util.Scanner;

public class Day2 {
    public int[] Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public void Size(){
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
    }
    public static void main(String[] args) {
        Day2 day2 = new Day2();
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] result = day2.Swap(a, b);
        System.out.println(result[0] + " " + result[1]);
     
        day2.Size();

    }
}

