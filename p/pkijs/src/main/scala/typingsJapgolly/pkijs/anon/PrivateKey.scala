package typingsJapgolly.pkijs.anon

import org.scalajs.dom.CryptoKey
import typingsJapgolly.pkijs.mod.Certificate
import typingsJapgolly.pkijs.mod._MakeInternalValuesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKey
  extends StObject
     with _MakeInternalValuesParams {
  
  var hashAlgorithm: String
  
  var privateKey: CryptoKey
  
  var signingCertificate: Certificate
}
object PrivateKey {
  
  inline def apply(hashAlgorithm: String, privateKey: CryptoKey, signingCertificate: Certificate): PrivateKey = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  extension [Self <: PrivateKey](x: Self) {
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificate(value: Certificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
  }
}
