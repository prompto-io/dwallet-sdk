# PaymentMethodUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST**](PaymentMethodUiResourceApi.md#createUsingPOST) | **POST** /api/v1/u/payment-methods | create
[**createUsingPOST1**](PaymentMethodUiResourceApi.md#createUsingPOST1) | **POST** /api/v1/p/payment-methods | create
[**deleteUsingPOST**](PaymentMethodUiResourceApi.md#deleteUsingPOST) | **POST** /api/v1/u/payment-methods/{methodId}/delete | delete
[**deleteUsingPOST1**](PaymentMethodUiResourceApi.md#deleteUsingPOST1) | **POST** /api/v1/p/payment-methods/{methodId}/delete | delete
[**getUsingGET**](PaymentMethodUiResourceApi.md#getUsingGET) | **GET** /api/v1/u/payment-methods/{methodId} | get
[**getUsingGET1**](PaymentMethodUiResourceApi.md#getUsingGET1) | **GET** /api/v1/p/payment-methods/{methodId} | get
[**listUsingGET**](PaymentMethodUiResourceApi.md#listUsingGET) | **GET** /api/v1/u/payment-methods | list
[**listUsingGET1**](PaymentMethodUiResourceApi.md#listUsingGET1) | **GET** /api/v1/p/payment-methods | list


<a name="createUsingPOST"></a>
# **createUsingPOST**
> RestResponse createUsingPOST(request)

create

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
PaymentMethodRequest request = new PaymentMethodRequest(); // PaymentMethodRequest | request
try {
    RestResponse result = apiInstance.createUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PaymentMethodRequest**](PaymentMethodRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> PaymentMethodResponse createUsingPOST1(userId, request)

create

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
PaymentMethodRequest request = new PaymentMethodRequest(); // PaymentMethodRequest | request
try {
    PaymentMethodResponse result = apiInstance.createUsingPOST1(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**PaymentMethodRequest**](PaymentMethodRequest.md)| request |

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingPOST"></a>
# **deleteUsingPOST**
> RestResponse deleteUsingPOST(methodId)

delete

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
String methodId = "methodId_example"; // String | methodId
try {
    RestResponse result = apiInstance.deleteUsingPOST(methodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#deleteUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **methodId** | **String**| methodId |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingPOST1"></a>
# **deleteUsingPOST1**
> RestResponse deleteUsingPOST1(userId, methodId)

delete

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
String methodId = "methodId_example"; // String | methodId
try {
    RestResponse result = apiInstance.deleteUsingPOST1(userId, methodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#deleteUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **methodId** | **String**| methodId |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> PaymentMethodResponse getUsingGET(methodId)

get

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
String methodId = "methodId_example"; // String | methodId
try {
    PaymentMethodResponse result = apiInstance.getUsingGET(methodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **methodId** | **String**| methodId |

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsingGET1"></a>
# **getUsingGET1**
> PaymentMethodResponse getUsingGET1(userId, methodId)

get

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
String methodId = "methodId_example"; // String | methodId
try {
    PaymentMethodResponse result = apiInstance.getUsingGET1(userId, methodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **methodId** | **String**| methodId |

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listUsingGET"></a>
# **listUsingGET**
> PaymentMethodListResponse listUsingGET(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    PaymentMethodListResponse result = apiInstance.listUsingGET(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| limit | [optional] [default to 25]
 **offset** | **Integer**| offset | [optional] [default to 0]
 **q** | **String**| q | [optional]

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listUsingGET1"></a>
# **listUsingGET1**
> PaymentMethodListResponse listUsingGET1(userId, q)

list

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PaymentMethodUiResourceApi;


PaymentMethodUiResourceApi apiInstance = new PaymentMethodUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
String q = "q_example"; // String | q
try {
    PaymentMethodListResponse result = apiInstance.listUsingGET1(userId, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodUiResourceApi#listUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **q** | **String**| q | [optional]

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

