package com.semantica.git;

public class Test{
	public static void main(String[] args){
		  String text ="Git test"; 
			if( args != null && args.length>=1){
				text=args[0];
			}
			System.out.println(text);
	}
}