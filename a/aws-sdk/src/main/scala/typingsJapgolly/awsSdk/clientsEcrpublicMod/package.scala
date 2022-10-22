package typingsJapgolly.awsSdk.clientsEcrpublicMod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AboutText = String

type Architecture = String

type ArchitectureList = js.Array[Architecture]

type Arn = String

type Base64 = String

type BatchedOperationLayerDigest = String

type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]

type CreationTimestamp = js.Date

type DefaultRegistryAliasFlag = Boolean

type ExpirationTimestamp = js.Date

type ForceFlag = Boolean

type ImageDetailList = js.Array[ImageDetail]

type ImageDigest = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidImageDigest
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidImageTag
  - typingsJapgolly.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest
  - typingsJapgolly.awsSdk.awsSdkStrings.ImageNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.MissingDigestAndTag
  - typingsJapgolly.awsSdk.awsSdkStrings.ImageReferencedByManifestList
  - typingsJapgolly.awsSdk.awsSdkStrings.KmsError
  - java.lang.String
*/
type ImageFailureCode = _ImageFailureCode | String

type ImageFailureList = js.Array[ImageFailure]

type ImageFailureReason = String

type ImageIdentifierList = js.Array[ImageIdentifier]

type ImageManifest = String

type ImageSizeInBytes = Double

type ImageTag = String

type ImageTagDetailList = js.Array[ImageTagDetail]

type ImageTagList = js.Array[ImageTag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type LayerAvailability = _LayerAvailability | String

type LayerDigest = String

type LayerDigestList = js.Array[LayerDigest]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidLayerDigest
  - typingsJapgolly.awsSdk.awsSdkStrings.MissingLayerDigest
  - java.lang.String
*/
type LayerFailureCode = _LayerFailureCode | String

type LayerFailureList = js.Array[LayerFailure]

type LayerFailureReason = String

type LayerList = js.Array[Layer]

type LayerPartBlob = Buffer | js.typedarray.Uint8Array | Blob | String

type LayerSizeInBytes = Double

type LogoImageBlob = Buffer | js.typedarray.Uint8Array | Blob | String

type MarketplaceCertified = Boolean

type MaxResults = Double

type MediaType = String

type NextToken = String

type OperatingSystem = String

type OperatingSystemList = js.Array[OperatingSystem]

type PartSize = Double

type PrimaryRegistryAliasFlag = Boolean

type PushTimestamp = js.Date

type RegistryAliasList = js.Array[RegistryAlias]

type RegistryAliasName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type RegistryAliasStatus = _RegistryAliasStatus | String

type RegistryDisplayName = String

type RegistryId = String

type RegistryIdOrAlias = String

type RegistryList = js.Array[Registry]

type RegistryVerified = Boolean

type RepositoryDescription = String

type RepositoryList = js.Array[Repository]

type RepositoryName = String

type RepositoryNameList = js.Array[RepositoryName]

type RepositoryPolicyText = String

type ResourceUrl = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type UploadId = String

type Url = String

type UsageText = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-10-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
