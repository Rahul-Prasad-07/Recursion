package Basic_recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int ans = sum(23145);
        System.out.println(ans);
    }
    static int sum (int sum){

        if(sum==0){
            return 0;
        }

        return (sum%10) + (sum/10);
    }
}
