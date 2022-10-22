package typingsJapgolly.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.BotLocaleName
import typingsJapgolly.awsSdk.awsSdkStrings.BotName
import typingsJapgolly.awsSdk.awsSdkStrings.ExportResourceType
import typingsJapgolly.awsSdk.awsSdkStrings.IntentName
import typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedDateTime
import typingsJapgolly.awsSdk.awsSdkStrings.Lex_
import typingsJapgolly.awsSdk.awsSdkStrings.SlotName
import typingsJapgolly.awsSdk.awsSdkStrings.UseSlotValuesAsCustomVocabulary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AggregatedUtterancesFilterName = typingsJapgolly.awsSdk.awsSdkStrings.Utterance | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type AggregatedUtterancesFilterOperator = _AggregatedUtterancesFilterOperator | java.lang.String

type AggregatedUtterancesFilters = js.Array[AggregatedUtterancesFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HitCount
  - typingsJapgolly.awsSdk.awsSdkStrings.MissedCount
  - java.lang.String
*/
type AggregatedUtterancesSortAttribute = _AggregatedUtterancesSortAttribute | java.lang.String

type AggregatedUtterancesSummaryList = js.Array[AggregatedUtterancesSummary]

type AmazonResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IntentId
  - typingsJapgolly.awsSdk.awsSdkStrings.SlotTypeId
  - java.lang.String
*/
type AssociatedTranscriptFilterName = _AssociatedTranscriptFilterName | java.lang.String

type AssociatedTranscriptFilters = js.Array[AssociatedTranscriptFilter]

type AssociatedTranscriptList = js.Array[AssociatedTranscript]

type AttachmentTitle = java.lang.String

type AttachmentUrl = java.lang.String

type AudioLogSettingsList = js.Array[AudioLogSetting]

type AudioRecognitionStrategy = UseSlotValuesAsCustomVocabulary | java.lang.String

type Boolean = scala.Boolean

type BotAliasHistoryEventsList = js.Array[BotAliasHistoryEvent]

type BotAliasId = java.lang.String

type BotAliasLocaleSettingsMap = StringDictionary[BotAliasLocaleSettings]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Available_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type BotAliasStatus = _BotAliasStatus | java.lang.String

type BotAliasSummaryList = js.Array[BotAliasSummary]

type BotFilterName = BotName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type BotFilterOperator = _BotFilterOperator | java.lang.String

type BotFilters = js.Array[BotFilter]

type BotLocaleFilterName = BotLocaleName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type BotLocaleFilterOperator = _BotLocaleFilterOperator | java.lang.String

type BotLocaleFilters = js.Array[BotLocaleFilter]

type BotLocaleHistoryEventDescription = java.lang.String

type BotLocaleHistoryEventsList = js.Array[BotLocaleHistoryEvent]

type BotLocaleSortAttribute = BotLocaleName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Building_
  - typingsJapgolly.awsSdk.awsSdkStrings.Built
  - typingsJapgolly.awsSdk.awsSdkStrings.ReadyExpressTesting
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotBuilt
  - typingsJapgolly.awsSdk.awsSdkStrings.Importing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
  - java.lang.String
*/
type BotLocaleStatus = _BotLocaleStatus | java.lang.String

type BotLocaleSummaryList = js.Array[BotLocaleSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
  - typingsJapgolly.awsSdk.awsSdkStrings.Downloading_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Available_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type BotRecommendationStatus = _BotRecommendationStatus | java.lang.String

type BotRecommendationSummaryList = js.Array[BotRecommendationSummary]

type BotSortAttribute = BotName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Available_
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Versioning
  - typingsJapgolly.awsSdk.awsSdkStrings.Importing_
  - java.lang.String
*/
type BotStatus = _BotStatus | java.lang.String

type BotSummaryList = js.Array[BotSummary]

type BotVersion = java.lang.String

type BotVersionLocaleSpecification = StringDictionary[BotVersionLocaleDetails]

type BotVersionSortAttribute = typingsJapgolly.awsSdk.awsSdkStrings.BotVersion | java.lang.String

type BotVersionSummaryList = js.Array[BotVersionSummary]

type BoxedBoolean = scala.Boolean

type BuiltInIntentSortAttribute = typingsJapgolly.awsSdk.awsSdkStrings.IntentSignature | java.lang.String

type BuiltInIntentSummaryList = js.Array[BuiltInIntentSummary]

type BuiltInOrCustomSlotTypeId = java.lang.String

type BuiltInSlotTypeSortAttribute = typingsJapgolly.awsSdk.awsSdkStrings.SlotTypeSignature | java.lang.String

type BuiltInSlotTypeSummaryList = js.Array[BuiltInSlotTypeSummary]

type BuiltInsMaxResults = Double

type ButtonText = java.lang.String

type ButtonValue = java.lang.String

type ButtonsList = js.Array[Button]

type ChildDirected = scala.Boolean

type CloudWatchLogGroupArn = java.lang.String

type CodeHookInterfaceVersion = java.lang.String

type ConditionExpression = java.lang.String

type ConditionKey = java.lang.String

type ConditionKeyValueMap = StringDictionary[ConditionValue]

type ConditionMap = StringDictionary[ConditionKeyValueMap]

type ConditionOperator = java.lang.String

type ConditionValue = java.lang.String

type ConditionalBranches = js.Array[ConditionalBranch]

type ConfidenceThreshold = Double

type ContextTimeToLiveInSeconds = Double

type ContextTurnsToLive = Double

type Count = Double

type CustomPayloadValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Exporting
  - typingsJapgolly.awsSdk.awsSdkStrings.Importing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - java.lang.String
*/
type CustomVocabularyStatus = _CustomVocabularyStatus | java.lang.String

type DTMFCharacter = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ElicitIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.StartIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.ElicitSlot
  - typingsJapgolly.awsSdk.awsSdkStrings.EvaluateConditional
  - typingsJapgolly.awsSdk.awsSdkStrings.InvokeDialogCodeHook
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfirmIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.FulfillIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.CloseIntent
  - typingsJapgolly.awsSdk.awsSdkStrings.EndConversation
  - java.lang.String
*/
type DialogActionType = _DialogActionType | java.lang.String

type DraftBotVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Allow_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deny_
  - java.lang.String
*/
type Effect = _Effect | java.lang.String

type ExportFilterName = ExportResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type ExportFilterOperator = _ExportFilterOperator | java.lang.String

type ExportFilters = js.Array[ExportFilter]

type ExportSortAttribute = LastUpdatedDateTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type ExportStatus = _ExportStatus | java.lang.String

type ExportSummaryList = js.Array[ExportSummary]

type FailureReason = java.lang.String

type FailureReasons = js.Array[FailureReason]

type FilePassword = java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[FilterValue]

type FulfillmentStartResponseDelay = Double

type FulfillmentTimeout = Double

type FulfillmentUpdateResponseFrequency = Double

type HitCount = Double

type Id = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LexJson
  - typingsJapgolly.awsSdk.awsSdkStrings.TSV
  - java.lang.String
*/
type ImportExportFileFormat = _ImportExportFileFormat | java.lang.String

type ImportExportFilePassword = java.lang.String

type ImportFilterName = typingsJapgolly.awsSdk.awsSdkStrings.ImportResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type ImportFilterOperator = _ImportFilterOperator | java.lang.String

type ImportFilters = js.Array[ImportFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Bot_
  - typingsJapgolly.awsSdk.awsSdkStrings.BotLocale
  - typingsJapgolly.awsSdk.awsSdkStrings.CustomVocabulary
  - java.lang.String
*/
type ImportResourceType = _ImportResourceType | java.lang.String

type ImportSortAttribute = LastUpdatedDateTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

type ImportSummaryList = js.Array[ImportSummary]

type ImportedResourceId = java.lang.String

type InputContextsList = js.Array[InputContext]

type IntentFilterName = IntentName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type IntentFilterOperator = _IntentFilterOperator | java.lang.String

type IntentFilters = js.Array[IntentFilter]

type IntentSignature = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IntentName
  - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedDateTime
  - java.lang.String
*/
type IntentSortAttribute = _IntentSortAttribute | java.lang.String

type IntentSummaryList = js.Array[IntentSummary]

type KendraIndexArn = java.lang.String

type KmsKeyArn = java.lang.String

type LambdaARN = java.lang.String

type LocaleId = java.lang.String

type LocaleName = java.lang.String

type LogPrefix = java.lang.String

type MaxResults = Double

type MaxUtteranceDigits = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Overwrite_
  - typingsJapgolly.awsSdk.awsSdkStrings.FailOnConflict
  - typingsJapgolly.awsSdk.awsSdkStrings.Append_
  - java.lang.String
*/
type MergeStrategy = _MergeStrategy | java.lang.String

type MessageGroupsList = js.Array[MessageGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Random_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ordered
  - java.lang.String
*/
type MessageSelectionStrategy = _MessageSelectionStrategy | java.lang.String

type MessageVariationsList = js.Array[Message]

type MissedCount = Double

type Name = java.lang.String

type NextIndex = Double

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

type NumericalBotVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.DefaultObfuscation
  - java.lang.String
*/
type ObfuscationSettingType = _ObfuscationSettingType | java.lang.String

type ObjectPrefix = java.lang.String

type ObjectPrefixes = js.Array[ObjectPrefix]

type Operation = java.lang.String

type OperationList = js.Array[Operation]

type OutputContextsList = js.Array[OutputContext]

type PlainTextMessageValue = java.lang.String

type Policy = java.lang.String

type PresignedS3Url = java.lang.String

type PrincipalArn = java.lang.String

type PrincipalList = js.Array[Principal]

type PriorityValue = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initial_
  - typingsJapgolly.awsSdk.awsSdkStrings.Retry1
  - typingsJapgolly.awsSdk.awsSdkStrings.Retry2
  - typingsJapgolly.awsSdk.awsSdkStrings.Retry3
  - typingsJapgolly.awsSdk.awsSdkStrings.Retry4
  - typingsJapgolly.awsSdk.awsSdkStrings.Retry5
  - java.lang.String
*/
type PromptAttempt = _PromptAttempt | java.lang.String

type PromptAttemptsSpecificationMap = StringDictionary[PromptAttemptSpecification]

type PromptMaxRetries = Double

type QueryFilterString = java.lang.String

type RecommendedAction = java.lang.String

type RecommendedActions = js.Array[RecommendedAction]

type RecommendedIntentSummaryList = js.Array[RecommendedIntentSummary]

type RegexPattern = java.lang.String

type ResourceCount = Double

type RevisionId = java.lang.String

type RoleArn = java.lang.String

type S3BucketArn = java.lang.String

type S3BucketName = java.lang.String

type S3ObjectPath = java.lang.String

type SSMLMessageValue = java.lang.String

type SampleUtterancesCount = Double

type SampleUtterancesList = js.Array[SampleUtterance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type SearchOrder = _SearchOrder | java.lang.String

type ServicePrincipal = java.lang.String

type SessionId = java.lang.String

type SessionTTL = Double

type SkipResourceInUseCheck = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Required_
  - typingsJapgolly.awsSdk.awsSdkStrings.Optional_
  - java.lang.String
*/
type SlotConstraint = _SlotConstraint | java.lang.String

type SlotDefaultValueList = js.Array[SlotDefaultValue]

type SlotDefaultValueString = java.lang.String

type SlotFilterName = SlotName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type SlotFilterOperator = _SlotFilterOperator | java.lang.String

type SlotFilters = js.Array[SlotFilter]

type SlotPrioritiesList = js.Array[SlotPriority]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Scalar
  - typingsJapgolly.awsSdk.awsSdkStrings.List_
  - java.lang.String
*/
type SlotShape = _SlotShape | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SlotName
  - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedDateTime
  - java.lang.String
*/
type SlotSortAttribute = _SlotSortAttribute | java.lang.String

type SlotSummaryList = js.Array[SlotSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Custom_
  - typingsJapgolly.awsSdk.awsSdkStrings.Extended_
  - typingsJapgolly.awsSdk.awsSdkStrings.ExternalGrammar
  - typingsJapgolly.awsSdk.awsSdkStrings.Composite
  - java.lang.String
*/
type SlotTypeCategory = _SlotTypeCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SlotTypeName
  - typingsJapgolly.awsSdk.awsSdkStrings.ExternalSourceType
  - java.lang.String
*/
type SlotTypeFilterName = _SlotTypeFilterName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type SlotTypeFilterOperator = _SlotTypeFilterOperator | java.lang.String

type SlotTypeFilters = js.Array[SlotTypeFilter]

type SlotTypeSignature = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SlotTypeName
  - typingsJapgolly.awsSdk.awsSdkStrings.LastUpdatedDateTime
  - java.lang.String
*/
type SlotTypeSortAttribute = _SlotTypeSortAttribute | java.lang.String

type SlotTypeSummaryList = js.Array[SlotTypeSummary]

type SlotTypeValues = js.Array[SlotTypeValue]

type SlotValueOverrideMap = StringDictionary[SlotValueOverride]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OriginalValue
  - typingsJapgolly.awsSdk.awsSdkStrings.TopResolution
  - typingsJapgolly.awsSdk.awsSdkStrings.Concatenation
  - java.lang.String
*/
type SlotValueResolutionStrategy = _SlotValueResolutionStrategy | java.lang.String

type SlotValues = js.Array[SlotValueOverride]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type StillWaitingResponseFrequency = Double

type StillWaitingResponseTimeout = Double

type String = java.lang.String

type StringMap = StringDictionary[String]

type SubSlotExpression = java.lang.String

type SubSlotSpecificationMap = StringDictionary[Specifications]

type SubSlotTypeList = js.Array[SubSlotTypeComposition]

type SynonymList = js.Array[SampleValue]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TextLogSettingsList = js.Array[TextLogSetting]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Hours_
  - typingsJapgolly.awsSdk.awsSdkStrings.Days_
  - typingsJapgolly.awsSdk.awsSdkStrings.Weeks_
  - java.lang.String
*/
type TimeDimension = _TimeDimension | java.lang.String

type TimeInMilliSeconds = Double

type TimeValue = Double

type Timestamp = js.Date

type Transcript = java.lang.String

type TranscriptFormat = Lex_ | java.lang.String

type Utterance = java.lang.String

type Value = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.standard__
  - typingsJapgolly.awsSdk.awsSdkStrings.neural
  - java.lang.String
*/
type VoiceEngine = _VoiceEngine | java.lang.String

type VoiceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-08-07`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
