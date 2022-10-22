package typingsJapgolly.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  var publicKey: typingsJapgolly.openpgp.mod.key.Key
  
  var publicKeyArmored: String
}
object PublicKey {
  
  inline def apply(publicKey: typingsJapgolly.openpgp.mod.key.Key, publicKeyArmored: String): PublicKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  extension [Self <: PublicKey](x: Self) {
    
    inline def setPublicKey(value: typingsJapgolly.openpgp.mod.key.Key): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyArmored(value: String): Self = StObject.set(x, "publicKeyArmored", value.asInstanceOf[js.Any])
  }
}
