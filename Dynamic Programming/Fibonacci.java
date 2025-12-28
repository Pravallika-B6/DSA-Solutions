class Fibonacci {
    public int fib(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int prev = 0;
        int prest = 1;
        int temp = prev;

        for(int i=0; i<n-1; i++){
            temp = prev;
            prev = prest;
            prest = temp + prest;
        }

        return prest;
    }
}
