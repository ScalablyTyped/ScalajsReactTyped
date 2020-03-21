package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisanalyticsMod {
  type ApplicationCode = java.lang.String
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = typingsJapgolly.awsSdk.kinesisanalyticsMod._ApplicationStatus | java.lang.String
  type ApplicationSummaries = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kinesisanalyticsMod.ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOption]
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.InAppStreamName]
  type InAppTableName = java.lang.String
  type InputConfigurations = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.InputConfiguration]
  type InputDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.InputDescription]
  type InputParallelismCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOW
    - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = typingsJapgolly.awsSdk.kinesisanalyticsMod._InputStartingPosition | java.lang.String
  type InputUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.InputUpdate]
  type Inputs = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.Input]
  type KinesisAnalyticsARN = java.lang.String
  type ListApplicationsInputLimit = scala.Double
  type LogStreamARN = java.lang.String
  type OutputDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.OutputDescription]
  type OutputUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.OutputUpdate]
  type Outputs = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.Output]
  type ParsedInputRecord = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.ProcessedInputRecord]
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.RecordColumn]
  type RecordEncoding = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = typingsJapgolly.awsSdk.kinesisanalyticsMod._RecordFormatType | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.ReferenceDataSourceUpdate]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.kinesisanalyticsMod.Tag]
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-08-14`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kinesisanalyticsMod._apiVersion | java.lang.String
}
