package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object daxMod {
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMMEDIATE
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRES_REBOOT
    - java.lang.String
  */
  type ChangeType = typingsJapgolly.awsSdk.daxMod._ChangeType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.daxMod.ClientApiVersions
  type ClusterList = js.Array[typingsJapgolly.awsSdk.daxMod.Cluster]
  type ClusterNameList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type EventList = js.Array[typingsJapgolly.awsSdk.daxMod.Event]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
    - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type IsModifiable = typingsJapgolly.awsSdk.daxMod._IsModifiable | java.lang.String
  type KeyList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type NodeIdentifierList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type NodeList = js.Array[typingsJapgolly.awsSdk.daxMod.Node]
  type NodeTypeSpecificValueList = js.Array[typingsJapgolly.awsSdk.daxMod.NodeTypeSpecificValue]
  type ParameterGroupList = js.Array[typingsJapgolly.awsSdk.daxMod.ParameterGroup]
  type ParameterGroupNameList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type ParameterList = js.Array[typingsJapgolly.awsSdk.daxMod.Parameter]
  type ParameterNameValueList = js.Array[typingsJapgolly.awsSdk.daxMod.ParameterNameValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.NODE_TYPE_SPECIFIC
    - java.lang.String
  */
  type ParameterType = typingsJapgolly.awsSdk.daxMod._ParameterType | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type SSEStatus = typingsJapgolly.awsSdk.daxMod._SSEStatus | java.lang.String
  type SecurityGroupIdentifierList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type SecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.daxMod.SecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLUSTER
    - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_GROUP
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBNET_GROUP
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.daxMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetGroupList = js.Array[typingsJapgolly.awsSdk.daxMod.SubnetGroup]
  type SubnetGroupNameList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type SubnetIdentifierList = js.Array[typingsJapgolly.awsSdk.daxMod.String]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.daxMod.Subnet]
  type TStamp = js.Date
  type TagList = js.Array[typingsJapgolly.awsSdk.daxMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-04-19`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.daxMod._apiVersion | java.lang.String
}
