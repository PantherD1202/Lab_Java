import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Counter {

	Map<String, Integer> wordCounter = new HashMap<String, Integer>();
	Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

	public void analyze(String content) {
		for (char ch : content.toCharArray()) {
			if (Character.isSpaceChar(ch))
				continue;
			if (!charCounter.containsKey(ch)) {
				charCounter.put(ch, 1);
			} else {
				charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
			}
		}
		StringTokenizer tokenizer = new StringTokenizer(content);
		while (tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			if (!wordCounter.containsKey(token)) {
				wordCounter.put(token, 1);
			} else {
				wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
			}
		}

	}

	public void display() {
		System.out.println(wordCounter);
		System.out.println(charCounter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your content: ");
		String content = sc.nextLine();
		Counter counter = new Counter();
		counter.analyze(content);
		counter.display();
	}

}
