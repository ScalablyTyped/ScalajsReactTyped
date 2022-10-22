package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.PALO_ALTO_NETWORKS_CLOUD_NGFW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETION
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type AccountRoleStatus = _AccountRoleStatus | String

type AppsList = js.Array[App]

type AppsListsData = js.Array[AppsListDataSummary]

type AwsEc2NetworkInterfaceViolations = js.Array[AwsEc2NetworkInterfaceViolation]

type BasicInteger = Double

type Boolean = scala.Boolean

type CIDR = String

type ComplianceViolatorMetadata = StringDictionary[LengthBoundedString]

type ComplianceViolators = js.Array[ComplianceViolator]

type CustomerPolicyScopeId = String

type CustomerPolicyScopeIdList = js.Array[CustomerPolicyScopeId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORG_UNIT
  - java.lang.String
*/
type CustomerPolicyScopeIdType = _CustomerPolicyScopeIdType | String

type CustomerPolicyScopeMap = StringDictionary[CustomerPolicyScopeIdList]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSCONFIG
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSWAF
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSSHIELD_ADVANCED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSVPC
  - java.lang.String
*/
type DependentServiceName = _DependentServiceName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IPV4
  - typingsJapgolly.awsSdk.awsSdkStrings.IPV6
  - typingsJapgolly.awsSdk.awsSdkStrings.PREFIX_LIST
  - java.lang.String
*/
type DestinationType = _DestinationType | String

type DetailedInfo = String

type DnsRuleGroupPriorities = js.Array[DnsRuleGroupPriority]

type DnsRuleGroupPriority = Double

type EvaluationResults = js.Array[EvaluationResult]

type ExpectedRoutes = js.Array[ExpectedRoute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CENTRALIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISTRIBUTED
  - java.lang.String
*/
type FirewallDeploymentModel = _FirewallDeploymentModel | String

type FirewallPolicyId = String

type FirewallPolicyName = String

type IPPortNumber = Double

type IssueInfoMap = StringDictionary[DetailedInfo]

type LengthBoundedString = String

type LengthBoundedStringList = js.Array[LengthBoundedString]

type ListId = String

type ManagedServiceData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_SUBSCRIPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - java.lang.String
*/
type MarketplaceSubscriptionOnboardingStatus = _MarketplaceSubscriptionOnboardingStatus | String

type MemberAccounts = js.Array[AWSAccountId]

type NetworkFirewallAction = String

type NetworkFirewallActionList = js.Array[NetworkFirewallAction]

type NetworkFirewallResourceName = String

type OrderedRemediationActions = js.Array[RemediationActionWithOrder]

type PaginationMaxResults = Double

type PaginationToken = String

type PartialMatches = js.Array[PartialMatch]

type PolicyComplianceStatusList = js.Array[PolicyComplianceStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
  - java.lang.String
*/
type PolicyComplianceStatusType = _PolicyComplianceStatusType | String

type PolicyId = String

type PolicySummaryList = js.Array[PolicySummary]

type PolicyUpdateToken = String

type PossibleRemediationActionList = js.Array[PossibleRemediationAction]

type PreviousAppsList = StringDictionary[AppsList]

type PreviousListVersion = String

type PreviousProtocolsList = StringDictionary[ProtocolsList]

type PriorityNumber = Double

type ProtectionData = String

type Protocol = String

type ProtocolsList = js.Array[Protocol]

type ProtocolsListsData = js.Array[ProtocolsListDataSummary]

type ReferenceRule = String

type RemediationActionDescription = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
  - typingsJapgolly.awsSdk.awsSdkStrings.MODIFY
  - java.lang.String
*/
type RemediationActionType = _RemediationActionType | String

type ResourceArn = String

type ResourceCount = Double

type ResourceId = String

type ResourceIdList = js.Array[ResourceId]

type ResourceName = String

type ResourceTagKey = String

type ResourceTagValue = String

type ResourceTags = js.Array[ResourceTag]

type ResourceType = String

type ResourceTypeList = js.Array[ResourceType]

type ResourceViolations = js.Array[ResourceViolation]

type Routes = js.Array[Route]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRICT_ORDER
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_ACTION_ORDER
  - java.lang.String
*/
type RuleOrder = _RuleOrder | String

type SecurityGroupRemediationActions = js.Array[SecurityGroupRemediationAction]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WAF
  - typingsJapgolly.awsSdk.awsSdkStrings.WAFV2
  - typingsJapgolly.awsSdk.awsSdkStrings.SHIELD_ADVANCED
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_COMMON
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_CONTENT_AUDIT
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_USAGE_AUDIT
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_FIREWALL
  - typingsJapgolly.awsSdk.awsSdkStrings.DNS_FIREWALL
  - typingsJapgolly.awsSdk.awsSdkStrings.THIRD_PARTY_FIREWALL
  - java.lang.String
*/
type SecurityServiceType = _SecurityServiceType | String

type StatefulRuleGroupList = js.Array[StatefulRuleGroup]

type StatelessRuleGroupList = js.Array[StatelessRuleGroup]

type StatelessRuleGroupPriority = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.CARRIER_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.NAT_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_INTERFACE
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_ENDPOINT
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_PEERING_CONNECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.EGRESS_ONLY_INTERNET_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSIT_GATEWAY
  - java.lang.String
*/
type TargetType = _TargetType | String

type TargetViolationReason = String

type TargetViolationReasons = js.Array[TargetViolationReason]

type ThirdPartyFirewall = PALO_ALTO_NETWORKS_CLOUD_NGFW | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONBOARDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ONBOARD_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFBOARDING
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFBOARD_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EXIST
  - java.lang.String
*/
type ThirdPartyFirewallAssociationStatus = _ThirdPartyFirewallAssociationStatus | String

type ThirdPartyFirewallFirewallPolicies = js.Array[ThirdPartyFirewallFirewallPolicy]

type TimeStamp = js.Date

type UpdateToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB_ACL_MISSING_RULE_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_MISSING_WEB_ACL
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_INCORRECT_WEB_ACL
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_MISSING_SHIELD_PROTECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_MISSING_SECURITY_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUP_UNUSED
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUP_REDUNDANT
  - typingsJapgolly.awsSdk.awsSdkStrings.FMS_CREATED_SECURITY_GROUP_EDITED
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_FIREWALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_FIREWALL_SUBNET_IN_AZ
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_EXPECTED_ROUTE_TABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_FIREWALL_POLICY_MODIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.FIREWALL_SUBNET_IS_OUT_OF_SCOPE
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE
  - typingsJapgolly.awsSdk.awsSdkStrings.FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNEXPECTED_FIREWALL_ROUTES
  - typingsJapgolly.awsSdk.awsSdkStrings.UNEXPECTED_TARGET_GATEWAY_ROUTES
  - typingsJapgolly.awsSdk.awsSdkStrings.TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ROUTE_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_TARGET_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNET_TRAFFIC_NOT_INSPECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.BLACK_HOLE_ROUTE_DETECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_MISSING_DNS_FIREWALL
  - typingsJapgolly.awsSdk.awsSdkStrings.ROUTE_HAS_OUT_OF_SCOPE_ENDPOINT
  - typingsJapgolly.awsSdk.awsSdkStrings.FIREWALL_SUBNET_MISSING_VPCE_ENDPOINT
  - java.lang.String
*/
type ViolationReason = _ViolationReason | String

type ViolationTarget = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
