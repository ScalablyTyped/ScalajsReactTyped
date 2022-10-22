package typingsJapgolly.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.AWSTraceHeader
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdList = js.Array[String]

type ActionNameList = js.Array[String]

type AttributeNameList = js.Array[QueueAttributeName]

type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]

type Binary = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type BinaryList = js.Array[Binary]

type Boolean = scala.Boolean

type BoxedInteger = Double

type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]

type ChangeMessageVisibilityBatchResultEntryList = js.Array[ChangeMessageVisibilityBatchResultEntry]

type DeleteMessageBatchRequestEntryList = js.Array[DeleteMessageBatchRequestEntry]

type DeleteMessageBatchResultEntryList = js.Array[DeleteMessageBatchResultEntry]

type Integer = Double

type MessageAttributeName = java.lang.String

type MessageAttributeNameList = js.Array[MessageAttributeName]

type MessageBodyAttributeMap = StringDictionary[MessageAttributeValue]

type MessageBodySystemAttributeMap = StringDictionary[MessageSystemAttributeValue]

type MessageList = js.Array[Message]

type MessageSystemAttributeMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SenderId
  - typingsJapgolly.awsSdk.awsSdkStrings.SentTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.ApproximateReceiveCount
  - typingsJapgolly.awsSdk.awsSdkStrings.ApproximateFirstReceiveTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.SequenceNumber
  - typingsJapgolly.awsSdk.awsSdkStrings.MessageDeduplicationId
  - typingsJapgolly.awsSdk.awsSdkStrings.MessageGroupId
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSTraceHeader
  - java.lang.String
*/
type MessageSystemAttributeName = _MessageSystemAttributeName | java.lang.String

type MessageSystemAttributeNameForSends = AWSTraceHeader | java.lang.String

type QueueAttributeMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.All_
  - typingsJapgolly.awsSdk.awsSdkStrings.Policy_
  - typingsJapgolly.awsSdk.awsSdkStrings.VisibilityTimeout
  - typingsJapgolly.awsSdk.awsSdkStrings.MaximumMessageSize
  - typingsJapgolly.awsSdk.awsSdkStrings.MessageRetentionPeriod
  - typingsJapgolly.awsSdk.awsSdkStrings.ApproximateNumberOfMessages
  - typingsJapgolly.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesNotVisible
  - typingsJapgolly.awsSdk.awsSdkStrings.CreatedTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTimestamp
  - typingsJapgolly.awsSdk.awsSdkStrings.QueueArn
  - typingsJapgolly.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesDelayed
  - typingsJapgolly.awsSdk.awsSdkStrings.DelaySeconds
  - typingsJapgolly.awsSdk.awsSdkStrings.ReceiveMessageWaitTimeSeconds
  - typingsJapgolly.awsSdk.awsSdkStrings.RedrivePolicy
  - typingsJapgolly.awsSdk.awsSdkStrings.FifoQueue
  - typingsJapgolly.awsSdk.awsSdkStrings.ContentBasedDeduplication
  - typingsJapgolly.awsSdk.awsSdkStrings.KmsMasterKeyId
  - typingsJapgolly.awsSdk.awsSdkStrings.KmsDataKeyReusePeriodSeconds
  - typingsJapgolly.awsSdk.awsSdkStrings.DeduplicationScope
  - typingsJapgolly.awsSdk.awsSdkStrings.FifoThroughputLimit
  - typingsJapgolly.awsSdk.awsSdkStrings.RedriveAllowPolicy
  - typingsJapgolly.awsSdk.awsSdkStrings.SqsManagedSseEnabled
  - java.lang.String
*/
type QueueAttributeName = _QueueAttributeName | java.lang.String

type QueueUrlList = js.Array[String]

type SendMessageBatchRequestEntryList = js.Array[SendMessageBatchRequestEntry]

type SendMessageBatchResultEntryList = js.Array[SendMessageBatchResultEntry]

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Token = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2012-11-05`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
