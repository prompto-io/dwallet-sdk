
# PaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**creditCard** | [**CreditCardMethod**](CreditCardMethod.md) |  |  [optional]
**gatewayType** | [**GatewayTypeEnum**](#GatewayTypeEnum) |  |  [optional]
**owner** | **String** |  |  [optional]
**partnerId** | **String** |  |  [optional]
**prefered** | **Boolean** |  |  [optional]
**sandbox** | **Boolean** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="GatewayTypeEnum"></a>
## Enum: GatewayTypeEnum
Name | Value
---- | -----
PAYMENT_SPRING | &quot;PAYMENT_SPRING&quot;
STRIPE | &quot;STRIPE&quot;
OPENPAY | &quot;OPENPAY&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
ACH | &quot;ACH&quot;
POS | &quot;POS&quot;
CASH | &quot;CASH&quot;
CHECK | &quot;CHECK&quot;



