package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotanalyticsMod {
  type ActivityBatchSize = scala.Double
  type ActivityName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeNameMapping = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotanalyticsMod.AttributeName]
  type AttributeNames = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.AttributeName]
  type BatchPutMessageErrorEntries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.BatchPutMessageErrorEntry]
  type BucketKeyExpression = java.lang.String
  type BucketName = java.lang.String
  type ChannelArn = java.lang.String
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ChannelStatus = typingsJapgolly.awsSdk.iotanalyticsMod._ChannelStatus | java.lang.String
  type ChannelSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.ChannelSummary]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.iotanalyticsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACU_1
    - typingsJapgolly.awsSdk.awsSdkStrings.ACU_2
    - java.lang.String
  */
  type ComputeType = typingsJapgolly.awsSdk.iotanalyticsMod._ComputeType | java.lang.String
  type DatasetActionName = java.lang.String
  type DatasetActionSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetActionSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUERY
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINER
    - java.lang.String
  */
  type DatasetActionType = typingsJapgolly.awsSdk.iotanalyticsMod._DatasetActionType | java.lang.String
  type DatasetActions = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetAction]
  type DatasetArn = java.lang.String
  type DatasetContentDeliveryRules = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetContentDeliveryRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DatasetContentState = typingsJapgolly.awsSdk.iotanalyticsMod._DatasetContentState | java.lang.String
  type DatasetContentSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetContentSummary]
  type DatasetContentVersion = java.lang.String
  type DatasetEntries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetEntry]
  type DatasetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type DatasetStatus = typingsJapgolly.awsSdk.iotanalyticsMod._DatasetStatus | java.lang.String
  type DatasetSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetSummary]
  type DatasetTriggers = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatasetTrigger]
  type DatastoreArn = java.lang.String
  type DatastoreName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type DatastoreStatus = typingsJapgolly.awsSdk.iotanalyticsMod._DatastoreStatus | java.lang.String
  type DatastoreSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.DatastoreSummary]
  type DoubleValue = scala.Double
  type EndTime = js.Date
  type EntryName = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type FilterExpression = java.lang.String
  type GlueDatabaseName = java.lang.String
  type GlueTableName = java.lang.String
  type Image = java.lang.String
  type IncludeStatisticsFlag = scala.Boolean
  type IotEventsInputName = java.lang.String
  type LambdaName = java.lang.String
  type LogResult = java.lang.String
  type LoggingEnabled = scala.Boolean
  type LoggingLevel = typingsJapgolly.awsSdk.awsSdkStrings.ERROR | java.lang.String
  type MathExpression = java.lang.String
  type MaxMessages = scala.Double
  type MaxResults = scala.Double
  type MaxVersions = scala.Double
  type MessageId = java.lang.String
  type MessagePayload = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.iotanalyticsMod.Blob | java.lang.String
  type MessagePayloads = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.MessagePayload]
  type Messages = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.Message]
  type NextToken = java.lang.String
  type OffsetSeconds = scala.Double
  type OutputFileName = java.lang.String
  type PipelineActivities = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.PipelineActivity]
  type PipelineArn = java.lang.String
  type PipelineName = java.lang.String
  type PipelineSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.PipelineSummary]
  type PresignedURI = java.lang.String
  type QueryFilters = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.QueryFilter]
  type Reason = java.lang.String
  type ReprocessingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ReprocessingStatus = typingsJapgolly.awsSdk.iotanalyticsMod._ReprocessingStatus | java.lang.String
  type ReprocessingSummaries = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.ReprocessingSummary]
  type ResourceArn = java.lang.String
  type RetentionPeriodInDays = scala.Double
  type RoleArn = java.lang.String
  type S3KeyPrefix = java.lang.String
  type ScheduleExpression = java.lang.String
  type SizeInBytes = scala.Double
  type SqlQuery = java.lang.String
  type StartTime = js.Date
  type StringValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.Tag]
  type TagValue = java.lang.String
  type TimeExpression = java.lang.String
  type Timestamp = js.Date
  type UnlimitedRetentionPeriod = scala.Boolean
  type UnlimitedVersioning = scala.Boolean
  type VariableName = java.lang.String
  type Variables = js.Array[typingsJapgolly.awsSdk.iotanalyticsMod.Variable]
  type VolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.iotanalyticsMod._apiVersion | java.lang.String
}
