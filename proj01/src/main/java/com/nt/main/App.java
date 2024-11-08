package com.nt.main;


public class App {
	public int sum(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
    public static void main(String[] args) {
    	App App=new App();
    	int tot=App.sum(10, 20);
        System.out.println("sum is"+tot);
    }
}
