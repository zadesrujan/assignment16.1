package file;

import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	 
	public class FileCopy {
	

		public static void main(String[] args)
		{
	
			FileInputStream finput=null;
	//A FileInputStream obtains input bytes from a file in a file system and it's value is equal to null.
			FileOutputStream foutput=null;
	//A file output stream is an output stream for writing data to a File or to a FileDescriptorand it's value is equal to null.
			try
			{
				File infile=new File("C:/Users/USER/My/c.txt");
	//here created the file object which i have given  path of a source file 
	//here the text which is in source file will be copied the same to the destination file 

				File outfile=new File("C:/Users/USER/My/d.txt");
				//here created the file object which i given path of a destination file 
	            //here if we run the the program with the java application it shows the content as in the destination file 
				
				finput=new FileInputStream(infile); 
		//reading the file from input and output
				foutput=new FileOutputStream(outfile);
			//
				byte[] buffer=new byte[1024];
				//here we are giving size of buffer
				int length;//giving the length
	/*copying the contents from input stream to output stream using read 
	 * and write methods */			
				while((length=finput.read(buffer))>0)
				{
					foutput.write(buffer,0,length);
					//here we used to write from output
				}
				finput.close();//closing the file
				foutput.close();
				
				System.out.println("File copied Successfully");
				//system is final class
				//out is a static member of system class and type printStream
				//println is method of printStream class.ln means nextline
				
			}
			catch(IOException e)
	//The java.io.Exceptions provides for system input and output through
	//data streams, serialization and the file system.
			{
				e.printStackTrace();
	//The java.lang.Throwable.printStackTrace() method prints this throwable 
	//and its back trace to the standard error stream. It prints a stack trace 
	//for this Throwable object on the error output stream that is the value of the field System.err.
			}
		}
	}
