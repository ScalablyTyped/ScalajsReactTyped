package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lexruntimeMod {
  type Accept = java.lang.String
  type AttributesString = java.lang.String
  type BlobStream = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.lexruntimeMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type BotAlias = java.lang.String
  type BotName = java.lang.String
  type ButtonTextStringWithLength = java.lang.String
  type ButtonValueStringWithLength = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.lexruntimeMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.Confirmed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Denied_
    - java.lang.String
  */
  type ConfirmationStatus = typingsJapgolly.awsSdk.lexruntimeMod._ConfirmationStatus | java.lang.String
  type ContentType = typingsJapgolly.awsSdk.awsSdkStrings.applicationSlashvndDotamazonawsDotcardDotgeneric | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ElicitIntent
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfirmIntent
    - typingsJapgolly.awsSdk.awsSdkStrings.ElicitSlot
    - typingsJapgolly.awsSdk.awsSdkStrings.Close
    - typingsJapgolly.awsSdk.awsSdkStrings.Delegate
    - java.lang.String
  */
  type DialogActionType = typingsJapgolly.awsSdk.lexruntimeMod._DialogActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ElicitIntent
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfirmIntent
    - typingsJapgolly.awsSdk.awsSdkStrings.ElicitSlot
    - typingsJapgolly.awsSdk.awsSdkStrings.Fulfilled_
    - typingsJapgolly.awsSdk.awsSdkStrings.ReadyForFulfillment
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DialogState = typingsJapgolly.awsSdk.lexruntimeMod._DialogState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Fulfilled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.ReadyForFulfillment
    - java.lang.String
  */
  type FulfillmentState = typingsJapgolly.awsSdk.lexruntimeMod._FulfillmentState | java.lang.String
  type HttpContentType = java.lang.String
  type IntentName = java.lang.String
  type IntentSummaryCheckpointLabel = java.lang.String
  type IntentSummaryList = js.Array[typingsJapgolly.awsSdk.lexruntimeMod.IntentSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PlainText_
    - typingsJapgolly.awsSdk.awsSdkStrings.CustomPayload
    - typingsJapgolly.awsSdk.awsSdkStrings.SSML
    - typingsJapgolly.awsSdk.awsSdkStrings.Composite
    - java.lang.String
  */
  type MessageFormatType = typingsJapgolly.awsSdk.lexruntimeMod._MessageFormatType | java.lang.String
  type SentimentLabel = java.lang.String
  type SentimentScore = java.lang.String
  type String = java.lang.String
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.lexruntimeMod.String]
  type StringUrlWithLength = java.lang.String
  type StringWithLength = java.lang.String
  type Text = java.lang.String
  type UserId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.lexruntimeMod._apiVersion | java.lang.String
  type genericAttachmentList = js.Array[typingsJapgolly.awsSdk.lexruntimeMod.GenericAttachment]
  type listOfButtons = js.Array[typingsJapgolly.awsSdk.lexruntimeMod.Button]
}
