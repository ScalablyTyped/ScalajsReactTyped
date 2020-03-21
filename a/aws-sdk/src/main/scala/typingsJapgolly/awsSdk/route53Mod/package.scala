package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object route53Mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_HEALTH_CHECKS_BY_OWNER
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_HOSTED_ZONES_BY_OWNER
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_REUSABLE_DELEGATION_SETS_BY_OWNER
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_TRAFFIC_POLICIES_BY_OWNER
    - java.lang.String
  */
  type AccountLimitType = typingsJapgolly.awsSdk.route53Mod._AccountLimitType | java.lang.String
  type AlarmName = java.lang.String
  type AliasHealthEnabled = scala.Boolean
  type AssociateVPCComment = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPSERT
    - java.lang.String
  */
  type ChangeAction = typingsJapgolly.awsSdk.route53Mod._ChangeAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeStatus = typingsJapgolly.awsSdk.route53Mod._ChangeStatus | java.lang.String
  type Changes = js.Array[typingsJapgolly.awsSdk.route53Mod.Change]
  type CheckerIpRanges = js.Array[typingsJapgolly.awsSdk.route53Mod.IPAddressCidr]
  type ChildHealthCheckList = js.Array[typingsJapgolly.awsSdk.route53Mod.HealthCheckId]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.route53Mod.ClientApiVersions
  type CloudWatchLogsLogGroupArn = java.lang.String
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
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cn-northwest-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
    - java.lang.String
  */
  type CloudWatchRegion = typingsJapgolly.awsSdk.route53Mod._CloudWatchRegion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.route53Mod._ComparisonOperator | java.lang.String
  type DNSName = java.lang.String
  type DNSRCode = java.lang.String
  type DelegationSetNameServers = js.Array[typingsJapgolly.awsSdk.route53Mod.DNSName]
  type DelegationSets = js.Array[typingsJapgolly.awsSdk.route53Mod.DelegationSet]
  type DimensionField = java.lang.String
  type DimensionList = js.Array[typingsJapgolly.awsSdk.route53Mod.Dimension]
  type Disabled = scala.Boolean
  type DisassociateVPCComment = java.lang.String
  type EnableSNI = scala.Boolean
  type EvaluationPeriods = scala.Double
  type FailureThreshold = scala.Double
  type FullyQualifiedDomainName = java.lang.String
  type GeoLocationContinentCode = java.lang.String
  type GeoLocationContinentName = java.lang.String
  type GeoLocationCountryCode = java.lang.String
  type GeoLocationCountryName = java.lang.String
  type GeoLocationDetailsList = js.Array[typingsJapgolly.awsSdk.route53Mod.GeoLocationDetails]
  type GeoLocationSubdivisionCode = java.lang.String
  type GeoLocationSubdivisionName = java.lang.String
  type HealthCheckCount = scala.Double
  type HealthCheckId = java.lang.String
  type HealthCheckNonce = java.lang.String
  type HealthCheckObservations = js.Array[typingsJapgolly.awsSdk.route53Mod.HealthCheckObservation]
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
  type HealthCheckRegion = typingsJapgolly.awsSdk.route53Mod._HealthCheckRegion | java.lang.String
  type HealthCheckRegionList = js.Array[typingsJapgolly.awsSdk.route53Mod.HealthCheckRegion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_STR_MATCH
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS_STR_MATCH
    - typingsJapgolly.awsSdk.awsSdkStrings.TCP
    - typingsJapgolly.awsSdk.awsSdkStrings.CALCULATED
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC
    - java.lang.String
  */
  type HealthCheckType = typingsJapgolly.awsSdk.route53Mod._HealthCheckType | java.lang.String
  type HealthCheckVersion = scala.Double
  type HealthChecks = js.Array[typingsJapgolly.awsSdk.route53Mod.HealthCheck]
  type HealthThreshold = scala.Double
  type HostedZoneCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_RRSETS_BY_ZONE
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX_VPCS_ASSOCIATED_BY_ZONE
    - java.lang.String
  */
  type HostedZoneLimitType = typingsJapgolly.awsSdk.route53Mod._HostedZoneLimitType | java.lang.String
  type HostedZoneRRSetCount = scala.Double
  type HostedZones = js.Array[typingsJapgolly.awsSdk.route53Mod.HostedZone]
  type IPAddress = java.lang.String
  type IPAddressCidr = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Healthy_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unhealthy_
    - typingsJapgolly.awsSdk.awsSdkStrings.LastKnownStatus
    - java.lang.String
  */
  type InsufficientDataHealthStatus = typingsJapgolly.awsSdk.route53Mod._InsufficientDataHealthStatus | java.lang.String
  type Inverted = scala.Boolean
  type IsPrivateZone = scala.Boolean
  type LimitValue = scala.Double
  type MaxResults = java.lang.String
  type MeasureLatency = scala.Boolean
  type Message = java.lang.String
  type MetricName = java.lang.String
  type Nameserver = java.lang.String
  type Namespace = java.lang.String
  type Nonce = java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = java.lang.String
  type PageTruncated = scala.Boolean
  type PaginationToken = java.lang.String
  type Period = scala.Double
  type Port = scala.Double
  type QueryLoggingConfigId = java.lang.String
  type QueryLoggingConfigs = js.Array[typingsJapgolly.awsSdk.route53Mod.QueryLoggingConfig]
  type RData = java.lang.String
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
    - java.lang.String
  */
  type RRType = typingsJapgolly.awsSdk.route53Mod._RRType | java.lang.String
  type RecordData = js.Array[typingsJapgolly.awsSdk.route53Mod.RecordDataEntry]
  type RecordDataEntry = java.lang.String
  type RequestInterval = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FullyQualifiedDomainName
    - typingsJapgolly.awsSdk.awsSdkStrings.Regions
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourcePath
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildHealthChecks
    - java.lang.String
  */
  type ResettableElementName = typingsJapgolly.awsSdk.route53Mod._ResettableElementName | java.lang.String
  type ResettableElementNameList = js.Array[typingsJapgolly.awsSdk.route53Mod.ResettableElementName]
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIMARY
    - typingsJapgolly.awsSdk.awsSdkStrings.SECONDARY
    - java.lang.String
  */
  type ResourceRecordSetFailover = typingsJapgolly.awsSdk.route53Mod._ResourceRecordSetFailover | java.lang.String
  type ResourceRecordSetIdentifier = java.lang.String
  type ResourceRecordSetMultiValueAnswer = scala.Boolean
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
    - java.lang.String
  */
  type ResourceRecordSetRegion = typingsJapgolly.awsSdk.route53Mod._ResourceRecordSetRegion | java.lang.String
  type ResourceRecordSetWeight = scala.Double
  type ResourceRecordSets = js.Array[typingsJapgolly.awsSdk.route53Mod.ResourceRecordSet]
  type ResourceRecords = js.Array[typingsJapgolly.awsSdk.route53Mod.ResourceRecord]
  type ResourceTagSetList = js.Array[typingsJapgolly.awsSdk.route53Mod.ResourceTagSet]
  type ResourceURI = java.lang.String
  type ReusableDelegationSetLimitType = typingsJapgolly.awsSdk.awsSdkStrings.MAX_ZONES_BY_REUSABLE_DELEGATION_SET | java.lang.String
  type SearchString = java.lang.String
  type ServicePrincipal = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Average_
    - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
    - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
    - java.lang.String
  */
  type Statistic = typingsJapgolly.awsSdk.route53Mod._Statistic | java.lang.String
  type Status = java.lang.String
  type SubnetMask = java.lang.String
  type TTL = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.route53Mod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.route53Mod.Tag]
  type TagResourceId = java.lang.String
  type TagResourceIdList = js.Array[typingsJapgolly.awsSdk.route53Mod.TagResourceId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.healthcheck
    - typingsJapgolly.awsSdk.awsSdkStrings.hostedzone
    - java.lang.String
  */
  type TagResourceType = typingsJapgolly.awsSdk.route53Mod._TagResourceType | java.lang.String
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type TimeStamp = js.Date
  type TrafficPolicies = js.Array[typingsJapgolly.awsSdk.route53Mod.TrafficPolicy]
  type TrafficPolicyComment = java.lang.String
  type TrafficPolicyDocument = java.lang.String
  type TrafficPolicyId = java.lang.String
  type TrafficPolicyInstanceCount = scala.Double
  type TrafficPolicyInstanceId = java.lang.String
  type TrafficPolicyInstanceState = java.lang.String
  type TrafficPolicyInstances = js.Array[typingsJapgolly.awsSdk.route53Mod.TrafficPolicyInstance]
  type TrafficPolicyName = java.lang.String
  type TrafficPolicySummaries = js.Array[typingsJapgolly.awsSdk.route53Mod.TrafficPolicySummary]
  type TrafficPolicyVersion = scala.Double
  type TrafficPolicyVersionMarker = java.lang.String
  type TransportProtocol = java.lang.String
  type UsageCount = scala.Double
  type VPCId = java.lang.String
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
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
    - java.lang.String
  */
  type VPCRegion = typingsJapgolly.awsSdk.route53Mod._VPCRegion | java.lang.String
  type VPCs = js.Array[typingsJapgolly.awsSdk.route53Mod.VPC]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-04-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.route53Mod._apiVersion | java.lang.String
}
