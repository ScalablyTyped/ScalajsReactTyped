package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationDescription = String

type ApplicationMaintenanceWindowEndTime = String

type ApplicationMaintenanceWindowStartTime = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTIVE
  - java.lang.String
*/
type ApplicationMode = _ApplicationMode | String

type ApplicationName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
  - java.lang.String
*/
type ApplicationRestoreType = _ApplicationRestoreType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOSCALING
  - typingsJapgolly.awsSdk.awsSdkStrings.FORCE_STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLING_BACK
  - typingsJapgolly.awsSdk.awsSdkStrings.MAINTENANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLED_BACK
  - java.lang.String
*/
type ApplicationStatus = _ApplicationStatus | String

type ApplicationSummaries = js.Array[ApplicationSummary]

type ApplicationVersionId = Double

type ApplicationVersionSummaries = js.Array[ApplicationVersionSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UDF
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPENDENCY_JAR
  - java.lang.String
*/
type ArtifactType = _ArtifactType | String

type AuthorizedUrl = String

type BasePath = String

type BooleanObject = Boolean

type BucketARN = String

type CheckpointInterval = Double

type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]

type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]

type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.ZIPFILE
  - java.lang.String
*/
type CodeContentType = _CodeContentType | String

type CodeMD5 = String

type CodeSize = Double

type ConditionalToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ConfigurationType = _ConfigurationType | String

type CustomArtifactsConfigurationDescriptionList = js.Array[CustomArtifactConfigurationDescription]

type CustomArtifactsConfigurationList = js.Array[CustomArtifactConfiguration]

type DatabaseARN = String

type FileKey = String

type Id = String

type InAppStreamName = String

type InAppStreamNames = js.Array[InAppStreamName]

type InAppTableName = String

type InputDescriptions = js.Array[InputDescription]

type InputParallelismCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOW
  - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
  - java.lang.String
*/
type InputStartingPosition = _InputStartingPosition | String

type InputUpdates = js.Array[InputUpdate]

type Inputs = js.Array[Input]

type JobPlanDescription = String

type KinesisAnalyticsARN = String

type ListApplicationVersionsInputLimit = Double

type ListApplicationsInputLimit = Double

type ListSnapshotsInputLimit = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type LogStreamARN = String

type MavenArtifactId = String

type MavenGroupId = String

type MavenVersion = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.TASK
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATOR
  - typingsJapgolly.awsSdk.awsSdkStrings.PARALLELISM
  - java.lang.String
*/
type MetricsLevel = _MetricsLevel | String

type MinPauseBetweenCheckpoints = Double

type NextToken = String

type ObjectVersion = String

type OutputDescriptions = js.Array[OutputDescription]

type OutputUpdates = js.Array[OutputUpdate]

type Outputs = js.Array[Output]

type Parallelism = Double

type ParallelismPerKPU = Double

type ParsedInputRecord = js.Array[ParsedInputRecordField]

type ParsedInputRecordField = String

type ParsedInputRecords = js.Array[ParsedInputRecord]

type ProcessedInputRecord = String

type ProcessedInputRecords = js.Array[ProcessedInputRecord]

type PropertyGroups = js.Array[PropertyGroup]

type PropertyKey = String

type PropertyMap = StringDictionary[PropertyValue]

type PropertyValue = String

type RawInputRecord = String

type RawInputRecords = js.Array[RawInputRecord]

type RecordColumnDelimiter = String

type RecordColumnMapping = String

type RecordColumnName = String

type RecordColumnSqlType = String

type RecordColumns = js.Array[RecordColumn]

type RecordEncoding = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - java.lang.String
*/
type RecordFormatType = _RecordFormatType | String

type RecordRowDelimiter = String

type RecordRowPath = String

type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]

type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]

type ReferenceDataSources = js.Array[ReferenceDataSource]

type ResourceARN = String

type RoleARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`SQL-1_0`
  - typingsJapgolly.awsSdk.awsSdkStrings.`FLINK-1_6`
  - typingsJapgolly.awsSdk.awsSdkStrings.`FLINK-1_8`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ZEPPELIN-FLINK-1_0`
  - typingsJapgolly.awsSdk.awsSdkStrings.`FLINK-1_11`
  - typingsJapgolly.awsSdk.awsSdkStrings.`FLINK-1_13`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ZEPPELIN-FLINK-2_0`
  - java.lang.String
*/
type RuntimeEnvironment = _RuntimeEnvironment | String

type SecurityGroupId = String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SessionExpirationDurationInSeconds = Double

type SnapshotName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type SnapshotStatus = _SnapshotStatus | String

type SnapshotSummaries = js.Array[SnapshotDetails]

type SqlRunConfigurations = js.Array[SqlRunConfiguration]

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type TextContent = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FLINK_DASHBOARD_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.ZEPPELIN_UI_URL
  - java.lang.String
*/
type UrlType = _UrlType | String

type VpcConfigurationDescriptions = js.Array[VpcConfigurationDescription]

type VpcConfigurationUpdates = js.Array[VpcConfigurationUpdate]

type VpcConfigurations = js.Array[VpcConfiguration]

type VpcId = String

type ZipFileContent = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-05-23`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
