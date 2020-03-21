package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fmsMod {
  type AWSAccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETION
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type AccountRoleStatus = typingsJapgolly.awsSdk.fmsMod._AccountRoleStatus | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.fmsMod.ClientApiVersions
  type ComplianceViolators = js.Array[typingsJapgolly.awsSdk.fmsMod.ComplianceViolator]
  type CustomerPolicyScopeId = java.lang.String
  type CustomerPolicyScopeIdList = js.Array[typingsJapgolly.awsSdk.fmsMod.CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType = typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type CustomerPolicyScopeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.fmsMod.CustomerPolicyScopeIdList]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSCONFIG
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSWAF
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSSHIELD_ADVANCED
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSVPC
    - java.lang.String
  */
  type DependentServiceName = typingsJapgolly.awsSdk.fmsMod._DependentServiceName | java.lang.String
  type DetailedInfo = java.lang.String
  type EvaluationResults = js.Array[typingsJapgolly.awsSdk.fmsMod.EvaluationResult]
  type IssueInfoMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.fmsMod.DetailedInfo]
  type ManagedServiceData = java.lang.String
  type MemberAccounts = js.Array[typingsJapgolly.awsSdk.fmsMod.AWSAccountId]
  type PaginationMaxResults = scala.Double
  type PaginationToken = java.lang.String
  type PolicyComplianceStatusList = js.Array[typingsJapgolly.awsSdk.fmsMod.PolicyComplianceStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type PolicyComplianceStatusType = typingsJapgolly.awsSdk.fmsMod._PolicyComplianceStatusType | java.lang.String
  type PolicyId = java.lang.String
  type PolicySummaryList = js.Array[typingsJapgolly.awsSdk.fmsMod.PolicySummary]
  type PolicyUpdateToken = java.lang.String
  type ProtectionData = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceCount = scala.Double
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceTagKey = java.lang.String
  type ResourceTagValue = java.lang.String
  type ResourceTags = js.Array[typingsJapgolly.awsSdk.fmsMod.ResourceTag]
  type ResourceType = java.lang.String
  type ResourceTypeList = js.Array[typingsJapgolly.awsSdk.fmsMod.ResourceType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WAF
    - typingsJapgolly.awsSdk.awsSdkStrings.SHIELD_ADVANCED
    - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_COMMON
    - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_CONTENT_AUDIT
    - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_USAGE_AUDIT
    - java.lang.String
  */
  type SecurityServiceType = typingsJapgolly.awsSdk.fmsMod._SecurityServiceType | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.fmsMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.fmsMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = js.Date
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
    - java.lang.String
  */
  type ViolationReason = typingsJapgolly.awsSdk.fmsMod._ViolationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.fmsMod._apiVersion | java.lang.String
}
