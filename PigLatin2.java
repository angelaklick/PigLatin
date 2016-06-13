import java.util.Scanner;

//Angela Klick. Pig Latin calculator.

public class PigLatin2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//bool statement to control terminating the program
		boolean flag = true;

		while (flag) {
			
			System.out.println("Enter a word: ");
			String word = scan.nextLine().toLowerCase().replaceAll("'", "");
			
			//saves the first character of the word into firstLetter
			char firstLetter = word.charAt(0);
			
            //if statement for if the word starts with a vowel
			if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
					|| firstLetter == 'u') {

				word = word + "way";

				System.out.println(word);
				
			} else { //else statement for if word begins with consonant

				//iterates through the word
				for (int i = 0; i < word.length(); i++) {
					//finds the first vowel in word
					if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
							|| word.charAt(i) == 'u') {

						String first;
                        
						//saves the letters up until the vowel into first
						first = word.substring(0, i);
						
						//puts together the word--the beginning is still there
						word = word + first + "ay";
						
						//cuts the beginning of the word at the index before vowel
						word = word.substring(i);

						System.out.println(word);
						break;

					}

				}

			}
			
			System.out.println("Would you like to continue? (y/n)");
			String input = scan.nextLine();
			
			if(input.equalsIgnoreCase("n")){
				
				System.out.println("Thanks for coming!");
				
				flag = false;
				
			}
			
			
		}

	}

}
