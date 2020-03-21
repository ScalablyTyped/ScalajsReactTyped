package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object firehoseMod {
  type AWSKMSKeyARN = java.lang.String
  type BlockSizeBytes = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.firehoseMod.ClientApiVersions
  type ClusterJDBCURL = java.lang.String
  type ColumnToJsonKeyMappings = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.firehoseMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNCOMPRESSED
    - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.Snappy_
    - java.lang.String
  */
  type CompressionFormat = typingsJapgolly.awsSdk.firehoseMod._CompressionFormat | java.lang.String
  type CopyOptions = java.lang.String
  type Data = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.firehoseMod.Blob | java.lang.String
  type DataTableColumns = java.lang.String
  type DataTableName = java.lang.String
  type DeliveryStartTimestamp = js.Date
  type DeliveryStreamARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING_FAILED
    - java.lang.String
  */
  type DeliveryStreamEncryptionStatus = typingsJapgolly.awsSdk.firehoseMod._DeliveryStreamEncryptionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RETIRE_KMS_GRANT_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_KMS_GRANT_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS_ACCESS_DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED_KMS_KEY
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_KMS_KEY
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS_KEY_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS_OPT_IN_REQUIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_ERROR
    - java.lang.String
  */
  type DeliveryStreamFailureType = typingsJapgolly.awsSdk.firehoseMod._DeliveryStreamFailureType | java.lang.String
  type DeliveryStreamName = java.lang.String
  type DeliveryStreamNameList = js.Array[typingsJapgolly.awsSdk.firehoseMod.DeliveryStreamName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DeliveryStreamStatus = typingsJapgolly.awsSdk.firehoseMod._DeliveryStreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DirectPut
    - typingsJapgolly.awsSdk.awsSdkStrings.KinesisStreamAsSource
    - java.lang.String
  */
  type DeliveryStreamType = typingsJapgolly.awsSdk.firehoseMod._DeliveryStreamType | java.lang.String
  type DeliveryStreamVersionId = java.lang.String
  type DescribeDeliveryStreamInputLimit = scala.Double
  type DestinationDescriptionList = js.Array[typingsJapgolly.awsSdk.firehoseMod.DestinationDescription]
  type DestinationId = java.lang.String
  type ElasticsearchBufferingIntervalInSeconds = scala.Double
  type ElasticsearchBufferingSizeInMBs = scala.Double
  type ElasticsearchClusterEndpoint = java.lang.String
  type ElasticsearchDomainARN = java.lang.String
  type ElasticsearchIndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NoRotation
    - typingsJapgolly.awsSdk.awsSdkStrings.OneHour
    - typingsJapgolly.awsSdk.awsSdkStrings.OneDay
    - typingsJapgolly.awsSdk.awsSdkStrings.OneWeek
    - typingsJapgolly.awsSdk.awsSdkStrings.OneMonth
    - java.lang.String
  */
  type ElasticsearchIndexRotationPeriod = typingsJapgolly.awsSdk.firehoseMod._ElasticsearchIndexRotationPeriod | java.lang.String
  type ElasticsearchRetryDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FailedDocumentsOnly
    - typingsJapgolly.awsSdk.awsSdkStrings.AllDocuments
    - java.lang.String
  */
  type ElasticsearchS3BackupMode = typingsJapgolly.awsSdk.firehoseMod._ElasticsearchS3BackupMode | java.lang.String
  type ElasticsearchTypeName = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type ErrorOutputPrefix = java.lang.String
  type HECAcknowledgmentTimeoutInSeconds = scala.Double
  type HECEndpoint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Raw_
    - typingsJapgolly.awsSdk.awsSdkStrings.Event_
    - java.lang.String
  */
  type HECEndpointType = typingsJapgolly.awsSdk.firehoseMod._HECEndpointType | java.lang.String
  type HECToken = java.lang.String
  type IntervalInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_OWNED_CMK
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK
    - java.lang.String
  */
  type KeyType = typingsJapgolly.awsSdk.firehoseMod._KeyType | java.lang.String
  type KinesisStreamARN = java.lang.String
  type ListDeliveryStreamsInputLimit = scala.Double
  type ListOfNonEmptyStrings = js.Array[typingsJapgolly.awsSdk.firehoseMod.NonEmptyString]
  type ListOfNonEmptyStringsWithoutWhitespace = js.Array[typingsJapgolly.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]
  type ListTagsForDeliveryStreamInputLimit = scala.Double
  type ListTagsForDeliveryStreamOutputTagList = js.Array[typingsJapgolly.awsSdk.firehoseMod.Tag]
  type LogGroupName = java.lang.String
  type LogStreamName = java.lang.String
  type NoEncryptionConfig = typingsJapgolly.awsSdk.awsSdkStrings.NoEncryption | java.lang.String
  type NonEmptyString = java.lang.String
  type NonEmptyStringWithoutWhitespace = java.lang.String
  type NonNegativeIntegerObject = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.ZLIB
    - typingsJapgolly.awsSdk.awsSdkStrings.SNAPPY
    - java.lang.String
  */
  type OrcCompression = typingsJapgolly.awsSdk.firehoseMod._OrcCompression | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.V0_11
    - typingsJapgolly.awsSdk.awsSdkStrings.V0_12
    - java.lang.String
  */
  type OrcFormatVersion = typingsJapgolly.awsSdk.firehoseMod._OrcFormatVersion | java.lang.String
  type OrcRowIndexStride = scala.Double
  type OrcStripeSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNCOMPRESSED
    - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.SNAPPY
    - java.lang.String
  */
  type ParquetCompression = typingsJapgolly.awsSdk.firehoseMod._ParquetCompression | java.lang.String
  type ParquetPageSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.V1
    - typingsJapgolly.awsSdk.awsSdkStrings.V2
    - java.lang.String
  */
  type ParquetWriterVersion = typingsJapgolly.awsSdk.firehoseMod._ParquetWriterVersion | java.lang.String
  type Password = java.lang.String
  type Prefix = java.lang.String
  type ProcessorList = js.Array[typingsJapgolly.awsSdk.firehoseMod.Processor]
  type ProcessorParameterList = js.Array[typingsJapgolly.awsSdk.firehoseMod.ProcessorParameter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaArn
    - typingsJapgolly.awsSdk.awsSdkStrings.NumberOfRetries
    - typingsJapgolly.awsSdk.awsSdkStrings.RoleArn
    - typingsJapgolly.awsSdk.awsSdkStrings.BufferSizeInMBs
    - typingsJapgolly.awsSdk.awsSdkStrings.BufferIntervalInSeconds
    - java.lang.String
  */
  type ProcessorParameterName = typingsJapgolly.awsSdk.firehoseMod._ProcessorParameterName | java.lang.String
  type ProcessorParameterValue = java.lang.String
  type ProcessorType = typingsJapgolly.awsSdk.awsSdkStrings.Lambda_ | java.lang.String
  type Proportion = scala.Double
  type PutRecordBatchRequestEntryList = js.Array[typingsJapgolly.awsSdk.firehoseMod.Record]
  type PutRecordBatchResponseEntryList = js.Array[typingsJapgolly.awsSdk.firehoseMod.PutRecordBatchResponseEntry]
  type PutResponseRecordId = java.lang.String
  type RedshiftRetryDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - java.lang.String
  */
  type RedshiftS3BackupMode = typingsJapgolly.awsSdk.firehoseMod._RedshiftS3BackupMode | java.lang.String
  type RoleARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - java.lang.String
  */
  type S3BackupMode = typingsJapgolly.awsSdk.firehoseMod._S3BackupMode | java.lang.String
  type SizeInMBs = scala.Double
  type SplunkRetryDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FailedEventsOnly
    - typingsJapgolly.awsSdk.awsSdkStrings.AllEvents
    - java.lang.String
  */
  type SplunkS3BackupMode = typingsJapgolly.awsSdk.firehoseMod._SplunkS3BackupMode | java.lang.String
  type TagDeliveryStreamInputTagList = js.Array[typingsJapgolly.awsSdk.firehoseMod.Tag]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.firehoseMod.TagKey]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type Username = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-08-04`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.firehoseMod._apiVersion | java.lang.String
}
