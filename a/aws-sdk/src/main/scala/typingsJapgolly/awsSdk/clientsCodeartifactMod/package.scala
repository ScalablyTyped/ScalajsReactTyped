package typingsJapgolly.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.Available_
import typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHED_TIME
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - java.lang.String
*/
type AllowPublish = _AllowPublish | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - java.lang.String
*/
type AllowUpstream = _AllowUpstream | java.lang.String

type Arn = java.lang.String

type Asset = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type AssetHashes = StringDictionary[HashValue]

type AssetName = java.lang.String

type AssetSummaryList = js.Array[AssetSummary]

type AuthorizationTokenDurationSeconds = Double

type BooleanOptional = Boolean

type Description = java.lang.String

type DomainName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type DomainStatus = _DomainStatus | java.lang.String

type DomainSummaryList = js.Array[DomainSummary]

type ErrorMessage = java.lang.String

type ExternalConnectionName = java.lang.String

type ExternalConnectionStatus = Available_ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MD5
  - typingsJapgolly.awsSdk.awsSdkStrings.`SHA-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`SHA-256`
  - typingsJapgolly.awsSdk.awsSdkStrings.`SHA-512`
  - java.lang.String
*/
type HashAlgorithm = _HashAlgorithm | java.lang.String

type HashValue = java.lang.String

type Integer = Double

type LicenseInfoList = js.Array[LicenseInfo]

type ListDomainsMaxResults = Double

type ListPackageVersionAssetsMaxResults = Double

type ListPackageVersionsMaxResults = Double

type ListPackagesMaxResults = Double

type ListRepositoriesInDomainMaxResults = Double

type ListRepositoriesMaxResults = Double

type Long = Double

type LongOptional = Double

type PackageDependencyList = js.Array[PackageDependency]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.npm_
  - typingsJapgolly.awsSdk.awsSdkStrings.pypi
  - typingsJapgolly.awsSdk.awsSdkStrings.maven
  - typingsJapgolly.awsSdk.awsSdkStrings.nuget_
  - java.lang.String
*/
type PackageFormat = _PackageFormat | java.lang.String

type PackageName = java.lang.String

type PackageNamespace = java.lang.String

type PackageSummaryList = js.Array[PackageSummary]

type PackageVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALREADY_EXISTS
  - typingsJapgolly.awsSdk.awsSdkStrings.MISMATCHED_REVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.MISMATCHED_STATUS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_ALLOWED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type PackageVersionErrorCode = _PackageVersionErrorCode | java.lang.String

type PackageVersionErrorMap = StringDictionary[PackageVersionError]

type PackageVersionList = js.Array[PackageVersion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type PackageVersionOriginType = _PackageVersionOriginType | java.lang.String

type PackageVersionRevision = java.lang.String

type PackageVersionRevisionMap = StringDictionary[PackageVersionRevision]

type PackageVersionSortType = PUBLISHED_TIME | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Published_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unfinished
  - typingsJapgolly.awsSdk.awsSdkStrings.Unlisted
  - typingsJapgolly.awsSdk.awsSdkStrings.Archived_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disposed
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type PackageVersionStatus = _PackageVersionStatus | java.lang.String

type PackageVersionSummaryList = js.Array[PackageVersionSummary]

type PaginationToken = java.lang.String

type PolicyDocument = java.lang.String

type PolicyRevision = java.lang.String

type RepositoryExternalConnectionInfoList = js.Array[RepositoryExternalConnectionInfo]

type RepositoryName = java.lang.String

type RepositorySummaryList = js.Array[RepositorySummary]

type String = java.lang.String

type String255 = java.lang.String

type SuccessfulPackageVersionInfoMap = StringDictionary[SuccessfulPackageVersionInfo]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type UpstreamRepositoryInfoList = js.Array[UpstreamRepositoryInfo]

type UpstreamRepositoryList = js.Array[UpstreamRepository]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-22`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
