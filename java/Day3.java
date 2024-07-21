public class Day3 {
    public void Compare(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else {
            System.out.println(b+" is greater than "+a);
        }
    }

    public void EvenOdd(int a){
        if(a%2==0){
            System.out.println(a+" is even");
        } else{
            System.out.println(a+" is odd");
        }
    }

    public static void main(String[] args) {
        Day3 obj = new Day3();
        obj.Compare(10, 20);
        obj.EvenOdd(3);
    }
}
