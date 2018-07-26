# TransactionUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBalanceUsingPOST**](TransactionUiResourceApi.md#addBalanceUsingPOST) | **POST** /api/v1/p/transactions/balance/add | addBalance
[**addRewardUsingPOST**](TransactionUiResourceApi.md#addRewardUsingPOST) | **POST** /api/v1/p/transactions/reward/add | addReward
[**deductBalanceUsingPOST**](TransactionUiResourceApi.md#deductBalanceUsingPOST) | **POST** /api/v1/p/transactions/balance/deduct | deductBalance
[**deductRewardUsingPOST**](TransactionUiResourceApi.md#deductRewardUsingPOST) | **POST** /api/v1/p/transactions/reward/deduct | deductReward
[**listUsingGET2**](TransactionUiResourceApi.md#listUsingGET2) | **GET** /api/v1/u/transactions | list
[**listUsingGET3**](TransactionUiResourceApi.md#listUsingGET3) | **GET** /api/v1/p/transactions | list
[**payUsingPOST**](TransactionUiResourceApi.md#payUsingPOST) | **POST** /api/v1/u/transactions/pay | pay
[**rechargeUsingPOST**](TransactionUiResourceApi.md#rechargeUsingPOST) | **POST** /api/v1/u/transactions/recharge | recharge


<a name="addBalanceUsingPOST"></a>
# **addBalanceUsingPOST**
> RestResponse addBalanceUsingPOST(userId, request)

addBalance

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
TransactionRequest request = new TransactionRequest(); // TransactionRequest | request
try {
    RestResponse result = apiInstance.addBalanceUsingPOST(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#addBalanceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**TransactionRequest**](TransactionRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addRewardUsingPOST"></a>
# **addRewardUsingPOST**
> RestResponse addRewardUsingPOST(userId, request)

addReward

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
TransactionRequest request = new TransactionRequest(); // TransactionRequest | request
try {
    RestResponse result = apiInstance.addRewardUsingPOST(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#addRewardUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**TransactionRequest**](TransactionRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deductBalanceUsingPOST"></a>
# **deductBalanceUsingPOST**
> RestResponse deductBalanceUsingPOST(userId, request)

deductBalance

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
TransactionRequest request = new TransactionRequest(); // TransactionRequest | request
try {
    RestResponse result = apiInstance.deductBalanceUsingPOST(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#deductBalanceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**TransactionRequest**](TransactionRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deductRewardUsingPOST"></a>
# **deductRewardUsingPOST**
> RestResponse deductRewardUsingPOST(userId, request)

deductReward

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
TransactionRequest request = new TransactionRequest(); // TransactionRequest | request
try {
    RestResponse result = apiInstance.deductRewardUsingPOST(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#deductRewardUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**TransactionRequest**](TransactionRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET2"></a>
# **listUsingGET2**
> TransactionListResponse listUsingGET2()

list

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
try {
    TransactionListResponse result = apiInstance.listUsingGET2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#listUsingGET2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TransactionListResponse**](TransactionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listUsingGET3"></a>
# **listUsingGET3**
> TransactionListResponse listUsingGET3(userId)

list

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    TransactionListResponse result = apiInstance.listUsingGET3(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#listUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId | [optional]

### Return type

[**TransactionListResponse**](TransactionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="payUsingPOST"></a>
# **payUsingPOST**
> RestResponse payUsingPOST(request)

pay

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
TransactionRequest request = new TransactionRequest(); // TransactionRequest | request
try {
    RestResponse result = apiInstance.payUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#payUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TransactionRequest**](TransactionRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="rechargeUsingPOST"></a>
# **rechargeUsingPOST**
> TransactionResponse rechargeUsingPOST(request)

recharge

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.TransactionUiResourceApi;


TransactionUiResourceApi apiInstance = new TransactionUiResourceApi(defaultClient);
RechargeRequest request = new RechargeRequest(); // RechargeRequest | request
try {
    TransactionResponse result = apiInstance.rechargeUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionUiResourceApi#rechargeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RechargeRequest**](RechargeRequest.md)| request |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

