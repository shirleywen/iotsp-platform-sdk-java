package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.users.model.UserPolicyUnit;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UserPolicyCreateObject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UserPolicyCreateObject   {
  
  private String uid = null;
  private String name = null;
  private List<UserPolicyUnit> policyUnits = new ArrayList<UserPolicyUnit>();

  
  /**
   **/
  public UserPolicyCreateObject uid(String uid) {
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
  public UserPolicyCreateObject name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public UserPolicyCreateObject policyUnits(List<UserPolicyUnit> policyUnits) {
    this.policyUnits = policyUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyUnits")
  public List<UserPolicyUnit> getPolicyUnits() {
    return policyUnits;
  }
  public void setPolicyUnits(List<UserPolicyUnit> policyUnits) {
    this.policyUnits = policyUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPolicyCreateObject userPolicyCreateObject = (UserPolicyCreateObject) o;
    return Objects.equals(this.uid, userPolicyCreateObject.uid) &&
        Objects.equals(this.name, userPolicyCreateObject.name) &&
        Objects.equals(this.policyUnits, userPolicyCreateObject.policyUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, policyUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPolicyCreateObject {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyUnits: ").append(toIndentedString(policyUnits)).append("\n");
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

