package Basic_recursion;

public class fibbo {
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }

    private static int  fibo(int n) {

        // Base Condition
        if(n < 2){
            return n;
        }

        //Recursive call
        return fibo(n-1) + fibo(n-2);

    }

}
