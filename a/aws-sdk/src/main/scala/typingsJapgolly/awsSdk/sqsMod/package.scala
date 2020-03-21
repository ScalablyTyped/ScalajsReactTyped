package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsMod {
  type AWSAccountIdList = js.Array[typingsJapgolly.awsSdk.sqsMod.String]
  type ActionNameList = js.Array[typingsJapgolly.awsSdk.sqsMod.String]
  type AttributeNameList = js.Array[typingsJapgolly.awsSdk.sqsMod.QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.BatchResultErrorEntry]
  type Binary = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.sqsMod.Blob | java.lang.String
  type BinaryList = js.Array[typingsJapgolly.awsSdk.sqsMod.Binary]
  type Boolean = scala.Boolean
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.ChangeMessageVisibilityBatchResultEntry]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.sqsMod.ClientApiVersions
  type DeleteMessageBatchRequestEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.DeleteMessageBatchResultEntry]
  type Integer = scala.Double
  type MessageAttributeName = java.lang.String
  type MessageAttributeNameList = js.Array[typingsJapgolly.awsSdk.sqsMod.MessageAttributeName]
  type MessageBodyAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sqsMod.MessageAttributeValue]
  type MessageBodySystemAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sqsMod.MessageSystemAttributeValue]
  type MessageList = js.Array[typingsJapgolly.awsSdk.sqsMod.Message]
  type MessageSystemAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sqsMod.String]
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
  type MessageSystemAttributeName = typingsJapgolly.awsSdk.sqsMod._MessageSystemAttributeName | java.lang.String
  type MessageSystemAttributeNameForSends = typingsJapgolly.awsSdk.awsSdkStrings.AWSTraceHeader | java.lang.String
  type QueueAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sqsMod.String]
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
    - java.lang.String
  */
  type QueueAttributeName = typingsJapgolly.awsSdk.sqsMod._QueueAttributeName | java.lang.String
  type QueueUrlList = js.Array[typingsJapgolly.awsSdk.sqsMod.String]
  type SendMessageBatchRequestEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList = js.Array[typingsJapgolly.awsSdk.sqsMod.SendMessageBatchResultEntry]
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.sqsMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.sqsMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sqsMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-11-05`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.sqsMod._apiVersion | java.lang.String
}
