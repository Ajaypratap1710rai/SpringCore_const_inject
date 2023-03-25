package com.springcore.const_inject;

public class Ambiguity_problem {
  private int a;
  private int b;
  
  public Ambiguity_problem(int a, int b) {
	  this.a=a;
	  this.b=b;
	  System.out.println("Constructore : int, int");
  }
  
  public Ambiguity_problem(double a, double b) {
	  this.a=(int)a;
	  this.b=(int)b;
	  System.out.println("Constructore : double, double");
  }
  public void doSum() {
	  System.out.println("Sum is = "+(this.a+this.b));
  }
}
