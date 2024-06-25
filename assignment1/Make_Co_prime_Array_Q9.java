public class Make_Co_prime_Array_Q9 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(solve(arr));

    }

    public static int solve(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (gcd(arr[i], arr[i + 1]) != 1) {
                c++;

            }

        }
        return c;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
}
