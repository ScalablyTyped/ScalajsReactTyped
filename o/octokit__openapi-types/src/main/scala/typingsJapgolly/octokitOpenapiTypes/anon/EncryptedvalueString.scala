package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedvalueString extends StObject {
  
  /** @description Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an environment public key](https://docs.github.com/rest/reference/actions#get-an-environment-public-key) endpoint. */
  var encrypted_value: String
  
  /** @description ID of the key you used to encrypt the secret. */
  var key_id: String
}
object EncryptedvalueString {
  
  inline def apply(encrypted_value: String, key_id: String): EncryptedvalueString = {
    val __obj = js.Dynamic.literal(encrypted_value = encrypted_value.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedvalueString]
  }
  
  extension [Self <: EncryptedvalueString](x: Self) {
    
    inline def setEncrypted_value(value: String): Self = StObject.set(x, "encrypted_value", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
