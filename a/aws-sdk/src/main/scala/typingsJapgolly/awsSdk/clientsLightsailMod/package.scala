package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.AutoSnapshot
import typingsJapgolly.awsSdk.awsSdkStrings.Email_
import typingsJapgolly.awsSdk.awsSdkStrings.mysql__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.inbound__
  - typingsJapgolly.awsSdk.awsSdkStrings.outbound__
  - java.lang.String
*/
type AccessDirection = _AccessDirection | String

type AccessKeyList = js.Array[AccessKey]

type AccessReceiverList = js.Array[ResourceReceivingAccess]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.public__
  - typingsJapgolly.awsSdk.awsSdkStrings.private__
  - java.lang.String
*/
type AccessType = _AccessType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InSync_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.NeverSynced
  - typingsJapgolly.awsSdk.awsSdkStrings.Defaulted
  - java.lang.String
*/
type AccountLevelBpaSyncStatus = _AccountLevelBpaSyncStatus | String

type AddOnList = js.Array[AddOn]

type AddOnRequestList = js.Array[AddOnRequest]

type AddOnType = AutoSnapshot | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OK
  - typingsJapgolly.awsSdk.awsSdkStrings.ALARM
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type AlarmState = _AlarmState | String

type AlarmsList = js.Array[Alarm]

type AttachedDiskList = js.Array[AttachedDisk]

type AttachedDiskMap = StringDictionary[DiskMapList]

type AutoSnapshotDate = String

type AutoSnapshotDetailsList = js.Array[AutoSnapshotDetails]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotFound
  - java.lang.String
*/
type AutoSnapshotStatus = _AutoSnapshotStatus | String

type AvailabilityZoneList = js.Array[AvailabilityZone]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULTED_FOR_SLR_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNC_ON_HOLD
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULTED_FOR_SLR_MISSING_ON_HOLD
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type BPAStatusMessage = _BPAStatusMessage | String

type Base64 = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`dont-cache`
  - typingsJapgolly.awsSdk.awsSdkStrings.cache_
  - java.lang.String
*/
type BehaviorEnum = _BehaviorEnum | String

type BlueprintList = js.Array[Blueprint]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.os_
  - typingsJapgolly.awsSdk.awsSdkStrings.app_
  - java.lang.String
*/
type BlueprintType = _BlueprintType | String

type BucketAccessLogPrefix = String

type BucketBundleList = js.Array[BucketBundle]

type BucketList = js.Array[Bucket]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BucketSizeBytes
  - typingsJapgolly.awsSdk.awsSdkStrings.NumberOfObjects
  - java.lang.String
*/
type BucketMetricName = _BucketMetricName | String

type BucketName = String

type BundleList = js.Array[Bundle]

type CacheBehaviorList = js.Array[CacheBehaviorPerPath]

type CertificateName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ISSUED
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.REVOKED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CertificateStatus = _CertificateStatus | String

type CertificateStatusList = js.Array[CertificateStatus]

type CertificateSummaryList = js.Array[CertificateSummary]

type CloudFormationStackRecordList = js.Array[CloudFormationStackRecord]

type CloudFormationStackRecordSourceInfoList = js.Array[CloudFormationStackRecordSourceInfo]

type CloudFormationStackRecordSourceType = typingsJapgolly.awsSdk.awsSdkStrings.ExportSnapshotRecord | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingVerification
  - typingsJapgolly.awsSdk.awsSdkStrings.Valid_
  - typingsJapgolly.awsSdk.awsSdkStrings.Invalid_
  - java.lang.String
*/
type ContactMethodStatus = _ContactMethodStatus | String

type ContactMethodVerificationProtocol = Email_ | String

type ContactMethodsList = js.Array[ContactMethod]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Email_
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
type ContactProtocol = _ContactProtocol | String

type ContactProtocolsList = js.Array[ContactProtocol]

type ContainerImageList = js.Array[ContainerImage]

type ContainerLabel = String

type ContainerMap = StringDictionary[Container]

type ContainerName = String

type ContainerServiceDeploymentList = js.Array[ContainerServiceDeployment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ContainerServiceDeploymentState = _ContainerServiceDeploymentState | String

type ContainerServiceList = js.Array[ContainerService]

type ContainerServiceLogEventList = js.Array[ContainerServiceLogEvent]

type ContainerServiceMetadataEntry = StringDictionary[String]

type ContainerServiceMetadataEntryList = js.Array[ContainerServiceMetadataEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryUtilization
  - java.lang.String
*/
type ContainerServiceMetricName = _ContainerServiceMetricName | String

type ContainerServiceName = String

type ContainerServicePowerList = js.Array[ContainerServicePower]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.nano
  - typingsJapgolly.awsSdk.awsSdkStrings.micro
  - typingsJapgolly.awsSdk.awsSdkStrings.small__
  - typingsJapgolly.awsSdk.awsSdkStrings.medium__
  - typingsJapgolly.awsSdk.awsSdkStrings.large__
  - typingsJapgolly.awsSdk.awsSdkStrings.xlarge_
  - java.lang.String
*/
type ContainerServicePowerName = _ContainerServicePowerName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
  - typingsJapgolly.awsSdk.awsSdkStrings.TCP
  - typingsJapgolly.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type ContainerServiceProtocol = _ContainerServiceProtocol | String

type ContainerServicePublicDomains = StringDictionary[ContainerServicePublicDomainsList]

type ContainerServicePublicDomainsList = js.Array[String]

type ContainerServiceScale = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYING
  - java.lang.String
*/
type ContainerServiceState = _ContainerServiceState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING_SYSTEM_RESOURCES
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING_NETWORK_INFRASTRUCTURE
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING_CERTIFICATE
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATING_HEALTH_CHECK
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - java.lang.String
*/
type ContainerServiceStateDetailCode = _ContainerServiceStateDetailCode | String

type DiskInfoList = js.Array[DiskInfo]

type DiskList = js.Array[Disk]

type DiskMapList = js.Array[DiskMap]

type DiskSnapshotList = js.Array[DiskSnapshot]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.completed__
  - typingsJapgolly.awsSdk.awsSdkStrings.error__
  - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type DiskSnapshotState = _DiskSnapshotState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.error__
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.`in-use`
  - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type DiskState = _DiskState | String

type DistributionBundleList = js.Array[DistributionBundle]

type DistributionList = js.Array[LightsailDistribution]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Requests_
  - typingsJapgolly.awsSdk.awsSdkStrings.BytesDownloaded
  - typingsJapgolly.awsSdk.awsSdkStrings.BytesUploaded
  - typingsJapgolly.awsSdk.awsSdkStrings.TotalErrorRate
  - typingsJapgolly.awsSdk.awsSdkStrings.Http4xxErrorRate
  - typingsJapgolly.awsSdk.awsSdkStrings.Http5xxErrorRate
  - java.lang.String
*/
type DistributionMetricName = _DistributionMetricName | String

type DomainEntryList = js.Array[DomainEntry]

type DomainEntryOptions = StringDictionary[String]

type DomainEntryOptionsKeys = String

type DomainEntryType = String

type DomainList = js.Array[Domain]

type DomainName = String

type DomainNameList = js.Array[DomainName]

type DomainValidationRecordList = js.Array[DomainValidationRecord]

type EligibleToRenew = String

type Environment = StringDictionary[String]

type ExportSnapshotRecordList = js.Array[ExportSnapshotRecord]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskSnapshot
  - java.lang.String
*/
type ExportSnapshotRecordSourceType = _ExportSnapshotRecordSourceType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.`allow-list`
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type ForwardValues = _ForwardValues | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Accept_
  - typingsJapgolly.awsSdk.awsSdkStrings.`Accept-Charset`
  - typingsJapgolly.awsSdk.awsSdkStrings.`Accept-Datetime`
  - typingsJapgolly.awsSdk.awsSdkStrings.`Accept-Encoding`
  - typingsJapgolly.awsSdk.awsSdkStrings.`Accept-Language`
  - typingsJapgolly.awsSdk.awsSdkStrings.Authorization
  - typingsJapgolly.awsSdk.awsSdkStrings.`CloudFront-Forwarded-Proto`
  - typingsJapgolly.awsSdk.awsSdkStrings.`CloudFront-Is-Desktop-Viewer`
  - typingsJapgolly.awsSdk.awsSdkStrings.`CloudFront-Is-Mobile-Viewer`
  - typingsJapgolly.awsSdk.awsSdkStrings.`CloudFront-Is-SmartTV-Viewer`
  - typingsJapgolly.awsSdk.awsSdkStrings.`CloudFront-Is-Tablet-Viewer`
  - typingsJapgolly.awsSdk.awsSdkStrings.`CloudFront-Viewer-Country`
  - typingsJapgolly.awsSdk.awsSdkStrings.Host_
  - typingsJapgolly.awsSdk.awsSdkStrings.Origin_
  - typingsJapgolly.awsSdk.awsSdkStrings.Referer
  - java.lang.String
*/
type HeaderEnum = _HeaderEnum | String

type HeaderForwardList = js.Array[HeaderEnum]

type HostKeysList = js.Array[HostKeyAttributes]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
  - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type HttpEndpoint = _HttpEndpoint | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
  - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type HttpProtocolIpv6 = _HttpProtocolIpv6 | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.optional__
  - typingsJapgolly.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type HttpTokens = _HttpTokens | String

type IAMAccessKeyId = String

type InUseResourceCount = Double

type IncludeCertificateDetails = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ssh_
  - typingsJapgolly.awsSdk.awsSdkStrings.rdp
  - java.lang.String
*/
type InstanceAccessProtocol = _InstanceAccessProtocol | String

type InstanceEntryList = js.Array[InstanceEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LbDotRegistrationInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.LbDotInitialHealthChecking
  - typingsJapgolly.awsSdk.awsSdkStrings.LbDotInternalError
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotResponseCodeMismatch
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotTimeout
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotFailedHealthChecks
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotNotRegistered
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotNotInUse
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotDeregistrationInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotInvalidState
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotIpUnusable
  - java.lang.String
*/
type InstanceHealthReason = _InstanceHealthReason | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.initial__
  - typingsJapgolly.awsSdk.awsSdkStrings.healthy__
  - typingsJapgolly.awsSdk.awsSdkStrings.unhealthy__
  - typingsJapgolly.awsSdk.awsSdkStrings.unused
  - typingsJapgolly.awsSdk.awsSdkStrings.draining_
  - typingsJapgolly.awsSdk.awsSdkStrings.unavailable__
  - java.lang.String
*/
type InstanceHealthState = _InstanceHealthState | String

type InstanceHealthSummaryList = js.Array[InstanceHealthSummary]

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.applied_
  - java.lang.String
*/
type InstanceMetadataState = _InstanceMetadataState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
  - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed_System
  - typingsJapgolly.awsSdk.awsSdkStrings.BurstCapacityTime
  - typingsJapgolly.awsSdk.awsSdkStrings.BurstCapacityPercentage
  - typingsJapgolly.awsSdk.awsSdkStrings.MetadataNoToken
  - java.lang.String
*/
type InstanceMetricName = _InstanceMetricName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX_UNIX
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - java.lang.String
*/
type InstancePlatform = _InstancePlatform | String

type InstancePlatformList = js.Array[InstancePlatform]

type InstancePortInfoList = js.Array[InstancePortInfo]

type InstancePortStateList = js.Array[InstancePortState]

type InstanceSnapshotList = js.Array[InstanceSnapshot]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.error__
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - java.lang.String
*/
type InstanceSnapshotState = _InstanceSnapshotState | String

type IpAddress = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.dualstack
  - typingsJapgolly.awsSdk.awsSdkStrings.ipv4__
  - java.lang.String
*/
type IpAddressType = _IpAddressType | String

type Ipv6Address = String

type Ipv6AddressList = js.Array[Ipv6Address]

type IsoDate = js.Date

type IssuerCA = String

type KeyAlgorithm = String

type KeyPairList = js.Array[KeyPair]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HealthCheckPath
  - typingsJapgolly.awsSdk.awsSdkStrings.SessionStickinessEnabled
  - typingsJapgolly.awsSdk.awsSdkStrings.SessionStickiness_LB_CookieDurationSeconds
  - typingsJapgolly.awsSdk.awsSdkStrings.HttpsRedirectionEnabled
  - typingsJapgolly.awsSdk.awsSdkStrings.TlsPolicyName
  - java.lang.String
*/
type LoadBalancerAttributeName = _LoadBalancerAttributeName | String

type LoadBalancerConfigurationOptions = StringDictionary[String]

type LoadBalancerList = js.Array[LoadBalancer]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
  - typingsJapgolly.awsSdk.awsSdkStrings.HealthyHostCount
  - typingsJapgolly.awsSdk.awsSdkStrings.UnhealthyHostCount
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceResponseTime
  - typingsJapgolly.awsSdk.awsSdkStrings.RejectedConnectionCount
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestCount
  - java.lang.String
*/
type LoadBalancerMetricName = _LoadBalancerMetricName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_HTTPS
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type LoadBalancerProtocol = _LoadBalancerProtocol | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.active__
  - typingsJapgolly.awsSdk.awsSdkStrings.provisioning_
  - typingsJapgolly.awsSdk.awsSdkStrings.active_impaired
  - typingsJapgolly.awsSdk.awsSdkStrings.failed__
  - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type LoadBalancerState = _LoadBalancerState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - java.lang.String
*/
type LoadBalancerTlsCertificateDomainStatus = _LoadBalancerTlsCertificateDomainStatus | String

type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]

type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type LoadBalancerTlsCertificateFailureReason = _LoadBalancerTlsCertificateFailureReason | String

type LoadBalancerTlsCertificateList = js.Array[LoadBalancerTlsCertificate]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LoadBalancerTlsCertificateRenewalStatus = _LoadBalancerTlsCertificateRenewalStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_COMPROMISE
  - typingsJapgolly.awsSdk.awsSdkStrings.CA_COMPROMISE
  - typingsJapgolly.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUPERCEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
  - typingsJapgolly.awsSdk.awsSdkStrings.A_A_COMPROMISE
  - java.lang.String
*/
type LoadBalancerTlsCertificateRevocationReason = _LoadBalancerTlsCertificateRevocationReason | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ISSUED
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.REVOKED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type LoadBalancerTlsCertificateStatus = _LoadBalancerTlsCertificateStatus | String

type LoadBalancerTlsCertificateSummaryList = js.Array[LoadBalancerTlsCertificateSummary]

type LoadBalancerTlsPolicyList = js.Array[LoadBalancerTlsPolicy]

type LogEventList = js.Array[LogEvent]

type MetricDatapointList = js.Array[MetricDatapoint]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
  - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed_System
  - typingsJapgolly.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
  - typingsJapgolly.awsSdk.awsSdkStrings.HealthyHostCount
  - typingsJapgolly.awsSdk.awsSdkStrings.UnhealthyHostCount
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceResponseTime
  - typingsJapgolly.awsSdk.awsSdkStrings.RejectedConnectionCount
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestCount
  - typingsJapgolly.awsSdk.awsSdkStrings.DatabaseConnections
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskQueueDepth
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeStorageSpace
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkReceiveThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkTransmitThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.BurstCapacityTime
  - typingsJapgolly.awsSdk.awsSdkStrings.BurstCapacityPercentage
  - java.lang.String
*/
type MetricName = _MetricName | String

type MetricPeriod = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

type MetricStatisticList = js.Array[MetricStatistic]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Seconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Microseconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Milliseconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bytes_
  - typingsJapgolly.awsSdk.awsSdkStrings.Kilobytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Megabytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Gigabytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Terabytes_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bits_
  - typingsJapgolly.awsSdk.awsSdkStrings.Kilobits
  - typingsJapgolly.awsSdk.awsSdkStrings.Megabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Gigabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Terabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Percent_
  - typingsJapgolly.awsSdk.awsSdkStrings.Count_
  - typingsJapgolly.awsSdk.awsSdkStrings.BytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.BitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.CountSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type MetricUnit = _MetricUnit | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - typingsJapgolly.awsSdk.awsSdkStrings.udp_
  - typingsJapgolly.awsSdk.awsSdkStrings.icmp_
  - java.lang.String
*/
type NetworkProtocol = _NetworkProtocol | String

type NonEmptyString = String

type NotificationTriggerList = js.Array[AlarmState]

type OperationList = js.Array[Operation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.Started_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type OperationStatus = _OperationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteKnownHostKeys
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.StopInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.StartInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.RebootInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.OpenInstancePublicPorts
  - typingsJapgolly.awsSdk.awsSdkStrings.PutInstancePublicPorts
  - typingsJapgolly.awsSdk.awsSdkStrings.CloseInstancePublicPorts
  - typingsJapgolly.awsSdk.awsSdkStrings.AllocateStaticIp
  - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseStaticIp
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachStaticIp
  - typingsJapgolly.awsSdk.awsSdkStrings.DetachStaticIp
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateDomainEntry
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDomainEntry
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDomain
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDomain
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateInstanceSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInstanceSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateInstancesFromSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateLoadBalancer
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteLoadBalancer
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachInstancesToLoadBalancer
  - typingsJapgolly.awsSdk.awsSdkStrings.DetachInstancesFromLoadBalancer
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateLoadBalancerAttribute
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateLoadBalancerTlsCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteLoadBalancerTlsCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachLoadBalancerTlsCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDisk
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDisk
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachDisk
  - typingsJapgolly.awsSdk.awsSdkStrings.DetachDisk
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDiskSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDiskSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDiskFromSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateRelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateRelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteRelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateRelationalDatabaseFromSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateRelationalDatabaseSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteRelationalDatabaseSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateRelationalDatabaseParameters
  - typingsJapgolly.awsSdk.awsSdkStrings.StartRelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.RebootRelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.StopRelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.EnableAddOn
  - typingsJapgolly.awsSdk.awsSdkStrings.DisableAddOn
  - typingsJapgolly.awsSdk.awsSdkStrings.PutAlarm
  - typingsJapgolly.awsSdk.awsSdkStrings.GetAlarms
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteAlarm
  - typingsJapgolly.awsSdk.awsSdkStrings.TestAlarm
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateContactMethod
  - typingsJapgolly.awsSdk.awsSdkStrings.GetContactMethods
  - typingsJapgolly.awsSdk.awsSdkStrings.SendContactMethodVerification
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteContactMethod
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDistribution
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateDistribution
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDistribution
  - typingsJapgolly.awsSdk.awsSdkStrings.ResetDistributionCache
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachCertificateToDistribution
  - typingsJapgolly.awsSdk.awsSdkStrings.DetachCertificateFromDistribution
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateDistributionBundle
  - typingsJapgolly.awsSdk.awsSdkStrings.SetIpAddressType
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateContainerService
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateContainerService
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteContainerService
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateContainerServiceDeployment
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateContainerServiceRegistryLogin
  - typingsJapgolly.awsSdk.awsSdkStrings.RegisterContainerImage
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteContainerImage
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateBucket
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteBucket
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateBucketAccessKey
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteBucketAccessKey
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateBucketBundle
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateBucket
  - typingsJapgolly.awsSdk.awsSdkStrings.SetResourceAccessForBucket
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateInstanceMetadataOptions
  - java.lang.String
*/
type OperationType = _OperationType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`http-only`
  - typingsJapgolly.awsSdk.awsSdkStrings.`https-only`
  - java.lang.String
*/
type OriginProtocolPolicyEnum = _OriginProtocolPolicyEnum | String

type PartnerIdList = js.Array[NonEmptyString]

type PendingMaintenanceActionList = js.Array[PendingMaintenanceAction]

type Port = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Public_
  - typingsJapgolly.awsSdk.awsSdkStrings.Private_
  - java.lang.String
*/
type PortAccessType = _PortAccessType | String

type PortInfoList = js.Array[PortInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type PortInfoSourceType = _PortInfoSourceType | String

type PortList = js.Array[Port]

type PortMap = StringDictionary[ContainerServiceProtocol]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.open__
  - typingsJapgolly.awsSdk.awsSdkStrings.closed__
  - java.lang.String
*/
type PortState = _PortState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Started_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type RecordState = _RecordState | String

type RegionList = js.Array[Region]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
  - java.lang.String
*/
type RegionName = _RegionName | String

type RelationalDatabaseBlueprintList = js.Array[RelationalDatabaseBlueprint]

type RelationalDatabaseBundleList = js.Array[RelationalDatabaseBundle]

type RelationalDatabaseEngine = mysql__ | String

type RelationalDatabaseEventList = js.Array[RelationalDatabaseEvent]

type RelationalDatabaseList = js.Array[RelationalDatabase]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.DatabaseConnections
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskQueueDepth
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeStorageSpace
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkReceiveThroughput
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkTransmitThroughput
  - java.lang.String
*/
type RelationalDatabaseMetricName = _RelationalDatabaseMetricName | String

type RelationalDatabaseParameterList = js.Array[RelationalDatabaseParameter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
  - typingsJapgolly.awsSdk.awsSdkStrings.PREVIOUS
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type RelationalDatabasePasswordVersion = _RelationalDatabasePasswordVersion | String

type RelationalDatabaseSnapshotList = js.Array[RelationalDatabaseSnapshot]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingAutoRenewal
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingValidation
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type RenewalStatus = _RenewalStatus | String

type RenewalStatusReason = String

type RequestFailureReason = String

type ResourceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.allow__
  - typingsJapgolly.awsSdk.awsSdkStrings.deny__
  - java.lang.String
*/
type ResourceBucketAccess = _ResourceBucketAccess | String

type ResourceName = String

type ResourceNameList = js.Array[ResourceName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ContainerService
  - typingsJapgolly.awsSdk.awsSdkStrings.Instance_
  - typingsJapgolly.awsSdk.awsSdkStrings.StaticIp
  - typingsJapgolly.awsSdk.awsSdkStrings.KeyPair
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.Domain_
  - typingsJapgolly.awsSdk.awsSdkStrings.PeeredVpc
  - typingsJapgolly.awsSdk.awsSdkStrings.LoadBalancer_
  - typingsJapgolly.awsSdk.awsSdkStrings.LoadBalancerTlsCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.Disk
  - typingsJapgolly.awsSdk.awsSdkStrings.DiskSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.RelationalDatabase
  - typingsJapgolly.awsSdk.awsSdkStrings.RelationalDatabaseSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.ExportSnapshotRecord
  - typingsJapgolly.awsSdk.awsSdkStrings.CloudFormationStackRecord
  - typingsJapgolly.awsSdk.awsSdkStrings.Alarm_
  - typingsJapgolly.awsSdk.awsSdkStrings.ContactMethod
  - typingsJapgolly.awsSdk.awsSdkStrings.Distribution
  - typingsJapgolly.awsSdk.awsSdkStrings.Certificate_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bucket
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type RevocationReason = String

type SensitiveString = String

type SerialNumber = String

type StaticIpList = js.Array[StaticIp]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type StatusType = _StatusType | String

type StringList = js.Array[String]

type StringMax256 = String

type SubjectAlternativeNameList = js.Array[DomainName]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimeOfDay = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.breaching
  - typingsJapgolly.awsSdk.awsSdkStrings.notBreaching
  - typingsJapgolly.awsSdk.awsSdkStrings.ignore__
  - typingsJapgolly.awsSdk.awsSdkStrings.missing_
  - java.lang.String
*/
type TreatMissingData = _TreatMissingData | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-28`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type double = Double

type float = Double

type integer = Double

type long = Double

type timestamp = js.Date
