package typingsJapgolly.web3Core.mod

import typingsJapgolly.web3Core.anon.Cipher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedKeystoreV3Json extends StObject {
  
  var address: String
  
  var crypto: Cipher
  
  var id: String
  
  var version: Double
}
object EncryptedKeystoreV3Json {
  
  inline def apply(address: String, crypto: Cipher, id: String, version: Double): EncryptedKeystoreV3Json = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedKeystoreV3Json]
  }
  
  extension [Self <: EncryptedKeystoreV3Json](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCrypto(value: Cipher): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
