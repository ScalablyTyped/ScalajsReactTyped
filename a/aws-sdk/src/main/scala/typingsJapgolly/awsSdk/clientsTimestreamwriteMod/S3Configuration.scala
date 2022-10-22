package typingsJapgolly.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Configuration extends StObject {
  
  /**
    * &gt;Bucket name of the customer S3 bucket.
    */
  var BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or KMS managed key.
    */
  var EncryptionOption: js.UndefOr[S3EncryptionOption] = js.undefined
  
  /**
    * KMS key id for the customer s3 location when encrypting with a KMS managed key.
    */
  var KmsKeyId: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    * Object key preview for the customer S3 location.
    */
  var ObjectKeyPrefix: js.UndefOr[S3ObjectKeyPrefix] = js.undefined
}
object S3Configuration {
  
  inline def apply(): S3Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Configuration]
  }
  
  extension [Self <: S3Configuration](x: Self) {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setEncryptionOption(value: S3EncryptionOption): Self = StObject.set(x, "EncryptionOption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionUndefined: Self = StObject.set(x, "EncryptionOption", js.undefined)
    
    inline def setKmsKeyId(value: StringValue2048): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setObjectKeyPrefix(value: S3ObjectKeyPrefix): Self = StObject.set(x, "ObjectKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "ObjectKeyPrefix", js.undefined)
  }
}
