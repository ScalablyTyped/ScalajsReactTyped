package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketLifecycleRequest extends StObject {
  
  /**
    * 
    */
  var Bucket: BucketName
  
  /**
    * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not provide any additional functionality if not using the SDK. When sending this header, there must be a corresponding x-amz-checksum or x-amz-trailer header sent. Otherwise, Amazon S3 fails the request with the HTTP status code 400 Bad Request. For more information, see Checking object integrity in the Amazon S3 User Guide. If you provide an individual checksum, Amazon S3 ignores any provided ChecksumAlgorithm parameter.
    */
  var ChecksumAlgorithm: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    *  For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ContentMD5] = js.undefined
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * 
    */
  var LifecycleConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.LifecycleConfiguration] = js.undefined
}
object PutBucketLifecycleRequest {
  
  inline def apply(Bucket: BucketName): PutBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleRequest]
  }
  
  extension [Self <: PutBucketLifecycleRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setLifecycleConfiguration(value: LifecycleConfiguration): Self = StObject.set(x, "LifecycleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigurationUndefined: Self = StObject.set(x, "LifecycleConfiguration", js.undefined)
  }
}
