package com.jersey.lightbulbapi;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class CustomApplication extends Application{
	 @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> resources = new HashSet<Class<?>>();
	        //register REST modules
	        resources.add(JerseyService.class);
	        resources.add(CORSFilter.class);
	        return resources;
	    }
}
