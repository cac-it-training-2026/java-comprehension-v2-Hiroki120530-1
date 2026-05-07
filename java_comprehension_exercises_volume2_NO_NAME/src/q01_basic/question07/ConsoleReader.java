package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public int inputNumber() throws IOException, NumberFormatException {
		String str = reader.readLine();
		int number = Integer.parseInt(str);
		return number;
	}
}
