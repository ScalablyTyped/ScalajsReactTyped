package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectRequest extends StObject {
  
  /**
    * The canned ACL to apply to the object. For more information, see Canned ACL. This action is not supported by Amazon S3 on Outposts.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
  
  /**
    * Object data.
    */
  var Body: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Body] = js.undefined
  
  /**
    * The bucket name to which the PUT action was initiated.  When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using Amazon S3 on Outposts in the Amazon S3 User Guide.
    */
  var Bucket: BucketName
  
  /**
    * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using AWS KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS. Specifying this header with a PUT action doesn’t affect bucket-level settings for S3 Bucket Key.
    */
  var BucketKeyEnabled: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.BucketKeyEnabled] = js.undefined
  
  /**
    *  Can be used to specify caching behavior along the request/reply chain. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.
    */
  var CacheControl: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.CacheControl] = js.undefined
  
  /**
    * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not provide any additional functionality if not using the SDK. When sending this header, there must be a corresponding x-amz-checksum or x-amz-trailer header sent. Otherwise, Amazon S3 fails the request with the HTTP status code 400 Bad Request. For more information, see Checking object integrity in the Amazon S3 User Guide. If you provide an individual checksum, Amazon S3 ignores any provided ChecksumAlgorithm parameter.
    */
  var ChecksumAlgorithm: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumCRC32: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumCRC32] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 32-bit CRC32C checksum of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumCRC32C: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumCRC32C] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 160-bit SHA-1 digest of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumSHA1: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumSHA1] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumSHA256: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumSHA256] = js.undefined
  
  /**
    * Specifies presentational information for the object. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1.
    */
  var ContentDisposition: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentDisposition] = js.undefined
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11.
    */
  var ContentEncoding: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentEncoding] = js.undefined
  
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentLanguage] = js.undefined
  
  /**
    * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13.
    */
  var ContentLength: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentLength] = js.undefined
  
  /**
    * The base64-encoded 128-bit MD5 digest of the message (without the headers) according to RFC 1864. This header can be used as a message integrity check to verify that the data is the same data that was originally sent. Although it is optional, we recommend using the Content-MD5 mechanism as an end-to-end integrity check. For more information about REST request authentication, see REST Authentication.
    */
  var ContentMD5: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentMD5] = js.undefined
  
  /**
    * A standard MIME type describing the format of the contents. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17.
    */
  var ContentType: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentType] = js.undefined
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The date and time at which the object is no longer cacheable. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21.
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
    * Object key for which the PUT action was initiated.
    */
  var Key: ObjectKey
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Metadata] = js.undefined
  
  /**
    * Specifies whether a legal hold will be applied to this object. For more information about S3 Object Lock, see Object Lock.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The Object Lock mode that you want to apply to this object.
    */
  var ObjectLockMode: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ObjectLockMode] = js.undefined
  
  /**
    * The date and time when you want this object's Object Lock to expire. Must be formatted as a timestamp parameter.
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
    * If x-amz-server-side-encryption is present and has the value of aws:kms, this header specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetrical customer managed key that was used for the object. If you specify x-amz-server-side-encryption:aws:kms, but do not provide x-amz-server-side-encryption-aws-kms-key-id, Amazon S3 uses the Amazon Web Services managed key to protect the data. If the KMS key does not exist in the same account issuing the command, you must use the full ARN and not just the ID. 
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
    * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For example, "Key1=Value1")
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.undefined
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata. For information about object metadata, see Object Key and Metadata. In the following example, the request header sets the redirect to an object (anotherPage.html) in the same bucket:  x-amz-website-redirect-location: /anotherPage.html  In the following example, the request header sets the object redirect to another website:  x-amz-website-redirect-location: http://www.example.com/  For more information about website hosting in Amazon S3, see Hosting Websites on Amazon S3 and How to Configure Website Page Redirects. 
    */
  var WebsiteRedirectLocation: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.WebsiteRedirectLocation] = js.undefined
}
object PutObjectRequest {
  
  inline def apply(Bucket: BucketName, Key: ObjectKey): PutObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRequest]
  }
  
  extension [Self <: PutObjectRequest](x: Self) {
    
    inline def setACL(value: ObjectCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    inline def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabled(value: BucketKeyEnabled): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setChecksumCRC32(value: ChecksumCRC32): Self = StObject.set(x, "ChecksumCRC32", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32C(value: ChecksumCRC32C): Self = StObject.set(x, "ChecksumCRC32C", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32CUndefined: Self = StObject.set(x, "ChecksumCRC32C", js.undefined)
    
    inline def setChecksumCRC32Undefined: Self = StObject.set(x, "ChecksumCRC32", js.undefined)
    
    inline def setChecksumSHA1(value: ChecksumSHA1): Self = StObject.set(x, "ChecksumSHA1", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA1Undefined: Self = StObject.set(x, "ChecksumSHA1", js.undefined)
    
    inline def setChecksumSHA256(value: ChecksumSHA256): Self = StObject.set(x, "ChecksumSHA256", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA256Undefined: Self = StObject.set(x, "ChecksumSHA256", js.undefined)
    
    inline def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    inline def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    inline def setContentLength(value: ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
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
    
    inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
    
    inline def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    inline def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
  }
}
