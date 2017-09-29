package com.workspace.projectdemo;

import java.io.File;
import java.text.ParseException;

import com.workspace.project.demo.Helper;

public class ProcessCheck extends Helper implements Runnable{
	
	//@Override
	public void run() {
			File listOfFiles[] = getListOfFiles("D:/vj");
			
			if(listOfFiles.length == 0){
				System.out.println("----Empty Directory----");
				return;
			}
			for(File f : listOfFiles){
				try {
					if(!isValid(f) || isDuplicate(f) || !isOnTime(f)){
						deleteFile(f);
						System.out.println(f.getName() + " is deleted.");
					}
					
					else{
						
					}
				}
				catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	

}
}
}