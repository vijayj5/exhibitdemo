package com.workspace.project.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.workspace.project.demo.ApplicationContext;

public class ApplicationContext {
	private Parser parser=null;
	static ApplicationContext monitercontext=null;
	
	public static Map<String, String> filePropertyMap = null;
	public static Map<String, String> processedFileMap = null;
	
	private ApplicationContext() throws SAXException, IOException, ParserConfigurationException{
		parser=Parser.getInstance();
		filePropertyMap = parser.getFilePropertyMap();
		processedFileMap = new HashMap<String, String>();
		processedFileMap.put("b.csv", "28-09-2017");
	}
	public static ApplicationContext loadfileProcessContext() throws SAXException, IOException, ParserConfigurationException{
		if(monitercontext == null){
			monitercontext = new ApplicationContext();
		}
		return monitercontext;
	}

}
