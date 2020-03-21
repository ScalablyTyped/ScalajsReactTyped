package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinpointemailMod {
  type AmazonResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USE_DEFAULT_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECT_MESSAGE
    - java.lang.String
  */
  type BehaviorOnMxFailure = typingsJapgolly.awsSdk.pinpointemailMod._BehaviorOnMxFailure | java.lang.String
  type BlacklistEntries = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.BlacklistEntry]
  type BlacklistItemName = java.lang.String
  type BlacklistItemNames = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.BlacklistItemName]
  type BlacklistReport = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointemailMod.BlacklistEntries]
  type BlacklistingDescription = java.lang.String
  type CampaignId = java.lang.String
  type Charset = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.pinpointemailMod.ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.CloudWatchDimensionConfiguration]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSetNameList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.ConfigurationSetName]
  type CustomRedirectDomain = java.lang.String
  type DailyVolumes = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DailyVolume]
  type DedicatedIpList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DedicatedIp]
  type DefaultDimensionValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_EXPIRATION
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DeliverabilityDashboardAccountStatus = typingsJapgolly.awsSdk.pinpointemailMod._DeliverabilityDashboardAccountStatus | java.lang.String
  type DeliverabilityTestReports = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DeliverabilityTestReport]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type DeliverabilityTestStatus = typingsJapgolly.awsSdk.pinpointemailMod._DeliverabilityTestStatus | java.lang.String
  type DeliverabilityTestSubject = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MESSAGE_TAG
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_HEADER
    - typingsJapgolly.awsSdk.awsSdkStrings.LINK_TAG
    - java.lang.String
  */
  type DimensionValueSource = typingsJapgolly.awsSdk.pinpointemailMod._DimensionValueSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DkimStatus = typingsJapgolly.awsSdk.pinpointemailMod._DkimStatus | java.lang.String
  type DnsToken = java.lang.String
  type DnsTokenList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DnsToken]
  type Domain = java.lang.String
  type DomainDeliverabilityCampaignList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DomainDeliverabilityCampaign]
  type DomainDeliverabilityTrackingOptions = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DomainDeliverabilityTrackingOption]
  type DomainIspPlacements = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.DomainIspPlacement]
  type EmailAddress = java.lang.String
  type EmailAddressList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.EmailAddress]
  type Enabled = scala.Boolean
  type Esp = java.lang.String
  type Esps = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.Esp]
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SEND
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECT
    - typingsJapgolly.awsSdk.awsSdkStrings.BOUNCE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLAINT
    - typingsJapgolly.awsSdk.awsSdkStrings.DELIVERY
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CLICK
    - typingsJapgolly.awsSdk.awsSdkStrings.RENDERING_FAILURE
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.pinpointemailMod._EventType | java.lang.String
  type EventTypes = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.EventType]
  type GeneralEnforcementStatus = java.lang.String
  type Identity = java.lang.String
  type IdentityInfoList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.IdentityInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN
    - typingsJapgolly.awsSdk.awsSdkStrings.MANAGED_DOMAIN
    - java.lang.String
  */
  type IdentityType = typingsJapgolly.awsSdk.pinpointemailMod._IdentityType | java.lang.String
  type ImageUrl = java.lang.String
  type Ip = java.lang.String
  type IpList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.Ip]
  type IspName = java.lang.String
  type IspNameList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.IspName]
  type IspPlacements = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.IspPlacement]
  type LastFreshStart = js.Date
  type ListOfDedicatedIpPools = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.PoolName]
  type MailFromDomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - java.lang.String
  */
  type MailFromDomainStatus = typingsJapgolly.awsSdk.pinpointemailMod._MailFromDomainStatus | java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxSendRate = scala.Double
  type MessageContent = java.lang.String
  type MessageData = java.lang.String
  type MessageTagList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type OutboundMessageId = java.lang.String
  type Percentage = scala.Double
  type Percentage100Wrapper = scala.Double
  type PoolName = java.lang.String
  type RawMessageData = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.pinpointemailMod.Blob | java.lang.String
  type RblName = java.lang.String
  type ReportId = java.lang.String
  type ReportName = java.lang.String
  type SendingPoolName = java.lang.String
  type SentLast24Hours = scala.Double
  type Subject = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.pinpointemailMod.Tag]
  type TagValue = java.lang.String
  type TemplateArn = java.lang.String
  type TemplateData = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRE
    - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type TlsPolicy = typingsJapgolly.awsSdk.pinpointemailMod._TlsPolicy | java.lang.String
  type Volume = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DONE
    - java.lang.String
  */
  type WarmupStatus = typingsJapgolly.awsSdk.pinpointemailMod._WarmupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-07-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.pinpointemailMod._apiVersion | java.lang.String
}
