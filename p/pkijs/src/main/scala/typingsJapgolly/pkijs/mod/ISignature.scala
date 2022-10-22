package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignature extends StObject {
  
  var certs: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  var signature: BitString
  
  var signatureAlgorithm: AlgorithmIdentifier
}
object ISignature {
  
  inline def apply(signature: BitString, signatureAlgorithm: AlgorithmIdentifier): ISignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignature]
  }
  
  extension [Self <: ISignature](x: Self) {
    
    inline def setCerts(value: js.Array[Certificate]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: Certificate*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setSignature(value: BitString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
  }
}
