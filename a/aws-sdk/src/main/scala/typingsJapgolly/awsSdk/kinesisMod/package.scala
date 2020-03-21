package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisMod {
  type BooleanObject = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kinesisMod.ClientApiVersions
  type ConsumerARN = java.lang.String
  type ConsumerCountObject = scala.Double
  type ConsumerList = js.Array[typingsJapgolly.awsSdk.kinesisMod.Consumer]
  type ConsumerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ConsumerStatus = typingsJapgolly.awsSdk.kinesisMod._ConsumerStatus | java.lang.String
  type Data = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kinesisMod.Blob | java.lang.String
  type DescribeStreamInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = typingsJapgolly.awsSdk.kinesisMod._EncryptionType | java.lang.String
  type EnhancedMonitoringList = js.Array[typingsJapgolly.awsSdk.kinesisMod.EnhancedMetrics]
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type GetRecordsInputLimit = scala.Double
  type HashKey = java.lang.String
  type KeyId = java.lang.String
  type ListShardsInputLimit = scala.Double
  type ListStreamConsumersInputLimit = scala.Double
  type ListStreamsInputLimit = scala.Double
  type ListTagsForStreamInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IncomingBytes
    - typingsJapgolly.awsSdk.awsSdkStrings.IncomingRecords
    - typingsJapgolly.awsSdk.awsSdkStrings.OutgoingBytes
    - typingsJapgolly.awsSdk.awsSdkStrings.OutgoingRecords
    - typingsJapgolly.awsSdk.awsSdkStrings.WriteProvisionedThroughputExceeded
    - typingsJapgolly.awsSdk.awsSdkStrings.ReadProvisionedThroughputExceeded
    - typingsJapgolly.awsSdk.awsSdkStrings.IteratorAgeMilliseconds
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type MetricsName = typingsJapgolly.awsSdk.kinesisMod._MetricsName | java.lang.String
  type MetricsNameList = js.Array[typingsJapgolly.awsSdk.kinesisMod.MetricsName]
  type MillisBehindLatest = scala.Double
  type NextToken = java.lang.String
  type PartitionKey = java.lang.String
  type PositiveIntegerObject = scala.Double
  type PutRecordsRequestEntryList = js.Array[typingsJapgolly.awsSdk.kinesisMod.PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[typingsJapgolly.awsSdk.kinesisMod.PutRecordsResultEntry]
  type RecordList = js.Array[typingsJapgolly.awsSdk.kinesisMod.Record]
  type RetentionPeriodHours = scala.Double
  type ScalingType = typingsJapgolly.awsSdk.awsSdkStrings.UNIFORM_SCALING | java.lang.String
  type SequenceNumber = java.lang.String
  type ShardCountObject = scala.Double
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
    - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsJapgolly.awsSdk.awsSdkStrings.LATEST
    - typingsJapgolly.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type ShardIteratorType = typingsJapgolly.awsSdk.kinesisMod._ShardIteratorType | java.lang.String
  type ShardList = js.Array[typingsJapgolly.awsSdk.kinesisMod.Shard]
  type StreamARN = java.lang.String
  type StreamName = java.lang.String
  type StreamNameList = js.Array[typingsJapgolly.awsSdk.kinesisMod.StreamName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type StreamStatus = typingsJapgolly.awsSdk.kinesisMod._StreamStatus | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.kinesisMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.kinesisMod.Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.kinesisMod.TagValue]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-12-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kinesisMod._apiVersion | java.lang.String
}
