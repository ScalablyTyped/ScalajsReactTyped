package typingsJapgolly.domTrustToken

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequest extends StObject {
  
  def setTrustToken(trustToken: TrustToken): Unit
  
  val trustTokenOperationError: DOMException
}
object XMLHttpRequest {
  
  inline def apply(setTrustToken: TrustToken => Callback, trustTokenOperationError: DOMException): XMLHttpRequest = {
    val __obj = js.Dynamic.literal(setTrustToken = js.Any.fromFunction1((t0: TrustToken) => setTrustToken(t0).runNow()), trustTokenOperationError = trustTokenOperationError.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequest]
  }
  
  extension [Self <: XMLHttpRequest](x: Self) {
    
    inline def setSetTrustToken(value: TrustToken => Callback): Self = StObject.set(x, "setTrustToken", js.Any.fromFunction1((t0: TrustToken) => value(t0).runNow()))
    
    inline def setTrustTokenOperationError(value: DOMException): Self = StObject.set(x, "trustTokenOperationError", value.asInstanceOf[js.Any])
  }
}
