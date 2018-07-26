# StatusApiControllerApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIStatusUsingGET**](StatusApiControllerApi.md#getAPIStatusUsingGET) | **GET** /internal/status | getAPIStatus


<a name="getAPIStatusUsingGET"></a>
# **getAPIStatusUsingGET**
> ApplicationStatusResponse getAPIStatusUsingGET()

getAPIStatus

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.StatusApiControllerApi;


StatusApiControllerApi apiInstance = new StatusApiControllerApi(defaultClient);
try {
    ApplicationStatusResponse result = apiInstance.getAPIStatusUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApiControllerApi#getAPIStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApplicationStatusResponse**](ApplicationStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

