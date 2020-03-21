package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sesMod {
  type Address = java.lang.String
  type AddressList = js.Array[typingsJapgolly.awsSdk.sesMod.Address]
  type AmazonResourceName = java.lang.String
  type ArrivalDate = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UseDefaultValue
    - typingsJapgolly.awsSdk.awsSdkStrings.RejectMessage
    - java.lang.String
  */
  type BehaviorOnMXFailure = typingsJapgolly.awsSdk.sesMod._BehaviorOnMXFailure | java.lang.String
  type BounceMessage = java.lang.String
  type BounceSmtpReplyCode = java.lang.String
  type BounceStatusCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.MessageTooLarge
    - typingsJapgolly.awsSdk.awsSdkStrings.ExceededQuota
    - typingsJapgolly.awsSdk.awsSdkStrings.ContentRejected
    - typingsJapgolly.awsSdk.awsSdkStrings.Undefined_
    - typingsJapgolly.awsSdk.awsSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type BounceType = typingsJapgolly.awsSdk.sesMod._BounceType | java.lang.String
  type BouncedRecipientInfoList = js.Array[typingsJapgolly.awsSdk.sesMod.BouncedRecipientInfo]
  type BulkEmailDestinationList = js.Array[typingsJapgolly.awsSdk.sesMod.BulkEmailDestination]
  type BulkEmailDestinationStatusList = js.Array[typingsJapgolly.awsSdk.sesMod.BulkEmailDestinationStatus]
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
  type BulkEmailStatus = typingsJapgolly.awsSdk.sesMod._BulkEmailStatus | java.lang.String
  type Charset = java.lang.String
  type Cidr = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.sesMod.ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[typingsJapgolly.awsSdk.sesMod.CloudWatchDimensionConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.eventDestinations
    - typingsJapgolly.awsSdk.awsSdkStrings.trackingOptions
    - typingsJapgolly.awsSdk.awsSdkStrings.deliveryOptions
    - typingsJapgolly.awsSdk.awsSdkStrings.reputationOptions
    - java.lang.String
  */
  type ConfigurationSetAttribute = typingsJapgolly.awsSdk.sesMod._ConfigurationSetAttribute | java.lang.String
  type ConfigurationSetAttributeList = js.Array[typingsJapgolly.awsSdk.sesMod.ConfigurationSetAttribute]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSets = js.Array[typingsJapgolly.awsSdk.sesMod.ConfigurationSet]
  type Counter = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type CustomMailFromStatus = typingsJapgolly.awsSdk.sesMod._CustomMailFromStatus | java.lang.String
  type CustomRedirectDomain = java.lang.String
  type CustomVerificationEmailTemplates = js.Array[typingsJapgolly.awsSdk.sesMod.CustomVerificationEmailTemplate]
  type DefaultDimensionValue = java.lang.String
  type DiagnosticCode = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.messageTag
    - typingsJapgolly.awsSdk.awsSdkStrings.emailHeader
    - typingsJapgolly.awsSdk.awsSdkStrings.linkTag
    - java.lang.String
  */
  type DimensionValueSource = typingsJapgolly.awsSdk.sesMod._DimensionValueSource | java.lang.String
  type DkimAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sesMod.IdentityDkimAttributes]
  type Domain = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.delayed_
    - typingsJapgolly.awsSdk.awsSdkStrings.delivered
    - typingsJapgolly.awsSdk.awsSdkStrings.relayed
    - typingsJapgolly.awsSdk.awsSdkStrings.expanded_
    - java.lang.String
  */
  type DsnAction = typingsJapgolly.awsSdk.sesMod._DsnAction | java.lang.String
  type DsnStatus = java.lang.String
  type Enabled = scala.Boolean
  type Error = java.lang.String
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[typingsJapgolly.awsSdk.sesMod.EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.send_
    - typingsJapgolly.awsSdk.awsSdkStrings.reject__
    - typingsJapgolly.awsSdk.awsSdkStrings.bounce__
    - typingsJapgolly.awsSdk.awsSdkStrings.complaint__
    - typingsJapgolly.awsSdk.awsSdkStrings.delivery__
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.click_
    - typingsJapgolly.awsSdk.awsSdkStrings.renderingFailure
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.sesMod._EventType | java.lang.String
  type EventTypes = js.Array[typingsJapgolly.awsSdk.sesMod.EventType]
  type Explanation = java.lang.String
  type ExtensionFieldList = js.Array[typingsJapgolly.awsSdk.sesMod.ExtensionField]
  type ExtensionFieldName = java.lang.String
  type ExtensionFieldValue = java.lang.String
  type FailureRedirectionURL = java.lang.String
  type FromAddress = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type HtmlPart = java.lang.String
  type Identity = java.lang.String
  type IdentityList = js.Array[typingsJapgolly.awsSdk.sesMod.Identity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EmailAddress
    - typingsJapgolly.awsSdk.awsSdkStrings.Domain_
    - java.lang.String
  */
  type IdentityType = typingsJapgolly.awsSdk.sesMod._IdentityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Event_
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestResponse
    - java.lang.String
  */
  type InvocationType = typingsJapgolly.awsSdk.sesMod._InvocationType | java.lang.String
  type LastAttemptDate = js.Date
  type LastFreshStart = js.Date
  type MailFromDomainAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sesMod.IdentityMailFromDomainAttributes]
  type MailFromDomainName = java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxResults = scala.Double
  type MaxSendRate = scala.Double
  type MessageData = java.lang.String
  type MessageId = java.lang.String
  type MessageTagList = js.Array[typingsJapgolly.awsSdk.sesMod.MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type NotificationAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sesMod.IdentityNotificationAttributes]
  type NotificationTopic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Bounce_
    - typingsJapgolly.awsSdk.awsSdkStrings.Complaint_
    - typingsJapgolly.awsSdk.awsSdkStrings.Delivery_
    - java.lang.String
  */
  type NotificationType = typingsJapgolly.awsSdk.sesMod._NotificationType | java.lang.String
  type Policy = java.lang.String
  type PolicyMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sesMod.Policy]
  type PolicyName = java.lang.String
  type PolicyNameList = js.Array[typingsJapgolly.awsSdk.sesMod.PolicyName]
  type RawMessageData = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.sesMod.Blob | java.lang.String
  type ReceiptActionsList = js.Array[typingsJapgolly.awsSdk.sesMod.ReceiptAction]
  type ReceiptFilterList = js.Array[typingsJapgolly.awsSdk.sesMod.ReceiptFilter]
  type ReceiptFilterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Block_
    - typingsJapgolly.awsSdk.awsSdkStrings.Allow_
    - java.lang.String
  */
  type ReceiptFilterPolicy = typingsJapgolly.awsSdk.sesMod._ReceiptFilterPolicy | java.lang.String
  type ReceiptRuleName = java.lang.String
  type ReceiptRuleNamesList = js.Array[typingsJapgolly.awsSdk.sesMod.ReceiptRuleName]
  type ReceiptRuleSetName = java.lang.String
  type ReceiptRuleSetsLists = js.Array[typingsJapgolly.awsSdk.sesMod.ReceiptRuleSetMetadata]
  type ReceiptRulesList = js.Array[typingsJapgolly.awsSdk.sesMod.ReceiptRule]
  type Recipient = java.lang.String
  type RecipientsList = js.Array[typingsJapgolly.awsSdk.sesMod.Recipient]
  type RemoteMta = java.lang.String
  type RenderedTemplate = java.lang.String
  type ReportingMta = java.lang.String
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`UTF-8`
    - typingsJapgolly.awsSdk.awsSdkStrings.Base64
    - java.lang.String
  */
  type SNSActionEncoding = typingsJapgolly.awsSdk.sesMod._SNSActionEncoding | java.lang.String
  type SendDataPointList = js.Array[typingsJapgolly.awsSdk.sesMod.SendDataPoint]
  type SentLast24Hours = scala.Double
  type StopScope = typingsJapgolly.awsSdk.awsSdkStrings.RuleSet | java.lang.String
  type Subject = java.lang.String
  type SubjectPart = java.lang.String
  type SuccessRedirectionURL = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateData = java.lang.String
  type TemplateMetadataList = js.Array[typingsJapgolly.awsSdk.sesMod.TemplateMetadata]
  type TemplateName = java.lang.String
  type TextPart = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Require_
    - typingsJapgolly.awsSdk.awsSdkStrings.Optional_
    - java.lang.String
  */
  type TlsPolicy = typingsJapgolly.awsSdk.sesMod._TlsPolicy | java.lang.String
  type VerificationAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sesMod.IdentityVerificationAttributes]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.TemporaryFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
    - java.lang.String
  */
  type VerificationStatus = typingsJapgolly.awsSdk.sesMod._VerificationStatus | java.lang.String
  type VerificationToken = java.lang.String
  type VerificationTokenList = js.Array[typingsJapgolly.awsSdk.sesMod.VerificationToken]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2010-12-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.sesMod._apiVersion | java.lang.String
}
