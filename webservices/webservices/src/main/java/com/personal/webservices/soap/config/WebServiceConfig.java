package com.personal.webservices.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.personal.webservices.soap.ProductWebService;

@Configuration
public class WebServiceConfig {

	@Autowired
	private Bus bus;

	@Autowired
	private ProductWebService productws;

	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, productws);
		endpoint.publish("/product");
		return endpoint;

	}

}
