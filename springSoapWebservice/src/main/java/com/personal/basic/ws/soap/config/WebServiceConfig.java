package com.personal.basic.ws.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.personal.basic.ws.soap.springSoapWebservice.HelloWS;

@Configuration
public class WebServiceConfig {

	private Bus bus;

	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, new HelloWS());
		//endpoint.publish("/hello");
		endpoint.publish("http://localhost:8081/services/hello");
		return endpoint;
	}

}
