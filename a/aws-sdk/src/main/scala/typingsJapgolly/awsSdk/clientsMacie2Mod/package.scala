package typingsJapgolly.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
import typingsJapgolly.awsSdk.awsSdkStrings.AWS_API_CALL
import typingsJapgolly.awsSdk.awsSdkStrings.S3_OBJECT
import typingsJapgolly.awsSdk.awsSdkStrings.SENSITIVE_DATA_DISCOVERY_JOB
import typingsJapgolly.awsSdk.awsSdkStrings.TERABYTES
import typingsJapgolly.awsSdk.awsSdkStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING_IN_PROGRESS
  - java.lang.String
*/
type AdminStatus = _AdminStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OK
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_OBJECT_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_USER_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_OBJECT_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_OBJECT_OVERSIZE
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_OBJECT_EMPTY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - java.lang.String
*/
type AllowListStatusCode = _AllowListStatusCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type AllowsUnencryptedObjectUploads = _AllowsUnencryptedObjectUploads | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type AvailabilityCode = _AvailabilityCode | String

type BucketCriteria = StringDictionary[BucketCriteriaAdditionalProperties]

type BucketMetadataErrorCode = ACCESS_DENIED | String

type Cells = js.Array[Cell]

type Criterion = StringDictionary[CriterionAdditionalProperties]

type Currency = USD | String

type CustomDetections = js.Array[CustomDetection]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type DataIdentifierSeverity = _DataIdentifierSeverity | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUNDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.MONDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.TUESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEDNESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.THURSDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.FRIDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type DayOfWeek = _DayOfWeek | String

type DefaultDetections = js.Array[DefaultDetection]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type EffectivePermission = _EffectivePermission | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256
  - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ClientError
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type FindingActionType = AWS_API_CALL | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLASSIFICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.POLICY
  - java.lang.String
*/
type FindingCategory = _FindingCategory | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
  - typingsJapgolly.awsSdk.awsSdkStrings.ONE_HOUR
  - typingsJapgolly.awsSdk.awsSdkStrings.SIX_HOURS
  - java.lang.String
*/
type FindingPublishingFrequency = _FindingPublishingFrequency | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.groupKey
  - typingsJapgolly.awsSdk.awsSdkStrings.count__
  - java.lang.String
*/
type FindingStatisticsSortAttributeName = _FindingStatisticsSortAttributeName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashMultiple
  - typingsJapgolly.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashFinancial
  - typingsJapgolly.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashPersonal
  - typingsJapgolly.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCredentials
  - typingsJapgolly.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCustomIdentifier
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketPublic
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketSharedExternally
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketReplicatedExternally
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketEncryptionDisabled
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BlockPublicAccessDisabled
  - java.lang.String
*/
type FindingType = _FindingType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NOOP
  - java.lang.String
*/
type FindingsFilterAction = _FindingsFilterAction | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.resourcesAffectedDots3BucketDotname
  - typingsJapgolly.awsSdk.awsSdkStrings.type__
  - typingsJapgolly.awsSdk.awsSdkStrings.classificationDetailsDotjobId
  - typingsJapgolly.awsSdk.awsSdkStrings.severityDotdescription
  - java.lang.String
*/
type GroupBy = _GroupBy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type IsDefinedInJob = _IsDefinedInJob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type IsMonitoredByJob = _IsMonitoredByJob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.GTE
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.LTE
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTS_WITH
  - java.lang.String
*/
type JobComparator = _JobComparator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.IDLE
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_PAUSED
  - java.lang.String
*/
type JobStatus = _JobStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONE_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
  - java.lang.String
*/
type JobType = _JobType | String

type KeyValuePairList = js.Array[KeyValuePair]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type LastRunErrorStatusCode = _LastRunErrorStatusCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.jobType
  - typingsJapgolly.awsSdk.awsSdkStrings.jobStatus_
  - typingsJapgolly.awsSdk.awsSdkStrings.createdAt_
  - typingsJapgolly.awsSdk.awsSdkStrings.name__
  - java.lang.String
*/
type ListJobsFilterKey = _ListJobsFilterKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.createdAt_
  - typingsJapgolly.awsSdk.awsSdkStrings.jobStatus_
  - typingsJapgolly.awsSdk.awsSdkStrings.name__
  - typingsJapgolly.awsSdk.awsSdkStrings.jobType
  - java.lang.String
*/
type ListJobsSortAttributeName = _ListJobsSortAttributeName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type MacieStatus = _MacieStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.EXCLUDE
  - typingsJapgolly.awsSdk.awsSdkStrings.INCLUDE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ManagedDataIdentifierSelector = _ManagedDataIdentifierSelector | String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type OrderBy = _OrderBy | String

type OriginType = SENSITIVE_DATA_DISCOVERY_JOB | String

type Pages = js.Array[Page]

type Ranges = js.Array[Range]

type Records = js.Array[Record]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Paused_
  - typingsJapgolly.awsSdk.awsSdkStrings.Invited_
  - typingsJapgolly.awsSdk.awsSdkStrings.Created_
  - typingsJapgolly.awsSdk.awsSdkStrings.Removed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Resigned_
  - typingsJapgolly.awsSdk.awsSdkStrings.EmailVerificationInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.EmailVerificationFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.RegionDisabled
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountSuspended
  - java.lang.String
*/
type RelationshipStatus = _RelationshipStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type RevealRequestStatus = _RevealRequestStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type RevealStatus = _RevealStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT_EXTENSION
  - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT_LAST_MODIFIED_DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT_SIZE
  - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT_KEY
  - java.lang.String
*/
type ScopeFilterKey = _ScopeFilterKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - java.lang.String
*/
type SearchResourcesComparator = _SearchResourcesComparator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BUCKET_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BUCKET_EFFECTIVE_PERMISSION
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BUCKET_SHARED_ACCESS
  - java.lang.String
*/
type SearchResourcesSimpleCriterionKey = _SearchResourcesSimpleCriterionKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_CLASSIFIABLE_OBJECT_COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_CLASSIFIABLE_SIZE_IN_BYTES
  - java.lang.String
*/
type SearchResourcesSortAttributeName = _SearchResourcesSortAttributeName | String

type SensitiveData = js.Array[SensitiveDataItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FINANCIAL_INFORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSONAL_INFORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CREDENTIALS
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_IDENTIFIER
  - java.lang.String
*/
type SensitiveDataItemCategory = _SensitiveDataItemCategory | String

type SensitiveDataOccurrences = StringDictionary[listOfDetectedDataDetails]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Low_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type SeverityDescription = _SeverityDescription | String

type SeverityLevelList = js.Array[SeverityLevel]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SHARED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type SharedAccess = _SharedAccess | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BUCKET_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BUCKET_EFFECTIVE_PERMISSION
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BUCKET_SHARED_ACCESS
  - java.lang.String
*/
type SimpleCriterionKeyForJob = _SimpleCriterionKeyForJob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type TagMap = StringDictionary[string]

type TagTarget = S3_OBJECT | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MONTH_TO_DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.PAST_30_DAYS
  - java.lang.String
*/
type TimeRange = _TimeRange | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256
  - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
  - java.lang.String
*/
type Type = _Type | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT_EXCEEDS_SIZE_QUOTA
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_OBJECT_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_FINDING_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_CLASSIFICATION_RESULT
  - typingsJapgolly.awsSdk.awsSdkStrings.OBJECT_UNAVAILABLE
  - java.lang.String
*/
type UnavailabilityReasonCode = _UnavailabilityReasonCode | String

type Unit = TERABYTES | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.GTE
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.LTE
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type UsageStatisticsFilterComparator = _UsageStatisticsFilterComparator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.accountId_
  - typingsJapgolly.awsSdk.awsSdkStrings.serviceLimit
  - typingsJapgolly.awsSdk.awsSdkStrings.freeTrialStartDate
  - typingsJapgolly.awsSdk.awsSdkStrings.total_
  - java.lang.String
*/
type UsageStatisticsFilterKey = _UsageStatisticsFilterKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.accountId_
  - typingsJapgolly.awsSdk.awsSdkStrings.total_
  - typingsJapgolly.awsSdk.awsSdkStrings.serviceLimitValue
  - typingsJapgolly.awsSdk.awsSdkStrings.freeTrialStartDate
  - java.lang.String
*/
type UsageStatisticsSortKey = _UsageStatisticsSortKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_INVENTORY_EVALUATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SENSITIVE_DATA_DISCOVERY
  - java.lang.String
*/
type UsageType = _UsageType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AssumedRole
  - typingsJapgolly.awsSdk.awsSdkStrings.IAMUser
  - typingsJapgolly.awsSdk.awsSdkStrings.FederatedUser
  - typingsJapgolly.awsSdk.awsSdkStrings.Root_
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSAccount
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSService
  - java.lang.String
*/
type UserIdentityType = _UserIdentityType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-01-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type integer = Double

type listOfAdminAccount = js.Array[AdminAccount]

type listOfAllowListSummary = js.Array[AllowListSummary]

type listOfBatchGetCustomDataIdentifierSummary = js.Array[BatchGetCustomDataIdentifierSummary]

type listOfBucketMetadata = js.Array[BucketMetadata]

type listOfCriteriaForJob = js.Array[CriteriaForJob]

type listOfCustomDataIdentifierSummary = js.Array[CustomDataIdentifierSummary]

type listOfDetectedDataDetails = js.Array[DetectedDataDetails]

type listOfFinding = js.Array[Finding]

type listOfFindingType = js.Array[FindingType]

type listOfFindingsFilterListItem = js.Array[FindingsFilterListItem]

type listOfGroupCount = js.Array[GroupCount]

type listOfInvitation = js.Array[Invitation]

type listOfJobScopeTerm = js.Array[JobScopeTerm]

type listOfJobSummary = js.Array[JobSummary]

type listOfKeyValuePair = js.Array[KeyValuePair]

type listOfListJobsFilterTerm = js.Array[ListJobsFilterTerm]

type listOfManagedDataIdentifierSummary = js.Array[ManagedDataIdentifierSummary]

type listOfMatchingResource = js.Array[MatchingResource]

type listOfMember = js.Array[Member]

type listOfS3BucketDefinitionForJob = js.Array[S3BucketDefinitionForJob]

type listOfSearchResourcesCriteria = js.Array[SearchResourcesCriteria]

type listOfSearchResourcesTagCriterionPair = js.Array[SearchResourcesTagCriterionPair]

type listOfString = js.Array[string]

type listOfTagCriterionPairForJob = js.Array[TagCriterionPairForJob]

type listOfTagValuePair = js.Array[TagValuePair]

type listOfUnavailabilityReasonCode = js.Array[UnavailabilityReasonCode]

type listOfUnprocessedAccount = js.Array[UnprocessedAccount]

type listOfUsageByAccount = js.Array[UsageByAccount]

type listOfUsageRecord = js.Array[UsageRecord]

type listOfUsageStatisticsFilter = js.Array[UsageStatisticsFilter]

type listOfUsageTotal = js.Array[UsageTotal]

type long = Double

type string = String

type stringMin1Max1024PatternSS = String

type stringMin1Max128 = String

type stringMin1Max128Pattern = String

type stringMin1Max2048 = String

type stringMin1Max512PatternSS = String

type stringMin22Max22PatternAZ0922 = String

type stringMin3Max255PatternAZaZ093255 = String

type stringMin71Max89PatternArnAwsAwsCnAwsUsGovMacie2AZ19920D12AllowListAZ0922 = String

type timestampIso8601 = js.Date
