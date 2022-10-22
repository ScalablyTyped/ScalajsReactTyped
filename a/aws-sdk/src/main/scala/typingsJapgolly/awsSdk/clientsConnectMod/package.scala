package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.KMS
import typingsJapgolly.awsSdk.awsSdkStrings.LT
import typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AfterContactWorkTimeLimit = Double

type AgentContactReferenceList = js.Array[AgentContactReference]

type AgentFirstName = java.lang.String

type AgentLastName = java.lang.String

type AgentResourceId = java.lang.String

type AgentStatusDescription = java.lang.String

type AgentStatusId = java.lang.String

type AgentStatusName = java.lang.String

type AgentStatusOrderNumber = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AgentStatusState = _AgentStatusState | java.lang.String

type AgentStatusSummaryList = js.Array[AgentStatusSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROUTABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
  - java.lang.String
*/
type AgentStatusType = _AgentStatusType | java.lang.String

type AgentStatusTypes = js.Array[AgentStatusType]

type AgentUsername = java.lang.String

type AliasArn = java.lang.String

type ApproximateTotalCount = Double

type AssociationId = java.lang.String

type AttributeName = java.lang.String

type AttributeValue = java.lang.String

type Attributes = StringDictionary[AttributeValue]

type AttributesList = js.Array[Attribute]

type AutoAccept = scala.Boolean

type AvailableNumbersList = js.Array[AvailableNumberSummary]

type Boolean = scala.Boolean

type BotName = java.lang.String

type BucketName = java.lang.String

type CampaignId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE
  - typingsJapgolly.awsSdk.awsSdkStrings.CHAT
  - typingsJapgolly.awsSdk.awsSdkStrings.TASK
  - java.lang.String
*/
type Channel = _Channel | java.lang.String

type ChannelToCountMap = StringDictionary[IntegerCount]

type Channels = js.Array[Channel]

type ChatContent = java.lang.String

type ChatContentType = java.lang.String

type ChatDurationInMinutes = Double

type ChatStreamingEndpointARN = java.lang.String

type ClientToken = java.lang.String

type CommonNameLength127 = java.lang.String

type Comparison = LT | java.lang.String

type Concurrency = Double

type ContactFlowContent = java.lang.String

type ContactFlowDescription = java.lang.String

type ContactFlowId = java.lang.String

type ContactFlowModuleContent = java.lang.String

type ContactFlowModuleDescription = java.lang.String

type ContactFlowModuleId = java.lang.String

type ContactFlowModuleName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type ContactFlowModuleState = _ContactFlowModuleState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHED
  - typingsJapgolly.awsSdk.awsSdkStrings.SAVED
  - java.lang.String
*/
type ContactFlowModuleStatus = _ContactFlowModuleStatus | java.lang.String

type ContactFlowModulesSummaryList = js.Array[ContactFlowModuleSummary]

type ContactFlowName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type ContactFlowState = _ContactFlowState | java.lang.String

type ContactFlowSummaryList = js.Array[ContactFlowSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_FLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_QUEUE
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_HOLD
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_WHISPER
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_HOLD
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_WHISPER
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTBOUND_WHISPER
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_TRANSFER
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE_TRANSFER
  - java.lang.String
*/
type ContactFlowType = _ContactFlowType | java.lang.String

type ContactFlowTypes = js.Array[ContactFlowType]

type ContactId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INBOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTBOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFER
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE_TRANSFER
  - typingsJapgolly.awsSdk.awsSdkStrings.CALLBACK
  - typingsJapgolly.awsSdk.awsSdkStrings.API
  - java.lang.String
*/
type ContactInitiationMethod = _ContactInitiationMethod | java.lang.String

type ContactReferences = StringDictionary[Reference]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INCOMING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTING
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED_ONHOLD
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.ENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type ContactState = _ContactState | java.lang.String

type ContactStates = js.Array[ContactState]

type CurrentMetricDataCollections = js.Array[CurrentMetricData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ONLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ON_CALL
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_NON_PRODUCTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_AFTER_CONTACT_WORK
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_STAFFED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_IN_QUEUE
  - typingsJapgolly.awsSdk.awsSdkStrings.OLDEST_CONTACT_AGE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ON_CONTACT
  - typingsJapgolly.awsSdk.awsSdkStrings.SLOTS_ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.SLOTS_AVAILABLE
  - java.lang.String
*/
type CurrentMetricName = _CurrentMetricName | java.lang.String

type CurrentMetricResults = js.Array[CurrentMetricResult]

type CurrentMetrics = js.Array[CurrentMetric]

type DefaultVocabularyList = js.Array[DefaultVocabulary]

type Delay = Double

type Description = java.lang.String

type DirectoryAlias = java.lang.String

type DirectoryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECT_MANAGED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXISTING_DIRECTORY
  - java.lang.String
*/
type DirectoryType = _DirectoryType | java.lang.String

type DirectoryUserId = java.lang.String

type DisplayName = java.lang.String

type Email = java.lang.String

type EncryptionType = KMS | java.lang.String

type FunctionArn = java.lang.String

type FunctionArnsList = js.Array[FunctionArn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANNEL
  - java.lang.String
*/
type Grouping = _Grouping | java.lang.String

type Groupings = js.Array[Grouping]

type HierarchyGroupId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXACT
  - typingsJapgolly.awsSdk.awsSdkStrings.WITH_CHILD_GROUPS
  - java.lang.String
*/
type HierarchyGroupMatchType = _HierarchyGroupMatchType | java.lang.String

type HierarchyGroupName = java.lang.String

type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]

type HierarchyLevelId = java.lang.String

type HierarchyLevelName = java.lang.String

type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HANDLED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_ABANDONED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_CONSULTED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HANDLED_INCOMING
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HANDLED_OUTBOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HOLD_ABANDONS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_MISSED
  - typingsJapgolly.awsSdk.awsSdkStrings.CALLBACK_CONTACTS_HANDLED
  - typingsJapgolly.awsSdk.awsSdkStrings.API_CONTACTS_HANDLED
  - typingsJapgolly.awsSdk.awsSdkStrings.OCCUPANCY
  - typingsJapgolly.awsSdk.awsSdkStrings.HANDLE_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_CONTACT_WORK_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.ABANDON_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE_ANSWER_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.HOLD_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTION_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTION_AND_HOLD_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_LEVEL
  - java.lang.String
*/
type HistoricalMetricName = _HistoricalMetricName | java.lang.String

type HistoricalMetricResults = js.Array[HistoricalMetricResult]

type HistoricalMetrics = js.Array[HistoricalMetric]

type Hours = Double

type Hours24Format = Double

type HoursOfOperationConfigList = js.Array[HoursOfOperationConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUNDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.MONDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.TUESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEDNESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.THURSDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.FRIDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type HoursOfOperationDays = _HoursOfOperationDays | java.lang.String

type HoursOfOperationDescription = java.lang.String

type HoursOfOperationId = java.lang.String

type HoursOfOperationName = java.lang.String

type HoursOfOperationSummaryList = js.Array[HoursOfOperationSummary]

type InboundCallsEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INBOUND_CALLS
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTBOUND_CALLS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTFLOW_LOGS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_LENS
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_RESOLVE_BEST_VOICES
  - typingsJapgolly.awsSdk.awsSdkStrings.USE_CUSTOM_TTS_VOICES
  - typingsJapgolly.awsSdk.awsSdkStrings.EARLY_MEDIA
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_PARTY_CONFERENCE
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH_VOLUME_OUTBOUND
  - java.lang.String
*/
type InstanceAttributeType = _InstanceAttributeType | java.lang.String

type InstanceAttributeValue = java.lang.String

type InstanceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | java.lang.String

type InstanceStorageConfigs = js.Array[InstanceStorageConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CHAT_TRANSCRIPTS
  - typingsJapgolly.awsSdk.awsSdkStrings.CALL_RECORDINGS
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED_REPORTS
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIA_STREAMS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_TRACE_RECORDS
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_EVENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
  - java.lang.String
*/
type InstanceStorageResourceType = _InstanceStorageResourceType | java.lang.String

type InstanceSummaryList = js.Array[InstanceSummary]

type IntegerCount = Double

type IntegrationAssociationId = java.lang.String

type IntegrationAssociationSummaryList = js.Array[IntegrationAssociationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.PINPOINT_APP
  - typingsJapgolly.awsSdk.awsSdkStrings.WISDOM_ASSISTANT
  - typingsJapgolly.awsSdk.awsSdkStrings.WISDOM_KNOWLEDGE_BASE
  - typingsJapgolly.awsSdk.awsSdkStrings.CASES_DOMAIN
  - java.lang.String
*/
type IntegrationType = _IntegrationType | java.lang.String

type InvisibleTaskTemplateFields = js.Array[InvisibleFieldInfo]

type KeyId = java.lang.String

type LargeNextToken = java.lang.String

type LexBotConfigList = js.Array[LexBotConfig]

type LexBotsList = js.Array[LexBot]

type LexRegion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.V1
  - typingsJapgolly.awsSdk.awsSdkStrings.V2
  - java.lang.String
*/
type LexVersion = _LexVersion | java.lang.String

type ListPhoneNumbersSummaryList = js.Array[ListPhoneNumbersSummary]

type Long = Double

type MaxResult10 = Double

type MaxResult100 = Double

type MaxResult1000 = Double

type MaxResult2 = Double

type MaxResult25 = Double

type MaxResult7 = Double

type MediaConcurrencies = js.Array[MediaConcurrency]

type MinutesLimit60 = Double

type Name = java.lang.String

type NextToken = java.lang.String

type NextToken2500 = java.lang.String

type Origin = java.lang.String

type OriginsList = js.Array[Origin]

type OutboundCallerIdName = java.lang.String

type OutboundCallsEnabled = scala.Boolean

type PEM = java.lang.String

type ParticipantId = java.lang.String

type ParticipantToken = java.lang.String

type Password = java.lang.String

type PermissionsList = js.Array[SecurityProfilePermission]

type PhoneNumber = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AF
  - typingsJapgolly.awsSdk.awsSdkStrings.AL
  - typingsJapgolly.awsSdk.awsSdkStrings.DZ
  - typingsJapgolly.awsSdk.awsSdkStrings.AS
  - typingsJapgolly.awsSdk.awsSdkStrings.AD
  - typingsJapgolly.awsSdk.awsSdkStrings.AO
  - typingsJapgolly.awsSdk.awsSdkStrings.AI
  - typingsJapgolly.awsSdk.awsSdkStrings.AQ
  - typingsJapgolly.awsSdk.awsSdkStrings.AG
  - typingsJapgolly.awsSdk.awsSdkStrings.AR
  - typingsJapgolly.awsSdk.awsSdkStrings.AM
  - typingsJapgolly.awsSdk.awsSdkStrings.AW
  - typingsJapgolly.awsSdk.awsSdkStrings.AU
  - typingsJapgolly.awsSdk.awsSdkStrings.AT
  - typingsJapgolly.awsSdk.awsSdkStrings.AZ
  - typingsJapgolly.awsSdk.awsSdkStrings.BS
  - typingsJapgolly.awsSdk.awsSdkStrings.BH
  - typingsJapgolly.awsSdk.awsSdkStrings.BD
  - typingsJapgolly.awsSdk.awsSdkStrings.BB
  - typingsJapgolly.awsSdk.awsSdkStrings.BY
  - typingsJapgolly.awsSdk.awsSdkStrings.BE
  - typingsJapgolly.awsSdk.awsSdkStrings.BZ
  - typingsJapgolly.awsSdk.awsSdkStrings.BJ
  - typingsJapgolly.awsSdk.awsSdkStrings.BM
  - typingsJapgolly.awsSdk.awsSdkStrings.BT
  - typingsJapgolly.awsSdk.awsSdkStrings.BO
  - typingsJapgolly.awsSdk.awsSdkStrings.BA
  - typingsJapgolly.awsSdk.awsSdkStrings.BW
  - typingsJapgolly.awsSdk.awsSdkStrings.BR
  - typingsJapgolly.awsSdk.awsSdkStrings.IO
  - typingsJapgolly.awsSdk.awsSdkStrings.VG
  - typingsJapgolly.awsSdk.awsSdkStrings.BN
  - typingsJapgolly.awsSdk.awsSdkStrings.BG
  - typingsJapgolly.awsSdk.awsSdkStrings.BF
  - typingsJapgolly.awsSdk.awsSdkStrings.BI
  - typingsJapgolly.awsSdk.awsSdkStrings.KH
  - typingsJapgolly.awsSdk.awsSdkStrings.CM
  - typingsJapgolly.awsSdk.awsSdkStrings.CA
  - typingsJapgolly.awsSdk.awsSdkStrings.CV
  - typingsJapgolly.awsSdk.awsSdkStrings.KY
  - typingsJapgolly.awsSdk.awsSdkStrings.CF
  - typingsJapgolly.awsSdk.awsSdkStrings.TD
  - typingsJapgolly.awsSdk.awsSdkStrings.CL
  - typingsJapgolly.awsSdk.awsSdkStrings.CN
  - typingsJapgolly.awsSdk.awsSdkStrings.CX
  - typingsJapgolly.awsSdk.awsSdkStrings.CC
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.KM
  - typingsJapgolly.awsSdk.awsSdkStrings.CK
  - typingsJapgolly.awsSdk.awsSdkStrings.CR
  - typingsJapgolly.awsSdk.awsSdkStrings.HR
  - typingsJapgolly.awsSdk.awsSdkStrings.CU
  - typingsJapgolly.awsSdk.awsSdkStrings.CW
  - typingsJapgolly.awsSdk.awsSdkStrings.CY
  - typingsJapgolly.awsSdk.awsSdkStrings.CZ
  - typingsJapgolly.awsSdk.awsSdkStrings.CD
  - typingsJapgolly.awsSdk.awsSdkStrings.DK
  - typingsJapgolly.awsSdk.awsSdkStrings.DJ
  - typingsJapgolly.awsSdk.awsSdkStrings.DM
  - typingsJapgolly.awsSdk.awsSdkStrings.DO
  - typingsJapgolly.awsSdk.awsSdkStrings.TL
  - typingsJapgolly.awsSdk.awsSdkStrings.EC
  - typingsJapgolly.awsSdk.awsSdkStrings.EG
  - typingsJapgolly.awsSdk.awsSdkStrings.SV
  - typingsJapgolly.awsSdk.awsSdkStrings.GQ
  - typingsJapgolly.awsSdk.awsSdkStrings.ER
  - typingsJapgolly.awsSdk.awsSdkStrings.EE
  - typingsJapgolly.awsSdk.awsSdkStrings.ET
  - typingsJapgolly.awsSdk.awsSdkStrings.FK
  - typingsJapgolly.awsSdk.awsSdkStrings.FO
  - typingsJapgolly.awsSdk.awsSdkStrings.FJ
  - typingsJapgolly.awsSdk.awsSdkStrings.FI
  - typingsJapgolly.awsSdk.awsSdkStrings.FR
  - typingsJapgolly.awsSdk.awsSdkStrings.PF
  - typingsJapgolly.awsSdk.awsSdkStrings.GA
  - typingsJapgolly.awsSdk.awsSdkStrings.GM
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.DE
  - typingsJapgolly.awsSdk.awsSdkStrings.GH
  - typingsJapgolly.awsSdk.awsSdkStrings.GI
  - typingsJapgolly.awsSdk.awsSdkStrings.GR
  - typingsJapgolly.awsSdk.awsSdkStrings.GL
  - typingsJapgolly.awsSdk.awsSdkStrings.GD
  - typingsJapgolly.awsSdk.awsSdkStrings.GU
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.GG
  - typingsJapgolly.awsSdk.awsSdkStrings.GN
  - typingsJapgolly.awsSdk.awsSdkStrings.GW
  - typingsJapgolly.awsSdk.awsSdkStrings.GY
  - typingsJapgolly.awsSdk.awsSdkStrings.HT
  - typingsJapgolly.awsSdk.awsSdkStrings.HN
  - typingsJapgolly.awsSdk.awsSdkStrings.HK
  - typingsJapgolly.awsSdk.awsSdkStrings.HU
  - typingsJapgolly.awsSdk.awsSdkStrings.IS
  - typingsJapgolly.awsSdk.awsSdkStrings.IN
  - typingsJapgolly.awsSdk.awsSdkStrings.ID
  - typingsJapgolly.awsSdk.awsSdkStrings.IR
  - typingsJapgolly.awsSdk.awsSdkStrings.IQ
  - typingsJapgolly.awsSdk.awsSdkStrings.IE
  - typingsJapgolly.awsSdk.awsSdkStrings.IM
  - typingsJapgolly.awsSdk.awsSdkStrings.IL
  - typingsJapgolly.awsSdk.awsSdkStrings.IT
  - typingsJapgolly.awsSdk.awsSdkStrings.CI
  - typingsJapgolly.awsSdk.awsSdkStrings.JM
  - typingsJapgolly.awsSdk.awsSdkStrings.JP
  - typingsJapgolly.awsSdk.awsSdkStrings.JE
  - typingsJapgolly.awsSdk.awsSdkStrings.JO
  - typingsJapgolly.awsSdk.awsSdkStrings.KZ
  - typingsJapgolly.awsSdk.awsSdkStrings.KE
  - typingsJapgolly.awsSdk.awsSdkStrings.KI
  - typingsJapgolly.awsSdk.awsSdkStrings.KW
  - typingsJapgolly.awsSdk.awsSdkStrings.KG
  - typingsJapgolly.awsSdk.awsSdkStrings.LA
  - typingsJapgolly.awsSdk.awsSdkStrings.LV
  - typingsJapgolly.awsSdk.awsSdkStrings.LB
  - typingsJapgolly.awsSdk.awsSdkStrings.LS
  - typingsJapgolly.awsSdk.awsSdkStrings.LR
  - typingsJapgolly.awsSdk.awsSdkStrings.LY
  - typingsJapgolly.awsSdk.awsSdkStrings.LI
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.LU
  - typingsJapgolly.awsSdk.awsSdkStrings.MO
  - typingsJapgolly.awsSdk.awsSdkStrings.MK
  - typingsJapgolly.awsSdk.awsSdkStrings.MG
  - typingsJapgolly.awsSdk.awsSdkStrings.MW
  - typingsJapgolly.awsSdk.awsSdkStrings.MY
  - typingsJapgolly.awsSdk.awsSdkStrings.MV
  - typingsJapgolly.awsSdk.awsSdkStrings.ML
  - typingsJapgolly.awsSdk.awsSdkStrings.MT
  - typingsJapgolly.awsSdk.awsSdkStrings.MH
  - typingsJapgolly.awsSdk.awsSdkStrings.MR
  - typingsJapgolly.awsSdk.awsSdkStrings.MU
  - typingsJapgolly.awsSdk.awsSdkStrings.YT
  - typingsJapgolly.awsSdk.awsSdkStrings.MX
  - typingsJapgolly.awsSdk.awsSdkStrings.FM
  - typingsJapgolly.awsSdk.awsSdkStrings.MD
  - typingsJapgolly.awsSdk.awsSdkStrings.MC
  - typingsJapgolly.awsSdk.awsSdkStrings.MN
  - typingsJapgolly.awsSdk.awsSdkStrings.ME
  - typingsJapgolly.awsSdk.awsSdkStrings.MS
  - typingsJapgolly.awsSdk.awsSdkStrings.MA
  - typingsJapgolly.awsSdk.awsSdkStrings.MZ
  - typingsJapgolly.awsSdk.awsSdkStrings.MM
  - typingsJapgolly.awsSdk.awsSdkStrings.NA
  - typingsJapgolly.awsSdk.awsSdkStrings.NR
  - typingsJapgolly.awsSdk.awsSdkStrings.NP
  - typingsJapgolly.awsSdk.awsSdkStrings.NL
  - typingsJapgolly.awsSdk.awsSdkStrings.AN
  - typingsJapgolly.awsSdk.awsSdkStrings.NC
  - typingsJapgolly.awsSdk.awsSdkStrings.NZ
  - typingsJapgolly.awsSdk.awsSdkStrings.NI
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.NG
  - typingsJapgolly.awsSdk.awsSdkStrings.NU
  - typingsJapgolly.awsSdk.awsSdkStrings.KP
  - typingsJapgolly.awsSdk.awsSdkStrings.MP
  - typingsJapgolly.awsSdk.awsSdkStrings.NO
  - typingsJapgolly.awsSdk.awsSdkStrings.OM
  - typingsJapgolly.awsSdk.awsSdkStrings.PK
  - typingsJapgolly.awsSdk.awsSdkStrings.PW
  - typingsJapgolly.awsSdk.awsSdkStrings.PA
  - typingsJapgolly.awsSdk.awsSdkStrings.PG
  - typingsJapgolly.awsSdk.awsSdkStrings.PY
  - typingsJapgolly.awsSdk.awsSdkStrings.PE
  - typingsJapgolly.awsSdk.awsSdkStrings.PH
  - typingsJapgolly.awsSdk.awsSdkStrings.PN
  - typingsJapgolly.awsSdk.awsSdkStrings.PL
  - typingsJapgolly.awsSdk.awsSdkStrings.PT
  - typingsJapgolly.awsSdk.awsSdkStrings.PR
  - typingsJapgolly.awsSdk.awsSdkStrings.QA
  - typingsJapgolly.awsSdk.awsSdkStrings.CG
  - typingsJapgolly.awsSdk.awsSdkStrings.RE
  - typingsJapgolly.awsSdk.awsSdkStrings.RO
  - typingsJapgolly.awsSdk.awsSdkStrings.RU
  - typingsJapgolly.awsSdk.awsSdkStrings.RW
  - typingsJapgolly.awsSdk.awsSdkStrings.BL
  - typingsJapgolly.awsSdk.awsSdkStrings.SH
  - typingsJapgolly.awsSdk.awsSdkStrings.KN
  - typingsJapgolly.awsSdk.awsSdkStrings.LC
  - typingsJapgolly.awsSdk.awsSdkStrings.MF
  - typingsJapgolly.awsSdk.awsSdkStrings.PM
  - typingsJapgolly.awsSdk.awsSdkStrings.VC
  - typingsJapgolly.awsSdk.awsSdkStrings.WS
  - typingsJapgolly.awsSdk.awsSdkStrings.SM
  - typingsJapgolly.awsSdk.awsSdkStrings.ST
  - typingsJapgolly.awsSdk.awsSdkStrings.SA
  - typingsJapgolly.awsSdk.awsSdkStrings.SN
  - typingsJapgolly.awsSdk.awsSdkStrings.RS
  - typingsJapgolly.awsSdk.awsSdkStrings.SC
  - typingsJapgolly.awsSdk.awsSdkStrings.SL
  - typingsJapgolly.awsSdk.awsSdkStrings.SG
  - typingsJapgolly.awsSdk.awsSdkStrings.SX
  - typingsJapgolly.awsSdk.awsSdkStrings.SK
  - typingsJapgolly.awsSdk.awsSdkStrings.SI
  - typingsJapgolly.awsSdk.awsSdkStrings.SB
  - typingsJapgolly.awsSdk.awsSdkStrings.SO
  - typingsJapgolly.awsSdk.awsSdkStrings.ZA
  - typingsJapgolly.awsSdk.awsSdkStrings.KR
  - typingsJapgolly.awsSdk.awsSdkStrings.ES
  - typingsJapgolly.awsSdk.awsSdkStrings.LK
  - typingsJapgolly.awsSdk.awsSdkStrings.SD
  - typingsJapgolly.awsSdk.awsSdkStrings.SR
  - typingsJapgolly.awsSdk.awsSdkStrings.SJ
  - typingsJapgolly.awsSdk.awsSdkStrings.SZ
  - typingsJapgolly.awsSdk.awsSdkStrings.SE
  - typingsJapgolly.awsSdk.awsSdkStrings.CH
  - typingsJapgolly.awsSdk.awsSdkStrings.SY
  - typingsJapgolly.awsSdk.awsSdkStrings.TW
  - typingsJapgolly.awsSdk.awsSdkStrings.TJ
  - typingsJapgolly.awsSdk.awsSdkStrings.TZ
  - typingsJapgolly.awsSdk.awsSdkStrings.TH
  - typingsJapgolly.awsSdk.awsSdkStrings.TG
  - typingsJapgolly.awsSdk.awsSdkStrings.TK
  - typingsJapgolly.awsSdk.awsSdkStrings.TO
  - typingsJapgolly.awsSdk.awsSdkStrings.TT
  - typingsJapgolly.awsSdk.awsSdkStrings.TN
  - typingsJapgolly.awsSdk.awsSdkStrings.TR
  - typingsJapgolly.awsSdk.awsSdkStrings.TM
  - typingsJapgolly.awsSdk.awsSdkStrings.TC
  - typingsJapgolly.awsSdk.awsSdkStrings.TV
  - typingsJapgolly.awsSdk.awsSdkStrings.VI
  - typingsJapgolly.awsSdk.awsSdkStrings.UG
  - typingsJapgolly.awsSdk.awsSdkStrings.UA
  - typingsJapgolly.awsSdk.awsSdkStrings.AE
  - typingsJapgolly.awsSdk.awsSdkStrings.GB
  - typingsJapgolly.awsSdk.awsSdkStrings.US
  - typingsJapgolly.awsSdk.awsSdkStrings.UY
  - typingsJapgolly.awsSdk.awsSdkStrings.UZ
  - typingsJapgolly.awsSdk.awsSdkStrings.VU
  - typingsJapgolly.awsSdk.awsSdkStrings.VA
  - typingsJapgolly.awsSdk.awsSdkStrings.VE
  - typingsJapgolly.awsSdk.awsSdkStrings.VN
  - typingsJapgolly.awsSdk.awsSdkStrings.WF
  - typingsJapgolly.awsSdk.awsSdkStrings.EH
  - typingsJapgolly.awsSdk.awsSdkStrings.YE
  - typingsJapgolly.awsSdk.awsSdkStrings.ZM
  - typingsJapgolly.awsSdk.awsSdkStrings.ZW
  - java.lang.String
*/
type PhoneNumberCountryCode = _PhoneNumberCountryCode | java.lang.String

type PhoneNumberCountryCodes = js.Array[PhoneNumberCountryCode]

type PhoneNumberDescription = java.lang.String

type PhoneNumberId = java.lang.String

type PhoneNumberPrefix = java.lang.String

type PhoneNumberSummaryList = js.Array[PhoneNumberSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TOLL_FREE
  - typingsJapgolly.awsSdk.awsSdkStrings.DID
  - java.lang.String
*/
type PhoneNumberType = _PhoneNumberType | java.lang.String

type PhoneNumberTypes = js.Array[PhoneNumberType]

type PhoneNumberWorkflowMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLAIMED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PhoneNumberWorkflowStatus = _PhoneNumberWorkflowStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SOFT_PHONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DESK_PHONE
  - java.lang.String
*/
type PhoneType = _PhoneType | java.lang.String

type Prefix = java.lang.String

type Priority = Double

type PromptId = java.lang.String

type PromptName = java.lang.String

type PromptSummaryList = js.Array[PromptSummary]

type QueueDescription = java.lang.String

type QueueId = java.lang.String

type QueueMaxContacts = Double

type QueueName = java.lang.String

type QueueSearchConditionList = js.Array[QueueSearchCriteria]

type QueueSearchSummaryList = js.Array[Queue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type QueueStatus = _QueueStatus | java.lang.String

type QueueSummaryList = js.Array[QueueSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT
  - java.lang.String
*/
type QueueType = _QueueType | java.lang.String

type QueueTypes = js.Array[QueueType]

type Queues = js.Array[QueueId]

type QuickConnectDescription = java.lang.String

type QuickConnectId = java.lang.String

type QuickConnectName = java.lang.String

type QuickConnectSummaryList = js.Array[QuickConnectSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE_NUMBER
  - java.lang.String
*/
type QuickConnectType = _QuickConnectType | java.lang.String

type QuickConnectTypes = js.Array[QuickConnectType]

type QuickConnectsList = js.Array[QuickConnectId]

type ReadOnlyTaskTemplateFields = js.Array[ReadOnlyFieldInfo]

type ReferenceKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type ReferenceStatus = _ReferenceStatus | java.lang.String

type ReferenceSummaryList = js.Array[ReferenceSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type ReferenceType = _ReferenceType | java.lang.String

type ReferenceTypes = js.Array[ReferenceType]

type ReferenceValue = java.lang.String

type RequiredTaskTemplateFields = js.Array[RequiredFieldInfo]

type RoutingProfileDescription = java.lang.String

type RoutingProfileId = java.lang.String

type RoutingProfileList = js.Array[RoutingProfile]

type RoutingProfileName = java.lang.String

type RoutingProfileQueueConfigList = js.Array[RoutingProfileQueueConfig]

type RoutingProfileQueueConfigSummaryList = js.Array[RoutingProfileQueueConfigSummary]

type RoutingProfileQueueReferenceList = js.Array[RoutingProfileQueueReference]

type RoutingProfileSearchConditionList = js.Array[RoutingProfileSearchCriteria]

type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]

type SearchableQueueType = STANDARD | java.lang.String

type SecurityKeysList = js.Array[SecurityKey]

type SecurityProfileDescription = java.lang.String

type SecurityProfileId = java.lang.String

type SecurityProfileIds = js.Array[SecurityProfileId]

type SecurityProfileName = java.lang.String

type SecurityProfilePermission = java.lang.String

type SecurityProfileSearchConditionList = js.Array[SecurityProfileSearchCriteria]

type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]

type SecurityProfilesSearchSummaryList = js.Array[SecurityProfileSearchSummary]

type SecurityToken = java.lang.String

type SingleSelectOptions = js.Array[TaskTemplateSingleSelectOption]

type SnapshotVersion = java.lang.String

type SourceApplicationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SALESFORCE
  - typingsJapgolly.awsSdk.awsSdkStrings.ZENDESK
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUM
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX
  - typingsJapgolly.awsSdk.awsSdkStrings.AVG
  - java.lang.String
*/
type Statistic = _Statistic | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.KINESIS_VIDEO_STREAM
  - typingsJapgolly.awsSdk.awsSdkStrings.KINESIS_STREAM
  - typingsJapgolly.awsSdk.awsSdkStrings.KINESIS_FIREHOSE
  - java.lang.String
*/
type StorageType = _StorageType | java.lang.String

type StreamingId = java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTS_WITH
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXACT
  - java.lang.String
*/
type StringComparisonType = _StringComparisonType | java.lang.String

type SupportedMessagingContentType = java.lang.String

type SupportedMessagingContentTypes = js.Array[SupportedMessagingContentType]

type TagAndConditionList = js.Array[TagCondition]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagOrConditionList = js.Array[TagAndConditionList]

type TagValue = java.lang.String

type TaskTemplateArn = java.lang.String

type TaskTemplateDefaultFieldValueList = js.Array[TaskTemplateDefaultFieldValue]

type TaskTemplateDescription = java.lang.String

type TaskTemplateFieldDescription = java.lang.String

type TaskTemplateFieldName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCRIPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.QUICK_CONNECT
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_AREA
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_SELECT
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type TaskTemplateFieldType = _TaskTemplateFieldType | java.lang.String

type TaskTemplateFieldValue = java.lang.String

type TaskTemplateFields = js.Array[TaskTemplateField]

type TaskTemplateId = java.lang.String

type TaskTemplateList = js.Array[TaskTemplateMetadata]

type TaskTemplateName = java.lang.String

type TaskTemplateSingleSelectOption = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type TaskTemplateStatus = _TaskTemplateStatus | java.lang.String

type ThresholdValue = Double

type TimeZone = java.lang.String

type Timestamp_ = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GENERAL
  - typingsJapgolly.awsSdk.awsSdkStrings.CAMPAIGN
  - java.lang.String
*/
type TrafficType = _TrafficType | java.lang.String

type URI = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SECONDS
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.PERCENT
  - java.lang.String
*/
type Unit = _Unit | java.lang.String

type UpdateAgentStatusDescription = java.lang.String

type UpdateHoursOfOperationDescription = java.lang.String

type UpdateQuickConnectDescription = java.lang.String

type UseCaseId = java.lang.String

type UseCaseSummaryList = js.Array[UseCase]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RULES_EVALUATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECT_CAMPAIGNS
  - java.lang.String
*/
type UseCaseType = _UseCaseType | java.lang.String

type UserDataList = js.Array[UserData]

type UserId = java.lang.String

type UserSearchConditionList = js.Array[UserSearchCriteria]

type UserSearchSummaryList = js.Array[UserSearchSummary]

type UserSummaryList = js.Array[UserSummary]

type Value = Double

type VocabularyContent = java.lang.String

type VocabularyFailureReason = java.lang.String

type VocabularyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`ar-AE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-CH`
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-IE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-WL`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-ES`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`hi-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`pt-BR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`pt-PT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`zh-CN`
  - java.lang.String
*/
type VocabularyLanguageCode = _VocabularyLanguageCode | java.lang.String

type VocabularyLastModifiedTime = js.Date

type VocabularyName = java.lang.String

type VocabularyNextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - java.lang.String
*/
type VocabularyState = _VocabularyState | java.lang.String

type VocabularySummaryList = js.Array[VocabularySummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FROM_AGENT
  - typingsJapgolly.awsSdk.awsSdkStrings.TO_AGENT
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type VoiceRecordingTrack = _VoiceRecordingTrack | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-08-08`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type timestamp = js.Date
