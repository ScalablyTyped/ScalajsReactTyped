package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdditionalContactEmailAddress = String

type AdditionalContactEmailAddresses = js.Array[AdditionalContactEmailAddress]

type AmazonResourceName = String

type AttributesData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USE_DEFAULT_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECT_MESSAGE
  - java.lang.String
*/
type BehaviorOnMxFailure = _BehaviorOnMxFailure | String

type BlacklistEntries = js.Array[BlacklistEntry]

type BlacklistItemName = String

type BlacklistItemNames = js.Array[BlacklistItemName]

type BlacklistReport = StringDictionary[BlacklistEntries]

type BlacklistingDescription = String

type BulkEmailEntryList = js.Array[BulkEmailEntry]

type BulkEmailEntryResultList = js.Array[BulkEmailEntryResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.MESSAGE_REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.MAIL_FROM_DOMAIN_NOT_VERIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_SET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.TEMPLATE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_SUSPENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_DAILY_QUOTA_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_SENDING_POOL_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_SENDING_PAUSED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_SET_SENDING_PAUSED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PARAMETER
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSIENT_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type BulkEmailStatus = _BulkEmailStatus | String

type CampaignId = String

type CaseId = String

type Charset = String

type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]

type ConfigurationSetName = String

type ConfigurationSetNameList = js.Array[ConfigurationSetName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EN
  - typingsJapgolly.awsSdk.awsSdkStrings.JA
  - java.lang.String
*/
type ContactLanguage = _ContactLanguage | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.PUT
  - java.lang.String
*/
type ContactListImportAction = _ContactListImportAction | String

type ContactListName = String

type CustomRedirectDomain = String

type CustomVerificationEmailTemplatesList = js.Array[CustomVerificationEmailTemplateMetadata]

type DailyVolumes = js.Array[DailyVolume]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type DataFormat = _DataFormat | String

type DedicatedIpList = js.Array[DedicatedIp]

type DefaultDimensionValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_EXPIRATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DeliverabilityDashboardAccountStatus = _DeliverabilityDashboardAccountStatus | String

type DeliverabilityTestReports = js.Array[DeliverabilityTestReport]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type DeliverabilityTestStatus = _DeliverabilityTestStatus | String

type DeliverabilityTestSubject = String

type Description = String

type DimensionName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MESSAGE_TAG
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.LINK_TAG
  - java.lang.String
*/
type DimensionValueSource = _DimensionValueSource | String

type DisplayName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SES
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type DkimSigningAttributesOrigin = _DkimSigningAttributesOrigin | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_1024_BIT
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048_BIT
  - java.lang.String
*/
type DkimSigningKeyLength = _DkimSigningKeyLength | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - java.lang.String
*/
type DkimStatus = _DkimStatus | String

type DnsToken = String

type DnsTokenList = js.Array[DnsToken]

type Domain = String

type DomainDeliverabilityCampaignList = js.Array[DomainDeliverabilityCampaign]

type DomainDeliverabilityTrackingOptions = js.Array[DomainDeliverabilityTrackingOption]

type DomainIspPlacements = js.Array[DomainIspPlacement]

type EmailAddress = String

type EmailAddressList = js.Array[EmailAddress]

type EmailTemplateData = String

type EmailTemplateHtml = String

type EmailTemplateMetadataList = js.Array[EmailTemplateMetadata]

type EmailTemplateName = String

type EmailTemplateSubject = String

type EmailTemplateText = String

type Enabled = Boolean

type EnabledWrapper = Boolean

type ErrorMessage = String

type Esp = String

type Esps = js.Array[Esp]

type EventDestinationName = String

type EventDestinations = js.Array[EventDestination]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SEND
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECT
  - typingsJapgolly.awsSdk.awsSdkStrings.BOUNCE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLAINT
  - typingsJapgolly.awsSdk.awsSdkStrings.DELIVERY
  - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
  - typingsJapgolly.awsSdk.awsSdkStrings.CLICK
  - typingsJapgolly.awsSdk.awsSdkStrings.RENDERING_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELIVERY_DELAY
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBSCRIPTION
  - java.lang.String
*/
type EventType = _EventType | String

type EventTypes = js.Array[EventType]

type FailedRecordsCount = Double

type FailedRecordsS3Url = String

type FailureRedirectionURL = String

type FeedbackId = String

type GeneralEnforcementStatus = String

type Identity = String

type IdentityInfoList = js.Array[IdentityInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.MANAGED_DOMAIN
  - java.lang.String
*/
type IdentityType = _IdentityType | String

type ImageUrl = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUPPRESSION_LIST
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_LIST
  - java.lang.String
*/
type ImportDestinationType = _ImportDestinationType | String

type ImportJobSummaryList = js.Array[ImportJobSummary]

type Ip = String

type IpList = js.Array[Ip]

type IspName = String

type IspNameList = js.Array[IspName]

type IspPlacements = js.Array[IspPlacement]

type JobId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type JobStatus = _JobStatus | String

type LastFreshStart = js.Date

type ListOfContactLists = js.Array[ContactList]

type ListOfContacts = js.Array[Contact]

type ListOfDedicatedIpPools = js.Array[PoolName]

type MailFromDomainName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
  - java.lang.String
*/
type MailFromDomainStatus = _MailFromDomainStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MARKETING
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSACTIONAL
  - java.lang.String
*/
type MailType = _MailType | String

type Max24HourSend = Double

type MaxItems = Double

type MaxSendRate = Double

type MessageContent = String

type MessageData = String

type MessageTagList = js.Array[MessageTag]

type MessageTagName = String

type MessageTagValue = String

type NextToken = String

type OutboundMessageId = String

type Percentage = Double

type Percentage100Wrapper = Double

type Policy = String

type PolicyMap = StringDictionary[Policy]

type PolicyName = String

type PoolName = String

type PrivateKey = String

type ProcessedRecordsCount = Double

type RawMessageData = Buffer | js.typedarray.Uint8Array | Blob | String

type RblName = String

type RenderedEmailTemplate = String

type ReportId = String

type ReportName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.GRANTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DENIED
  - java.lang.String
*/
type ReviewStatus = _ReviewStatus | String

type S3Url = String

type Selector = String

type SendingPoolName = String

type SentLast24Hours = Double

type Subject = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OPT_IN
  - typingsJapgolly.awsSdk.awsSdkStrings.OPT_OUT
  - java.lang.String
*/
type SubscriptionStatus = _SubscriptionStatus | String

type SuccessRedirectionURL = String

type SuppressedDestinationSummaries = js.Array[SuppressedDestinationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.PUT
  - java.lang.String
*/
type SuppressionListImportAction = _SuppressionListImportAction | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BOUNCE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLAINT
  - java.lang.String
*/
type SuppressionListReason = _SuppressionListReason | String

type SuppressionListReasons = js.Array[SuppressionListReason]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TemplateContent = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRE
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type TlsPolicy = _TlsPolicy | String

type TopicName = String

type TopicPreferenceList = js.Array[TopicPreference]

type Topics = js.Array[Topic]

type UnsubscribeAll = Boolean

type UseCaseDescription = String

type UseDefaultIfPreferenceUnavailable = Boolean

type Volume = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DONE
  - java.lang.String
*/
type WarmupStatus = _WarmupStatus | String

type WebsiteURL = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-09-27`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
