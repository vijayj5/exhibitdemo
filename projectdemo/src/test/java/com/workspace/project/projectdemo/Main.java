package com.workspace.project.projectdemo;

import com.workspace.project.demo.ApplicationContext;
import com.workspace.projectdemo.ProcessCheck;

public class Main {
	static ApplicationContext applicationcontext=null;
	public static void main(String[] args) {
		
		try {
			applicationcontext = ApplicationContext.loadfileProcessContext();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Thread processingThread = new Thread(new ProcessCheck());
		processingThread.run();
	}

}
