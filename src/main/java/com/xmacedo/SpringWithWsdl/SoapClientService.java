package com.xmacedo.SpringWithWsdl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
//import org.springframework.ws.soap.client.SOAPFaultClientException;

@Service
public class SoapClientService {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    private static final String PING_URL = "http://localhost:8080/wsdl/ping";
    private static final String FIND_BY_ID_URL = "http://localhost:8080/wsdl/findById";

    public String ping(String message) {
        //PingRequest request = new PingRequest();
        //request.setMessage(message);
        return " " + message;
        //try {
        //  PingResponse response = (PingResponse) webServiceTemplate.marshalSendAndReceive(PING_URL, request);
//            return response.getResponse();
        //} catch (SOAPFaultClientException e) {
        //  return "Error: " + e.getMessage();
        //}
    }

    public String findById(int id) {
        return " " + id;
        /*FindByIdRequest request = new FindByIdRequest();
        request.setId(id);

        try {
            FindByIdResponse response = (FindByIdResponse) webServiceTemplate.marshalSendAndReceive(FIND_BY_ID_URL, request);
            return response.getResult();
        } catch (SOAPFaultClientException e) {
            return "Error: " + e.getMessage();
        }*/
    }
}
