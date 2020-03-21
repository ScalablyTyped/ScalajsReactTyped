package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ecrMod {
  type Arn = java.lang.String
  type AttributeKey = java.lang.String
  type AttributeList = js.Array[typingsJapgolly.awsSdk.ecrMod.Attribute]
  type AttributeValue = java.lang.String
  type AuthorizationDataList = js.Array[typingsJapgolly.awsSdk.ecrMod.AuthorizationData]
  type Base64 = java.lang.String
  type BatchedOperationLayerDigest = java.lang.String
  type BatchedOperationLayerDigestList = js.Array[typingsJapgolly.awsSdk.ecrMod.BatchedOperationLayerDigest]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ecrMod.ClientApiVersions
  type CreationTimestamp = js.Date
  type EvaluationTimestamp = js.Date
  type ExpirationTimestamp = js.Date
  type FindingDescription = java.lang.String
  type FindingName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INFORMATIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
    - typingsJapgolly.awsSdk.awsSdkStrings.UNDEFINED
    - java.lang.String
  */
  type FindingSeverity = typingsJapgolly.awsSdk.ecrMod._FindingSeverity | java.lang.String
  type FindingSeverityCounts = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ecrMod.SeverityCount]
  type ForceFlag = scala.Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[typingsJapgolly.awsSdk.ecrMod.RegistryId]
  type ImageActionType = typingsJapgolly.awsSdk.awsSdkStrings.EXPIRE | java.lang.String
  type ImageCount = scala.Double
  type ImageDetailList = js.Array[typingsJapgolly.awsSdk.ecrMod.ImageDetail]
  type ImageDigest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidImageDigest
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidImageTag
    - typingsJapgolly.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest
    - typingsJapgolly.awsSdk.awsSdkStrings.ImageNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.MissingDigestAndTag
    - java.lang.String
  */
  type ImageFailureCode = typingsJapgolly.awsSdk.ecrMod._ImageFailureCode | java.lang.String
  type ImageFailureList = js.Array[typingsJapgolly.awsSdk.ecrMod.ImageFailure]
  type ImageFailureReason = java.lang.String
  type ImageIdentifierList = js.Array[typingsJapgolly.awsSdk.ecrMod.ImageIdentifier]
  type ImageList = js.Array[typingsJapgolly.awsSdk.ecrMod.Image]
  type ImageManifest = java.lang.String
  type ImageScanFindingList = js.Array[typingsJapgolly.awsSdk.ecrMod.ImageScanFinding]
  type ImageSizeInBytes = scala.Double
  type ImageTag = java.lang.String
  type ImageTagList = js.Array[typingsJapgolly.awsSdk.ecrMod.ImageTag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MUTABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.IMMUTABLE
    - java.lang.String
  */
  type ImageTagMutability = typingsJapgolly.awsSdk.ecrMod._ImageTagMutability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type LayerAvailability = typingsJapgolly.awsSdk.ecrMod._LayerAvailability | java.lang.String
  type LayerDigest = java.lang.String
  type LayerDigestList = js.Array[typingsJapgolly.awsSdk.ecrMod.LayerDigest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidLayerDigest
    - typingsJapgolly.awsSdk.awsSdkStrings.MissingLayerDigest
    - java.lang.String
  */
  type LayerFailureCode = typingsJapgolly.awsSdk.ecrMod._LayerFailureCode | java.lang.String
  type LayerFailureList = js.Array[typingsJapgolly.awsSdk.ecrMod.LayerFailure]
  type LayerFailureReason = java.lang.String
  type LayerList = js.Array[typingsJapgolly.awsSdk.ecrMod.Layer]
  type LayerPartBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.ecrMod.Blob | java.lang.String
  type LayerSizeInBytes = scala.Double
  type LifecyclePolicyPreviewResultList = js.Array[typingsJapgolly.awsSdk.ecrMod.LifecyclePolicyPreviewResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LifecyclePolicyPreviewStatus = typingsJapgolly.awsSdk.ecrMod._LifecyclePolicyPreviewStatus | java.lang.String
  type LifecyclePolicyRulePriority = scala.Double
  type LifecyclePolicyText = java.lang.String
  type LifecyclePreviewMaxResults = scala.Double
  type MaxResults = scala.Double
  type MediaType = java.lang.String
  type MediaTypeList = js.Array[typingsJapgolly.awsSdk.ecrMod.MediaType]
  type NextToken = java.lang.String
  type PartSize = scala.Double
  type ProxyEndpoint = java.lang.String
  type PushTimestamp = js.Date
  type RegistryId = java.lang.String
  type RepositoryList = js.Array[typingsJapgolly.awsSdk.ecrMod.Repository]
  type RepositoryName = java.lang.String
  type RepositoryNameList = js.Array[typingsJapgolly.awsSdk.ecrMod.RepositoryName]
  type RepositoryPolicyText = java.lang.String
  type ScanOnPushFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ScanStatus = typingsJapgolly.awsSdk.ecrMod._ScanStatus | java.lang.String
  type ScanStatusDescription = java.lang.String
  type ScanTimestamp = js.Date
  type SeverityCount = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.ecrMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.ecrMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TAGGED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNTAGGED
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type TagStatus = typingsJapgolly.awsSdk.ecrMod._TagStatus | java.lang.String
  type TagValue = java.lang.String
  type UploadId = java.lang.String
  type Url = java.lang.String
  type VulnerabilitySourceUpdateTimestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-09-21`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ecrMod._apiVersion | java.lang.String
}
