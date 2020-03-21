package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudhsmv2Mod {
  type BackupId = java.lang.String
  type BackupPolicy = typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETION
    - java.lang.String
  */
  type BackupState = typingsJapgolly.awsSdk.cloudhsmv2Mod._BackupState | java.lang.String
  type Backups = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.Backup]
  type Boolean = scala.Boolean
  type Cert = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudhsmv2Mod.ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UNINITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type ClusterState = typingsJapgolly.awsSdk.cloudhsmv2Mod._ClusterState | java.lang.String
  type Clusters = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.Cluster]
  type EniId = java.lang.String
  type ExternalAz = java.lang.String
  type ExternalSubnetMapping = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudhsmv2Mod.SubnetId]
  type Field = java.lang.String
  type Filters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudhsmv2Mod.Strings]
  type HsmId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type HsmState = typingsJapgolly.awsSdk.cloudhsmv2Mod._HsmState | java.lang.String
  type HsmType = java.lang.String
  type Hsms = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.Hsm]
  type IpAddress = java.lang.String
  type MaxSize = scala.Double
  type NextToken = java.lang.String
  type PreCoPassword = java.lang.String
  type Region = java.lang.String
  type ResourceId = java.lang.String
  type SecurityGroup = java.lang.String
  type StateMessage = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.String]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.cloudhsmv2Mod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-04-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudhsmv2Mod._apiVersion | java.lang.String
}
