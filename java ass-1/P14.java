import java.io.*;
class P14{
   public static void main(String args[]) throws IOException{
      if(args.length<2){
	    System.out.println("Missing parameter in command line...");
		System.exit(0);
	  }
	  System.out.println("Your Source File is :"+args[0]);
	  System.out.println("Your destination File is :"+args[1]);
	  
	  File f1=new File(args[0]);
	  File f2=new File(args[1]);
	  
	  FileInputStream r=new FileInputStream(f1);
	  FileOutputStream w=new FileOutputStream(f2);
	  
	  int i=r.read();
	  while(i!=-1){
		  w.write((char)i);
		  i=r.read();
	  }
	  System.out.println("File Copy Completed");
	  r.close();
	  w.close();
   }
}