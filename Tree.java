import java.io.File;

public class Tree {
	public static void main(String[] args){
	    start(new File("/Users/KenChiu/documents/workspace/java/Cisc 3150"));
	}
	public static void start(File dir){
	    File listFile[] = dir.listFiles();
	    if (listFile != null){
	        for (int i=0; i<listFile.length; i++){
	        	if (listFile[i].isDirectory()){
	            	System.out.println("|\t\t");  
	            	start(listFile[i]);
	            } 
	            else{
	            	System.out.println("+---"+listFile[i].getName().toString());
	            }
	        }
	    }
	}
}