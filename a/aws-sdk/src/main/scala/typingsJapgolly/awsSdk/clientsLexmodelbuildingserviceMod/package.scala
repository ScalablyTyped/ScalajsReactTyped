package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AliasName = java.lang.String

type AliasNameOrListAll = java.lang.String

type AmazonResourceName = java.lang.String

type Boolean = scala.Boolean

type BotAliasMetadataList = js.Array[BotAliasMetadata]

type BotChannelAssociationList = js.Array[BotChannelAssociation]

type BotChannelName = java.lang.String

type BotMetadataList = js.Array[BotMetadata]

type BotName = java.lang.String

type BotVersions = js.Array[Version]

type BuiltinIntentMetadataList = js.Array[BuiltinIntentMetadata]

type BuiltinIntentSignature = java.lang.String

type BuiltinIntentSlotList = js.Array[BuiltinIntentSlot]

type BuiltinSlotTypeMetadataList = js.Array[BuiltinSlotTypeMetadata]

type BuiltinSlotTypeSignature = java.lang.String

type ChannelConfigurationMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ChannelStatus = _ChannelStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Facebook
  - typingsJapgolly.awsSdk.awsSdkStrings.Slack_
  - typingsJapgolly.awsSdk.awsSdkStrings.`Twilio-Sms`
  - typingsJapgolly.awsSdk.awsSdkStrings.Kik_
  - java.lang.String
*/
type ChannelType = _ChannelType | java.lang.String

type ConfidenceThreshold = Double

type ContentString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PlainText_
  - typingsJapgolly.awsSdk.awsSdkStrings.SSML
  - typingsJapgolly.awsSdk.awsSdkStrings.CustomPayload
  - java.lang.String
*/
type ContentType = _ContentType | java.lang.String

type ContextTimeToLiveInSeconds = Double

type ContextTurnsToLive = Double

type Count = Double

type CustomOrBuiltinSlotTypeName = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH_LOGS
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type Destination = _Destination | java.lang.String

type EnumerationValues = js.Array[EnumerationValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ExportStatus = _ExportStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALEXA_SKILLS_KIT
  - typingsJapgolly.awsSdk.awsSdkStrings.LEX
  - java.lang.String
*/
type ExportType = _ExportType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ReturnIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.CodeHook
  - java.lang.String
*/
type FulfillmentActivityType = _FulfillmentActivityType | java.lang.String

type GroupNumber = Double

type IamRoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

type InputContextList = js.Array[InputContext]

type InputContextName = java.lang.String

type IntentList = js.Array[Intent]

type IntentMetadataList = js.Array[IntentMetadata]

type IntentName = java.lang.String

type IntentUtteranceList = js.Array[Utterance]

type KendraIndexArn = java.lang.String

type KmsKeyArn = java.lang.String

type LambdaARN = java.lang.String

type ListOfUtterance = js.Array[UtteranceData]

type ListsOfUtterances = js.Array[UtteranceList]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-419`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-ES`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
  - java.lang.String
*/
type Locale = _Locale | java.lang.String

type LocaleList = js.Array[Locale]

type LogSettingsRequestList = js.Array[LogSettingsRequest]

type LogSettingsResponseList = js.Array[LogSettingsResponse]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUDIO
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE_LATEST
  - typingsJapgolly.awsSdk.awsSdkStrings.FAIL_ON_CONFLICT
  - java.lang.String
*/
type MergeStrategy = _MergeStrategy | java.lang.String

type MessageList = js.Array[Message]

type MessageVersion = java.lang.String

type MigrationAlertDetail = java.lang.String

type MigrationAlertDetails = js.Array[MigrationAlertDetail]

type MigrationAlertMessage = java.lang.String

type MigrationAlertReferenceURL = java.lang.String

type MigrationAlertReferenceURLs = js.Array[MigrationAlertReferenceURL]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN
  - java.lang.String
*/
type MigrationAlertType = _MigrationAlertType | java.lang.String

type MigrationAlerts = js.Array[MigrationAlert]

type MigrationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.V1_BOT_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.MIGRATION_DATE_TIME
  - java.lang.String
*/
type MigrationSortAttribute = _MigrationSortAttribute | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type MigrationStatus = _MigrationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_EXISTING
  - java.lang.String
*/
type MigrationStrategy = _MigrationStrategy | java.lang.String

type MigrationSummaryList = js.Array[MigrationSummary]

type Name = java.lang.String

type NextToken = java.lang.String

type NumericalVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_OBFUSCATION
  - java.lang.String
*/
type ObfuscationSetting = _ObfuscationSetting | java.lang.String

type OutputContextList = js.Array[OutputContext]

type OutputContextName = java.lang.String

type Priority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAVE
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
  - java.lang.String
*/
type ProcessBehavior = _ProcessBehavior | java.lang.String

type PromptMaxAttempts = Double

type QueryFilterString = java.lang.String

type RegexPattern = java.lang.String

type ResourceArn = java.lang.String

type ResourcePrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BOT
  - typingsJapgolly.awsSdk.awsSdkStrings.INTENT
  - typingsJapgolly.awsSdk.awsSdkStrings.SLOT_TYPE
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type ResponseCard = java.lang.String

type SessionTTL = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Required_
  - typingsJapgolly.awsSdk.awsSdkStrings.Optional_
  - java.lang.String
*/
type SlotConstraint = _SlotConstraint | java.lang.String

type SlotDefaultValueList = js.Array[SlotDefaultValue]

type SlotDefaultValueString = java.lang.String

type SlotList = js.Array[Slot]

type SlotName = java.lang.String

type SlotTypeConfigurations = js.Array[SlotTypeConfiguration]

type SlotTypeMetadataList = js.Array[SlotTypeMetadata]

type SlotTypeName = java.lang.String

type SlotUtteranceList = js.Array[Utterance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ORIGINAL_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.TOP_RESOLUTION
  - java.lang.String
*/
type SlotValueSelectionStrategy = _SlotValueSelectionStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_BASIC_TESTING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_BUILT
  - java.lang.String
*/
type Status = _Status | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Detected
  - typingsJapgolly.awsSdk.awsSdkStrings.Missed_
  - java.lang.String
*/
type StatusType = _StatusType | java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SynonymList = js.Array[Value]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type UserId = java.lang.String

type Utterance = java.lang.String

type UtteranceString = java.lang.String

type V2BotId = java.lang.String

type V2BotName = java.lang.String

type Value = java.lang.String

type Version = java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-04-19`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type roleArn = java.lang.String
