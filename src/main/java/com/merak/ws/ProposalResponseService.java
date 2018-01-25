package com.merak.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.merak.ws.dto.Request;
import com.merak.ws.dto.SetProposalResponseResponse;

@WebService(targetNamespace = "http://www.newmarketinc.com")
public abstract interface ProposalResponseService {
	@WebMethod
	public abstract SetProposalResponseResponse SetProposalResponse(Request request);
}
