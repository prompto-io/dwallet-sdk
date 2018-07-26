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
import io.wallet.sdk.model.TransactionResponse;
import io.wallet.sdk.model.ValidationError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * TransactionListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-24T22:57:23.435-05:00")
public class TransactionListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("page")
  private Pagination page = null;

  @SerializedName("transactions")
  private List<TransactionResponse> transactions = null;

  public TransactionListResponse errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public TransactionListResponse addErrorsItem(ValidationError errorsItem) {
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

  public TransactionListResponse httpCode(Integer httpCode) {
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

  public TransactionListResponse httpMessage(String httpMessage) {
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

  public TransactionListResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TransactionListResponse addLinksItem(Link linksItem) {
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

  public TransactionListResponse page(Pagination page) {
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

  public TransactionListResponse transactions(List<TransactionResponse> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionListResponse addTransactionsItem(TransactionResponse transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<TransactionResponse>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")
  public List<TransactionResponse> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionResponse> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionListResponse transactionListResponse = (TransactionListResponse) o;
    return Objects.equals(this.errors, transactionListResponse.errors) &&
        Objects.equals(this.httpCode, transactionListResponse.httpCode) &&
        Objects.equals(this.httpMessage, transactionListResponse.httpMessage) &&
        Objects.equals(this.links, transactionListResponse.links) &&
        Objects.equals(this.page, transactionListResponse.page) &&
        Objects.equals(this.transactions, transactionListResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, httpCode, httpMessage, links, page, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionListResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
