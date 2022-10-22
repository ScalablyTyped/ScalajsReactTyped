package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import typingsJapgolly.awsSdk.awsSdkStrings.CNAME
import typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.ALERT
  - java.lang.String
*/
type Action = _Action | String

type Arn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type AutodefinedReverseFlag = _AutodefinedReverseFlag | String

type BlockOverrideDnsType = CNAME | String

type BlockOverrideDomain = String

type BlockOverrideTtl = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NODATA
  - typingsJapgolly.awsSdk.awsSdkStrings.NXDOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERRIDE
  - java.lang.String
*/
type BlockResponse = _BlockResponse | String

type Boolean = scala.Boolean

type Count = Double

type CreatorRequestId = String

type DestinationArn = String

type DomainListFileUrl = String

type DomainName = String

type FilterName = String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

type FirewallConfigList = js.Array[FirewallConfig]

type FirewallDomainImportOperation = REPLACE | String

type FirewallDomainListMetadataList = js.Array[FirewallDomainListMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE_IMPORT_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FirewallDomainListStatus = _FirewallDomainListStatus | String

type FirewallDomainName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type FirewallDomainUpdateOperation = _FirewallDomainUpdateOperation | String

type FirewallDomains = js.Array[FirewallDomainName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type FirewallFailOpenStatus = _FirewallFailOpenStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FirewallRuleGroupAssociationStatus = _FirewallRuleGroupAssociationStatus | String

type FirewallRuleGroupAssociations = js.Array[FirewallRuleGroupAssociation]

type FirewallRuleGroupMetadataList = js.Array[FirewallRuleGroupMetadata]

type FirewallRuleGroupPolicy = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type FirewallRuleGroupStatus = _FirewallRuleGroupStatus | String

type FirewallRules = js.Array[FirewallRule]

type Ip = String

type IpAddressCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_CREATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHING
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMAP_DETACHING
  - typingsJapgolly.awsSdk.awsSdkStrings.REMAP_ATTACHING
  - typingsJapgolly.awsSdk.awsSdkStrings.DETACHING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_RESOURCE_GONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED_FAS_EXPIRED
  - java.lang.String
*/
type IpAddressStatus = _IpAddressStatus | String

type IpAddressesRequest = js.Array[IpAddressRequest]

type IpAddressesResponse = js.Array[IpAddressResponse]

type ListDomainMaxResults = Double

type ListFirewallConfigsMaxResult = Double

type ListResolverConfigsMaxResult = Double

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type MutationProtectionStatus = _MutationProtectionStatus | String

type Name = String

type NextToken = String

type Port = Double

type Priority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ResolverAutodefinedReverseStatus = _ResolverAutodefinedReverseStatus | String

type ResolverConfigList = js.Array[ResolverConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ResolverDNSSECValidationStatus = _ResolverDNSSECValidationStatus | String

type ResolverDnssecConfigList = js.Array[ResolverDnssecConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INBOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTBOUND
  - java.lang.String
*/
type ResolverEndpointDirection = _ResolverEndpointDirection | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_RECOVERING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTION_NEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ResolverEndpointStatus = _ResolverEndpointStatus | String

type ResolverEndpoints = js.Array[ResolverEndpoint]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DESTINATION_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type ResolverQueryLogConfigAssociationError = _ResolverQueryLogConfigAssociationError | String

type ResolverQueryLogConfigAssociationErrorMessage = String

type ResolverQueryLogConfigAssociationList = js.Array[ResolverQueryLogConfigAssociation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTION_NEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResolverQueryLogConfigAssociationStatus = _ResolverQueryLogConfigAssociationStatus | String

type ResolverQueryLogConfigList = js.Array[ResolverQueryLogConfig]

type ResolverQueryLogConfigName = String

type ResolverQueryLogConfigPolicy = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResolverQueryLogConfigStatus = _ResolverQueryLogConfigStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERRIDDEN
  - java.lang.String
*/
type ResolverRuleAssociationStatus = _ResolverRuleAssociationStatus | String

type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]

type ResolverRulePolicy = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResolverRuleStatus = _ResolverRuleStatus | String

type ResolverRules = js.Array[ResolverRule]

type ResourceId = String

type Rfc3339TimeString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FORWARD
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
  - typingsJapgolly.awsSdk.awsSdkStrings.RECURSIVE
  - java.lang.String
*/
type RuleTypeOption = _RuleTypeOption | String

type SecurityGroupIds = js.Array[ResourceId]

type ServicePrinciple = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SHARED
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED_WITH_ME
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED_BY_ME
  - java.lang.String
*/
type ShareStatus = _ShareStatus | String

type SortByKey = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type StatusMessage = String

type SubnetId = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TargetList = js.Array[TargetAddress]

type Unsigned = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type Validation = _Validation | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-04-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
