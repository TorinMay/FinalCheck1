public class WordScrambler {

	public static void main(String[] args) {
		
		System.out.println(recombine("Apple","Pear"));
	}

	private String[] scrambledWords;

	// public static WordScrambler(String[] wordArr) {
	// 	scrambledWords = mixedWords(wordArr);
	// }
	//PART A
	private static String recombine(String word1, String word2) {
		String combination = word1.substring(0,(word1.length()/2)) + word2.substring(word2.length()/2);
		return combination;
	}
	//PART B
	// private String[] mixedWords(String[] words){
	// 	String[] tempArr = new String[words.length];
	// 	for(int i=0; i<tempArr.length(); i+=2) {
			
	// 	}
	// }

}