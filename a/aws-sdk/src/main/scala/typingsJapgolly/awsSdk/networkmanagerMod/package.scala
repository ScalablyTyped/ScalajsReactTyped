package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object networkmanagerMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.networkmanagerMod.ClientApiVersions
  type CustomerGatewayAssociationList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.CustomerGatewayAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CustomerGatewayAssociationState = typingsJapgolly.awsSdk.networkmanagerMod._CustomerGatewayAssociationState | java.lang.String
  type DateTime = js.Date
  type DeviceList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.Device]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type DeviceState = typingsJapgolly.awsSdk.networkmanagerMod._DeviceState | java.lang.String
  type GlobalNetworkList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.GlobalNetwork]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalNetworkState = typingsJapgolly.awsSdk.networkmanagerMod._GlobalNetworkState | java.lang.String
  type Integer = scala.Double
  type LinkAssociationList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.LinkAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type LinkAssociationState = typingsJapgolly.awsSdk.networkmanagerMod._LinkAssociationState | java.lang.String
  type LinkList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.Link]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type LinkState = typingsJapgolly.awsSdk.networkmanagerMod._LinkState | java.lang.String
  type MaxResults = scala.Double
  type ResourceARN = java.lang.String
  type SiteList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.Site]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SiteState = typingsJapgolly.awsSdk.networkmanagerMod._SiteState | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.Tag]
  type TagValue = java.lang.String
  type TransitGatewayRegistrationList = js.Array[typingsJapgolly.awsSdk.networkmanagerMod.TransitGatewayRegistration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type TransitGatewayRegistrationState = typingsJapgolly.awsSdk.networkmanagerMod._TransitGatewayRegistrationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-07-05`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.networkmanagerMod._apiVersion | java.lang.String
}
