public class Day5 {
    public void PrintNNumbers(int a){
        for (int i=0; i<=a; i++){
           
            System.out.println(i);
        }
    }

    public int Factorial(int a){
        int fact = 1;
        for (int i=1; i<=a; i++){
            fact = fact * i;
        }
        return fact;
    }

    public void Fibonaaci(int a){
        int a1 = 0, a2 = 1, a3 = 0;
        for (int i=0; i<=a; i++){
            System.out.println(a1);
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;

        }
    }

    public static int Fibonaaci2(int a){
        if (a<=1){
            return a;
        } 
        return Fibonaaci2(a-1) + Fibonaaci2(a-2);
    }

    public static void main(String[] args) {
        Day5 obj = new Day5();
        obj.PrintNNumbers(5);
        int x = obj.Factorial(5);
        System.out.println(x);
        int n = 10; // Number of terms in the Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonaaci2(i) + " ");
        }
    }
}
