package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static int lexemeToChar(String str) {
		try {
			if(str.length() == 3 && str.charAt(0) == '\'' && str.charAt(2) == '\'')
				return str.charAt(1);
			else if(str.length() == 4 && str.charAt(2)=='t'){
				return '\t';
			}
			else if(str.length() == 4 && str.charAt(2)=='n'){
				return '\n';
			}
			else if (str.charAt(0) == '\'' && str.charAt(str.length()-1) == '\'' && str.charAt(1) == '\\') {
				return (char) Integer.parseInt(str.substring(2,str.length()-1));
			}

		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}




	
}
