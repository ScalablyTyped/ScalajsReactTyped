package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptionMod {
  
  trait Encryption extends StObject {
    
    /**
      * <p>The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).</p>
      */
    var EncryptionType: AES256 | awsColonkms | String
    
    /**
      * <p>If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.</p>
      */
    var KMSContext: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.</p>
      */
    var KMSKeyId: js.UndefOr[String] = js.undefined
  }
  object Encryption {
    
    inline def apply(EncryptionType: AES256 | awsColonkms | String): Encryption = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encryption]
    }
    
    extension [Self <: Encryption](x: Self) {
      
      inline def setEncryptionType(value: AES256 | awsColonkms | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      inline def setKMSContext(value: String): Self = StObject.set(x, "KMSContext", value.asInstanceOf[js.Any])
      
      inline def setKMSContextUndefined: Self = StObject.set(x, "KMSContext", js.undefined)
      
      inline def setKMSKeyId(value: String): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
      
      inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
    }
  }
  
  type UnmarshalledEncryption = Encryption
}
