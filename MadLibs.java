import java.util.*;
import java.io.*;

public class MadLibs {

	public static void main(String[] args) throws IOException {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		ArrayList<String> nouns = new ArrayList<String>();
		ArrayList<String> adj = new ArrayList<String>();
		Arraylist<String> listString = new ArrayList<String>();
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
 		BufferedReader reader = new BufferedReader(new FileReader("nouns.txt"));
 		String str = "";
 		while (reader.ready()) {
 			str = reader.readLine();
 			nouns.add(str);
 		}
 		reader.close();
 		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		FileReader fr = new FileReader("verbs.txt");
		BufferedReader br = new BufferedReader(fr);

		while((i=br.read())!=-1){
			String next=new String("");
			while(!(char)i.equals(" ")){
				next+=char(i);
			}
			listString.add(next);
		}
		br.close();
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

	}

}
