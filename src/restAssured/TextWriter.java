package restAssured;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("response.txt");
		writer.write("Write Text");
		writer.close();

	}

}
