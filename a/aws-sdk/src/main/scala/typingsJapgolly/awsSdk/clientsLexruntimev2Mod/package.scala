package typingsJapgolly.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveContextName = java.lang.String

type ActiveContextParametersMap = StringDictionary[Text]

type ActiveContextTimeToLiveInSeconds = scala.Double

type ActiveContextTurnsToLive = scala.Double

type ActiveContextsList = js.Array[ActiveContext]

type AttachmentTitle = java.lang.String

type AttachmentUrl = java.lang.String

type BlobStream = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type BotAliasIdentifier = java.lang.String

type BotIdentifier = java.lang.String

type ButtonText = java.lang.String

type ButtonValue = java.lang.String

type ButtonsList = js.Array[Button]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Confirmed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Denied_
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type ConfirmationState = _ConfirmationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Close_
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfirmIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.Delegate
  - typingsJapgolly.awsSdk.awsSdkStrings.ElicitIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.ElicitSlot
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type DialogActionType = _DialogActionType | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Fulfilled_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.ReadyForFulfillment
  - typingsJapgolly.awsSdk.awsSdkStrings.Waiting_
  - typingsJapgolly.awsSdk.awsSdkStrings.FulfillmentInProgress
  - java.lang.String
*/
type IntentState = _IntentState | java.lang.String

type Interpretations = js.Array[Interpretation]

type LocaleId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CustomPayload
  - typingsJapgolly.awsSdk.awsSdkStrings.ImageResponseCard
  - typingsJapgolly.awsSdk.awsSdkStrings.PlainText_
  - typingsJapgolly.awsSdk.awsSdkStrings.SSML
  - java.lang.String
*/
type MessageContentType = _MessageContentType | java.lang.String

type Messages = js.Array[Message]

type Name = java.lang.String

type NonEmptyString = java.lang.String

type ParameterName = java.lang.String

type RuntimeHintPhrase = java.lang.String

type RuntimeHintValuesList = js.Array[RuntimeHintValue]

type SensitiveNonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MIXED
  - typingsJapgolly.awsSdk.awsSdkStrings.NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NEUTRAL
  - typingsJapgolly.awsSdk.awsSdkStrings.POSITIVE
  - java.lang.String
*/
type SentimentType = _SentimentType | java.lang.String

type SessionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Scalar
  - typingsJapgolly.awsSdk.awsSdkStrings.List_
  - typingsJapgolly.awsSdk.awsSdkStrings.Composite
  - java.lang.String
*/
type Shape = _Shape | java.lang.String

type SlotHintsIntentMap = StringDictionary[SlotHintsSlotMap]

type SlotHintsSlotMap = StringDictionary[RuntimeHintDetails]

type Slots = StringDictionary[Slot]

type String = java.lang.String

type StringList = js.Array[NonEmptyString]

type StringMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Default_
  - typingsJapgolly.awsSdk.awsSdkStrings.SpellByLetter
  - typingsJapgolly.awsSdk.awsSdkStrings.SpellByWord
  - java.lang.String
*/
type StyleType = _StyleType | java.lang.String

type Text = java.lang.String

type Values = js.Array[Slot]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-08-07`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
