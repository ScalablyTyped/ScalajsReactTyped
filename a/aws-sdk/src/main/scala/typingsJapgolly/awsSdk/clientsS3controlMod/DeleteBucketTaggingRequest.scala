package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketTaggingRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Outposts bucket tag set to be removed.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The bucket ARN that has the tag set to be removed. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the Amazon Web Services SDK and CLI, you must specify the ARN of the bucket accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;. For example, to access the bucket reports through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports. The value must be URL encoded. 
    */
  var Bucket: BucketName
}
object DeleteBucketTaggingRequest {
  
  inline def apply(AccountId: AccountId, Bucket: BucketName): DeleteBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketTaggingRequest]
  }
  
  extension [Self <: DeleteBucketTaggingRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
  }
}
