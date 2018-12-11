package edu.century.finalproject;

public class Currency {

	public static double toUsd(double currency, String unit) {
		if(unit == "USD") {
			currency=currency;
		}
		if(unit == "EURO") {
			currency=currency/.88;
		}
		if(unit == "POUND") {
			currency=currency/.8;
		}
		if(unit=="YEN") {
			currency=currency/113.12;
		}
		if(unit=="PESO") {
			currency=currency/20.32;
		}
		if(unit=="CSD") {
			currency=currency/1.34;
		}
		return currency;
	}
	
	public static double toEuro(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*.88;
		}
		if(unit == "EURO") {
			currency=currency;
		}
		if(unit == "POUND") {
			currency=currency/.8;
			currency=currency*.88;
		}
		if(unit=="YEN") {
			currency=currency/113.12;
			currency=currency*.88;
		}
		if(unit=="PESO") {
			currency=currency/20.32;
			currency=currency*.88;
		}
		if(unit=="CSD") {
			currency=currency/1.34;
			currency=currency*.88;
		}
		return currency;
	}
	//.78
	public static double toPound(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*.8;
		}
		if(unit == "EURO") {
			currency=currency/.88;
			currency=currency*.8;
		}
		if(unit == "POUND") {
			currency=currency;
		}
		if(unit=="YEN") {
			currency=currency/113.12;
			currency=currency*.8;
		}
		if(unit=="PESO") {
			currency=currency/20.32;
			currency=currency*.76;
		}
		if(unit=="CSD") {
			currency=currency/1.34;
			currency=currency*.8;
		}
		return currency;
	}
	//113.08 yen to usd
	public static int toYen(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*113.12;
		}
		if(unit == "EURO") {
			currency=currency/.88;
			currency=currency*113.12;
		}
		if(unit == "POUND") {
			currency=currency/.8;
			currency=currency*113.12;
		}
		if(unit=="YEN") {
			currency=currency;
		}
		if(unit=="PESO") {
			currency=currency/20.32;
			currency=currency*113.12;
		}
		if(unit=="CSD") {
			currency=currency/1.34;
			currency=currency*113.12;
		}
		return (int)currency;
	}
	//20.24 peso to usd
	public static double toPeso(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*20.32;
		}
		if(unit == "EURO") {
			currency=currency/.88;
			currency=currency*20.32;
		}
		if(unit == "POUND") {
			currency=currency/.8;
			currency=currency*20.32;
		}
		if(unit=="YEN") {
			currency=currency/113.12;
			currency=currency*20.32;
		}
		if(unit=="PESO") {
			currency=currency;
		}
		if(unit=="CSD") {
			currency=currency/1.34;
			currency=currency*20.32;
		}
		return currency;
	}
	//1.325 rate usd to cad
	public static double toCanadian(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*1.34;
		}
		if(unit == "EURO") {
			currency=currency/.88;
			currency=currency*1.34;
		}
		if(unit == "POUND") {
			currency=currency/.8;
			currency=currency*1.34;
		}
		if(unit=="YEN") {
			currency=currency/113.12;
			currency=currency*1.34;
		}
		if(unit=="PESO") {
			currency=currency/20.32;
			currency=currency*1.34;
		}
		if(unit=="CSD") {
			currency=currency;
		}
		return currency;
	}
}