package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudhsmMod {
  type AZ = java.lang.String
  type AZList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.AZ]
  type Certificate = java.lang.String
  type CertificateFingerprint = java.lang.String
  type ClientArn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudhsmMod.ClientApiVersions
  type ClientLabel = java.lang.String
  type ClientList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.ClientArn]
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`5Dot1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`5Dot3`
    - java.lang.String
  */
  type ClientVersion = typingsJapgolly.awsSdk.cloudhsmMod._ClientVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type CloudHsmObjectState = typingsJapgolly.awsSdk.cloudhsmMod._CloudHsmObjectState | java.lang.String
  type EniId = java.lang.String
  type ExternalId = java.lang.String
  type HapgArn = java.lang.String
  type HapgList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.HapgArn]
  type HsmArn = java.lang.String
  type HsmList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.HsmArn]
  type HsmSerialNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type HsmStatus = typingsJapgolly.awsSdk.cloudhsmMod._HsmStatus | java.lang.String
  type IamRoleArn = java.lang.String
  type IpAddress = java.lang.String
  type Label = java.lang.String
  type PaginationToken = java.lang.String
  type PartitionArn = java.lang.String
  type PartitionList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.PartitionArn]
  type PartitionSerial = java.lang.String
  type PartitionSerialList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.PartitionSerial]
  type SshKey = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubscriptionType = typingsJapgolly.awsSdk.awsSdkStrings.PRODUCTION | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.cloudhsmMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-05-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudhsmMod._apiVersion | java.lang.String
}
