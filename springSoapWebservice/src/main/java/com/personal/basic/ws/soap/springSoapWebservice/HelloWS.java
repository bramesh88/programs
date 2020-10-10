package com.personal.basic.ws.soap.springSoapWebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWS {

	@WebMethod
	public String hello() {
		return "hello";
	}

}
