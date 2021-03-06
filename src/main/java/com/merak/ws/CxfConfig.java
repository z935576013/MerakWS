package com.merak.ws;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

	@Autowired
	private Bus bus;
	@Autowired
	private ProposalResponseService urlService;
	@Autowired
	private WsConfig wsConfig;

	@Bean
	public Endpoint endpoint2() {
		EndpointImpl endpoint = new EndpointImpl(this.bus, this.urlService);
		endpoint.setPublishedEndpointUrl(wsConfig.getPublishedEndpointUrl());
		endpoint.publish("/ProposalResponseService");
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		return endpoint;
	}
}
