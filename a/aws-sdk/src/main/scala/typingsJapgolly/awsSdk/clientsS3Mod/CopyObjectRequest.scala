package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyObjectRequest extends StObject {
  
  /**
    * The canned ACL to apply to the object. This action is not supported by Amazon S3 on Outposts.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
  
  /**
    * The name of the destination bucket. When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using Amazon S3 on Outposts in the Amazon S3 User Guide.
    */
  var Bucket: BucketName
  
  /**
    * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using AWS KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS.  Specifying this header with a COPY action doesn’t affect bucket-level settings for S3 Bucket Key.
    */
  var BucketKeyEnabled: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.BucketKeyEnabled] = js.undefined
  
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CacheControl] = js.undefined
  
  /**
    * Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumAlgorithm: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentDisposition] = js.undefined
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentEncoding] = js.undefined
  
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentLanguage] = js.undefined
  
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentType] = js.undefined
  
  /**
    * Specifies the source object for the copy operation. You specify the value in one of two formats, depending on whether you want to access the source object through an access point:   For objects not accessed through an access point, specify the name of the source bucket and the key of the source object, separated by a slash (/). For example, to copy the object reports/january.pdf from the bucket awsexamplebucket, use awsexamplebucket/reports/january.pdf. The value must be URL-encoded.   For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed through the access point, in the format arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;. For example, to copy the object reports/january.pdf through access point my-access-point owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf. The value must be URL encoded.  Amazon S3 supports copy operations using access points only when the source and destination buckets are in the same Amazon Web Services Region.  Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;. For example, to copy the object reports/january.pdf through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf. The value must be URL-encoded.    To copy a specific version of an object, append ?versionId=&lt;version-id&gt; to the value (for example, awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893). If you don't specify a version ID, Amazon S3 copies the latest version of the source object.
    */
  var CopySource: typingsJapgolly.awsSdk.clientsS3Mod.CopySource
  
  /**
    * Copies the object if its entity tag (ETag) matches the specified tag.
    */
  var CopySourceIfMatch: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CopySourceIfMatch] = js.undefined
  
  /**
    * Copies the object if it has been modified since the specified time.
    */
  var CopySourceIfModifiedSince: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Copies the object if its entity tag (ETag) is different than the specified ETag.
    */
  var CopySourceIfNoneMatch: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CopySourceIfNoneMatch] = js.undefined
  
  /**
    * Copies the object if it hasn't been modified since the specified time.
    */
  var CopySourceIfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the algorithm to use when decrypting the source object (for example, AES256).
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CopySourceSSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
    */
  var CopySourceSSECustomerKey: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CopySourceSSECustomerKey] = js.undefined
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var CopySourceSSECustomerKeyMD5: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CopySourceSSECustomerKeyMD5] = js.undefined
  
  /**
    * The account ID of the expected destination bucket owner. If the destination bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The account ID of the expected source bucket owner. If the source bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedSourceBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantFullControl: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.GrantFullControl] = js.undefined
  
  /**
    * Allows grantee to read the object data and its metadata. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantRead: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.GrantRead] = js.undefined
  
  /**
    * Allows grantee to read the object ACL. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantReadACP: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.GrantReadACP] = js.undefined
  
  /**
    * Allows grantee to write the ACL for the applicable object. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantWriteACP: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.GrantWriteACP] = js.undefined
  
  /**
    * The key of the destination object.
    */
  var Key: ObjectKey
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Metadata] = js.undefined
  
  /**
    * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
    */
  var MetadataDirective: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.MetadataDirective] = js.undefined
  
  /**
    * Specifies whether you want to apply a legal hold to the copied object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The Object Lock mode that you want to apply to the copied object.
    */
  var ObjectLockMode: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ObjectLockMode] = js.undefined
  
  /**
    * The date and time when you want the copied object's Object Lock to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined
  
  var RequestPayer: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.RequestPayer] = js.undefined
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.SSECustomerKey] = js.undefined
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.SSEKMSEncryptionContext] = js.undefined
  
  /**
    * Specifies the Amazon Web Services KMS key ID to use for object encryption. All GET and PUT requests for an object protected by Amazon Web Services KMS will fail if not made via SSL or using SigV4. For information about configuring using any of the officially supported Amazon Web Services SDKs and Amazon Web Services CLI, see Specifying the Signature Version in Request Authentication in the Amazon S3 User Guide.
    */
  var SSEKMSKeyId: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  
  /**
    * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class provides high durability and high availability. Depending on performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see Storage Classes in the Amazon S3 User Guide.
    */
  var StorageClass: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.StorageClass] = js.undefined
  
  /**
    * The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters.
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.undefined
  
  /**
    * Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.
    */
  var TaggingDirective: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.TaggingDirective] = js.undefined
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.WebsiteRedirectLocation] = js.undefined
}
object CopyObjectRequest {
  
  inline def apply(Bucket: BucketName, CopySource: CopySource, Key: ObjectKey): CopyObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectRequest]
  }
  
  extension [Self <: CopyObjectRequest](x: Self) {
    
    inline def setACL(value: ObjectCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabled(value: BucketKeyEnabled): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    inline def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setCopySource(value: CopySource): Self = StObject.set(x, "CopySource", value.asInstanceOf[js.Any])
    
    inline def setCopySourceIfMatch(value: CopySourceIfMatch): Self = StObject.set(x, "CopySourceIfMatch", value.asInstanceOf[js.Any])
    
    inline def setCopySourceIfMatchUndefined: Self = StObject.set(x, "CopySourceIfMatch", js.undefined)
    
    inline def setCopySourceIfModifiedSince(value: js.Date): Self = StObject.set(x, "CopySourceIfModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setCopySourceIfModifiedSinceUndefined: Self = StObject.set(x, "CopySourceIfModifiedSince", js.undefined)
    
    inline def setCopySourceIfNoneMatch(value: CopySourceIfNoneMatch): Self = StObject.set(x, "CopySourceIfNoneMatch", value.asInstanceOf[js.Any])
    
    inline def setCopySourceIfNoneMatchUndefined: Self = StObject.set(x, "CopySourceIfNoneMatch", js.undefined)
    
    inline def setCopySourceIfUnmodifiedSince(value: js.Date): Self = StObject.set(x, "CopySourceIfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    inline def setCopySourceIfUnmodifiedSinceUndefined: Self = StObject.set(x, "CopySourceIfUnmodifiedSince", js.undefined)
    
    inline def setCopySourceSSECustomerAlgorithm(value: CopySourceSSECustomerAlgorithm): Self = StObject.set(x, "CopySourceSSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setCopySourceSSECustomerAlgorithmUndefined: Self = StObject.set(x, "CopySourceSSECustomerAlgorithm", js.undefined)
    
    inline def setCopySourceSSECustomerKey(value: CopySourceSSECustomerKey): Self = StObject.set(x, "CopySourceSSECustomerKey", value.asInstanceOf[js.Any])
    
    inline def setCopySourceSSECustomerKeyMD5(value: CopySourceSSECustomerKeyMD5): Self = StObject.set(x, "CopySourceSSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setCopySourceSSECustomerKeyMD5Undefined: Self = StObject.set(x, "CopySourceSSECustomerKeyMD5", js.undefined)
    
    inline def setCopySourceSSECustomerKeyUndefined: Self = StObject.set(x, "CopySourceSSECustomerKey", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setExpectedSourceBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedSourceBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedSourceBucketOwnerUndefined: Self = StObject.set(x, "ExpectedSourceBucketOwner", js.undefined)
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    inline def setGrantFullControl(value: GrantFullControl): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
    
    inline def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
    
    inline def setGrantRead(value: GrantRead): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACP(value: GrantReadACP): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
    
    inline def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
    
    inline def setGrantWriteACP(value: GrantWriteACP): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
    
    inline def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataDirective(value: MetadataDirective): Self = StObject.set(x, "MetadataDirective", value.asInstanceOf[js.Any])
    
    inline def setMetadataDirectiveUndefined: Self = StObject.set(x, "MetadataDirective", js.undefined)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    inline def setObjectLockMode(value: ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    inline def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    inline def setObjectLockRetainUntilDate(value: js.Date): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    inline def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    inline def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = StObject.set(x, "SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSEncryptionContextUndefined: Self = StObject.set(x, "SSEKMSEncryptionContext", js.undefined)
    
    inline def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setTagging(value: TaggingHeader): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
    
    inline def setTaggingDirective(value: TaggingDirective): Self = StObject.set(x, "TaggingDirective", value.asInstanceOf[js.Any])
    
    inline def setTaggingDirectiveUndefined: Self = StObject.set(x, "TaggingDirective", js.undefined)
    
    inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
    
    inline def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    inline def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
  }
}
