package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.UNIFORM_SCALING
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BooleanObject = Boolean

type ChildShardList = js.Array[ChildShard]

type ConsumerARN = String

type ConsumerCountObject = Double

type ConsumerList = js.Array[Consumer]

type ConsumerName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type ConsumerStatus = _ConsumerStatus | String

type Data = Buffer | js.typedarray.Uint8Array | Blob | String

type DescribeStreamInputLimit = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

type EnhancedMonitoringList = js.Array[EnhancedMetrics]

type ErrorCode = String

type ErrorMessage = String

type GetRecordsInputLimit = Double

type HashKey = String

type KeyId = String

type ListShardsInputLimit = Double

type ListStreamConsumersInputLimit = Double

type ListStreamsInputLimit = Double

type ListTagsForStreamInputLimit = Double

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
type MetricsName = _MetricsName | String

type MetricsNameList = js.Array[MetricsName]

type MillisBehindLatest = Double

type NextToken = String

type OnDemandStreamCountLimitObject = Double

type OnDemandStreamCountObject = Double

type PartitionKey = String

type PositiveIntegerObject = Double

type PutRecordsRequestEntryList = js.Array[PutRecordsRequestEntry]

type PutRecordsResultEntryList = js.Array[PutRecordsResultEntry]

type RecordList = js.Array[Record]

type RetentionPeriodHours = Double

type ScalingType = UNIFORM_SCALING | String

type SequenceNumber = String

type ShardCountObject = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_SHARD_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.AT_TRIM_HORIZON
  - typingsJapgolly.awsSdk.awsSdkStrings.FROM_TRIM_HORIZON
  - typingsJapgolly.awsSdk.awsSdkStrings.AT_LATEST
  - typingsJapgolly.awsSdk.awsSdkStrings.AT_TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.FROM_TIMESTAMP
  - java.lang.String
*/
type ShardFilterType = _ShardFilterType | String

type ShardId = String

type ShardIdList = js.Array[ShardId]

type ShardIterator = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typingsJapgolly.awsSdk.awsSdkStrings.LATEST
  - typingsJapgolly.awsSdk.awsSdkStrings.AT_TIMESTAMP
  - java.lang.String
*/
type ShardIteratorType = _ShardIteratorType | String

type ShardList = js.Array[Shard]

type StreamARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONED
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
type StreamMode = _StreamMode | String

type StreamName = String

type StreamNameList = js.Array[StreamName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type StreamStatus = _StreamStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-12-02`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
