package typingsJapgolly.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnregisterCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  
  var onSuccess: js.UndefOr[Callback] = js.undefined
}
object UnregisterCallbacksHash {
  
  inline def apply(): UnregisterCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnregisterCallbacksHash]
  }
  
  extension [Self <: UnregisterCallbacksHash](x: Self) {
    
    inline def setOnError(value: /* args */ ErrorArgs => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* args */ ErrorArgs) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSuccess", value.toJsFn)
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
