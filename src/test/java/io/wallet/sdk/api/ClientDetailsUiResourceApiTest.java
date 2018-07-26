/*
 * Wallet
 * User application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.wallet.sdk.api;

import io.wallet.sdk.api.ApiException;
import io.wallet.sdk.model.ClientDetailsListResponse;
import io.wallet.sdk.model.ClientDetailsRequest;
import io.wallet.sdk.model.RestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientDetailsUiResourceApi
 */
//@Ignore
public class ClientDetailsUiResourceApiTest {

    private final ClientDetailsUiResourceApi api = new ClientDetailsUiResourceApi( "", "");

    
    /**
     * createClientDetails
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClientDetailsUsingPOSTTest() throws ApiException {
    
    	try{
    	
	        ClientDetailsRequest request = null;
	        RestResponse response = api.createClientDetailsUsingPOST(request);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * deleteClientDetails
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClientDetailsUsingGETTest() throws ApiException {
    
    	try{
    	
	        String id = null;
	        RestResponse response = api.deleteClientDetailsUsingGET(id);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * getClientDetailsByPartner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientDetailsByPartnerUsingGETTest() throws ApiException {
    
    	try{
    	
	        ClientDetailsListResponse response = api.getClientDetailsByPartnerUsingGET();
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPOSTTest() throws ApiException {
    
    	try{
    	
	        String id = null;
	        ClientDetailsRequest request = null;
	        RestResponse response = api.updateUsingPOST(id, request);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
}
