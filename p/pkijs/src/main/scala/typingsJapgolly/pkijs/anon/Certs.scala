package typingsJapgolly.pkijs.anon

import typingsJapgolly.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certs extends StObject {
  
  var certs: js.UndefOr[String] = js.undefined
  
  var signature: js.UndefOr[String] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
}
object Certs {
  
  inline def apply(): Certs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certs]
  }
  
  extension [Self <: Certs](x: Self) {
    
    inline def setCerts(value: String): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
