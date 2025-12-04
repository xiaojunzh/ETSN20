import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;

public class Function {
    public static void main (String[] args) throws IOException {

        // File is the last arg, pattern is the second arg
		String archivo = args[1];
		String pattern = args[0];
		String str1="";

        // Try reading the file specified
		try{
			FileReader f0 = new FileReader(archivo);
			BufferedReader br = new BufferedReader(f0);
			int i;
			while((i=br.read())!=-1){  
				str1+=(char)i; 
			}
			br.close();
			f0.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        // We split each line by \n
		String[] sections = str1.split("\n");
		String last = "";

		for(String esta:sections) {
            // If the line contains the pattern, add it.
			if(esta.contains(pattern)){
				last+=esta+"\n";
			}
		}

        // We show every line that contained the pattern
		System.out.println(last);
	}
}