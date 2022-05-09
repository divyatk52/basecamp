package basecamp1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Driver {
	
	
	public static void main(String args[]) throws IOException {
		String input = args[0];
		String output = args[1];
		
		Mapper mapper = new Mapper();
		Reducer reducer = new Reducer();
		
		File fInput = new File(input);
		
		File fOutput = new File(output);
		
		Map<String,Integer> map = reducer.reudcer(mapper.map(fInput), fOutput);
		
		System.out.println(map);
		
		
	}
}
