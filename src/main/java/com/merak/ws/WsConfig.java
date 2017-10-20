package com.merak.ws;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 *
 * @author zhuliang
 */
@ConfigurationProperties(prefix = "ws")
@Component
public class WsConfig {
	private String publishedEndpointUrl;
	private String responseURL;

	/**
	 * @return the publishedEndpointUrl
	 */
	public String getPublishedEndpointUrl() {
		return publishedEndpointUrl;
	}

	/**
	 * @param publishedEndpointUrl
	 *            the publishedEndpointUrl to set
	 */
	public void setPublishedEndpointUrl(String publishedEndpointUrl) {
		this.publishedEndpointUrl = publishedEndpointUrl;
	}

	/**
	 * @return the responseURL
	 */
	public String getResponseURL() {
		return responseURL;
	}

	/**
	 * @param responseURL
	 *            the responseURL to set
	 */
	public void setResponseURL(String responseURL) {
		this.responseURL = responseURL;
	}

}
