package typingsJapgolly.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  
  var onSuccess: js.UndefOr[SuccessCallback] = js.undefined
}
object CallCallbacksHash {
  
  inline def apply(): CallCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallCallbacksHash]
  }
  
  extension [Self <: CallCallbacksHash](x: Self) {
    
    inline def setOnError(value: /* args */ ErrorArgs => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* args */ ErrorArgs) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: /* args */ DataArgs => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: /* args */ DataArgs) => value(t0).runNow()))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
