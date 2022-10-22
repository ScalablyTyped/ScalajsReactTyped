package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketNotificationConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  var NotificationConfiguration: typingsJapgolly.awsSdk.clientsS3Mod.NotificationConfiguration
  
  /**
    * Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
    */
  var SkipDestinationValidation: js.UndefOr[SkipValidation] = js.undefined
}
object PutBucketNotificationConfigurationRequest {
  
  inline def apply(Bucket: BucketName, NotificationConfiguration: NotificationConfiguration): PutBucketNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationConfigurationRequest]
  }
  
  extension [Self <: PutBucketNotificationConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSkipDestinationValidation(value: SkipValidation): Self = StObject.set(x, "SkipDestinationValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipDestinationValidationUndefined: Self = StObject.set(x, "SkipDestinationValidation", js.undefined)
  }
}
