package typingsJapgolly.awsSdk.clientsRoute53Mod

import typingsJapgolly.awsSdk.awsSdkStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type AWSAccountID = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_HEALTH_CHECKS_BY_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_HOSTED_ZONES_BY_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_REUSABLE_DELEGATION_SETS_BY_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICIES_BY_OWNER
  - java.lang.String
*/
type AccountLimitType = _AccountLimitType | String

type AlarmName = String

type AliasHealthEnabled = Boolean

type AssociateVPCComment = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPSERT
  - java.lang.String
*/
type ChangeAction = _ChangeAction | String

type ChangeId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.INSYNC
  - java.lang.String
*/
type ChangeStatus = _ChangeStatus | String

type Changes = js.Array[Change]

type CheckerIpRanges = js.Array[IPAddressCidr]

type ChildHealthCheckList = js.Array[HealthCheckId]

type Cidr = String

type CidrBlockSummaries = js.Array[CidrBlockSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUT
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IF_EXISTS
  - java.lang.String
*/
type CidrCollectionChangeAction = _CidrCollectionChangeAction | String

type CidrCollectionChanges = js.Array[CidrCollectionChange]

type CidrList = js.Array[Cidr]

type CidrLocationNameDefaultAllowed = String

type CidrLocationNameDefaultNotAllowed = String

type CidrNonce = String

type CloudWatchLogsLogGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`me-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`me-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-northwest-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`af-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-iso-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-iso-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-isob-east-1`
  - java.lang.String
*/
type CloudWatchRegion = _CloudWatchRegion | String

type CollectionName = String

type CollectionSummaries = js.Array[CollectionSummary]

type CollectionVersion = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type DNSName = String

type DNSRCode = String

type DelegationSetNameServers = js.Array[DNSName]

type DelegationSets = js.Array[DelegationSet]

type DimensionField = String

type DimensionList = js.Array[Dimension]

type Disabled = Boolean

type DisassociateVPCComment = String

type EnableSNI = Boolean

type EvaluationPeriods = Double

type FailureThreshold = Double

type FullyQualifiedDomainName = String

type GeoLocationContinentCode = String

type GeoLocationContinentName = String

type GeoLocationCountryCode = String

type GeoLocationCountryName = String

type GeoLocationDetailsList = js.Array[GeoLocationDetails]

type GeoLocationSubdivisionCode = String

type GeoLocationSubdivisionName = String

type HealthCheckCount = Double

type HealthCheckId = String

type HealthCheckNonce = String

type HealthCheckObservations = js.Array[HealthCheckObservation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - java.lang.String
*/
type HealthCheckRegion = _HealthCheckRegion | String

type HealthCheckRegionList = js.Array[HealthCheckRegion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_STR_MATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS_STR_MATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.TCP
  - typingsJapgolly.awsSdk.awsSdkStrings.CALCULATED
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC
  - typingsJapgolly.awsSdk.awsSdkStrings.RECOVERY_CONTROL
  - java.lang.String
*/
type HealthCheckType = _HealthCheckType | String

type HealthCheckVersion = Double

type HealthChecks = js.Array[HealthCheck]

type HealthThreshold = Double

type HostedZoneCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_RRSETS_BY_ZONE
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_VPCS_ASSOCIATED_BY_ZONE
  - java.lang.String
*/
type HostedZoneLimitType = _HostedZoneLimitType | String

type HostedZoneOwningService = String

type HostedZoneRRSetCount = Double

type HostedZoneSummaries = js.Array[HostedZoneSummary]

type HostedZones = js.Array[HostedZone]

type IPAddress = String

type IPAddressCidr = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Healthy_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unhealthy_
  - typingsJapgolly.awsSdk.awsSdkStrings.LastKnownStatus
  - java.lang.String
*/
type InsufficientDataHealthStatus = _InsufficientDataHealthStatus | String

type Inverted = Boolean

type IsPrivateZone = Boolean

type KeySigningKeys = js.Array[KeySigningKey]

type LimitValue = Double

type LocationSummaries = js.Array[LocationSummary]

type MaxResults = String

type MeasureLatency = Boolean

type Message = String

type MetricName = String

type Nameserver = String

type Namespace = String

type Nonce = String

type PageMarker = String

type PageMaxItems = String

type PageTruncated = Boolean

type PaginationToken = String

type Period = Double

type Port = Double

type QueryLoggingConfigId = String

type QueryLoggingConfigs = js.Array[QueryLoggingConfig]

type RData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SOA
  - typingsJapgolly.awsSdk.awsSdkStrings.A
  - typingsJapgolly.awsSdk.awsSdkStrings.TXT
  - typingsJapgolly.awsSdk.awsSdkStrings.NS
  - typingsJapgolly.awsSdk.awsSdkStrings.CNAME
  - typingsJapgolly.awsSdk.awsSdkStrings.MX
  - typingsJapgolly.awsSdk.awsSdkStrings.NAPTR
  - typingsJapgolly.awsSdk.awsSdkStrings.PTR
  - typingsJapgolly.awsSdk.awsSdkStrings.SRV
  - typingsJapgolly.awsSdk.awsSdkStrings.SPF
  - typingsJapgolly.awsSdk.awsSdkStrings.AAAA
  - typingsJapgolly.awsSdk.awsSdkStrings.CAA
  - typingsJapgolly.awsSdk.awsSdkStrings.DS
  - java.lang.String
*/
type RRType = _RRType | String

type RecordData = js.Array[RecordDataEntry]

type RecordDataEntry = String

type RequestInterval = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FullyQualifiedDomainName
  - typingsJapgolly.awsSdk.awsSdkStrings.Regions
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourcePath
  - typingsJapgolly.awsSdk.awsSdkStrings.ChildHealthChecks
  - java.lang.String
*/
type ResettableElementName = _ResettableElementName | String

type ResettableElementNameList = js.Array[ResettableElementName]

type ResourceDescription = String

type ResourceId = String

type ResourcePath = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIMARY
  - typingsJapgolly.awsSdk.awsSdkStrings.SECONDARY
  - java.lang.String
*/
type ResourceRecordSetFailover = _ResourceRecordSetFailover | String

type ResourceRecordSetIdentifier = String

type ResourceRecordSetMultiValueAnswer = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-northwest-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`me-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`af-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-south-1`
  - java.lang.String
*/
type ResourceRecordSetRegion = _ResourceRecordSetRegion | String

type ResourceRecordSetWeight = Double

type ResourceRecordSets = js.Array[ResourceRecordSet]

type ResourceRecords = js.Array[ResourceRecord]

type ResourceTagSetList = js.Array[ResourceTagSet]

type ResourceURI = String

type ReusableDelegationSetLimitType = MAX_ZONES_BY_REUSABLE_DELEGATION_SET | String

type RoutingControlArn = String

type SearchString = String

type ServeSignature = String

type ServicePrincipal = String

type SigningKeyInteger = Double

type SigningKeyName = String

type SigningKeyStatus = String

type SigningKeyStatusMessage = String

type SigningKeyString = String

type SigningKeyTag = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
  - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
  - java.lang.String
*/
type Statistic = _Statistic | String

type Status = String

type SubnetMask = String

type TTL = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagResourceId = String

type TagResourceIdList = js.Array[TagResourceId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.healthcheck
  - typingsJapgolly.awsSdk.awsSdkStrings.hostedzone
  - java.lang.String
*/
type TagResourceType = _TagResourceType | String

type TagValue = String

type Threshold = Double

type TimeStamp = js.Date

type TrafficPolicies = js.Array[TrafficPolicy]

type TrafficPolicyComment = String

type TrafficPolicyDocument = String

type TrafficPolicyId = String

type TrafficPolicyInstanceCount = Double

type TrafficPolicyInstanceId = String

type TrafficPolicyInstanceState = String

type TrafficPolicyInstances = js.Array[TrafficPolicyInstance]

type TrafficPolicyName = String

type TrafficPolicySummaries = js.Array[TrafficPolicySummary]

type TrafficPolicyVersion = Double

type TrafficPolicyVersionMarker = String

type TransportProtocol = String

type UUID = String

type UsageCount = Double

type VPCId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`me-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-iso-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-iso-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-isob-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`me-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`af-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-south-1`
  - java.lang.String
*/
type VPCRegion = _VPCRegion | String

type VPCs = js.Array[VPC]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-04-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
