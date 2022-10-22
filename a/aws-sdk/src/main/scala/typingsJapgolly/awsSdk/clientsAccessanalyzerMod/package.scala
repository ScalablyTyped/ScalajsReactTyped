package typingsJapgolly.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPointArn = java.lang.String

type AccessPointPolicy = java.lang.String

type AccessPreviewFindingId = java.lang.String

type AccessPreviewFindingsList = js.Array[AccessPreviewFinding]

type AccessPreviewId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AccessPreviewStatus = _AccessPreviewStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_CONFIGURATION
  - java.lang.String
*/
type AccessPreviewStatusReasonCode = _AccessPreviewStatusReasonCode | java.lang.String

type AccessPreviewsList = js.Array[AccessPreviewSummary]

type AclCanonicalId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
  - java.lang.String
*/
type AclPermission = _AclPermission | java.lang.String

type AclUri = java.lang.String

type ActionList = js.Array[String]

type AnalyzedResourcesList = js.Array[AnalyzedResourceSummary]

type AnalyzerArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AnalyzerStatus = _AnalyzerStatus | java.lang.String

type AnalyzersList = js.Array[AnalyzerSummary]

type ArchiveRulesList = js.Array[ArchiveRuleSummary]

type Boolean = scala.Boolean

type CloudTrailArn = java.lang.String

type ConditionKeyMap = StringDictionary[String]

type ConfigurationsMap = StringDictionary[Configuration]

type ConfigurationsMapKey = java.lang.String

type FilterCriteriaMap = StringDictionary[Criterion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANGED
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.UNCHANGED
  - java.lang.String
*/
type FindingChangeType = _FindingChangeType | java.lang.String

type FindingId = java.lang.String

type FindingIdList = js.Array[FindingId]

type FindingSourceList = js.Array[FindingSource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.BUCKET_ACL
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_ACCESS_POINT
  - java.lang.String
*/
type FindingSourceType = _FindingSourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOLVED
  - java.lang.String
*/
type FindingStatus = _FindingStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type FindingStatusUpdate = _FindingStatusUpdate | java.lang.String

type FindingsList = js.Array[FindingSummary]

type GeneratedPolicyList = js.Array[GeneratedPolicy]

type GranteePrincipal = java.lang.String

type IamTrustPolicy = java.lang.String

type InlineArchiveRulesList = js.Array[InlineArchiveRule]

type Integer = Double

type IssueCode = java.lang.String

type IssuingAccount = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHORIZATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_QUOTA_EXCEEDED_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_ERROR
  - java.lang.String
*/
type JobErrorCode = _JobErrorCode | java.lang.String

type JobId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type KmsConstraintsKey = java.lang.String

type KmsConstraintsMap = StringDictionary[KmsConstraintsValue]

type KmsConstraintsValue = java.lang.String

type KmsGrantConfigurationsList = js.Array[KmsGrantConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateGrant
  - typingsJapgolly.awsSdk.awsSdkStrings.Decrypt
  - typingsJapgolly.awsSdk.awsSdkStrings.DescribeKey
  - typingsJapgolly.awsSdk.awsSdkStrings.Encrypt
  - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKey
  - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKeyPair
  - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKeyPairWithoutPlaintext
  - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKeyWithoutPlaintext
  - typingsJapgolly.awsSdk.awsSdkStrings.GetPublicKey
  - typingsJapgolly.awsSdk.awsSdkStrings.ReEncryptFrom
  - typingsJapgolly.awsSdk.awsSdkStrings.ReEncryptTo
  - typingsJapgolly.awsSdk.awsSdkStrings.RetireGrant
  - typingsJapgolly.awsSdk.awsSdkStrings.Sign_
  - typingsJapgolly.awsSdk.awsSdkStrings.Verify
  - java.lang.String
*/
type KmsGrantOperation = _KmsGrantOperation | java.lang.String

type KmsGrantOperationsList = js.Array[KmsGrantOperation]

type KmsKeyPoliciesMap = StringDictionary[KmsKeyPolicy]

type KmsKeyPolicy = java.lang.String

type LearnMoreLink = java.lang.String

type ListPolicyGenerationsRequestMaxResultsInteger = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DE
  - typingsJapgolly.awsSdk.awsSdkStrings.EN
  - typingsJapgolly.awsSdk.awsSdkStrings.ES
  - typingsJapgolly.awsSdk.awsSdkStrings.FR
  - typingsJapgolly.awsSdk.awsSdkStrings.IT
  - typingsJapgolly.awsSdk.awsSdkStrings.JA
  - typingsJapgolly.awsSdk.awsSdkStrings.KO
  - typingsJapgolly.awsSdk.awsSdkStrings.PT_BR
  - typingsJapgolly.awsSdk.awsSdkStrings.ZH_CN
  - typingsJapgolly.awsSdk.awsSdkStrings.ZH_TW
  - java.lang.String
*/
type Locale = _Locale | java.lang.String

type LocationList = js.Array[Location]

type Name = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type OrderBy = _OrderBy | java.lang.String

type PathElementList = js.Array[PathElement]

type PolicyDocument = java.lang.String

type PolicyGenerationList = js.Array[PolicyGeneration]

type PolicyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IDENTITY_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_CONTROL_POLICY
  - java.lang.String
*/
type PolicyType = _PolicyType | java.lang.String

type PrincipalArn = java.lang.String

type PrincipalMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SERVICE_ACCESS_DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELEGATED_ADMINISTRATOR_DEREGISTERED
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_LINKED_ROLE_CREATION_FAILED
  - java.lang.String
*/
type ReasonCode = _ReasonCode | java.lang.String

type RegionList = js.Array[String]

type ResourceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSecretsManagerColonColonSecret
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type RetiringPrincipal = java.lang.String

type RoleArn = java.lang.String

type S3AccessPointConfigurationsMap = StringDictionary[S3AccessPointConfiguration]

type S3BucketAclGrantConfigurationsList = js.Array[S3BucketAclGrantConfiguration]

type S3BucketPolicy = java.lang.String

type SecretsManagerSecretKmsId = java.lang.String

type SecretsManagerSecretPolicy = java.lang.String

type SharedViaList = js.Array[String]

type SqsQueuePolicy = java.lang.String

type String = java.lang.String

type TagKeys = js.Array[String]

type TagsMap = StringDictionary[String]

type Timestamp = js.Date

type Token = java.lang.String

type TrailList = js.Array[Trail]

type TrailPropertiesList = js.Array[TrailProperties]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type Type = _Type | java.lang.String

type ValidatePolicyFindingList = js.Array[ValidatePolicyFinding]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_WARNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUGGESTION
  - typingsJapgolly.awsSdk.awsSdkStrings.WARNING
  - java.lang.String
*/
type ValidatePolicyFindingType = _ValidatePolicyFindingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonAccessPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonMultiRegionAccessPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ObjectLambdaColonColonAccessPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonAssumeRolePolicyDocument
  - java.lang.String
*/
type ValidatePolicyResourceType = _ValidatePolicyResourceType | java.lang.String

type ValueList = js.Array[String]

type VpcId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
