package Basic_recursion;

public class Nto1 {

    public static void main(String[] args) {

        fun(5);
    }

    private static void fun(int n) {

        // Base condition
        if(n==0){
            return;
        }

        System.out.println(n); // first print the value then call recursive call.
        fun(n-1);
    }
}
