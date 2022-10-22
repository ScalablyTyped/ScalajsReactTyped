package typingsJapgolly.knuddelsUserappsApi.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappsApi.mod.global.KnuddelAmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onError: js.UndefOr[
    js.Function3[/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String, Unit]
  ] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function2[/* knuddelAmount */ KnuddelAmount, /* reason */ String, Unit]] = js.undefined
}
object OnError {
  
  inline def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: (/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction3((t0: /* knuddelAmount */ KnuddelAmount, t1: /* reason */ String, t2: /* message */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: (/* knuddelAmount */ KnuddelAmount, /* reason */ String) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* knuddelAmount */ KnuddelAmount, t1: /* reason */ String) => (value(t0, t1)).runNow()))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
