package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snsMod {
  type ActionsList = js.Array[typingsJapgolly.awsSdk.snsMod.action]
  type AmazonResourceName = java.lang.String
  type Binary = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.snsMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.snsMod.ClientApiVersions
  type DelegatesList = js.Array[typingsJapgolly.awsSdk.snsMod.delegate]
  type ListOfEndpoints = js.Array[typingsJapgolly.awsSdk.snsMod.Endpoint_]
  type ListOfPlatformApplications = js.Array[typingsJapgolly.awsSdk.snsMod.PlatformApplication]
  type ListString = js.Array[typingsJapgolly.awsSdk.snsMod.String]
  type MapStringToString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.snsMod.String]
  type MessageAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.snsMod.MessageAttributeValue]
  type PhoneNumber = java.lang.String
  type PhoneNumberList = js.Array[typingsJapgolly.awsSdk.snsMod.PhoneNumber]
  type String = java.lang.String
  type SubscriptionAttributesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.snsMod.attributeValue]
  type SubscriptionsList = js.Array[typingsJapgolly.awsSdk.snsMod.Subscription]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.snsMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.snsMod.Tag]
  type TagValue = java.lang.String
  type TopicAttributesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.snsMod.attributeValue]
  type TopicsList = js.Array[typingsJapgolly.awsSdk.snsMod.Topic]
  type account = java.lang.String
  type action = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2010-03-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.snsMod._apiVersion | java.lang.String
  type attributeName = java.lang.String
  type attributeValue = java.lang.String
  type authenticateOnUnsubscribe = java.lang.String
  type delegate = java.lang.String
  type endpoint = java.lang.String
  type label = java.lang.String
  type message = java.lang.String
  type messageId = java.lang.String
  type messageStructure = java.lang.String
  type nextToken = java.lang.String
  type protocol = java.lang.String
  type subject = java.lang.String
  type subscriptionARN = java.lang.String
  type token = java.lang.String
  type topicARN = java.lang.String
  type topicName = java.lang.String
}
