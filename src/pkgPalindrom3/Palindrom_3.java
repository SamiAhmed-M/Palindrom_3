// System checks if a given word is palindrom through String buffer reverse method
package pkgPalindrom3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrom_3 {

	public static void main(String[] args) {
		try {
		// Create InputStreamReader Object
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Please enter a word to be checked for palindrom");
		String str = br.readLine().toString();
		// reversed string
		StringBuffer sb = new StringBuffer(str);
		String strRev = sb.reverse().toString();
		PalindromCheck3.display(str,strRev);
		br.close();
		isr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
