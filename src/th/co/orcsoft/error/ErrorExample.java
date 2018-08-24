package th.co.orcsoft.error;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ErrorExample {
	public static void main(String[] args) {
//		FileInputStream inputStream = new FileInputStream(new File("D:/hello.txt"));
		
		FileInputStream inputStream = null;
		try {
		    File file = new File("D:/hello.txt");
		    inputStream = new FileInputStream(file);
		    //Do Something
		} catch (IOException e) {;
	    	//Do Something
		} finally {
		    if (inputStream != null) {
		        try {
		            inputStream.close();
		        } catch (IOException e) {;
			    //Do Something
		        }
		    }
		};
	}
}
