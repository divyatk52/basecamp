package basecamp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.upgrad.MyMapper;

public class Mapper  extends MyMapper{
	
	
	public List<Map<String, Integer>> map (File fInput) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(fInput));
		
		String read =" ";
		List<Map<String, Integer>>  wordList = new ArrayList<>();
		while((read =br.readLine())!=null) {
			
			wordList.add(map(read));
		}
		return wordList;
	}
	
	
		


}
