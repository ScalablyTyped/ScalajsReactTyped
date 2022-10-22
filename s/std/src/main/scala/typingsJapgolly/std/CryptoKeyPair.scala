package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyPair extends StObject {
  
  /* standard dom */
  var privateKey: org.scalajs.dom.CryptoKey
  
  /* standard dom */
  var publicKey: org.scalajs.dom.CryptoKey
}
object CryptoKeyPair {
  
  inline def apply(privateKey: org.scalajs.dom.CryptoKey, publicKey: org.scalajs.dom.CryptoKey): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
  
  extension [Self <: CryptoKeyPair](x: Self) {
    
    inline def setPrivateKey(value: org.scalajs.dom.CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: org.scalajs.dom.CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
