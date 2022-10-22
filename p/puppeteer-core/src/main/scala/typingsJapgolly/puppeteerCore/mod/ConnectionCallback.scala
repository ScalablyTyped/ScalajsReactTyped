package typingsJapgolly.puppeteerCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionCallback extends StObject {
  
  var error: ProtocolError
  
  var method: String
  
  def reject(args: Any): Unit
  
  def resolve(args: Any): Unit
}
object ConnectionCallback {
  
  inline def apply(error: ProtocolError, method: String, reject: Any => Callback, resolve: Any => Callback): ConnectionCallback = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reject = js.Any.fromFunction1((t0: Any) => reject(t0).runNow()), resolve = js.Any.fromFunction1((t0: Any) => resolve(t0).runNow()))
    __obj.asInstanceOf[ConnectionCallback]
  }
  
  extension [Self <: ConnectionCallback](x: Self) {
    
    inline def setError(value: ProtocolError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReject(value: Any => Callback): Self = StObject.set(x, "reject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setResolve(value: Any => Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
