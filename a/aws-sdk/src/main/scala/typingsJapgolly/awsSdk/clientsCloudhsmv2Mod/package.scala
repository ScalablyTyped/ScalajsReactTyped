package typingsJapgolly.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.DAYS
import typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BackupId = java.lang.String

type BackupPolicy = DEFAULT | java.lang.String

type BackupRetentionType = DAYS | java.lang.String

type BackupRetentionValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETION
  - java.lang.String
*/
type BackupState = _BackupState | java.lang.String

type Backups = js.Array[Backup]

type BackupsMaxSize = Double

type Boolean = scala.Boolean

type Cert = java.lang.String

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
type ClusterState = _ClusterState | java.lang.String

type Clusters = js.Array[Cluster]

type ClustersMaxSize = Double

type EniId = java.lang.String

type ExternalAz = java.lang.String

type ExternalSubnetMapping = StringDictionary[SubnetId]

type Field = java.lang.String

type Filters = StringDictionary[Strings]

type HsmId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type HsmState = _HsmState | java.lang.String

type HsmType = java.lang.String

type Hsms = js.Array[Hsm]

type IpAddress = java.lang.String

type MaxSize = Double

type NextToken = java.lang.String

type PreCoPassword = java.lang.String

type Region = java.lang.String

type ResourceId = java.lang.String

type SecurityGroup = java.lang.String

type StateMessage = java.lang.String

type String = java.lang.String

type Strings = js.Array[String]

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type VpcId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-04-28`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
