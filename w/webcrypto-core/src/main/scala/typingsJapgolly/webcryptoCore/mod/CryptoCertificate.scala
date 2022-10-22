package typingsJapgolly.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoCertificate extends StObject {
  
  var publicKey: org.scalajs.dom.CryptoKey
  
  var `type`: CryptoCertificateType
}
object CryptoCertificate {
  
  inline def apply(publicKey: org.scalajs.dom.CryptoKey, `type`: CryptoCertificateType): CryptoCertificate = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoCertificate]
  }
  
  extension [Self <: CryptoCertificate](x: Self) {
    
    inline def setPublicKey(value: org.scalajs.dom.CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: CryptoCertificateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
