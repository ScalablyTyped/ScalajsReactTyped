package typingsJapgolly.web3CoreHelpers.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestItem extends StObject {
  
  def callback(error: Any, result: Any): Unit
  
  var payload: JsonRpcPayload
}
object RequestItem {
  
  inline def apply(callback: (Any, Any) => Callback, payload: JsonRpcPayload): RequestItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: Any, t1: Any) => (callback(t0, t1)).runNow()), payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestItem]
  }
  
  extension [Self <: RequestItem](x: Self) {
    
    inline def setCallback(value: (Any, Any) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setPayload(value: JsonRpcPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
