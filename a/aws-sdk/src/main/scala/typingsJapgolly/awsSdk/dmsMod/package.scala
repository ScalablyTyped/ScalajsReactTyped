package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dmsMod {
  type AccountQuotaList = js.Array[typingsJapgolly.awsSdk.dmsMod.AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - typingsJapgolly.awsSdk.awsSdkStrings.mongodb_cr
    - typingsJapgolly.awsSdk.awsSdkStrings.scram_sha_1
    - java.lang.String
  */
  type AuthMechanismValue = typingsJapgolly.awsSdk.dmsMod._AuthMechanismValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.no_
    - typingsJapgolly.awsSdk.awsSdkStrings.password__
    - java.lang.String
  */
  type AuthTypeValue = typingsJapgolly.awsSdk.dmsMod._AuthTypeValue | java.lang.String
  type AvailabilityZonesList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[typingsJapgolly.awsSdk.dmsMod.Certificate]
  type CertificateWallet = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.dmsMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.dmsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - typingsJapgolly.awsSdk.awsSdkStrings.gzip__
    - java.lang.String
  */
  type CompressionTypeValue = typingsJapgolly.awsSdk.dmsMod._CompressionTypeValue | java.lang.String
  type ConnectionList = js.Array[typingsJapgolly.awsSdk.dmsMod.Connection]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.csv_
    - typingsJapgolly.awsSdk.awsSdkStrings.parquet_
    - java.lang.String
  */
  type DataFormatValue = typingsJapgolly.awsSdk.dmsMod._DataFormatValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - typingsJapgolly.awsSdk.awsSdkStrings.require__
    - typingsJapgolly.awsSdk.awsSdkStrings.`verify-ca`
    - typingsJapgolly.awsSdk.awsSdkStrings.`verify-full`
    - java.lang.String
  */
  type DmsSslModeValue = typingsJapgolly.awsSdk.dmsMod._DmsSslModeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.plain
    - typingsJapgolly.awsSdk.awsSdkStrings.`plain-dictionary`
    - typingsJapgolly.awsSdk.awsSdkStrings.`rle-dictionary`
    - java.lang.String
  */
  type EncodingTypeValue = typingsJapgolly.awsSdk.dmsMod._EncodingTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`sse-s3_`
    - typingsJapgolly.awsSdk.awsSdkStrings.`sse-kms_`
    - java.lang.String
  */
  type EncryptionModeValue = typingsJapgolly.awsSdk.dmsMod._EncryptionModeValue | java.lang.String
  type EndpointList = js.Array[typingsJapgolly.awsSdk.dmsMod.Endpoint]
  type EventCategoriesList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type EventCategoryGroupList = js.Array[typingsJapgolly.awsSdk.dmsMod.EventCategoryGroup]
  type EventList = js.Array[typingsJapgolly.awsSdk.dmsMod.Event]
  type EventSubscriptionsList = js.Array[typingsJapgolly.awsSdk.dmsMod.EventSubscription]
  type FilterList = js.Array[typingsJapgolly.awsSdk.dmsMod.Filter]
  type FilterValueList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type Long = scala.Double
  type MessageFormatValue = typingsJapgolly.awsSdk.awsSdkStrings.json_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`full-load`
    - typingsJapgolly.awsSdk.awsSdkStrings.cdc
    - typingsJapgolly.awsSdk.awsSdkStrings.`full-load-and-cdc`
    - java.lang.String
  */
  type MigrationTypeValue = typingsJapgolly.awsSdk.dmsMod._MigrationTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - typingsJapgolly.awsSdk.awsSdkStrings.one
    - java.lang.String
  */
  type NestingLevelValue = typingsJapgolly.awsSdk.dmsMod._NestingLevelValue | java.lang.String
  type OrderableReplicationInstanceList = js.Array[typingsJapgolly.awsSdk.dmsMod.OrderableReplicationInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`parquet-1-0`
    - typingsJapgolly.awsSdk.awsSdkStrings.`parquet-2-0`
    - java.lang.String
  */
  type ParquetVersionValue = typingsJapgolly.awsSdk.dmsMod._ParquetVersionValue | java.lang.String
  type PendingMaintenanceActionDetails = js.Array[typingsJapgolly.awsSdk.dmsMod.PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[typingsJapgolly.awsSdk.dmsMod.ResourcePendingMaintenanceActions]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.successful__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.refreshing
    - java.lang.String
  */
  type RefreshSchemasStatusTypeValue = typingsJapgolly.awsSdk.dmsMod._RefreshSchemasStatusTypeValue | java.lang.String
  type ReleaseStatusValues = typingsJapgolly.awsSdk.awsSdkStrings.beta_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`data-reload`
    - typingsJapgolly.awsSdk.awsSdkStrings.`validate-only`
    - java.lang.String
  */
  type ReloadOptionValue = typingsJapgolly.awsSdk.dmsMod._ReloadOptionValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.source_
    - typingsJapgolly.awsSdk.awsSdkStrings.target_
    - java.lang.String
  */
  type ReplicationEndpointTypeValue = typingsJapgolly.awsSdk.dmsMod._ReplicationEndpointTypeValue | java.lang.String
  type ReplicationInstanceList = js.Array[typingsJapgolly.awsSdk.dmsMod.ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type ReplicationInstancePublicIpAddressList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type ReplicationInstanceTaskLogsList = js.Array[typingsJapgolly.awsSdk.dmsMod.ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups = js.Array[typingsJapgolly.awsSdk.dmsMod.ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList = js.Array[typingsJapgolly.awsSdk.dmsMod.ReplicationTaskAssessmentResult]
  type ReplicationTaskList = js.Array[typingsJapgolly.awsSdk.dmsMod.ReplicationTask]
  type SchemaList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type SecretString = java.lang.String
  type SourceIdsList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type SourceType = typingsJapgolly.awsSdk.awsSdkStrings.`replication-instance` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`start-replication`
    - typingsJapgolly.awsSdk.awsSdkStrings.`resume-processing`
    - typingsJapgolly.awsSdk.awsSdkStrings.`reload-target`
    - java.lang.String
  */
  type StartReplicationTaskTypeValue = typingsJapgolly.awsSdk.dmsMod._StartReplicationTaskTypeValue | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.dmsMod.Subnet]
  type SupportedEndpointTypeList = js.Array[typingsJapgolly.awsSdk.dmsMod.SupportedEndpointType]
  type TStamp = js.Date
  type TableListToReload = js.Array[typingsJapgolly.awsSdk.dmsMod.TableToReload]
  type TableStatisticsList = js.Array[typingsJapgolly.awsSdk.dmsMod.TableStatistics]
  type TagList = js.Array[typingsJapgolly.awsSdk.dmsMod.Tag]
  type VpcSecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.dmsMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.dmsMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-01-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.dmsMod._apiVersion | java.lang.String
}
