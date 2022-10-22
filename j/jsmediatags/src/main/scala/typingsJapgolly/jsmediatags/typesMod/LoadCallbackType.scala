package typingsJapgolly.jsmediatags.typesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadCallbackType extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  
  def onSuccess(): Unit
}
object LoadCallbackType {
  
  inline def apply(onSuccess: Callback): LoadCallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = onSuccess.toJsFn)
    __obj.asInstanceOf[LoadCallbackType]
  }
  
  extension [Self <: LoadCallbackType](x: Self) {
    
    inline def setOnError(value: /* error */ jsmediatagsError => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ jsmediatagsError) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: Callback): Self = StObject.set(x, "onSuccess", value.toJsFn)
  }
}
