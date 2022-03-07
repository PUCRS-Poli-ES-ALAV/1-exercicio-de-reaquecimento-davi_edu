package br.pucrs.alav;

public class Recursion {
	
    public int mult(int a, int b){
        if(b!=0) return a + mult(a, b-1);
        return 0;
    }

    public int inc(int a, int b){
        if(b==0) return a;
        return 1 + inc(a,b-1);
    }

    public double div(int n){
        if(b!=0) return 1.0/n + div(n-1);
        return 1;
    }

    public String invString(String s){
        return invString(s.substring(1)) + String.valueOf(s.charAt(0));
    }

    public int seq(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return 2 * seq(n-1) + 3 * seq(n-2);
    }

    public int seqAck(int m, int n){
        if(m==0) return n+1;
        if(m!=0 && n==0) return seqAck(m-1, 1);
        return seqAck(m-1, seqAck(m, n-1));
    }
    
}
