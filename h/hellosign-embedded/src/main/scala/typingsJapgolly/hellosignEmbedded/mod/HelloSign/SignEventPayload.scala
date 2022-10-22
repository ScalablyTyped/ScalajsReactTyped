package typingsJapgolly.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignEventPayload extends StObject {
  
  var signatureId: String
}
object SignEventPayload {
  
  inline def apply(signatureId: String): SignEventPayload = {
    val __obj = js.Dynamic.literal(signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignEventPayload]
  }
  
  extension [Self <: SignEventPayload](x: Self) {
    
    inline def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
  }
}
