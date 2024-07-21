public class Day8 {
    public static int FindLength(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            count += 1;
        }
        return count;
    }

    public static int[] Sort(int[] a) {
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length); 
    
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
    
        return b;
    }
    
                    
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        String S = "Atharva";
        System.out.println("Length of '" + S + "' is: " + FindLength(S));
        int[] a = {1, 2, 5, 3, 6, 4};
        int[] b = Sort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}