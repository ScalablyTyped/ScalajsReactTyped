package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lexmodelbuildingserviceMod {
  type AliasName = java.lang.String
  type AliasNameOrListAll = java.lang.String
  type Boolean = scala.Boolean
  type BotAliasMetadataList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.BotAliasMetadata]
  type BotChannelAssociationList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.BotChannelAssociation]
  type BotChannelName = java.lang.String
  type BotMetadataList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.BotMetadata]
  type BotName = java.lang.String
  type BotVersions = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Version]
  type BuiltinIntentMetadataList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.BuiltinIntentMetadata]
  type BuiltinIntentSignature = java.lang.String
  type BuiltinIntentSlotList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.BuiltinIntentSlot]
  type BuiltinSlotTypeMetadataList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.BuiltinSlotTypeMetadata]
  type BuiltinSlotTypeSignature = java.lang.String
  type ChannelConfigurationMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChannelStatus = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ChannelStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Facebook
    - typingsJapgolly.awsSdk.awsSdkStrings.Slack
    - typingsJapgolly.awsSdk.awsSdkStrings.`Twilio-Sms`
    - typingsJapgolly.awsSdk.awsSdkStrings.Kik_
    - java.lang.String
  */
  type ChannelType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ChannelType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.ClientApiVersions
  type ContentString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PlainText_
    - typingsJapgolly.awsSdk.awsSdkStrings.SSML
    - typingsJapgolly.awsSdk.awsSdkStrings.CustomPayload
    - java.lang.String
  */
  type ContentType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ContentType | java.lang.String
  type Count = scala.Double
  type CustomOrBuiltinSlotTypeName = java.lang.String
  type Description = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH_LOGS
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - java.lang.String
  */
  type Destination = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._Destination | java.lang.String
  type EnumerationValues = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.EnumerationValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ExportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALEXA_SKILLS_KIT
    - typingsJapgolly.awsSdk.awsSdkStrings.LEX
    - java.lang.String
  */
  type ExportType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ExportType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ReturnIntent
    - typingsJapgolly.awsSdk.awsSdkStrings.CodeHook
    - java.lang.String
  */
  type FulfillmentActivityType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._FulfillmentActivityType | java.lang.String
  type GroupNumber = scala.Double
  type IamRoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ImportStatus = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ImportStatus | java.lang.String
  type IntentList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Intent]
  type IntentMetadataList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.IntentMetadata]
  type IntentName = java.lang.String
  type IntentUtteranceList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Utterance]
  type KmsKeyArn = java.lang.String
  type LambdaARN = java.lang.String
  type ListOfUtterance = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.UtteranceData]
  type ListsOfUtterances = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.UtteranceList]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
    - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
    - java.lang.String
  */
  type Locale = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._Locale | java.lang.String
  type LocaleList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Locale]
  type LogSettingsRequestList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.LogSettingsRequest]
  type LogSettingsResponseList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.LogSettingsResponse]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUDIO
    - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
    - java.lang.String
  */
  type LogType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._LogType | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE_LATEST
    - typingsJapgolly.awsSdk.awsSdkStrings.FAIL_ON_CONFLICT
    - java.lang.String
  */
  type MergeStrategy = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._MergeStrategy | java.lang.String
  type MessageList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Message]
  type MessageVersion = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumericalVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_OBFUSCATION
    - java.lang.String
  */
  type ObfuscationSetting = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ObfuscationSetting | java.lang.String
  type Priority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SAVE
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
    - java.lang.String
  */
  type ProcessBehavior = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ProcessBehavior | java.lang.String
  type PromptMaxAttempts = scala.Double
  type RegexPattern = java.lang.String
  type ResourceArn = java.lang.String
  type ResourcePrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BOT
    - typingsJapgolly.awsSdk.awsSdkStrings.INTENT
    - typingsJapgolly.awsSdk.awsSdkStrings.SLOT_TYPE
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._ResourceType | java.lang.String
  type ResponseCard = java.lang.String
  type SessionTTL = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Required_
    - typingsJapgolly.awsSdk.awsSdkStrings.Optional_
    - java.lang.String
  */
  type SlotConstraint = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._SlotConstraint | java.lang.String
  type SlotList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Slot]
  type SlotName = java.lang.String
  type SlotTypeConfigurations = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.SlotTypeConfiguration]
  type SlotTypeMetadataList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.SlotTypeMetadata]
  type SlotTypeName = java.lang.String
  type SlotUtteranceList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Utterance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ORIGINAL_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.TOP_RESOLUTION
    - java.lang.String
  */
  type SlotValueSelectionStrategy = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._SlotValueSelectionStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_BASIC_TESTING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_BUILT
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Detected
    - typingsJapgolly.awsSdk.awsSdkStrings.Missed_
    - java.lang.String
  */
  type StatusType = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._StatusType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.String]
  type SynonymList = js.Array[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Value]
  type Timestamp = js.Date
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type UtteranceString = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-04-19`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.lexmodelbuildingserviceMod._apiVersion | java.lang.String
}
