package edu.century.finalproject;

public class Volume {
	//switch statement converts user's current unit to liters	
	public double convertToLiters(String unitCurrent, String unitFinal, double value) {
		switch (unitCurrent) {	
		case "US liquid gallon":
			value*=3.785;
			break;
		case "US liquid quart":
			value/=1.057;
			break;
		case "US liquid pint":
			value/=2.113;
			break;
		case "US legal cup":
			value/=4.167;
			break;
		case "US fluid ounce":
			value/=33.814;
			break;
		case "US tablespoon": 
			value/=67.628;
			break;
		case "US teaspoon":
			value/=202.884;
			break;
		case "cubic meter": 
			value*=1000;
			break;
		case "liter":
			break;
		case "milliliter":
			value/=1000;
			break;
		case "imperial gallon":
			value*=4.546;
			break;
		case "imperial quart":
			value*=1.137;
			break;
		case "imperial pint":
			value/=1.76;
			break;
		case "imperial cup":
			value/=3.52;
			break;
		case "imperial fluid ounce":
			value/=35.195;
			break;
		case "imperial tablespoon":
			value/=56.312;
			break;
		case "imperial teaspoon":
			value/=168.936;
			break;
		case "cubic foot":
			value*=28.317;
			break;
		case "cubic inch":
			value/=61.024;
			break;
		default:
			break;
		}
		return convertFromLiters(unitFinal, value);
	}
	//convert liter to user's final unit choice
	private double convertFromLiters(String unitFinal, double value) {
		switch (unitFinal) {
		case "US liquid gallon":
			value/=3.785;
			break;
		case "US liquid quart":
			value*=1.057;
			break;
		case "US liquid pint":
			value*=2.113;
			break;
		case "US legal cup":
			value*=4.167;
			break;
		case "US fluid ounce":
			value*=33.814;
			break;
		case "US tablespoon": 
			value*=67.628;
			break;
		case "cubic meter": 
			value/=1000;
			break;
		case "liter":
			break;
		case "milliliter":
			value*=1000;
			break;
		case "imperial gallon":
			value/=4.546;
			break;
		case "imperial quart":
			value/=1.137;
			break;
		case "imperial pint":
			value*=1.76;
			break;
		case "imperial cup":
			value*=3.52;
			break;
		case "imperial fluid ounce":
			value*=35.195;
			break;
		case "imperial tablespoon":
			value*=56.312;
			break;
		case "imperial teaspoon":
			value*=168.936;
			break;
		case "cubic foot":
			value/=28.317;
			break;
		case "cubic inch":
			value*=61.024;
			break;
		case "US teaspoon":
			value*=202.884;
			break;
		default:
			break;
		}
		return value;
	}

}
