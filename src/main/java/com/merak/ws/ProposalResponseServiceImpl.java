package com.merak.ws;

import com.merak.ws.dto.Request;
import com.merak.ws.dto.SetProposalResponseResponse;
import com.merak.ws.dto.SetProposalResponseResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@WebService(serviceName = "ProposalResponseService", targetNamespace = "http://www.newmarketinc.com", endpointInterface = "com.merak.ws.ProposalResponseService")
@Component
public class ProposalResponseServiceImpl implements ProposalResponseService {

	@Autowired
	WsConfig wsConfig;

	public SetProposalResponseResponse SetProposalResponse(Request request) {
		SetProposalResponseResponse response = new SetProposalResponseResponse();
		SetProposalResponseResult result = new SetProposalResponseResult();
		result.setResponseURL(wsConfig.getResponseURL());
		response.setSetProposalResponseResult(result);
		return response;
	}
}
