import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class main {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	int ans = 0;
	do {
	//The Home Page
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("To Encypt Message: Enter 1");
	System.out.println("To Decrypt Message: Enter 2");

	ans = in.nextInt();

	if(ans == 1) {
		System.out.println("_____________________________________");
		System.out.println("Enter a message to encrpyt below");
		System.out.println("*No capitals and no spaces please*");

	String pt = in.next();

	System.out.println("- - - - - - - - - - - - - - - - - - -");
	System.out.println("Entered Plaintext: " + pt);
	System.out.println("Plaintext encryption: " + encrypt(pt) );

	} else {
		System.out.println("_____________________________________");
		System.out.println("Enter an encrypted message below");

		String pt = in.next();

		System.out.println("_____________________________________");
		System.out.println("Entered cyphertext: " + pt);
		System.out.println("Decryption: " + decrypt(pt) );

	}
	} while( ans != 3);
	}


	//These Methods will take the plaintext that the user inserts and encrypts it
	public static String encrypt(String plaintext) {

		//The two are hard coded into the encrypt algorithm
		char[] plain = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    char[] encryptk = new char[] {'f','q','g','e','r','j','h','d','o','w','b','n','l','a','x','c','y','m','u','z','p','k','v','t','s','i'};


	    //Break user response into an array of individual characters called 'temp'
	    //Create a list called 'list' to hold an encrypted array
	    //Create a character array to put final encryption back to string
	    char[] temp = plaintext.toCharArray();
		char[] encryption = new char[100];
		List<Character> list = new ArrayList<>();

		//iterates over plaintext one by one, and encrypting it according to its index
		for(char ch: temp) {
		  for (int i = 0; i<= plain.length-1; i++) {
				 if (plain[i]==ch) {
					char letter = encryptk[i];
					list.add(letter);
				}
			}
		}

		//To turn it back into a String, we turn the arraylist into a character array
		for (int a = 0; a<= list.size() -1; a++ ) {
			encryption[a] = list.get(a);
		}

		//return the cyphertext
		String cyphertext = new String(encryption);
		return cyphertext;
	}

	public static String decrypt(String cyphertext) {

		//The two are hardcoded into the encrypt algorithm
		char[] plain = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    char[] encryptk = new char[] {'f','q','g','e','r','j','h','d','o','w','b','n','l','a','x','c','y','m','u','z','p','k','v','t','s','i'};

	    char[] temp = cyphertext.toCharArray();
		char[] decryption = new char[100];
		List<Character> list = new ArrayList<>();

		for(char ch: temp) {
			  for (int i = 0; i<= encryptk.length-1; i++) {
					 if (encryptk[i]==ch) {
						char letter = plain[i];
						list.add(letter);
					}
				}
			}
		for (int a = 0; a<= list.size() -1; a++ ) {
			decryption[a] = list.get(a);
	}
		String plaintext = new String(decryption);
		return plaintext;

}
}