package com.project.FlightZuul;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class LoggingFilter extends ZuulFilter{
	@Override
	public Object run() throws ZuulException {
		Date d1 = new Date();
		System.err.println("This is log.....");
		try {
			File f = new File("testLog.txt");
			FileWriter file = new FileWriter(f.getAbsoluteFile(), true);
			file.write("Request to Flight Service...");
			file.write("Scheduled in : " + d1);
			file.write("\n");
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
