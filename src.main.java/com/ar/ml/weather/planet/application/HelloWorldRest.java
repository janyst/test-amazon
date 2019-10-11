package com.ar.ml.weather.planet.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.ar.ml.weather.planet.service.FactoryImpl;

@Path("/state") 
@Produces(MediaType.APPLICATION_JSON) 
@Consumes(MediaType.APPLICATION_JSON) 
public class HelloWorldRest {
	FactoryImpl factoryImpl;
	static Logger logger = Logger.getLogger(HelloWorldRest.class);
	
	@GET  
    public Response weatherDay(@QueryParam("dia") String days) {     
		factoryImpl = new FactoryImpl();
		factoryImpl.getInstance();		
		logger.info("informacion para el dia: "+days);
		return factoryImpl.stateDay(days);
    } 
}
