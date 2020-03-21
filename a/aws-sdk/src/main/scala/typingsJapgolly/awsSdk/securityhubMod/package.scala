package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object securityhubMod {
  type AccountDetailsList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AccountDetails]
  type AccountId = java.lang.String
  type AccountIdList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type ActionTargetList = js.Array[typingsJapgolly.awsSdk.securityhubMod.ActionTarget]
  type ArnList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type AvailabilityZones = js.Array[typingsJapgolly.awsSdk.securityhubMod.AvailabilityZone]
  type AwsCloudFrontDistributionOriginItemList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsCloudFrontDistributionOriginItem]
  type AwsEc2NetworkInterfaceSecurityGroupList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsEc2NetworkInterfaceSecurityGroup]
  type AwsEc2SecurityGroupIpPermissionList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsEc2SecurityGroupIpPermission]
  type AwsEc2SecurityGroupIpRangeList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsEc2SecurityGroupIpRange]
  type AwsEc2SecurityGroupIpv6RangeList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsEc2SecurityGroupIpv6Range]
  type AwsEc2SecurityGroupPrefixListIdList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsEc2SecurityGroupPrefixListId]
  type AwsEc2SecurityGroupUserIdGroupPairList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsEc2SecurityGroupUserIdGroupPair]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type AwsIamAccessKeyStatus = typingsJapgolly.awsSdk.securityhubMod._AwsIamAccessKeyStatus | java.lang.String
  type AwsIamRoleAssumeRolePolicyDocument = java.lang.String
  type AwsLambdaFunctionLayerList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsLambdaFunctionLayer]
  type AwsLambdaLayerVersionNumber = scala.Double
  type AwsRdsDbInstanceAssociatedRoles = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsRdsDbInstanceAssociatedRole]
  type AwsRdsDbInstanceVpcSecurityGroups = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsRdsDbInstanceVpcSecurityGroup]
  type AwsSecurityFindingList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsSecurityFinding]
  type AwsSnsTopicSubscriptionList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsSnsTopicSubscription]
  type AwsWafWebAclRuleList = js.Array[typingsJapgolly.awsSdk.securityhubMod.AwsWafWebAclRule]
  type Boolean = scala.Boolean
  type CategoryList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.securityhubMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PASSED
    - typingsJapgolly.awsSdk.awsSdkStrings.WARNING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type ComplianceStatus = typingsJapgolly.awsSdk.securityhubMod._ComplianceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ControlStatus = typingsJapgolly.awsSdk.securityhubMod._ControlStatus | java.lang.String
  type DateFilterList = js.Array[typingsJapgolly.awsSdk.securityhubMod.DateFilter]
  type DateRangeUnit = typingsJapgolly.awsSdk.awsSdkStrings.DAYS | java.lang.String
  type Double = scala.Double
  type FieldMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type ImportFindingsErrorList = js.Array[typingsJapgolly.awsSdk.securityhubMod.ImportFindingsError]
  type InsightList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Insight]
  type InsightResultValueList = js.Array[typingsJapgolly.awsSdk.securityhubMod.InsightResultValue]
  type Integer = scala.Double
  type InvitationList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Invitation]
  type IpFilterList = js.Array[typingsJapgolly.awsSdk.securityhubMod.IpFilter]
  type KeywordFilterList = js.Array[typingsJapgolly.awsSdk.securityhubMod.KeywordFilter]
  type MalwareList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Malware]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OBSERVED
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
    - java.lang.String
  */
  type MalwareState = typingsJapgolly.awsSdk.securityhubMod._MalwareState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADWARE
    - typingsJapgolly.awsSdk.awsSdkStrings.BLENDED_THREAT
    - typingsJapgolly.awsSdk.awsSdkStrings.BOTNET_AGENT
    - typingsJapgolly.awsSdk.awsSdkStrings.COIN_MINER
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPLOIT_KIT
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYLOGGER
    - typingsJapgolly.awsSdk.awsSdkStrings.MACRO
    - typingsJapgolly.awsSdk.awsSdkStrings.POTENTIALLY_UNWANTED
    - typingsJapgolly.awsSdk.awsSdkStrings.SPYWARE
    - typingsJapgolly.awsSdk.awsSdkStrings.RANSOMWARE
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_ACCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOTKIT
    - typingsJapgolly.awsSdk.awsSdkStrings.TROJAN
    - typingsJapgolly.awsSdk.awsSdkStrings.VIRUS
    - typingsJapgolly.awsSdk.awsSdkStrings.WORM
    - java.lang.String
  */
  type MalwareType = typingsJapgolly.awsSdk.securityhubMod._MalwareType | java.lang.String
  type MapFilterComparison = typingsJapgolly.awsSdk.awsSdkStrings.EQUALS | java.lang.String
  type MapFilterList = js.Array[typingsJapgolly.awsSdk.securityhubMod.MapFilter]
  type MaxResults = scala.Double
  type MemberList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Member]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN
    - typingsJapgolly.awsSdk.awsSdkStrings.OUT
    - java.lang.String
  */
  type NetworkDirection = typingsJapgolly.awsSdk.securityhubMod._NetworkDirection | java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type NumberFilterList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NumberFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.aws_
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-cn`
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-us-gov`
    - java.lang.String
  */
  type Partition = typingsJapgolly.awsSdk.securityhubMod._Partition | java.lang.String
  type ProductSubscriptionArnList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type ProductsList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Product]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type RecordState = typingsJapgolly.awsSdk.securityhubMod._RecordState | java.lang.String
  type RelatedFindingList = js.Array[typingsJapgolly.awsSdk.securityhubMod.RelatedFinding]
  type RelatedRequirementsList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type ResourceArn = java.lang.String
  type ResourceList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Resource]
  type ResultList = js.Array[typingsJapgolly.awsSdk.securityhubMod.Result]
  type SecurityGroups = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
    - java.lang.String
  */
  type SeverityRating = typingsJapgolly.awsSdk.securityhubMod._SeverityRating | java.lang.String
  type SortCriteria = js.Array[typingsJapgolly.awsSdk.securityhubMod.SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.asc_
    - typingsJapgolly.awsSdk.awsSdkStrings.desc_
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.securityhubMod._SortOrder | java.lang.String
  type Standards = js.Array[typingsJapgolly.awsSdk.securityhubMod.Standard]
  type StandardsControls = js.Array[typingsJapgolly.awsSdk.securityhubMod.StandardsControl]
  type StandardsInputParameterMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPLETE
    - java.lang.String
  */
  type StandardsStatus = typingsJapgolly.awsSdk.securityhubMod._StandardsStatus | java.lang.String
  type StandardsSubscriptionArns = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[typingsJapgolly.awsSdk.securityhubMod.StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[typingsJapgolly.awsSdk.securityhubMod.StandardsSubscription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
    - typingsJapgolly.awsSdk.awsSdkStrings.PREFIX
    - java.lang.String
  */
  type StringFilterComparison = typingsJapgolly.awsSdk.securityhubMod._StringFilterComparison | java.lang.String
  type StringFilterList = js.Array[typingsJapgolly.awsSdk.securityhubMod.StringFilter]
  type StringList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.securityhubMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.securityhubMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BACKDOOR
    - typingsJapgolly.awsSdk.awsSdkStrings.CARD_STEALER
    - typingsJapgolly.awsSdk.awsSdkStrings.COMMAND_AND_CONTROL
    - typingsJapgolly.awsSdk.awsSdkStrings.DROP_SITE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPLOIT_SITE
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYLOGGER
    - java.lang.String
  */
  type ThreatIntelIndicatorCategory = typingsJapgolly.awsSdk.securityhubMod._ThreatIntelIndicatorCategory | java.lang.String
  type ThreatIntelIndicatorList = js.Array[typingsJapgolly.awsSdk.securityhubMod.ThreatIntelIndicator]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH_MD5
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH_SHA1
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH_SHA256
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH_SHA512
    - typingsJapgolly.awsSdk.awsSdkStrings.IPV4_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.IPV6_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.MUTEX
    - typingsJapgolly.awsSdk.awsSdkStrings.PROCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type ThreatIntelIndicatorType = typingsJapgolly.awsSdk.securityhubMod._ThreatIntelIndicatorType | java.lang.String
  type Timestamp = js.Date
  type TypeList = js.Array[typingsJapgolly.awsSdk.securityhubMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.TRUE_POSITIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.FALSE_POSITIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.BENIGN_POSITIVE
    - java.lang.String
  */
  type VerificationState = typingsJapgolly.awsSdk.securityhubMod._VerificationState | java.lang.String
  type WafExcludedRuleList = js.Array[typingsJapgolly.awsSdk.securityhubMod.WafExcludedRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSIGNED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFERRED
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOLVED
    - java.lang.String
  */
  type WorkflowState = typingsJapgolly.awsSdk.securityhubMod._WorkflowState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.securityhubMod._apiVersion | java.lang.String
}
