package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.RuleSet
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Address = String

type AddressList = js.Array[Address]

type AmazonResourceName = String

type ArrivalDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UseDefaultValue
  - typingsJapgolly.awsSdk.awsSdkStrings.RejectMessage
  - java.lang.String
*/
type BehaviorOnMXFailure = _BehaviorOnMXFailure | String

type BounceMessage = String

type BounceSmtpReplyCode = String

type BounceStatusCode = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DoesNotExist
  - typingsJapgolly.awsSdk.awsSdkStrings.MessageTooLarge
  - typingsJapgolly.awsSdk.awsSdkStrings.ExceededQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.ContentRejected
  - typingsJapgolly.awsSdk.awsSdkStrings.Undefined_
  - typingsJapgolly.awsSdk.awsSdkStrings.TemporaryFailure
  - java.lang.String
*/
type BounceType = _BounceType | String

type BouncedRecipientInfoList = js.Array[BouncedRecipientInfo]

type BulkEmailDestinationList = js.Array[BulkEmailDestination]

type BulkEmailDestinationStatusList = js.Array[BulkEmailDestinationStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.MessageRejected
  - typingsJapgolly.awsSdk.awsSdkStrings.MailFromDomainNotVerified
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationSetDoesNotExist
  - typingsJapgolly.awsSdk.awsSdkStrings.TemplateDoesNotExist
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountSuspended
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountThrottled
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountDailyQuotaExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidSendingPoolName
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountSendingPaused
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationSetSendingPaused
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidParameterValue
  - typingsJapgolly.awsSdk.awsSdkStrings.TransientFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type BulkEmailStatus = _BulkEmailStatus | String

type Charset = String

type Cidr = String

type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.eventDestinations
  - typingsJapgolly.awsSdk.awsSdkStrings.trackingOptions
  - typingsJapgolly.awsSdk.awsSdkStrings.deliveryOptions
  - typingsJapgolly.awsSdk.awsSdkStrings.reputationOptions
  - java.lang.String
*/
type ConfigurationSetAttribute = _ConfigurationSetAttribute | String

type ConfigurationSetAttributeList = js.Array[ConfigurationSetAttribute]

type ConfigurationSetName = String

type ConfigurationSets = js.Array[ConfigurationSet]

type Counter = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.TemporaryFailure
  - java.lang.String
*/
type CustomMailFromStatus = _CustomMailFromStatus | String

type CustomRedirectDomain = String

type CustomVerificationEmailTemplates = js.Array[CustomVerificationEmailTemplate]

type DefaultDimensionValue = String

type DiagnosticCode = String

type DimensionName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.messageTag
  - typingsJapgolly.awsSdk.awsSdkStrings.emailHeader
  - typingsJapgolly.awsSdk.awsSdkStrings.linkTag
  - java.lang.String
*/
type DimensionValueSource = _DimensionValueSource | String

type DkimAttributes = StringDictionary[IdentityDkimAttributes]

type Domain = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.failed__
  - typingsJapgolly.awsSdk.awsSdkStrings.delayed_
  - typingsJapgolly.awsSdk.awsSdkStrings.delivered_
  - typingsJapgolly.awsSdk.awsSdkStrings.relayed
  - typingsJapgolly.awsSdk.awsSdkStrings.expanded_
  - java.lang.String
*/
type DsnAction = _DsnAction | String

type DsnStatus = String

type Enabled = Boolean

type Error = String

type EventDestinationName = String

type EventDestinations = js.Array[EventDestination]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.send__
  - typingsJapgolly.awsSdk.awsSdkStrings.reject__
  - typingsJapgolly.awsSdk.awsSdkStrings.bounce__
  - typingsJapgolly.awsSdk.awsSdkStrings.complaint__
  - typingsJapgolly.awsSdk.awsSdkStrings.delivery__
  - typingsJapgolly.awsSdk.awsSdkStrings.open__
  - typingsJapgolly.awsSdk.awsSdkStrings.click_
  - typingsJapgolly.awsSdk.awsSdkStrings.renderingFailure
  - java.lang.String
*/
type EventType = _EventType | String

type EventTypes = js.Array[EventType]

type Explanation = String

type ExtensionFieldList = js.Array[ExtensionField]

type ExtensionFieldName = String

type ExtensionFieldValue = String

type FailureRedirectionURL = String

type FromAddress = String

type HeaderName = String

type HeaderValue = String

type HtmlPart = String

type Identity = String

type IdentityList = js.Array[Identity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EmailAddress
  - typingsJapgolly.awsSdk.awsSdkStrings.Domain_
  - java.lang.String
*/
type IdentityType = _IdentityType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Event_
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestResponse
  - java.lang.String
*/
type InvocationType = _InvocationType | String

type LastAttemptDate = js.Date

type LastFreshStart = js.Date

type MailFromDomainAttributes = StringDictionary[IdentityMailFromDomainAttributes]

type MailFromDomainName = String

type Max24HourSend = Double

type MaxItems = Double

type MaxResults = Double

type MaxSendRate = Double

type MessageData = String

type MessageId = String

type MessageTagList = js.Array[MessageTag]

type MessageTagName = String

type MessageTagValue = String

type NextToken = String

type NotificationAttributes = StringDictionary[IdentityNotificationAttributes]

type NotificationTopic = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Bounce_
  - typingsJapgolly.awsSdk.awsSdkStrings.Complaint_
  - typingsJapgolly.awsSdk.awsSdkStrings.Delivery_
  - java.lang.String
*/
type NotificationType = _NotificationType | String

type Policy = String

type PolicyMap = StringDictionary[Policy]

type PolicyName = String

type PolicyNameList = js.Array[PolicyName]

type RawMessageData = Buffer | js.typedarray.Uint8Array | Blob | String

type ReceiptActionsList = js.Array[ReceiptAction]

type ReceiptFilterList = js.Array[ReceiptFilter]

type ReceiptFilterName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Block_
  - typingsJapgolly.awsSdk.awsSdkStrings.Allow_
  - java.lang.String
*/
type ReceiptFilterPolicy = _ReceiptFilterPolicy | String

type ReceiptRuleName = String

type ReceiptRuleNamesList = js.Array[ReceiptRuleName]

type ReceiptRuleSetName = String

type ReceiptRuleSetsLists = js.Array[ReceiptRuleSetMetadata]

type ReceiptRulesList = js.Array[ReceiptRule]

type Recipient = String

type RecipientsList = js.Array[Recipient]

type RemoteMta = String

type RenderedTemplate = String

type ReportingMta = String

type S3BucketName = String

type S3KeyPrefix = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`UTF-8`
  - typingsJapgolly.awsSdk.awsSdkStrings.Base64
  - java.lang.String
*/
type SNSActionEncoding = _SNSActionEncoding | String

type SendDataPointList = js.Array[SendDataPoint]

type SentLast24Hours = Double

type StopScope = RuleSet | String

type Subject = String

type SubjectPart = String

type SuccessRedirectionURL = String

type TemplateContent = String

type TemplateData = String

type TemplateMetadataList = js.Array[TemplateMetadata]

type TemplateName = String

type TextPart = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Require_
  - typingsJapgolly.awsSdk.awsSdkStrings.Optional_
  - java.lang.String
*/
type TlsPolicy = _TlsPolicy | String

type VerificationAttributes = StringDictionary[IdentityVerificationAttributes]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.TemporaryFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
  - java.lang.String
*/
type VerificationStatus = _VerificationStatus | String

type VerificationToken = String

type VerificationTokenList = js.Array[VerificationToken]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2010-12-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
