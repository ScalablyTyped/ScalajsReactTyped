package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionEntity extends StObject {
  
  /**
    * Field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted. You can provide the full field name, or any beginning characters followed by a wildcard (*). You can't overlap field patterns. For example, you can't have both ABC* and AB*. Note that field patterns are case-sensitive. 
    */
  var FieldPatterns: typingsJapgolly.awsSdk.clientsCloudfrontMod.FieldPatterns
  
  /**
    * The provider associated with the public key being used for encryption. This value must also be provided with the private key for applications to be able to decrypt data.
    */
  var ProviderId: String
  
  /**
    * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns. 
    */
  var PublicKeyId: String
}
object EncryptionEntity {
  
  inline def apply(FieldPatterns: FieldPatterns, ProviderId: String, PublicKeyId: String): EncryptionEntity = {
    val __obj = js.Dynamic.literal(FieldPatterns = FieldPatterns.asInstanceOf[js.Any], ProviderId = ProviderId.asInstanceOf[js.Any], PublicKeyId = PublicKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionEntity]
  }
  
  extension [Self <: EncryptionEntity](x: Self) {
    
    inline def setFieldPatterns(value: FieldPatterns): Self = StObject.set(x, "FieldPatterns", value.asInstanceOf[js.Any])
    
    inline def setProviderId(value: String): Self = StObject.set(x, "ProviderId", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyId(value: String): Self = StObject.set(x, "PublicKeyId", value.asInstanceOf[js.Any])
  }
}
