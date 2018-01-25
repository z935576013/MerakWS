package com.merak.ws;

import com.merak.ws.dto.SetProposalResponseResponse;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.newmarketinc.com")
public abstract interface ProposalResponseService {
	@WebMethod
	public abstract SetProposalResponseResponse SetProposalResponse();
}
