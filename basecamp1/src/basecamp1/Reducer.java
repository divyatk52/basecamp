package basecamp1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

import com.upgrad.MyReducer;

public class Reducer extends MyReducer {
	
	public Map<String,Integer> reudcer(List<Map<String, Integer>> wordMap, File fOutput) throws IOException{
		
		
		
		 FileOutputStream f = new FileOutputStream(fOutput);
		
			ObjectOutputStream s = new ObjectOutputStream(f);          
			s.writeObject(reduce(wordMap));
			s.flush();
		return reduce(wordMap);
		
	}

}
