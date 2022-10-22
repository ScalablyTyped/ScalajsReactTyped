package typingsJapgolly.knuddelsUserappBackendApi.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSuccess extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var transferReason: js.UndefOr[String] = js.undefined
}
object OnSuccess {
  
  inline def apply(): OnSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSuccess]
  }
  
  extension [Self <: OnSuccess](x: Self) {
    
    inline def setOnError(value: /* message */ String => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: Callback): Self = StObject.set(x, "onSuccess", value.toJsFn)
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setTransferReason(value: String): Self = StObject.set(x, "transferReason", value.asInstanceOf[js.Any])
    
    inline def setTransferReasonUndefined: Self = StObject.set(x, "transferReason", js.undefined)
  }
}
