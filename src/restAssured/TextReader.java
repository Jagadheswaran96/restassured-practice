package restAssured;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {

	public static void main(String[] args) throws IOException {

		byte[] requestData = Files.readAllBytes(Paths.get("request.txt"));
		
		String str = new String(requestData); // Uses default charset
        System.out.println(str);
		
		String str2 = new String(requestData, StandardCharsets.UTF_8);
        System.out.println(str2);

	}

}
