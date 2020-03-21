package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alexaforbusinessMod {
  type Address = java.lang.String
  type AddressBookDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.AddressBookData]
  type AddressBookDescription = java.lang.String
  type AddressBookName = java.lang.String
  type AmazonId = java.lang.String
  type ApplianceDescription = java.lang.String
  type ApplianceFriendlyName = java.lang.String
  type ApplianceManufacturerName = java.lang.String
  type Arn = java.lang.String
  type AudioList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Audio]
  type AudioLocation = java.lang.String
  type AuthorizationResult = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.alexaforbusinessMod.Value]
  type Boolean = scala.Boolean
  type BulletPoint = java.lang.String
  type BulletPoints = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.BulletPoint]
  type BusinessReportDeliveryTime = js.Date
  type BusinessReportDownloadUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_SUCH_BUCKET
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type BusinessReportFailureCode = typingsJapgolly.awsSdk.alexaforbusinessMod._BusinessReportFailureCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV_ZIP
    - java.lang.String
  */
  type BusinessReportFormat = typingsJapgolly.awsSdk.alexaforbusinessMod._BusinessReportFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ONE_DAY
    - typingsJapgolly.awsSdk.awsSdkStrings.ONE_WEEK
    - typingsJapgolly.awsSdk.awsSdkStrings.THIRTY_DAYS
    - java.lang.String
  */
  type BusinessReportInterval = typingsJapgolly.awsSdk.alexaforbusinessMod._BusinessReportInterval | java.lang.String
  type BusinessReportS3Path = java.lang.String
  type BusinessReportScheduleList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.BusinessReportSchedule]
  type BusinessReportScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BusinessReportStatus = typingsJapgolly.awsSdk.alexaforbusinessMod._BusinessReportStatus | java.lang.String
  type CategoryId = scala.Double
  type CategoryList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Category]
  type CategoryName = java.lang.String
  type CertificateTime = js.Date
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.alexaforbusinessMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIP
    - typingsJapgolly.awsSdk.awsSdkStrings.SIPS
    - typingsJapgolly.awsSdk.awsSdkStrings.H323
    - java.lang.String
  */
  type CommsProtocol = typingsJapgolly.awsSdk.alexaforbusinessMod._CommsProtocol | java.lang.String
  type ConferenceProviderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CHIME
    - typingsJapgolly.awsSdk.awsSdkStrings.BLUEJEANS
    - typingsJapgolly.awsSdk.awsSdkStrings.FUZE
    - typingsJapgolly.awsSdk.awsSdkStrings.GOOGLE_HANGOUTS
    - typingsJapgolly.awsSdk.awsSdkStrings.POLYCOM
    - typingsJapgolly.awsSdk.awsSdkStrings.RINGCENTRAL
    - typingsJapgolly.awsSdk.awsSdkStrings.SKYPE_FOR_BUSINESS
    - typingsJapgolly.awsSdk.awsSdkStrings.WEBEX
    - typingsJapgolly.awsSdk.awsSdkStrings.ZOOM
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ConferenceProviderType = typingsJapgolly.awsSdk.alexaforbusinessMod._ConferenceProviderType | java.lang.String
  type ConferenceProvidersList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.ConferenceProvider]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type ConnectionStatus = typingsJapgolly.awsSdk.alexaforbusinessMod._ConnectionStatus | java.lang.String
  type ConnectionStatusUpdatedTime = js.Date
  type ContactDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.ContactData]
  type ContactName = java.lang.String
  type CountryCode = java.lang.String
  type CurrentWiFiPassword = java.lang.String
  type CustomerS3BucketName = java.lang.String
  type Date = java.lang.String
  type DeveloperName = java.lang.String
  type DeviceDataCreatedTime = js.Date
  type DeviceDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceData]
  type DeviceEventList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceEvent]
  type DeviceEventTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_STATUS
    - java.lang.String
  */
  type DeviceEventType = typingsJapgolly.awsSdk.alexaforbusinessMod._DeviceEventType | java.lang.String
  type DeviceEventValue = java.lang.String
  type DeviceLocale = java.lang.String
  type DeviceName = java.lang.String
  type DeviceSerialNumber = java.lang.String
  type DeviceSerialNumberForAVS = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.WAS_OFFLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DeviceStatus = typingsJapgolly.awsSdk.alexaforbusinessMod._DeviceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_SOFTWARE_UPDATE_NEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_WAS_OFFLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREDENTIALS_ACCESS_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS_VERSION_MISMATCH
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATION_REJECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTHENTICATION_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.DHCP_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNET_UNAVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DNS_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_ISSUING_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_CERTIFICATE_AUTHORITY
    - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_PROFILE_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PASSWORD_STATE
    - typingsJapgolly.awsSdk.awsSdkStrings.PASSWORD_NOT_FOUND
    - java.lang.String
  */
  type DeviceStatusDetailCode = typingsJapgolly.awsSdk.alexaforbusinessMod._DeviceStatusDetailCode | java.lang.String
  type DeviceStatusDetails = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceStatusDetail]
  type DeviceType = java.lang.String
  type DeviceUsageType = typingsJapgolly.awsSdk.awsSdkStrings.VOICE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.METRIC
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPERIAL
    - java.lang.String
  */
  type DistanceUnit = typingsJapgolly.awsSdk.alexaforbusinessMod._DistanceUnit | java.lang.String
  type Email = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type EnablementType = typingsJapgolly.awsSdk.alexaforbusinessMod._EnablementType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type EnablementTypeFilter = typingsJapgolly.awsSdk.alexaforbusinessMod._EnablementTypeFilter | java.lang.String
  type EndOfMeetingReminderMinutesList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Minutes]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ANNOUNCEMENT_TIME_CHECK
    - typingsJapgolly.awsSdk.awsSdkStrings.ANNOUNCEMENT_VARIABLE_TIME_LEFT
    - typingsJapgolly.awsSdk.awsSdkStrings.CHIME
    - typingsJapgolly.awsSdk.awsSdkStrings.KNOCK
    - java.lang.String
  */
  type EndOfMeetingReminderType = typingsJapgolly.awsSdk.alexaforbusinessMod._EndOfMeetingReminderType | java.lang.String
  type EndUserLicenseAgreement = java.lang.String
  type Endpoint = java.lang.String
  type EnrollmentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERING
    - java.lang.String
  */
  type EnrollmentStatus = typingsJapgolly.awsSdk.alexaforbusinessMod._EnrollmentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BLUETOOTH
    - typingsJapgolly.awsSdk.awsSdkStrings.VOLUME
    - typingsJapgolly.awsSdk.awsSdkStrings.NOTIFICATIONS
    - typingsJapgolly.awsSdk.awsSdkStrings.LISTS
    - typingsJapgolly.awsSdk.awsSdkStrings.SKILLS
    - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_PROFILE
    - typingsJapgolly.awsSdk.awsSdkStrings.SETTINGS
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type Feature = typingsJapgolly.awsSdk.alexaforbusinessMod._Feature | java.lang.String
  type Features = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Feature]
  type FilterKey = java.lang.String
  type FilterList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Filter]
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.FilterValue]
  type GatewayDescription = java.lang.String
  type GatewayGroupDescription = java.lang.String
  type GatewayGroupName = java.lang.String
  type GatewayGroupSummaries = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.GatewayGroupSummary]
  type GatewayName = java.lang.String
  type GatewaySummaries = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.GatewaySummary]
  type GatewayVersion = java.lang.String
  type GenericKeyword = java.lang.String
  type GenericKeywords = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.GenericKeyword]
  type IconUrl = java.lang.String
  type InvocationPhrase = java.lang.String
  type Key = java.lang.String
  type Locale = typingsJapgolly.awsSdk.awsSdkStrings.`en-US` | java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type MaxVolumeLimit = scala.Double
  type Minutes = scala.Double
  type NetworkEapMethod = typingsJapgolly.awsSdk.awsSdkStrings.EAP_TLS | java.lang.String
  type NetworkProfileDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.NetworkProfileData]
  type NetworkProfileDescription = java.lang.String
  type NetworkProfileName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.WEP
    - typingsJapgolly.awsSdk.awsSdkStrings.WPA_PSK
    - typingsJapgolly.awsSdk.awsSdkStrings.WPA2_PSK
    - typingsJapgolly.awsSdk.awsSdkStrings.WPA2_ENTERPRISE
    - java.lang.String
  */
  type NetworkSecurityType = typingsJapgolly.awsSdk.alexaforbusinessMod._NetworkSecurityType | java.lang.String
  type NetworkSsid = java.lang.String
  type NewInThisVersionBulletPoints = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.BulletPoint]
  type NextToken = java.lang.String
  type NextWiFiPassword = java.lang.String
  type OneClickIdDelay = java.lang.String
  type OneClickPinDelay = java.lang.String
  type OrganizationName = java.lang.String
  type OutboundPhoneNumber = java.lang.String
  type PhoneNumberList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.PhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MOBILE
    - typingsJapgolly.awsSdk.awsSdkStrings.WORK
    - typingsJapgolly.awsSdk.awsSdkStrings.HOME
    - java.lang.String
  */
  type PhoneNumberType = typingsJapgolly.awsSdk.alexaforbusinessMod._PhoneNumberType | java.lang.String
  type PrivacyPolicy = java.lang.String
  type ProductDescription = java.lang.String
  type ProductId = java.lang.String
  type ProfileDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.ProfileData]
  type ProfileName = java.lang.String
  type ProviderCalendarId = java.lang.String
  type RawPhoneNumber = java.lang.String
  type ReleaseDate = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.YES
    - typingsJapgolly.awsSdk.awsSdkStrings.NO
    - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type RequirePin = typingsJapgolly.awsSdk.alexaforbusinessMod._RequirePin | java.lang.String
  type ReviewKey = java.lang.String
  type ReviewValue = java.lang.String
  type Reviews = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.alexaforbusinessMod.ReviewValue]
  type RoomDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.RoomData]
  type RoomDescription = java.lang.String
  type RoomName = java.lang.String
  type RoomSkillParameterKey = java.lang.String
  type RoomSkillParameterValue = java.lang.String
  type RoomSkillParameters = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.RoomSkillParameter]
  type S3KeyPrefix = java.lang.String
  type SampleUtterances = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Utterance]
  type ShortDescription = java.lang.String
  type ShortSkillIdList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SkillId]
  type SipAddressList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SipAddress]
  type SipType = typingsJapgolly.awsSdk.awsSdkStrings.WORK | java.lang.String
  type SipUri = java.lang.String
  type SkillGroupDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SkillGroupData]
  type SkillGroupDescription = java.lang.String
  type SkillGroupName = java.lang.String
  type SkillId = java.lang.String
  type SkillListMaxResults = scala.Double
  type SkillName = java.lang.String
  type SkillStoreType = java.lang.String
  type SkillSummaryList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SkillSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type SkillType = typingsJapgolly.awsSdk.alexaforbusinessMod._SkillType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type SkillTypeFilter = typingsJapgolly.awsSdk.alexaforbusinessMod._SkillTypeFilter | java.lang.String
  type SkillTypes = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SkillStoreType]
  type SkillsStoreSkillList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SkillsStoreSkill]
  type SmartHomeApplianceList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.SmartHomeAppliance]
  type SoftwareVersion = java.lang.String
  type SortKey = java.lang.String
  type SortList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Sort]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortValue = typingsJapgolly.awsSdk.alexaforbusinessMod._SortValue | java.lang.String
  type SsmlList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Ssml]
  type SsmlValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAHRENHEIT
    - typingsJapgolly.awsSdk.awsSdkStrings.CELSIUS
    - java.lang.String
  */
  type TemperatureUnit = typingsJapgolly.awsSdk.alexaforbusinessMod._TemperatureUnit | java.lang.String
  type TextList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.Text]
  type TextValue = java.lang.String
  type TimeToLiveInSeconds = scala.Double
  type Timezone = java.lang.String
  type TotalCount = scala.Double
  type TrustAnchor = java.lang.String
  type TrustAnchorList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.TrustAnchor]
  type Url = java.lang.String
  type UserCode = java.lang.String
  type UserDataList = js.Array[typingsJapgolly.awsSdk.alexaforbusinessMod.UserData]
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type Value = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALEXA
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON
    - typingsJapgolly.awsSdk.awsSdkStrings.ECHO
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTER
    - java.lang.String
  */
  type WakeWord = typingsJapgolly.awsSdk.alexaforbusinessMod._WakeWord | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-09`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.alexaforbusinessMod._apiVersion | java.lang.String
  type userFirstName = java.lang.String
  type userLastName = java.lang.String
  type userUserId = java.lang.String
}
