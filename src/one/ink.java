package one;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ink {
     
	public static void main(String[] args)  {
		File f= new File ("D:\\D Drive\\PERSONNAL\\samplefolder");
		
		boolean mkdir = f.mkdir();
		System.out.println("mkdir :"+mkdir);
		
		
        File f1= new File ("D:\\D Drive\\PERSONNAL\\samplekir\\Good\\Bad");
		
		boolean mkdirs = f1.mkdirs();
		System.out.println("mkdirs :"+mkdirs);
		
//		boolean delete = f1.delete();
//		System.out.println("delete:"+delete);
		
		boolean hidden = f.isHidden();
		System.out.println("hidden:"+hidden);
		
		boolean directory = f.isDirectory();
		System.out.println("directory means to check wheather it is a folder or not:"+directory);
		
        File f3= new File ("D:\\D Drive");
        File[] listfile = f3.listFiles();
        for(File file: listfile) { 
        System.out.println("filelist:"+file);
        }
        
        File f4= new File ("D:\\D Drive");
        String[] listfiles = f3.list();
        for(String file: listfiles) { 
        System.out.println("list:"+file);
        }
        
        File f5= new File ("D:\\D Drive\\PERSONNAL\\samplekirapplication.txt");
        try {
			boolean createnewfile = f5.createNewFile();
			System.out.println("createnewfile:"+createnewfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        File f6= new File ("D:\\D Drive\\PERSONNAL\\samplekir\\application.txt");
        try {
			boolean isfile = f6.isFile();
			System.out.println("isfile:"+isfile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        File f7= new File ("D:\\D Drive\\PERSONNAL\\samplekir\\application.txt");
        try {
		    FileWriter fw = new FileWriter(f7);
		    fw.write("welcome to file");
		    fw.close();
			System.out.println("filewriter:"+fw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        File f8= new File ("D:\\D Drive\\PERSONNAL\\samplekir\\application.txt");
        System.out.print("read:");
        try {
		    FileReader fr = new FileReader(f8);
		    char c [] = new char[30];
		    fr.read(c);
            for (char d : c) { 		   
			System.out.print(d);
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
		
		
		
	}
	
}
		
	
    	

 