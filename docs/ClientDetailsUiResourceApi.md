# ClientDetailsUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientDetailsUsingPOST**](ClientDetailsUiResourceApi.md#createClientDetailsUsingPOST) | **POST** /api/v1/p/applications | createClientDetails
[**deleteClientDetailsUsingGET**](ClientDetailsUiResourceApi.md#deleteClientDetailsUsingGET) | **GET** /api/v1/p/applications/{id}/delete | deleteClientDetails
[**getClientDetailsByPartnerUsingGET**](ClientDetailsUiResourceApi.md#getClientDetailsByPartnerUsingGET) | **GET** /api/v1/p/applications | getClientDetailsByPartner
[**updateUsingPOST**](ClientDetailsUiResourceApi.md#updateUsingPOST) | **POST** /api/v1/p/applications/{id}/update | update


<a name="createClientDetailsUsingPOST"></a>
# **createClientDetailsUsingPOST**
> RestResponse createClientDetailsUsingPOST(request)

createClientDetails

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.ClientDetailsUiResourceApi;


ClientDetailsUiResourceApi apiInstance = new ClientDetailsUiResourceApi(defaultClient);
ClientDetailsRequest request = new ClientDetailsRequest(); // ClientDetailsRequest | request
try {
    RestResponse result = apiInstance.createClientDetailsUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientDetailsUiResourceApi#createClientDetailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClientDetailsRequest**](ClientDetailsRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteClientDetailsUsingGET"></a>
# **deleteClientDetailsUsingGET**
> RestResponse deleteClientDetailsUsingGET(id)

deleteClientDetails

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.ClientDetailsUiResourceApi;


ClientDetailsUiResourceApi apiInstance = new ClientDetailsUiResourceApi(defaultClient);
String id = "id_example"; // String | id
try {
    RestResponse result = apiInstance.deleteClientDetailsUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientDetailsUiResourceApi#deleteClientDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientDetailsByPartnerUsingGET"></a>
# **getClientDetailsByPartnerUsingGET**
> ClientDetailsListResponse getClientDetailsByPartnerUsingGET()

getClientDetailsByPartner

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.ClientDetailsUiResourceApi;


ClientDetailsUiResourceApi apiInstance = new ClientDetailsUiResourceApi(defaultClient);
try {
    ClientDetailsListResponse result = apiInstance.getClientDetailsByPartnerUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientDetailsUiResourceApi#getClientDetailsByPartnerUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClientDetailsListResponse**](ClientDetailsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUsingPOST"></a>
# **updateUsingPOST**
> RestResponse updateUsingPOST(id, request)

update

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.ClientDetailsUiResourceApi;


ClientDetailsUiResourceApi apiInstance = new ClientDetailsUiResourceApi(defaultClient);
String id = "id_example"; // String | id
ClientDetailsRequest request = new ClientDetailsRequest(); // ClientDetailsRequest | request
try {
    RestResponse result = apiInstance.updateUsingPOST(id, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientDetailsUiResourceApi#updateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **request** | [**ClientDetailsRequest**](ClientDetailsRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

