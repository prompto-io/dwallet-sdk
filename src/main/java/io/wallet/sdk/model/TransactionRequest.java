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


package io.wallet.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.wallet.sdk.model.Link;
import io.wallet.sdk.model.Pagination;
import io.wallet.sdk.model.ValidationError;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * TransactionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-24T22:57:23.435-05:00")
public class TransactionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("page")
  private Pagination page = null;

  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  public TransactionRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TransactionRequest errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public TransactionRequest addErrorsItem(ValidationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<ValidationError> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationError> errors) {
    this.errors = errors;
  }

  public TransactionRequest httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @ApiModelProperty(value = "")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public TransactionRequest httpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
    return this;
  }

   /**
   * Get httpMessage
   * @return httpMessage
  **/
  @ApiModelProperty(value = "")
  public String getHttpMessage() {
    return httpMessage;
  }

  public void setHttpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
  }

  public TransactionRequest links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TransactionRequest addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public TransactionRequest metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public TransactionRequest page(Pagination page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Pagination getPage() {
    return page;
  }

  public void setPage(Pagination page) {
    this.page = page;
  }

  public TransactionRequest paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequest transactionRequest = (TransactionRequest) o;
    return Objects.equals(this.amount, transactionRequest.amount) &&
        Objects.equals(this.currency, transactionRequest.currency) &&
        Objects.equals(this.errors, transactionRequest.errors) &&
        Objects.equals(this.httpCode, transactionRequest.httpCode) &&
        Objects.equals(this.httpMessage, transactionRequest.httpMessage) &&
        Objects.equals(this.links, transactionRequest.links) &&
        Objects.equals(this.metadata, transactionRequest.metadata) &&
        Objects.equals(this.page, transactionRequest.page) &&
        Objects.equals(this.paymentMethod, transactionRequest.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, errors, httpCode, httpMessage, links, metadata, page, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

