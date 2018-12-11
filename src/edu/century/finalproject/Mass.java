package edu.century.finalproject;


public class Mass {
	
	public static String toOz(int num1, int num2) {
		int lbs, oz, finalOz;
	
		lbs=num1*16;
		oz=num2;
		finalOz=lbs+oz;
		
		return finalOz + " Oz";
	}
	
	public static String toOz(double num) {
		double oz=num/28.34;
		return oz + " Oz";
	}
	
	public static String toLbs(int num1) {
		int oz=num1%16;
		int lbs=(num1/16);
		
		return lbs+" Lbs "+oz+" Oz";
	}
	
	public static String toLbs(double num1) {
		double oz=(num1/28.34)%16;
		int lbs=(int) ((num1/28.34)/16);
		
		return lbs+" Lbs "+(int)oz+" Oz";
	}
	
	public static String toGrams(int num1, int num2) {
		int lbs, oz;
		double grams;
		
		lbs = num1 * 16;
		oz = num2;
		grams = (lbs+oz) * 28.34;
		
		return grams + " Grams";
	}
	
	public static String toGrams(int num) {
		double grams;
		
		grams = num*28.34;
		
		return grams + " Grams";
	}
}