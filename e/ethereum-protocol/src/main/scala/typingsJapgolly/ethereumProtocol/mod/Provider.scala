package typingsJapgolly.ethereumProtocol.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit
}
object Provider {
  
  inline def apply(sendAsync: (JSONRPCRequestPayload, JSONRPCErrorCallback) => Callback): Provider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2((t0: JSONRPCRequestPayload, t1: JSONRPCErrorCallback) => (sendAsync(t0, t1)).runNow()))
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setSendAsync(value: (JSONRPCRequestPayload, JSONRPCErrorCallback) => Callback): Self = StObject.set(x, "sendAsync", js.Any.fromFunction2((t0: JSONRPCRequestPayload, t1: JSONRPCErrorCallback) => (value(t0, t1)).runNow()))
  }
}
