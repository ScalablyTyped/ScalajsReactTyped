package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.anon.Cont
import typingsJapgolly.awsSdk.awsSdkStrings.CSV
import typingsJapgolly.awsSdk.awsSdkStrings.Destination_
import typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
import typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
import typingsJapgolly.awsSdk.awsSdkStrings.SELECT
import typingsJapgolly.awsSdk.awsSdkStrings.SQL
import typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
import typingsJapgolly.awsSdk.awsSdkStrings.V_1
import typingsJapgolly.awsSdk.awsSdkStrings.requester_
import typingsJapgolly.awsSdk.awsSdkStrings.url_
import typingsJapgolly.awsSdk.libEventStreamEventStreamMod.EventStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbortDate = js.Date

type AbortRuleId = String

type AcceptRanges = String

type AccessPointArn = String

type AccountId = String

type AllowQuotedRecordDelimiter = Boolean

type AllowedHeader = String

type AllowedHeaders = js.Array[AllowedHeader]

type AllowedMethod = String

type AllowedMethods = js.Array[AllowedMethod]

type AllowedOrigin = String

type AllowedOrigins = js.Array[AllowedOrigin]

type AnalyticsConfigurationList = js.Array[AnalyticsConfiguration]

type AnalyticsId = String

type AnalyticsS3ExportFileFormat = CSV | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type ArchiveStatus = _ArchiveStatus | String

type Body = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketAccelerateStatus = _BucketAccelerateStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.private__
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
  - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
  - java.lang.String
*/
type BucketCannedACL = _BucketCannedACL | String

type BucketKeyEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`af-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`cn-northwest-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.EU
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-3`
  - typingsJapgolly.awsSdk.awsSdkStrings.`me-south-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - java.lang.String
*/
type BucketLocationConstraint = _BucketLocationConstraint | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
  - java.lang.String
*/
type BucketLogsPermission = _BucketLogsPermission | String

type BucketName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketVersioningStatus = _BucketVersioningStatus | String

type Buckets = js.Array[Bucket]

type BypassGovernanceRetention = Boolean

type BytesProcessed = Double

type BytesReturned = Double

type BytesScanned = Double

type CORSRules = js.Array[CORSRule]

type CacheControl = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRC32
  - typingsJapgolly.awsSdk.awsSdkStrings.CRC32C
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA1
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA256
  - java.lang.String
*/
type ChecksumAlgorithm = _ChecksumAlgorithm | String

type ChecksumAlgorithmList = js.Array[ChecksumAlgorithm]

type ChecksumCRC32 = String

type ChecksumCRC32C = String

type ChecksumMode = ENABLED | String

type ChecksumSHA1 = String

type ChecksumSHA256 = String

type CloudFunction = String

type CloudFunctionInvocationRole = String

type Code = String

type Comments = String

type CommonPrefixList = js.Array[CommonPrefix]

type CompletedPartList = js.Array[CompletedPart]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
  - typingsJapgolly.awsSdk.awsSdkStrings.BZIP2
  - java.lang.String
*/
type CompressionType = _CompressionType | String

type ConfirmRemoveSelfBucketAccess = Boolean

type ContentDisposition = String

type ContentEncoding = String

type ContentLanguage = String

type ContentLength = Double

type ContentMD5 = String

type ContentRange = String

type ContentType = String

type CopySource = String

type CopySourceIfMatch = String

type CopySourceIfModifiedSince = js.Date

type CopySourceIfNoneMatch = String

type CopySourceIfUnmodifiedSince = js.Date

type CopySourceRange = String

type CopySourceSSECustomerAlgorithm = String

type CopySourceSSECustomerKey = Buffer | js.typedarray.Uint8Array | Blob | String

type CopySourceSSECustomerKeyMD5 = String

type CopySourceVersionId = String

type CreationDate = js.Date

type Date = js.Date

type Days = Double

type DaysAfterInitiation = Double

type DeleteMarker = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type DeleteMarkerReplicationStatus = _DeleteMarkerReplicationStatus | String

type DeleteMarkerVersionId = String

type DeleteMarkers = js.Array[DeleteMarkerEntry]

type DeletedObjects = js.Array[DeletedObject]

type Delimiter = String

type Description = String

type DisplayName = String

type ETag = String

type EmailAddress = String

type EnableRequestProgress = Boolean

type EncodingType = url_ | String

type End = Double

type ErrorCode = String

type ErrorMessage = String

type Errors = js.Array[Error]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReducedRedundancyLostObject
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonAsterisk
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPut
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPost
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCopy
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonAsterisk
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDelete
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonAsterisk
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonPost
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonCompleted
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonAsterisk
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationFailedReplication
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationNotTracked
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationMissedThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonDelete
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonLifecycleTransition
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonIntelligentTiering
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectAclColonPut
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonLifecycleExpirationColonAsterisk
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonLifecycleExpirationColonDelete
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonLifecycleExpirationColonDeleteMarkerCreated
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectTaggingColonAsterisk
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectTaggingColonPut
  - typingsJapgolly.awsSdk.awsSdkStrings.s3ColonObjectTaggingColonDelete
  - java.lang.String
*/
type Event = _Event | String

type EventList = js.Array[Event]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExistingObjectReplicationStatus = _ExistingObjectReplicationStatus | String

type Expiration = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExpirationStatus = _ExpirationStatus | String

type ExpiredObjectDeleteMarker = Boolean

type Expires = js.Date

type ExposeHeader = String

type ExposeHeaders = js.Array[ExposeHeader]

type Expression = String

type ExpressionType = SQL | String

type FetchOwner = Boolean

type FieldDelimiter = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USE
  - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = _FileHeaderInfo | String

type FilterRuleList = js.Array[FilterRule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.prefix__
  - typingsJapgolly.awsSdk.awsSdkStrings.suffix_
  - java.lang.String
*/
type FilterRuleName = _FilterRuleName | String

type FilterRuleValue = String

type GetObjectResponseStatusCode = Double

type GrantFullControl = String

type GrantRead = String

type GrantReadACP = String

type GrantWrite = String

type GrantWriteACP = String

type Grants = js.Array[Grant]

type HostName = String

type HttpErrorCodeReturnedEquals = String

type HttpRedirectCode = String

type ID = String

type IfMatch = String

type IfModifiedSince = js.Date

type IfNoneMatch = String

type IfUnmodifiedSince = js.Date

type Initiated = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type IntelligentTieringAccessTier = _IntelligentTieringAccessTier | String

type IntelligentTieringConfigurationList = js.Array[IntelligentTieringConfiguration]

type IntelligentTieringDays = Double

type IntelligentTieringId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type IntelligentTieringStatus = _IntelligentTieringStatus | String

type InventoryConfigurationList = js.Array[InventoryConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.ORC
  - typingsJapgolly.awsSdk.awsSdkStrings.Parquet_
  - java.lang.String
*/
type InventoryFormat = _InventoryFormat | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Daily_
  - typingsJapgolly.awsSdk.awsSdkStrings.Weekly_
  - java.lang.String
*/
type InventoryFrequency = _InventoryFrequency | String

type InventoryId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.All_
  - typingsJapgolly.awsSdk.awsSdkStrings.Current_
  - java.lang.String
*/
type InventoryIncludedObjectVersions = _InventoryIncludedObjectVersions | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Size_
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedDate
  - typingsJapgolly.awsSdk.awsSdkStrings.StorageClass
  - typingsJapgolly.awsSdk.awsSdkStrings.ETag
  - typingsJapgolly.awsSdk.awsSdkStrings.IsMultipartUploaded
  - typingsJapgolly.awsSdk.awsSdkStrings.ReplicationStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.EncryptionStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.ObjectLockRetainUntilDate
  - typingsJapgolly.awsSdk.awsSdkStrings.ObjectLockMode
  - typingsJapgolly.awsSdk.awsSdkStrings.ObjectLockLegalHoldStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.IntelligentTieringAccessTier
  - typingsJapgolly.awsSdk.awsSdkStrings.BucketKeyStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.ChecksumAlgorithm
  - java.lang.String
*/
type InventoryOptionalField = _InventoryOptionalField | String

type InventoryOptionalFields = js.Array[InventoryOptionalField]

type IsEnabled = Boolean

type IsLatest = Boolean

type IsPublic = Boolean

type IsTruncated = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.LINES
  - java.lang.String
*/
type JSONType = _JSONType | String

type KMSContext = String

type KeyCount = Double

type KeyMarker = String

type KeyPrefixEquals = String

type LambdaFunctionArn = String

type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]

type LastModified = js.Date

type LifecycleRules = js.Array[LifecycleRule]

type Location = String

type LocationPrefix = String

type MFA = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADelete = _MFADelete | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADeleteStatus = _MFADeleteStatus | String

type Marker = String

type MaxAgeSeconds = Double

type MaxKeys = Double

type MaxParts = Double

type MaxUploads = Double

type Message = String

type Metadata = StringDictionary[MetadataValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type MetadataDirective = _MetadataDirective | String

type MetadataKey = String

type MetadataValue = String

type MetricsConfigurationList = js.Array[MetricsConfiguration]

type MetricsId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MetricsStatus = _MetricsStatus | String

type Minutes = Double

type MissingMeta = Double

type MultipartUploadId = String

type MultipartUploadList = js.Array[MultipartUpload]

type NextKeyMarker = String

type NextMarker = String

type NextPartNumberMarker = Double

type NextToken = String

type NextUploadIdMarker = String

type NextVersionIdMarker = String

type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]

type NotificationId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ETag
  - typingsJapgolly.awsSdk.awsSdkStrings.Checksum
  - typingsJapgolly.awsSdk.awsSdkStrings.ObjectParts
  - typingsJapgolly.awsSdk.awsSdkStrings.StorageClass
  - typingsJapgolly.awsSdk.awsSdkStrings.ObjectSize
  - java.lang.String
*/
type ObjectAttributes = _ObjectAttributes | String

type ObjectAttributesList = js.Array[ObjectAttributes]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.private__
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
  - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`aws-exec-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - java.lang.String
*/
type ObjectCannedACL = _ObjectCannedACL | String

type ObjectIdentifierList = js.Array[ObjectIdentifier]

type ObjectKey = String

type ObjectList = js.Array[Object]

type ObjectLockEnabled = Enabled_ | String

type ObjectLockEnabledForBucket = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ON
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type ObjectLockLegalHoldStatus = _ObjectLockLegalHoldStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockMode = _ObjectLockMode | String

type ObjectLockRetainUntilDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockRetentionMode = _ObjectLockRetentionMode | String

type ObjectLockToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BucketOwnerPreferred
  - typingsJapgolly.awsSdk.awsSdkStrings.ObjectWriter
  - typingsJapgolly.awsSdk.awsSdkStrings.BucketOwnerEnforced
  - java.lang.String
*/
type ObjectOwnership = _ObjectOwnership | String

type ObjectSize = Double

type ObjectSizeGreaterThanBytes = Double

type ObjectSizeLessThanBytes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTPOSTS
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER_IR
  - java.lang.String
*/
type ObjectStorageClass = _ObjectStorageClass | String

type ObjectVersionId = String

type ObjectVersionList = js.Array[ObjectVersion]

type ObjectVersionStorageClass = STANDARD | String

type OwnerOverride = Destination_ | String

type OwnershipControlsRules = js.Array[OwnershipControlsRule]

type PartNumber = Double

type PartNumberMarker = Double

type Parts = js.Array[Part]

type PartsCount = Double

type PartsList = js.Array[ObjectPart]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Requester
  - typingsJapgolly.awsSdk.awsSdkStrings.BucketOwner
  - java.lang.String
*/
type Payer = _Payer | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_CONTROL
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.WRITE_ACP
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
type Permission = _Permission | String

type Policy = String

type Prefix = String

type Priority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.http_
  - typingsJapgolly.awsSdk.awsSdkStrings.https_
  - java.lang.String
*/
type Protocol = _Protocol | String

type QueueArn = String

type QueueConfigurationList = js.Array[QueueConfiguration]

type Quiet = Boolean

type QuoteCharacter = String

type QuoteEscapeCharacter = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = _QuoteFields | String

type Range = String

type RecordDelimiter = String

type ReplaceKeyPrefixWith = String

type ReplaceKeyWith = String

type ReplicaKmsKeyID = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicaModificationsStatus = _ReplicaModificationsStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicationRuleStatus = _ReplicationRuleStatus | String

type ReplicationRules = js.Array[ReplicationRule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICA
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicationTimeStatus = _ReplicationTimeStatus | String

type RequestCharged = requester_ | String

type RequestPayer = requester_ | String

type RequestRoute = String

type RequestToken = String

type ResponseCacheControl = String

type ResponseContentDisposition = String

type ResponseContentEncoding = String

type ResponseContentLanguage = String

type ResponseContentType = String

type ResponseExpires = js.Date

type Restore = String

type RestoreOutputPath = String

type RestoreRequestType = SELECT | String

type Role = String

type RoutingRules = js.Array[RoutingRule]

type Rules = js.Array[Rule]

type SSECustomerAlgorithm = String

type SSECustomerKey = Buffer | js.typedarray.Uint8Array | Blob | String

type SSECustomerKeyMD5 = String

type SSEKMSEncryptionContext = String

type SSEKMSKeyId = String

type SelectObjectContentEventStream = EventStream[Cont]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256
  - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
  - java.lang.String
*/
type ServerSideEncryption = _ServerSideEncryption | String

type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]

type Setting = Boolean

type Size = Double

type SkipValidation = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type SseKmsEncryptedObjectsStatus = _SseKmsEncryptedObjectsStatus | String

type Start = Double

type StartAfter = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTPOSTS
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER_IR
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type StorageClassAnalysisSchemaVersion = V_1 | String

type Suffix = String

type TagCount = Double

type TagSet = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type TaggingDirective = _TaggingDirective | String

type TaggingHeader = String

type TargetBucket = String

type TargetGrants = js.Array[TargetGrant]

type TargetPrefix = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bulk_
  - typingsJapgolly.awsSdk.awsSdkStrings.Expedited
  - java.lang.String
*/
type Tier = _Tier | String

type TieringList = js.Array[Tiering]

type Token = String

type TopicArn = String

type TopicConfigurationList = js.Array[TopicConfiguration]

type TransitionList = js.Array[Transition]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER_IR
  - java.lang.String
*/
type TransitionStorageClass = _TransitionStorageClass | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CanonicalUser
  - typingsJapgolly.awsSdk.awsSdkStrings.AmazonCustomerByEmail
  - typingsJapgolly.awsSdk.awsSdkStrings.Group_
  - java.lang.String
*/
type Type = _Type | String

type URI = String

type UploadIdMarker = String

type UserMetadata = js.Array[MetadataEntry]

type Value = String

type VersionCount = Double

type VersionIdMarker = String

type WebsiteRedirectLocation = String

type Years = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2006-03-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
