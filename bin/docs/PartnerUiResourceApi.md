# PartnerUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPartnerUsingPOST**](PartnerUiResourceApi.md#createPartnerUsingPOST) | **POST** /api/v1/p/partners | createPartner
[**signUpPartnerUsingPOST**](PartnerUiResourceApi.md#signUpPartnerUsingPOST) | **POST** /api/v1/p/public/partners/signup | signUpPartner


<a name="createPartnerUsingPOST"></a>
# **createPartnerUsingPOST**
> RestResponse createPartnerUsingPOST(partner)

createPartner

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PartnerUiResourceApi;


PartnerUiResourceApi apiInstance = new PartnerUiResourceApi(defaultClient);
PartnerRequest partner = new PartnerRequest(); // PartnerRequest | partner
try {
    RestResponse result = apiInstance.createPartnerUsingPOST(partner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUiResourceApi#createPartnerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partner** | [**PartnerRequest**](PartnerRequest.md)| partner |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="signUpPartnerUsingPOST"></a>
# **signUpPartnerUsingPOST**
> RestResponse signUpPartnerUsingPOST(partnerSignUp)

signUpPartner

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.PartnerUiResourceApi;


PartnerUiResourceApi apiInstance = new PartnerUiResourceApi(defaultClient);
PartnerSignUpRequest partnerSignUp = new PartnerSignUpRequest(); // PartnerSignUpRequest | partnerSignUp
try {
    RestResponse result = apiInstance.signUpPartnerUsingPOST(partnerSignUp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUiResourceApi#signUpPartnerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerSignUp** | [**PartnerSignUpRequest**](PartnerSignUpRequest.md)| partnerSignUp |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

