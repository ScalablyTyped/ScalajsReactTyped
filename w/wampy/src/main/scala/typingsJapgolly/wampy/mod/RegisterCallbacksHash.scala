package typingsJapgolly.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  
  var onSuccess: js.UndefOr[Callback] = js.undefined
  
  def rpc(args: DataArgs): RPCResult | Unit
  @JSName("rpc")
  var rpc_Original: RPCCallback
}
object RegisterCallbacksHash {
  
  inline def apply(rpc: /* args */ DataArgs => RPCResult | Unit): RegisterCallbacksHash = {
    val __obj = js.Dynamic.literal(rpc = js.Any.fromFunction1(rpc))
    __obj.asInstanceOf[RegisterCallbacksHash]
  }
  
  extension [Self <: RegisterCallbacksHash](x: Self) {
    
    inline def setOnError(value: /* args */ ErrorArgs => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* args */ ErrorArgs) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSuccess", value.toJsFn)
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setRpc(value: /* args */ DataArgs => RPCResult | Unit): Self = StObject.set(x, "rpc", js.Any.fromFunction1(value))
  }
}
