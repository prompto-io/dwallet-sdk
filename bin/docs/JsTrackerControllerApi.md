# JsTrackerControllerApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trackMessageUsingPOST**](JsTrackerControllerApi.md#trackMessageUsingPOST) | **POST** /api/v1/telemetry/track | trackMessage


<a name="trackMessageUsingPOST"></a>
# **trackMessageUsingPOST**
> RestResponse trackMessageUsingPOST(payload)

trackMessage

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.JsTrackerControllerApi;


JsTrackerControllerApi apiInstance = new JsTrackerControllerApi(defaultClient);
TelemetryRequest payload = new TelemetryRequest(); // TelemetryRequest | payload
try {
    RestResponse result = apiInstance.trackMessageUsingPOST(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JsTrackerControllerApi#trackMessageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TelemetryRequest**](TelemetryRequest.md)| payload |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

