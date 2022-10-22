package typingsJapgolly.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureSignature extends StObject {
  
  var signature: typingsJapgolly.openpgp.mod.signature.Signature
}
object SignatureSignature {
  
  inline def apply(signature: typingsJapgolly.openpgp.mod.signature.Signature): SignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSignature]
  }
  
  extension [Self <: SignatureSignature](x: Self) {
    
    inline def setSignature(value: typingsJapgolly.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
