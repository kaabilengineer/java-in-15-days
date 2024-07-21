public class Day7 {
    public static int FindLength(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            count += 1;
        }
        return count;
    }

    public static void Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10};
        
        System.out.println("Before swapping: " + numbers[0] + ", " + numbers[1]);
        
        Swap(numbers, 0, 1);
        
        System.out.println("After swapping: " + numbers[0] + ", " + numbers[1]);
        
        String s = "Atharva";
        System.out.println("Length of '" + s + "' is: " + FindLength(s));
    }
    
}
