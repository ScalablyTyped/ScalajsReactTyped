package typingsJapgolly.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EFS
import typingsJapgolly.awsSdk.awsSdkStrings.OAUTH
import typingsJapgolly.awsSdk.awsSdkStrings.SECRETS_MANAGER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_ID
  - java.lang.String
*/
type ArtifactNamespace = _ArtifactNamespace | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
  - java.lang.String
*/
type ArtifactPackaging = _ArtifactPackaging | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CODEPIPELINE
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_ARTIFACTS
  - java.lang.String
*/
type ArtifactsType = _ArtifactsType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OAUTH
  - typingsJapgolly.awsSdk.awsSdkStrings.BASIC_AUTH
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
  - java.lang.String
*/
type AuthType = _AuthType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REPORT_INDIVIDUAL_BUILDS
  - typingsJapgolly.awsSdk.awsSdkStrings.REPORT_AGGREGATED_BATCH
  - java.lang.String
*/
type BatchReportModeType = _BatchReportModeType | java.lang.String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL
  - java.lang.String
*/
type BucketOwnerAccess = _BucketOwnerAccess | java.lang.String

type BuildArtifactsList = js.Array[BuildArtifacts]

type BuildBatchIds = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOAD_BATCHSPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMBINE_ARTIFACTS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type BuildBatchPhaseType = _BuildBatchPhaseType | java.lang.String

type BuildBatchPhases = js.Array[BuildBatchPhase]

type BuildBatches = js.Array[BuildBatch]

type BuildGroups = js.Array[BuildGroup]

type BuildIds = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOAD_SOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALL
  - typingsJapgolly.awsSdk.awsSdkStrings.PRE_BUILD
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
  - typingsJapgolly.awsSdk.awsSdkStrings.POST_BUILD
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLOAD_ARTIFACTS
  - typingsJapgolly.awsSdk.awsSdkStrings.FINALIZING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type BuildPhaseType = _BuildPhaseType | java.lang.String

type BuildPhases = js.Array[BuildPhase]

type BuildReportArns = js.Array[String]

type BuildSummaries = js.Array[BuildSummary]

type Builds = js.Array[Build]

type BuildsNotDeleted = js.Array[BuildNotDeleted]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_DOCKER_LAYER_CACHE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_SOURCE_CACHE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_CUSTOM_CACHE
  - java.lang.String
*/
type CacheMode = _CacheMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_CACHE
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL
  - java.lang.String
*/
type CacheType = _CacheType | java.lang.String

type CodeCoverages = js.Array[CodeCoverage]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_2XLARGE
  - java.lang.String
*/
type ComputeType = _ComputeType | java.lang.String

type ComputeTypesAllowed = js.Array[NonEmptyString]

type CredentialProviderType = SECRETS_MANAGER | java.lang.String

type EnvironmentImages = js.Array[EnvironmentImage]

type EnvironmentLanguages = js.Array[EnvironmentLanguage]

type EnvironmentPlatforms = js.Array[EnvironmentPlatform]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_CONTAINER
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX_CONTAINER
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX_GPU_CONTAINER
  - typingsJapgolly.awsSdk.awsSdkStrings.ARM_CONTAINER
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019_CONTAINER
  - java.lang.String
*/
type EnvironmentType = _EnvironmentType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_STORE
  - typingsJapgolly.awsSdk.awsSdkStrings.SECRETS_MANAGER
  - java.lang.String
*/
type EnvironmentVariableType = _EnvironmentVariableType | java.lang.String

type EnvironmentVariables = js.Array[EnvironmentVariable]

type ExportedEnvironmentVariables = js.Array[ExportedEnvironmentVariable]

type FileSystemType = EFS | java.lang.String

type FilterGroup = js.Array[WebhookFilter]

type FilterGroups = js.Array[FilterGroup]

type GitCloneDepth = Double

type Identifiers = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CODEBUILD
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_ROLE
  - java.lang.String
*/
type ImagePullCredentialsType = _ImagePullCredentialsType | java.lang.String

type ImageVersions = js.Array[String]

type KeyInput = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JAVA
  - typingsJapgolly.awsSdk.awsSdkStrings.PYTHON
  - typingsJapgolly.awsSdk.awsSdkStrings.NODE_JS
  - typingsJapgolly.awsSdk.awsSdkStrings.RUBY
  - typingsJapgolly.awsSdk.awsSdkStrings.GOLANG
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCKER
  - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
  - typingsJapgolly.awsSdk.awsSdkStrings.DOTNET
  - typingsJapgolly.awsSdk.awsSdkStrings.BASE
  - typingsJapgolly.awsSdk.awsSdkStrings.PHP
  - java.lang.String
*/
type LanguageType = _LanguageType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogsConfigStatusType = _LogsConfigStatusType | java.lang.String

type NonEmptyString = java.lang.String

type NonNegativeInt = Double

type PageSize = Double

type Percentage = Double

type PhaseContexts = js.Array[PhaseContext]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEBIAN
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.UBUNTU
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER
  - java.lang.String
*/
type PlatformType = _PlatformType | java.lang.String

type ProjectArns = js.Array[NonEmptyString]

type ProjectArtifactsList = js.Array[ProjectArtifacts]

type ProjectCacheModes = js.Array[CacheMode]

type ProjectDescription = java.lang.String

type ProjectFileSystemLocations = js.Array[ProjectFileSystemLocation]

type ProjectName = java.lang.String

type ProjectNames = js.Array[NonEmptyString]

type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - java.lang.String
*/
type ProjectSortByType = _ProjectSortByType | java.lang.String

type ProjectSources = js.Array[ProjectSource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC_READ
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type ProjectVisibilityType = _ProjectVisibilityType | java.lang.String

type Projects = js.Array[Project]

type ReportArns = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LINE_COVERAGE_PERCENTAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_PATH
  - java.lang.String
*/
type ReportCodeCoverageSortByType = _ReportCodeCoverageSortByType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_EXPORT
  - java.lang.String
*/
type ReportExportConfigType = _ReportExportConfigType | java.lang.String

type ReportGroupArns = js.Array[NonEmptyString]

type ReportGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - java.lang.String
*/
type ReportGroupSortByType = _ReportGroupSortByType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ReportGroupStatusType = _ReportGroupStatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PASS_RATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.TOTAL
  - typingsJapgolly.awsSdk.awsSdkStrings.LINE_COVERAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.LINES_COVERED
  - typingsJapgolly.awsSdk.awsSdkStrings.LINES_MISSED
  - typingsJapgolly.awsSdk.awsSdkStrings.BRANCH_COVERAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.BRANCHES_COVERED
  - typingsJapgolly.awsSdk.awsSdkStrings.BRANCHES_MISSED
  - java.lang.String
*/
type ReportGroupTrendFieldType = _ReportGroupTrendFieldType | java.lang.String

type ReportGroupTrendRawDataList = js.Array[ReportWithRawData]

type ReportGroups = js.Array[ReportGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReportPackagingType = _ReportPackagingType | java.lang.String

type ReportStatusCounts = StringDictionary[WrapperInt]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GENERATING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ReportStatusType = _ReportStatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST
  - typingsJapgolly.awsSdk.awsSdkStrings.CODE_COVERAGE
  - java.lang.String
*/
type ReportType = _ReportType | java.lang.String

type Reports = js.Array[Report]

type ResolvedSecondaryArtifacts = js.Array[ResolvedArtifact]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RETRY_ALL_BUILDS
  - typingsJapgolly.awsSdk.awsSdkStrings.RETRY_FAILED_BUILDS
  - java.lang.String
*/
type RetryBuildBatchType = _RetryBuildBatchType | java.lang.String

type SecurityGroupIds = js.Array[NonEmptyString]

type SensitiveNonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
  - typingsJapgolly.awsSdk.awsSdkStrings.BITBUCKET
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - java.lang.String
*/
type ServerType = _ServerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.MODIFIED_TIME
  - java.lang.String
*/
type SharedResourceSortByType = _SharedResourceSortByType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrderType = _SortOrderType | java.lang.String

type SourceAuthType = OAUTH | java.lang.String

type SourceCredentialsInfos = js.Array[SourceCredentialsInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CODECOMMIT
  - typingsJapgolly.awsSdk.awsSdkStrings.CODEPIPELINE
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.BITBUCKET
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_SOURCE
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type StatusType = _StatusType | java.lang.String

type String = java.lang.String

type Subnets = js.Array[NonEmptyString]

type TagList = js.Array[Tag]

type TestCases = js.Array[TestCase]

type TimeOut = Double

type Timestamp = js.Date

type ValueInput = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_BATCH
  - java.lang.String
*/
type WebhookBuildType = _WebhookBuildType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
  - typingsJapgolly.awsSdk.awsSdkStrings.BASE_REF
  - typingsJapgolly.awsSdk.awsSdkStrings.HEAD_REF
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTOR_ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_PATH
  - typingsJapgolly.awsSdk.awsSdkStrings.COMMIT_MESSAGE
  - java.lang.String
*/
type WebhookFilterType = _WebhookFilterType | java.lang.String

type WrapperBoolean = scala.Boolean

type WrapperInt = Double

type WrapperLong = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-10-06`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
