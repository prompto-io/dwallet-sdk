# UserUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserUsingPOST**](UserUiResourceApi.md#deleteUserUsingPOST) | **POST** /api/v1/p/users/{userId}/delete | deleteUser
[**getBalanceUsingGET**](UserUiResourceApi.md#getBalanceUsingGET) | **GET** /api/v1/u/users/balance | getBalance
[**getBalanceUsingGET1**](UserUiResourceApi.md#getBalanceUsingGET1) | **GET** /api/v1/p/users/{userId}/balance | getBalance
[**getProfileUsingGET**](UserUiResourceApi.md#getProfileUsingGET) | **GET** /api/v1/u/users/self | getProfile
[**getProfileUsingGET1**](UserUiResourceApi.md#getProfileUsingGET1) | **GET** /api/v1/p/users/self | getProfile
[**getUserUsingGET**](UserUiResourceApi.md#getUserUsingGET) | **GET** /api/v1/p/users/{userId} | getUser
[**getUsersUsingGET**](UserUiResourceApi.md#getUsersUsingGET) | **GET** /api/v1/p/users | getUsers
[**pongUsingGET**](UserUiResourceApi.md#pongUsingGET) | **GET** /api/v1/u/users/ping | pong
[**postClientUsingPOST**](UserUiResourceApi.md#postClientUsingPOST) | **POST** /api/v1/p/users | postClient
[**setUserUsingPOST**](UserUiResourceApi.md#setUserUsingPOST) | **POST** /api/v1/u/public/users/signup | setUser


<a name="deleteUserUsingPOST"></a>
# **deleteUserUsingPOST**
> RestResponse deleteUserUsingPOST(userId, request)

deleteUser

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
RestRequest request = new RestRequest(); // RestRequest | request
try {
    RestResponse result = apiInstance.deleteUserUsingPOST(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#deleteUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**RestRequest**](RestRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getBalanceUsingGET"></a>
# **getBalanceUsingGET**
> UserBalanceResponse getBalanceUsingGET()

getBalance

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
try {
    UserBalanceResponse result = apiInstance.getBalanceUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getBalanceUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserBalanceResponse**](UserBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBalanceUsingGET1"></a>
# **getBalanceUsingGET1**
> UserBalanceResponse getBalanceUsingGET1(userId)

getBalance

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    UserBalanceResponse result = apiInstance.getBalanceUsingGET1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getBalanceUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**UserBalanceResponse**](UserBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProfileUsingGET"></a>
# **getProfileUsingGET**
> User getProfileUsingGET()

getProfile

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
try {
    User result = apiInstance.getProfileUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getProfileUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProfileUsingGET1"></a>
# **getProfileUsingGET1**
> User getProfileUsingGET1()

getProfile

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
try {
    User result = apiInstance.getProfileUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getProfileUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> User getUserUsingGET(userId)

getUser

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    User result = apiInstance.getUserUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> UserListResponse getUsersUsingGET(limit, offset, q)

getUsers

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    UserListResponse result = apiInstance.getUsersUsingGET(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getUsersUsingGET");
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

[**UserListResponse**](UserListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="pongUsingGET"></a>
# **pongUsingGET**
> String pongUsingGET()

pong

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
try {
    String result = apiInstance.pongUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#pongUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postClientUsingPOST"></a>
# **postClientUsingPOST**
> User postClientUsingPOST(userOfPartnerRequest)

postClient

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
PartnerSignupUserRequest userOfPartnerRequest = new PartnerSignupUserRequest(); // PartnerSignupUserRequest | userOfPartnerRequest
try {
    User result = apiInstance.postClientUsingPOST(userOfPartnerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#postClientUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOfPartnerRequest** | [**PartnerSignupUserRequest**](PartnerSignupUserRequest.md)| userOfPartnerRequest |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="setUserUsingPOST"></a>
# **setUserUsingPOST**
> RestResponse setUserUsingPOST(request)

setUser

### Example
```java
// Import classes:
//import io.wallet.sdk.api.ApiException;
//import io.wallet.sdk.api.UserUiResourceApi;


UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
SingUpUserRequest request = new SingUpUserRequest(); // SingUpUserRequest | request
try {
    RestResponse result = apiInstance.setUserUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#setUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SingUpUserRequest**](SingUpUserRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

