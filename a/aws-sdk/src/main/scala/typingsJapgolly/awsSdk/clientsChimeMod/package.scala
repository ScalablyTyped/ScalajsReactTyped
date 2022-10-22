package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ChatBot
import typingsJapgolly.awsSdk.awsSdkStrings.ChimeSdkMeeting
import typingsJapgolly.awsSdk.awsSdkStrings.ContentOnly
import typingsJapgolly.awsSdk.awsSdkStrings.PHI
import typingsJapgolly.awsSdk.awsSdkStrings.PII
import typingsJapgolly.awsSdk.awsSdkStrings.S3Bucket
import typingsJapgolly.awsSdk.awsSdkStrings.VideoOnly
import typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountList = js.Array[Account]

type AccountName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type AccountStatus = _AccountStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Team
  - typingsJapgolly.awsSdk.awsSdkStrings.EnterpriseDirectory
  - typingsJapgolly.awsSdk.awsSdkStrings.EnterpriseLWA
  - typingsJapgolly.awsSdk.awsSdkStrings.EnterpriseOIDC
  - java.lang.String
*/
type AccountType = _AccountType | java.lang.String

type Alpha2CountryCode = java.lang.String

type AppInstanceAdminList = js.Array[AppInstanceAdminSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Channel_
  - typingsJapgolly.awsSdk.awsSdkStrings.ChannelMessage
  - java.lang.String
*/
type AppInstanceDataType = _AppInstanceDataType | java.lang.String

type AppInstanceList = js.Array[AppInstanceSummary]

type AppInstanceStreamingConfigurationList = js.Array[AppInstanceStreamingConfiguration]

type AppInstanceUserList = js.Array[AppInstanceUserSummary]

type AreaCode = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ArtifactsState = _ArtifactsState | java.lang.String

type AttendeeIdList = js.Array[GuidString]

type AttendeeList = js.Array[Attendee]

type AttendeeTagKeyList = js.Array[TagKey]

type AttendeeTagList = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioOnly
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioWithActiveSpeakerVideo
  - java.lang.String
*/
type AudioMuxType = _AudioMuxType | java.lang.String

type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]

type BatchCreateChannelMembershipErrors = js.Array[BatchCreateChannelMembershipError]

type Boolean = scala.Boolean

type BotList = js.Array[Bot]

type BotType = ChatBot | java.lang.String

type CallingName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Unassigned
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateFailed
  - java.lang.String
*/
type CallingNameStatus = _CallingNameStatus | java.lang.String

type CallingRegion = java.lang.String

type CallingRegionList = js.Array[CallingRegion]

type CandidateAddressList = js.Array[CandidateAddress]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Voice_
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
type Capability = _Capability | java.lang.String

type CapabilityList = js.Array[Capability]

type ChannelBanSummaryList = js.Array[ChannelBanSummary]

type ChannelMembershipForAppInstanceUserSummaryList = js.Array[ChannelMembershipForAppInstanceUserSummary]

type ChannelMembershipSummaryList = js.Array[ChannelMembershipSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.HIDDEN
  - java.lang.String
*/
type ChannelMembershipType = _ChannelMembershipType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSISTENT
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_PERSISTENT
  - java.lang.String
*/
type ChannelMessagePersistenceType = _ChannelMessagePersistenceType | java.lang.String

type ChannelMessageSummaryList = js.Array[ChannelMessageSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTROL
  - java.lang.String
*/
type ChannelMessageType = _ChannelMessageType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNRESTRICTED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTRICTED
  - java.lang.String
*/
type ChannelMode = _ChannelMode | java.lang.String

type ChannelModeratedByAppInstanceUserSummaryList = js.Array[ChannelModeratedByAppInstanceUserSummary]

type ChannelModeratorSummaryList = js.Array[ChannelModeratorSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type ChannelPrivacy = _ChannelPrivacy | java.lang.String

type ChannelSummaryList = js.Array[ChannelSummary]

type ChimeArn = java.lang.String

type ClientRequestToken = java.lang.String

type Content = java.lang.String

type ContentMuxType = ContentOnly | java.lang.String

type Country = java.lang.String

type CountryList = js.Array[Country]

type CpsLimit = Double

type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]

type CreateMeetingWithAttendeesRequestItemList = js.Array[CreateAttendeeRequestItem]

type CredentialList = js.Array[Credential]

type DNISEmergencyCallingConfigurationList = js.Array[DNISEmergencyCallingConfiguration]

type DataRetentionInHours = Double

type E164PhoneNumber = java.lang.String

type E164PhoneNumberList = js.Array[E164PhoneNumber]

type EmailAddress = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NotSent
  - typingsJapgolly.awsSdk.awsSdkStrings.Sent_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type EmailStatus = _EmailStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BadRequest
  - typingsJapgolly.awsSdk.awsSdkStrings.Conflict_
  - typingsJapgolly.awsSdk.awsSdkStrings.Forbidden
  - typingsJapgolly.awsSdk.awsSdkStrings.NotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.PreconditionFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceLimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceUnavailable
  - typingsJapgolly.awsSdk.awsSdkStrings.Throttled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Throttling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unauthorized_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unprocessable
  - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnectorGroupAssociationsExist
  - typingsJapgolly.awsSdk.awsSdkStrings.PhoneNumberAssociationsExist
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ExternalMeetingIdType = java.lang.String

type ExternalUserIdList = js.Array[ExternalUserIdType]

type ExternalUserIdType = java.lang.String

type FunctionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Country_
  - typingsJapgolly.awsSdk.awsSdkStrings.AreaCode
  - java.lang.String
*/
type GeoMatchLevel = _GeoMatchLevel | java.lang.String

type GuidString = java.lang.String

type Integer = Double

type InviteList = js.Array[Invite]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Accepted_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type InviteStatus = _InviteStatus | java.lang.String

type Iso8601Timestamp = js.Date

type JoinTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Basic_
  - typingsJapgolly.awsSdk.awsSdkStrings.Plus
  - typingsJapgolly.awsSdk.awsSdkStrings.Pro
  - typingsJapgolly.awsSdk.awsSdkStrings.ProTrial
  - java.lang.String
*/
type License = _License | java.lang.String

type LicenseList = js.Array[License]

type MaxResults = Double

type MediaCapturePipelineList = js.Array[MediaCapturePipeline]

type MediaPipelineSinkType = S3Bucket | java.lang.String

type MediaPipelineSourceType = ChimeSdkMeeting | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type MediaPipelineStatus = _MediaPipelineStatus | java.lang.String

type MeetingList = js.Array[Meeting]

type MeetingTagKeyList = js.Array[TagKey]

type MeetingTagList = js.Array[Tag]

type MemberArns = js.Array[ChimeArn]

type MemberErrorList = js.Array[MemberError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.User_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bot_
  - typingsJapgolly.awsSdk.awsSdkStrings.Webhook
  - java.lang.String
*/
type MemberType = _MemberType | java.lang.String

type Members = js.Array[Identity]

type MembershipItemList = js.Array[MembershipItem]

type MessageId = java.lang.String

type Metadata = java.lang.String

type NextToken = java.lang.String

type NextTokenString = java.lang.String

type NonEmptyContent = java.lang.String

type NonEmptyResourceName = java.lang.String

type NonEmptyString = java.lang.String

type NonEmptyString128 = java.lang.String

type NonEmptyStringList = js.Array[String]

type NonNullableBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EventBridge
  - typingsJapgolly.awsSdk.awsSdkStrings.SNS
  - typingsJapgolly.awsSdk.awsSdkStrings.SQS
  - java.lang.String
*/
type NotificationTarget = _NotificationTarget | java.lang.String

type NullableBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PreferSticky
  - typingsJapgolly.awsSdk.awsSdkStrings.AvoidSticky
  - java.lang.String
*/
type NumberSelectionBehavior = _NumberSelectionBehavior | java.lang.String

type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Acquired
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type OrderedPhoneNumberStatus = _OrderedPhoneNumberStatus | java.lang.String

type OriginationRouteList = js.Array[OriginationRoute]

type OriginationRoutePriority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TCP
  - typingsJapgolly.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type OriginationRouteProtocol = _OriginationRouteProtocol | java.lang.String

type OriginationRouteWeight = Double

type ParticipantPhoneNumberList = js.Array[E164PhoneNumber]

type Participants = js.Array[Participant]

type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.UserId
  - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnectorId
  - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnectorGroupId
  - typingsJapgolly.awsSdk.awsSdkStrings.SipRuleId
  - java.lang.String
*/
type PhoneNumberAssociationName = _PhoneNumberAssociationName | java.lang.String

type PhoneNumberCountriesList = js.Array[PhoneNumberCountry]

type PhoneNumberErrorList = js.Array[PhoneNumberError]

type PhoneNumberList = js.Array[PhoneNumber]

type PhoneNumberMaxResults = Double

type PhoneNumberOrderList = js.Array[PhoneNumberOrder]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Partial_
  - java.lang.String
*/
type PhoneNumberOrderStatus = _PhoneNumberOrderStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BusinessCalling
  - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnector
  - typingsJapgolly.awsSdk.awsSdkStrings.SipMediaApplicationDialIn
  - java.lang.String
*/
type PhoneNumberProductType = _PhoneNumberProductType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AcquireInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.AcquireFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.Unassigned
  - typingsJapgolly.awsSdk.awsSdkStrings.Assigned_
  - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteFailed
  - java.lang.String
*/
type PhoneNumberStatus = _PhoneNumberStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Local_
  - typingsJapgolly.awsSdk.awsSdkStrings.TollFree
  - java.lang.String
*/
type PhoneNumberType = _PhoneNumberType | java.lang.String

type PhoneNumberTypeList = js.Array[PhoneNumberType]

type Port = Double

type PositiveInteger = Double

type ProfileServiceMaxResults = Double

type ProxySessionNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Open_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Closed_
  - java.lang.String
*/
type ProxySessionStatus = _ProxySessionStatus | java.lang.String

type ProxySessions = js.Array[ProxySession]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Unregistered_
  - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
  - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | java.lang.String

type ResourceName = java.lang.String

type ResultMax = Double

type RetentionDays = Double

type RoomList = js.Array[Room]

type RoomMembershipList = js.Array[RoomMembership]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Administrator_
  - typingsJapgolly.awsSdk.awsSdkStrings.Member
  - java.lang.String
*/
type RoomMembershipRole = _RoomMembershipRole | java.lang.String

type SMAUpdateCallArgumentsMap = StringDictionary[SensitiveString]

type SensitiveNonEmptyString = java.lang.String

type SensitiveString = java.lang.String

type SensitiveStringList = js.Array[SensitiveString]

type SigninDelegateGroupList = js.Array[SigninDelegateGroup]

type SipApplicationPriority = Double

type SipHeadersMap = StringDictionary[SensitiveString]

type SipMediaApplicationEndpointList = js.Array[SipMediaApplicationEndpoint]

type SipMediaApplicationList = js.Array[SipMediaApplication]

type SipMediaApplicationName = java.lang.String

type SipRuleList = js.Array[SipRule]

type SipRuleName = java.lang.String

type SipRuleTargetApplicationList = js.Array[SipRuleTargetApplication]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ToPhoneNumber
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestUriHostname
  - java.lang.String
*/
type SipRuleTriggerType = _SipRuleTriggerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type StreamingNotificationTargetList = js.Array[StreamingNotificationTarget]

type String = java.lang.String

type String128 = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type TollFreePrefix = java.lang.String

type TranscribeContentIdentificationType = PII | java.lang.String

type TranscribeContentRedactionType = PII | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
  - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`pt-BR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`zh-CN`
  - java.lang.String
*/
type TranscribeLanguageCode = _TranscribeLanguageCode | java.lang.String

type TranscribeLanguageModelName = java.lang.String

type TranscribeMedicalContentIdentificationType = PHI | java.lang.String

type TranscribeMedicalLanguageCode = `en-US` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type TranscribeMedicalRegion = _TranscribeMedicalRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIMARYCARE
  - typingsJapgolly.awsSdk.awsSdkStrings.CARDIOLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.NEUROLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.ONCOLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.RADIOLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.UROLOGY
  - java.lang.String
*/
type TranscribeMedicalSpecialty = _TranscribeMedicalSpecialty | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERSATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type TranscribeMedicalType = _TranscribeMedicalType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.low__
  - typingsJapgolly.awsSdk.awsSdkStrings.medium__
  - typingsJapgolly.awsSdk.awsSdkStrings.high__
  - java.lang.String
*/
type TranscribePartialResultsStability = _TranscribePartialResultsStability | java.lang.String

type TranscribePiiEntityTypes = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type TranscribeRegion = _TranscribeRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.remove__
  - typingsJapgolly.awsSdk.awsSdkStrings.mask__
  - typingsJapgolly.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type TranscribeVocabularyFilterMethod = _TranscribeVocabularyFilterMethod | java.lang.String

type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]

type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]

type UriType = java.lang.String

type UrlType = java.lang.String

type UserEmailList = js.Array[EmailAddress]

type UserErrorList = js.Array[UserError]

type UserId = java.lang.String

type UserIdList = js.Array[NonEmptyString]

type UserList = js.Array[User]

type UserName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PrivateUser
  - typingsJapgolly.awsSdk.awsSdkStrings.SharedDevice
  - java.lang.String
*/
type UserType = _UserType | java.lang.String

type ValidationResult = Double

type VideoMuxType = VideoOnly | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - java.lang.String
*/
type VoiceConnectorAwsRegion = _VoiceConnectorAwsRegion | java.lang.String

type VoiceConnectorGroupList = js.Array[VoiceConnectorGroup]

type VoiceConnectorGroupName = java.lang.String

type VoiceConnectorItemList = js.Array[VoiceConnectorItem]

type VoiceConnectorItemPriority = Double

type VoiceConnectorList = js.Array[VoiceConnector]

type VoiceConnectorName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-05-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
