package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisanalyticsv2Mod {
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
    - java.lang.String
  */
  type ApplicationRestoreType = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._ApplicationRestoreType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._ApplicationStatus | java.lang.String
  type ApplicationSummaries = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type CheckpointInterval = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
    - typingsJapgolly.awsSdk.awsSdkStrings.ZIPFILE
    - java.lang.String
  */
  type CodeContentType = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._CodeContentType | java.lang.String
  type CodeMD5 = java.lang.String
  type CodeSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ConfigurationType = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._ConfigurationType | java.lang.String
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.InAppStreamName]
  type InAppTableName = java.lang.String
  type InputDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.InputDescription]
  type InputParallelismCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOW
    - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._InputStartingPosition | java.lang.String
  type InputUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.InputUpdate]
  type Inputs = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.Input]
  type JobPlanDescription = java.lang.String
  type KinesisAnalyticsARN = java.lang.String
  type ListApplicationsInputLimit = scala.Double
  type ListSnapshotsInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - typingsJapgolly.awsSdk.awsSdkStrings.WARN
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
    - java.lang.String
  */
  type LogLevel = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._LogLevel | java.lang.String
  type LogStreamARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.TASK
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATOR
    - typingsJapgolly.awsSdk.awsSdkStrings.PARALLELISM
    - java.lang.String
  */
  type MetricsLevel = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._MetricsLevel | java.lang.String
  type MinPauseBetweenCheckpoints = scala.Double
  type NextToken = java.lang.String
  type ObjectVersion = java.lang.String
  type OutputDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.OutputDescription]
  type OutputUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.OutputUpdate]
  type Outputs = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.Output]
  type Parallelism = scala.Double
  type ParallelismPerKPU = scala.Double
  type ParsedInputRecord = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ProcessedInputRecord]
  type PropertyGroups = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.PropertyGroup]
  type PropertyKey = java.lang.String
  type PropertyMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.PropertyValue]
  type PropertyValue = java.lang.String
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RecordColumn]
  type RecordEncoding = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._RecordFormatType | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdate]
  type ReferenceDataSources = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSource]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`SQL-1_0`
    - typingsJapgolly.awsSdk.awsSdkStrings.`FLINK-1_6`
    - typingsJapgolly.awsSdk.awsSdkStrings.`FLINK-1_8`
    - java.lang.String
  */
  type RuntimeEnvironment = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._RuntimeEnvironment | java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.SecurityGroupId]
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type SnapshotStatus = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._SnapshotStatus | java.lang.String
  type SnapshotSummaries = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.SnapshotDetails]
  type SqlRunConfigurations = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.SqlRunConfiguration]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.SubnetId]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.Tag]
  type TextContent = java.lang.String
  type Timestamp = js.Date
  type VpcConfigurationDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescription]
  type VpcConfigurationUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdate]
  type VpcConfigurations = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.VpcConfiguration]
  type VpcId = java.lang.String
  type ZipFileContent = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-05-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kinesisanalyticsv2Mod._apiVersion | java.lang.String
}
