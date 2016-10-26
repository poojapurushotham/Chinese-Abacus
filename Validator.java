package bina;

/*
 * Validates for a valid the Roman Numeral String
 * 
 */
public class Validator {
	
	public static boolean isValid(String str) {
		return str.matches("^M{0,}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");	
	}
}
