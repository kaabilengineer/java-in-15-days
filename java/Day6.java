
public class Day6 {
    public static int[] Find(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int avg = sum / a.length;
        return new int[]{sum, avg};
    }

    public static int FindMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int[] Reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] x = Find(a);
        int[] reversed = Reverse(a);
        System.out.println("Sum is: " + x[0]);
        System.out.println("Average is: " + x[1]);
        System.out.println("Max is: " + FindMax(a));
        System.out.println(reversed);
    }
}
