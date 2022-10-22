package typingsJapgolly.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
import typingsJapgolly.awsSdk.awsSdkStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AccountIdSet = js.Array[AccountId]

type AccountList = js.Array[Account]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type AccountSortBy = _AccountSortBy | java.lang.String

type AccountStateList = js.Array[AccountState]

type AggCounts = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_REACHABILITY
  - typingsJapgolly.awsSdk.awsSdkStrings.PACKAGE_VULNERABILITY
  - java.lang.String
*/
type AggregationFindingType = _AggregationFindingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER_IMAGE
  - java.lang.String
*/
type AggregationResourceType = _AggregationResourceType | java.lang.String

type AggregationResponseList = js.Array[AggregationResponse]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FINDING_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.TITLE
  - typingsJapgolly.awsSdk.awsSdkStrings.REPOSITORY
  - typingsJapgolly.awsSdk.awsSdkStrings.AMI
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_LAYER
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - java.lang.String
*/
type AggregationType = _AggregationType | java.lang.String

type AmiId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.AFFECTED_INSTANCES
  - java.lang.String
*/
type AmiSortBy = _AmiSortBy | java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type AwsEcrContainerSortBy = _AwsEcrContainerSortBy | java.lang.String

type BatchGetFreeTrialInfoRequestAccountIdsList = js.Array[MeteringAccountId]

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type Component = java.lang.String

type ComponentType = java.lang.String

type CountsList = js.Array[Counts]

type CoverageMapComparison = EQUALS | java.lang.String

type CoverageMapFilterList = js.Array[CoverageMapFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER_IMAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ECR_REPOSITORY
  - java.lang.String
*/
type CoverageResourceType = _CoverageResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUALS
  - java.lang.String
*/
type CoverageStringComparison = _CoverageStringComparison | java.lang.String

type CoverageStringFilterList = js.Array[CoverageStringFilter]

type CoverageStringInput = java.lang.String

type CoveredResources = js.Array[CoveredResource]

type Currency = USD | java.lang.String

type CvssScoreAdjustmentList = js.Array[CvssScoreAdjustment]

type CvssScoreList = js.Array[CvssScore]

type DateFilterList = js.Array[DateFilter]

type DateTimeTimestamp = js.Date

type DelegatedAdminAccountList = js.Array[DelegatedAdminAccount]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - java.lang.String
*/
type DelegatedAdminStatus = _DelegatedAdminStatus | java.lang.String

type DisableResourceTypeList = js.Array[ResourceScanType]

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_FINDINGS
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type Ec2InstanceSortBy = _Ec2InstanceSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type Ec2Platform = _Ec2Platform | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LIFETIME
  - typingsJapgolly.awsSdk.awsSdkStrings.DAYS_30
  - typingsJapgolly.awsSdk.awsSdkStrings.DAYS_180
  - java.lang.String
*/
type EcrRescanDuration = _EcrRescanDuration | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type EcrRescanDurationStatus = _EcrRescanDurationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.SCAN_ON_PUSH
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUOUS_SCAN
  - java.lang.String
*/
type EcrScanFrequency = _EcrScanFrequency | java.lang.String

type EnableResourceTypeList = js.Array[ResourceScanType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALREADY_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPEND_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SSM_UNAVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.SSM_THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENTBRIDGE_UNAVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENTBRIDGE_THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_SCAN_NOT_DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATE_ALL_MEMBERS
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_IS_ISOLATED
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ExternalReportStatus = _ExternalReportStatus | java.lang.String

type FailedAccountList = js.Array[FailedAccount]

type FilePath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.SUPPRESS
  - java.lang.String
*/
type FilterAction = _FilterAction | java.lang.String

type FilterArn = java.lang.String

type FilterArnList = js.Array[FilterArn]

type FilterDescription = java.lang.String

type FilterList = js.Array[Filter]

type FilterName = java.lang.String

type FilterReason = java.lang.String

type FindingArn = java.lang.String

type FindingDescription = java.lang.String

type FindingList = js.Array[Finding]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.SUPPRESSED
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type FindingStatus = _FindingStatus | java.lang.String

type FindingTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_REACHABILITY
  - typingsJapgolly.awsSdk.awsSdkStrings.PACKAGE_VULNERABILITY
  - java.lang.String
*/
type FindingType = _FindingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type FindingTypeSortBy = _FindingTypeSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.YES
  - typingsJapgolly.awsSdk.awsSdkStrings.NO
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL
  - java.lang.String
*/
type FixAvailable = _FixAvailable | java.lang.String

type FreeTrialAccountInfoList = js.Array[FreeTrialAccountInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type FreeTrialInfoErrorCode = _FreeTrialInfoErrorCode | java.lang.String

type FreeTrialInfoErrorList = js.Array[FreeTrialInfoError]

type FreeTrialInfoList = js.Array[FreeTrialInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type FreeTrialStatus = _FreeTrialStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR
  - java.lang.String
*/
type FreeTrialType = _FreeTrialType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SCAN_STATUS_CODE
  - typingsJapgolly.awsSdk.awsSdkStrings.SCAN_STATUS_REASON
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR_REPOSITORY_NAME
  - java.lang.String
*/
type GroupKey = _GroupKey | java.lang.String

type ImageHash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ImageLayerSortBy = _ImageLayerSortBy | java.lang.String

type ImageTagList = js.Array[NonEmptyString]

type IpV4Address = java.lang.String

type IpV4AddressList = js.Array[IpV4Address]

type IpV6Address = java.lang.String

type IpV6AddressList = js.Array[IpV6Address]

type ListAccountPermissionsMaxResults = scala.Double

type ListCoverageMaxResults = scala.Double

type ListDelegatedAdminMaxResults = scala.Double

type ListFilterMaxResults = scala.Double

type ListFindingAggregationsMaxResults = scala.Double

type ListFindingsMaxResults = scala.Double

type ListMembersMaxResults = scala.Double

type ListUsageTotalsMaxResults = scala.Double

type ListUsageTotalsNextToken = java.lang.String

type Long = scala.Double

type MapComparison = EQUALS | java.lang.String

type MapFilterList = js.Array[MapFilter]

type MapKey = java.lang.String

type MapValue = java.lang.String

type MemberList = js.Array[Member]

type MeteringAccountId = java.lang.String

type MonthlyCostEstimate = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TCP
  - typingsJapgolly.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type NetworkProtocol = _NetworkProtocol | java.lang.String

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

type NonEmptyStringList = js.Array[NonEmptyString]

type NumberFilterList = js.Array[NumberFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_SCANNING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE_SCANNING
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_REPOSITORY
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE_REPOSITORY
  - java.lang.String
*/
type Operation = _Operation | java.lang.String

type OwnerId = java.lang.String

type PackageArchitecture = java.lang.String

type PackageEpoch = scala.Double

type PackageFilterList = js.Array[PackageFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUNDLER
  - typingsJapgolly.awsSdk.awsSdkStrings.CARGO
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPOSER
  - typingsJapgolly.awsSdk.awsSdkStrings.NPM
  - typingsJapgolly.awsSdk.awsSdkStrings.NUGET
  - typingsJapgolly.awsSdk.awsSdkStrings.PIPENV
  - typingsJapgolly.awsSdk.awsSdkStrings.POETRY
  - typingsJapgolly.awsSdk.awsSdkStrings.YARN
  - typingsJapgolly.awsSdk.awsSdkStrings.GOBINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.GOMOD
  - typingsJapgolly.awsSdk.awsSdkStrings.JAR
  - typingsJapgolly.awsSdk.awsSdkStrings.OS
  - typingsJapgolly.awsSdk.awsSdkStrings.PIP
  - typingsJapgolly.awsSdk.awsSdkStrings.PYTHONPKG
  - typingsJapgolly.awsSdk.awsSdkStrings.NODEPKG
  - typingsJapgolly.awsSdk.awsSdkStrings.POM
  - java.lang.String
*/
type PackageManager = _PackageManager | java.lang.String

type PackageName = java.lang.String

type PackageRelease = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type PackageSortBy = _PackageSortBy | java.lang.String

type PackageVersion = java.lang.String

type Permissions = js.Array[Permission]

type Platform = java.lang.String

type Port = scala.Double

type PortRangeFilterList = js.Array[PortRangeFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVITED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESIGNED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_VERIFICATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_VERIFICATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REGION_DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_SUSPENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANNOT_CREATE_DETECTOR_IN_ORG_MASTER
  - java.lang.String
*/
type RelationshipStatus = _RelationshipStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type ReportFormat = _ReportFormat | java.lang.String

type ReportId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PERMISSIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_FINDINGS_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.BUCKET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPATIBLE_BUCKET_REGION
  - typingsJapgolly.awsSdk.awsSdkStrings.MALFORMED_KMS_KEY
  - java.lang.String
*/
type ReportingErrorCode = _ReportingErrorCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.AFFECTED_IMAGES
  - java.lang.String
*/
type RepositorySortBy = _RepositorySortBy | java.lang.String

type ResourceId = java.lang.String

type ResourceList = js.Array[Resource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR
  - java.lang.String
*/
type ResourceScanType = _ResourceScanType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER_IMAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ECR_REPOSITORY
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ScanStatusCode = _ScanStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_INITIAL_SCAN
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.UNMANAGED_EC2_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_OS
  - typingsJapgolly.awsSdk.awsSdkStrings.SCAN_ELIGIBILITY_EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_RESOURCES_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_SIZE_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.SCAN_FREQUENCY_MANUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.SCAN_FREQUENCY_SCAN_ON_PUSH
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2_INSTANCE_STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DISABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_INVENTORY
  - typingsJapgolly.awsSdk.awsSdkStrings.STALE_INVENTORY
  - java.lang.String
*/
type ScanStatusReason = _ScanStatusReason | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK
  - typingsJapgolly.awsSdk.awsSdkStrings.PACKAGE
  - java.lang.String
*/
type ScanType = _ScanType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR
  - java.lang.String
*/
type Service = _Service | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INFORMATIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.UNTRIAGED
  - java.lang.String
*/
type Severity = _Severity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.FINDING_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.SEVERITY
  - typingsJapgolly.awsSdk.awsSdkStrings.FIRST_OBSERVED_AT
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_OBSERVED_AT
  - typingsJapgolly.awsSdk.awsSdkStrings.FINDING_STATUS
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR_IMAGE_PUSHED_AT
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR_IMAGE_REPOSITORY_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR_IMAGE_REGISTRY
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_PROTOCOL
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPONENT_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.VULNERABILITY_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.VULNERABILITY_SOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.INSPECTOR_SCORE
  - typingsJapgolly.awsSdk.awsSdkStrings.VENDOR_SEVERITY
  - java.lang.String
*/
type SortField = _SortField | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceLayerHash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StepList = js.Array[Step]

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.PREFIX
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUALS
  - java.lang.String
*/
type StringComparison = _StringComparison | java.lang.String

type StringFilterList = js.Array[StringFilter]

type StringInput = java.lang.String

type StringList = js.Array[NonEmptyString]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[String]

type TagMap = StringDictionary[MapValue]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TitleSortBy = _TitleSortBy | java.lang.String

type UsageAccountId = java.lang.String

type UsageAccountIdList = js.Array[UsageAccountId]

type UsageList = js.Array[Usage]

type UsageTotalList = js.Array[UsageTotal]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2_INSTANCE_HOURS
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR_INITIAL_SCAN
  - typingsJapgolly.awsSdk.awsSdkStrings.ECR_RESCAN
  - java.lang.String
*/
type UsageType = _UsageType | java.lang.String

type UsageValue = scala.Double

type VulnerabilityId = java.lang.String

type VulnerabilityIdList = js.Array[VulnerabilityId]

type VulnerablePackageList = js.Array[VulnerablePackage]

type VulnerablePackageRemediation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-06-08`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
