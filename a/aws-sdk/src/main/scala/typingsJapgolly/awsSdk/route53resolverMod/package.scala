package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object route53resolverMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.route53resolverMod.ClientApiVersions
  type CreatorRequestId = java.lang.String
  type DomainName = java.lang.String
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.route53resolverMod.FilterValue]
  type Filters = js.Array[typingsJapgolly.awsSdk.route53resolverMod.Filter]
  type Ip = java.lang.String
  type IpAddressCount = scala.Double
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
  type IpAddressStatus = typingsJapgolly.awsSdk.route53resolverMod._IpAddressStatus | java.lang.String
  type IpAddressesRequest = js.Array[typingsJapgolly.awsSdk.route53resolverMod.IpAddressRequest]
  type IpAddressesResponse = js.Array[typingsJapgolly.awsSdk.route53resolverMod.IpAddressResponse]
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INBOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.OUTBOUND
    - java.lang.String
  */
  type ResolverEndpointDirection = typingsJapgolly.awsSdk.route53resolverMod._ResolverEndpointDirection | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_RECOVERING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTION_NEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ResolverEndpointStatus = typingsJapgolly.awsSdk.route53resolverMod._ResolverEndpointStatus | java.lang.String
  type ResolverEndpoints = js.Array[typingsJapgolly.awsSdk.route53resolverMod.ResolverEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.OVERRIDDEN
    - java.lang.String
  */
  type ResolverRuleAssociationStatus = typingsJapgolly.awsSdk.route53resolverMod._ResolverRuleAssociationStatus | java.lang.String
  type ResolverRuleAssociations = js.Array[typingsJapgolly.awsSdk.route53resolverMod.ResolverRuleAssociation]
  type ResolverRulePolicy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ResolverRuleStatus = typingsJapgolly.awsSdk.route53resolverMod._ResolverRuleStatus | java.lang.String
  type ResolverRules = js.Array[typingsJapgolly.awsSdk.route53resolverMod.ResolverRule]
  type ResourceId = java.lang.String
  type Rfc3339TimeString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FORWARD
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.RECURSIVE
    - java.lang.String
  */
  type RuleTypeOption = typingsJapgolly.awsSdk.route53resolverMod._RuleTypeOption | java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.route53resolverMod.ResourceId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SHARED
    - typingsJapgolly.awsSdk.awsSdkStrings.SHARED_WITH_ME
    - typingsJapgolly.awsSdk.awsSdkStrings.SHARED_BY_ME
    - java.lang.String
  */
  type ShareStatus = typingsJapgolly.awsSdk.route53resolverMod._ShareStatus | java.lang.String
  type StatusMessage = java.lang.String
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.route53resolverMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.route53resolverMod.Tag]
  type TagValue = java.lang.String
  type TargetList = js.Array[typingsJapgolly.awsSdk.route53resolverMod.TargetAddress]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-04-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.route53resolverMod._apiVersion | java.lang.String
}
