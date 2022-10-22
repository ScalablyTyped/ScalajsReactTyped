package typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_TIER
import typingsJapgolly.awsSdk.awsSdkStrings.`end-user-opted-out`
import typingsJapgolly.awsSdk.awsSdkStrings.`keyword-action`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountAttributeList = js.Array[AccountAttribute]

type AccountAttributeName = ACCOUNT_TIER | java.lang.String

type AccountLimitList = js.Array[AccountLimit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE_NUMBERS
  - typingsJapgolly.awsSdk.awsSdkStrings.POOLS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_SETS
  - typingsJapgolly.awsSdk.awsSdkStrings.OPT_OUT_LISTS
  - java.lang.String
*/
type AccountLimitName = _AccountLimitName | java.lang.String

type AmazonResourceName = java.lang.String

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type ConfigurationSetFilterList = js.Array[ConfigurationSetFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`event-destination-name`
  - typingsJapgolly.awsSdk.awsSdkStrings.`matching-event-types`
  - typingsJapgolly.awsSdk.awsSdkStrings.`default-message-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`default-sender-id`
  - java.lang.String
*/
type ConfigurationSetFilterName = _ConfigurationSetFilterName | java.lang.String

type ConfigurationSetInformationList = js.Array[ConfigurationSetInformation]

type ConfigurationSetName = java.lang.String

type ConfigurationSetNameList = js.Array[ConfigurationSetNameOrArn]

type ConfigurationSetNameOrArn = java.lang.String

type ContextKey = java.lang.String

type ContextMap = StringDictionary[ContextValue]

type ContextValue = java.lang.String

type DeliveryStreamArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_TEMPLATE_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_ENTITY_ID
  - java.lang.String
*/
type DestinationCountryParameterKey = _DestinationCountryParameterKey | java.lang.String

type DestinationCountryParameterValue = java.lang.String

type DestinationCountryParameters = StringDictionary[DestinationCountryParameterValue]

type EventDestinationList = js.Array[EventDestination]

type EventDestinationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_SENT
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_DELIVERED
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_INVALID_MESSAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_UNREACHABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_CARRIER_UNREACHABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_BLOCKED
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_CARRIER_BLOCKED
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_SPAM
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_TTL_EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_RINGING
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_ANSWERED
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_BUSY
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_NO_ANSWER
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_TTL_EXPIRED
  - java.lang.String
*/
type EventType = _EventType | java.lang.String

type EventTypeList = js.Array[EventType]

type FilterValue = java.lang.String

type FilterValueList = js.Array[FilterValue]

type IamRoleArn = java.lang.String

type IsoCountryCode = java.lang.String

type Keyword = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC_RESPONSE
  - typingsJapgolly.awsSdk.awsSdkStrings.OPT_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.OPT_IN
  - java.lang.String
*/
type KeywordAction = _KeywordAction | java.lang.String

type KeywordFilterList = js.Array[KeywordFilter]

type KeywordFilterName = `keyword-action` | java.lang.String

type KeywordInformationList = js.Array[KeywordInformation]

type KeywordList = js.Array[Keyword]

type KeywordMessage = java.lang.String

type LogGroupArn = java.lang.String

type MaxPrice = java.lang.String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSACTIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PROMOTIONAL
  - java.lang.String
*/
type MessageType = _MessageType | java.lang.String

type MessageTypeList = js.Array[MessageType]

type MonthlyLimit = Double

type NextToken = java.lang.String

type NonEmptyTagList = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE
  - java.lang.String
*/
type NumberCapability = _NumberCapability | java.lang.String

type NumberCapabilityList = js.Array[NumberCapability]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type NumberStatus = _NumberStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SHORT_CODE
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG_CODE
  - typingsJapgolly.awsSdk.awsSdkStrings.TOLL_FREE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEN_DLC
  - java.lang.String
*/
type NumberType = _NumberType | java.lang.String

type OptOutListInformationList = js.Array[OptOutListInformation]

type OptOutListName = java.lang.String

type OptOutListNameList = js.Array[OptOutListNameOrArn]

type OptOutListNameOrArn = java.lang.String

type OptedOutFilterList = js.Array[OptedOutFilter]

type OptedOutFilterName = `end-user-opted-out` | java.lang.String

type OptedOutNumberInformationList = js.Array[OptedOutNumberInformation]

type OptedOutNumberList = js.Array[PhoneNumber]

type OriginationIdentityMetadataList = js.Array[OriginationIdentityMetadata]

type PhoneNumber = java.lang.String

type PhoneNumberFilterList = js.Array[PhoneNumberFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.status__
  - typingsJapgolly.awsSdk.awsSdkStrings.`iso-country-code`
  - typingsJapgolly.awsSdk.awsSdkStrings.`message-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`number-capability`
  - typingsJapgolly.awsSdk.awsSdkStrings.`number-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`two-way-enabled`
  - typingsJapgolly.awsSdk.awsSdkStrings.`self-managed-opt-outs-enabled`
  - typingsJapgolly.awsSdk.awsSdkStrings.`opt-out-list-name`
  - typingsJapgolly.awsSdk.awsSdkStrings.`deletion-protection-enabled`
  - java.lang.String
*/
type PhoneNumberFilterName = _PhoneNumberFilterName | java.lang.String

type PhoneNumberIdList = js.Array[PhoneNumberIdOrArn]

type PhoneNumberIdOrArn = java.lang.String

type PhoneNumberInformationList = js.Array[PhoneNumberInformation]

type PhoneOrPoolIdOrArn = java.lang.String

type PhoneOrSenderIdOrArn = java.lang.String

type PoolFilterList = js.Array[PoolFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.status__
  - typingsJapgolly.awsSdk.awsSdkStrings.`message-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`two-way-enabled`
  - typingsJapgolly.awsSdk.awsSdkStrings.`self-managed-opt-outs-enabled`
  - typingsJapgolly.awsSdk.awsSdkStrings.`opt-out-list-name`
  - typingsJapgolly.awsSdk.awsSdkStrings.`shared-routes-enabled`
  - typingsJapgolly.awsSdk.awsSdkStrings.`deletion-protection-enabled`
  - java.lang.String
*/
type PoolFilterName = _PoolFilterName | java.lang.String

type PoolIdList = js.Array[PoolIdOrArn]

type PoolIdOrArn = java.lang.String

type PoolInformationList = js.Array[PoolInformation]

type PoolOriginationIdentitiesFilterList = js.Array[PoolOriginationIdentitiesFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`iso-country-code`
  - typingsJapgolly.awsSdk.awsSdkStrings.`number-capability`
  - java.lang.String
*/
type PoolOriginationIdentitiesFilterName = _PoolOriginationIdentitiesFilterName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type PoolStatus = _PoolStatus | java.lang.String

type PrimitiveBoolean = scala.Boolean

type PrimitiveLong = Double

type RegistrationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG_CODE
  - typingsJapgolly.awsSdk.awsSdkStrings.TOLL_FREE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEN_DLC
  - java.lang.String
*/
type RequestableNumberType = _RequestableNumberType | java.lang.String

type SenderId = java.lang.String

type SenderIdFilterList = js.Array[SenderIdFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`sender-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`iso-country-code`
  - typingsJapgolly.awsSdk.awsSdkStrings.`message-type`
  - java.lang.String
*/
type SenderIdFilterName = _SenderIdFilterName | java.lang.String

type SenderIdInformationList = js.Array[SenderIdInformation]

type SenderIdList = js.Array[SenderIdAndCountry]

type SenderIdOrArn = java.lang.String

type SnsTopicArn = java.lang.String

type SpendLimitList = js.Array[SpendLimit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_MESSAGE_MONTHLY_SPEND_LIMIT
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_MESSAGE_MONTHLY_SPEND_LIMIT
  - java.lang.String
*/
type SpendLimitName = _SpendLimitName | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TextMessageBody = java.lang.String

type TextMessageOriginationIdentity = java.lang.String

type TimeToLive = Double

type Timestamp = js.Date

type TwoWayChannelArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AMY
  - typingsJapgolly.awsSdk.awsSdkStrings.ASTRID
  - typingsJapgolly.awsSdk.awsSdkStrings.BIANCA
  - typingsJapgolly.awsSdk.awsSdkStrings.BRIAN
  - typingsJapgolly.awsSdk.awsSdkStrings.CAMILA
  - typingsJapgolly.awsSdk.awsSdkStrings.CARLA
  - typingsJapgolly.awsSdk.awsSdkStrings.CARMEN
  - typingsJapgolly.awsSdk.awsSdkStrings.CELINE
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANTAL
  - typingsJapgolly.awsSdk.awsSdkStrings.CONCHITA
  - typingsJapgolly.awsSdk.awsSdkStrings.CRISTIANO
  - typingsJapgolly.awsSdk.awsSdkStrings.DORA
  - typingsJapgolly.awsSdk.awsSdkStrings.EMMA
  - typingsJapgolly.awsSdk.awsSdkStrings.ENRIQUE
  - typingsJapgolly.awsSdk.awsSdkStrings.EWA
  - typingsJapgolly.awsSdk.awsSdkStrings.FILIZ
  - typingsJapgolly.awsSdk.awsSdkStrings.GERAINT
  - typingsJapgolly.awsSdk.awsSdkStrings.GIORGIO
  - typingsJapgolly.awsSdk.awsSdkStrings.GWYNETH
  - typingsJapgolly.awsSdk.awsSdkStrings.HANS
  - typingsJapgolly.awsSdk.awsSdkStrings.INES
  - typingsJapgolly.awsSdk.awsSdkStrings.IVY
  - typingsJapgolly.awsSdk.awsSdkStrings.JACEK
  - typingsJapgolly.awsSdk.awsSdkStrings.JAN
  - typingsJapgolly.awsSdk.awsSdkStrings.JOANNA
  - typingsJapgolly.awsSdk.awsSdkStrings.JOEY
  - typingsJapgolly.awsSdk.awsSdkStrings.JUSTIN
  - typingsJapgolly.awsSdk.awsSdkStrings.KARL
  - typingsJapgolly.awsSdk.awsSdkStrings.KENDRA
  - typingsJapgolly.awsSdk.awsSdkStrings.KIMBERLY
  - typingsJapgolly.awsSdk.awsSdkStrings.LEA
  - typingsJapgolly.awsSdk.awsSdkStrings.LIV
  - typingsJapgolly.awsSdk.awsSdkStrings.LOTTE
  - typingsJapgolly.awsSdk.awsSdkStrings.LUCIA
  - typingsJapgolly.awsSdk.awsSdkStrings.LUPE
  - typingsJapgolly.awsSdk.awsSdkStrings.MADS
  - typingsJapgolly.awsSdk.awsSdkStrings.MAJA
  - typingsJapgolly.awsSdk.awsSdkStrings.MARLENE
  - typingsJapgolly.awsSdk.awsSdkStrings.MATHIEU
  - typingsJapgolly.awsSdk.awsSdkStrings.MATTHEW
  - typingsJapgolly.awsSdk.awsSdkStrings.MAXIM
  - typingsJapgolly.awsSdk.awsSdkStrings.MIA
  - typingsJapgolly.awsSdk.awsSdkStrings.MIGUEL
  - typingsJapgolly.awsSdk.awsSdkStrings.MIZUKI
  - typingsJapgolly.awsSdk.awsSdkStrings.NAJA
  - typingsJapgolly.awsSdk.awsSdkStrings.NICOLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENELOPE
  - typingsJapgolly.awsSdk.awsSdkStrings.RAVEENA
  - typingsJapgolly.awsSdk.awsSdkStrings.RICARDO
  - typingsJapgolly.awsSdk.awsSdkStrings.RUBEN
  - typingsJapgolly.awsSdk.awsSdkStrings.RUSSELL
  - typingsJapgolly.awsSdk.awsSdkStrings.SALLI
  - typingsJapgolly.awsSdk.awsSdkStrings.SEOYEON
  - typingsJapgolly.awsSdk.awsSdkStrings.TAKUMI
  - typingsJapgolly.awsSdk.awsSdkStrings.TATYANA
  - typingsJapgolly.awsSdk.awsSdkStrings.VICKI
  - typingsJapgolly.awsSdk.awsSdkStrings.VITORIA
  - typingsJapgolly.awsSdk.awsSdkStrings.ZEINA
  - typingsJapgolly.awsSdk.awsSdkStrings.ZHIYU
  - java.lang.String
*/
type VoiceId = _VoiceId | java.lang.String

type VoiceMessageBody = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.SSML
  - java.lang.String
*/
type VoiceMessageBodyTextType = _VoiceMessageBodyTextType | java.lang.String

type VoiceMessageOriginationIdentity = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2022-03-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
