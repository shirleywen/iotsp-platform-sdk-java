package com.cisco.iotsp.client.thing_credentials.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * UserCredentialResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-21T16:34:05.634-07:00")
public class UserCredentialResponse   {
  
  private String uid = null;
  private String userUid = null;
  private String credentialType = null;
  private Secret credential = null;

  
  /**
   **/
  public UserCredentialResponse uid(String uid) {
    this.uid = uid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }


  /**
   **/
  public UserCredentialResponse userUid(String userUid) {
    this.userUid = userUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userUid")
  public String getUserUid() {
    return userUid;
  }
  public void setUserUid(String userUid) {
    this.userUid = userUid;
  }


  /**
   **/
  public UserCredentialResponse credentialType(String credentialType) {
    this.credentialType = credentialType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credentialType")
  public String getCredentialType() {
    return credentialType;
  }
  public void setCredentialType(String credentialType) {
    this.credentialType = credentialType;
  }


  /**
   **/
  public UserCredentialResponse credential(Secret credential) {
    this.credential = credential;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credential")
  public Secret getCredential() {
    return credential;
  }
  public void setCredential(Secret credential) {
    this.credential = credential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCredentialResponse userCredentialResponse = (UserCredentialResponse) o;
    return Objects.equals(this.uid, userCredentialResponse.uid) &&
        Objects.equals(this.userUid, userCredentialResponse.userUid) &&
        Objects.equals(this.credentialType, userCredentialResponse.credentialType) &&
        Objects.equals(this.credential, userCredentialResponse.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, userUid, credentialType, credential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCredentialResponse {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    userUid: ").append(toIndentedString(userUid)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

