public class Day14 {
    public int Factorial(int x){
        if((x == 0) || (x==1)){
            return 1;
        } 
        return x * Factorial(x-1);
    }

    public int TowerOfHanoi(int x){
        if(x == 0){
            return 0;
            }
            return 2 * TowerOfHanoi(x-1) + 1;
            
    }
    public static void main(String[] args) {
        Day14 obj = new Day14();
        System.out.println(obj.Factorial(5));
        System.out.println(obj.TowerOfHanoi(3));
    }
    
}
