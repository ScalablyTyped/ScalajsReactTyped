package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamodbstreamsMod {
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbstreamsMod.AttributeValue]
  type AttributeName = java.lang.String
  type BinaryAttributeValue = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.dynamodbstreamsMod.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.dynamodbstreamsMod.ClientApiVersions
  type Date = js.Date
  type KeySchema = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH
    - typingsJapgolly.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typingsJapgolly.awsSdk.dynamodbstreamsMod._KeyType | java.lang.String
  type ListAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.AttributeValue]
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbstreamsMod.AttributeValue]
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INSERT
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFY
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type OperationType = typingsJapgolly.awsSdk.dynamodbstreamsMod._OperationType | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type RecordList = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.Record]
  type SequenceNumber = java.lang.String
  type ShardDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.Shard]
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsJapgolly.awsSdk.awsSdkStrings.LATEST
    - typingsJapgolly.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
    - java.lang.String
  */
  type ShardIteratorType = typingsJapgolly.awsSdk.dynamodbstreamsMod._ShardIteratorType | java.lang.String
  type StreamArn = java.lang.String
  type StreamList = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.Stream]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamStatus = typingsJapgolly.awsSdk.dynamodbstreamsMod._StreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_IMAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.OLD_IMAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typingsJapgolly.awsSdk.dynamodbstreamsMod._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbstreamsMod.StringAttributeValue]
  type TableName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-08-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.dynamodbstreamsMod._apiVersion | java.lang.String
}
