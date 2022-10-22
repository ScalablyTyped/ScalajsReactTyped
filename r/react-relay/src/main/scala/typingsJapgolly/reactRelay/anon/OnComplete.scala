package typingsJapgolly.reactRelay.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnComplete[TQuery /* <: OperationType */] extends StObject {
  
  var UNSTABLE_extraVariables: js.UndefOr[Partial[VariablesOf[TQuery]]] = js.undefined
  
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
}
object OnComplete {
  
  inline def apply[TQuery /* <: OperationType */](): OnComplete[TQuery] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnComplete[TQuery]]
  }
  
  extension [Self <: OnComplete[?], TQuery /* <: OperationType */](x: Self & OnComplete[TQuery]) {
    
    inline def setOnComplete(value: /* arg */ js.Error | Null => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: /* arg */ js.Error | Null) => value(t0).runNow()))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setUNSTABLE_extraVariables(value: Partial[VariablesOf[TQuery]]): Self = StObject.set(x, "UNSTABLE_extraVariables", value.asInstanceOf[js.Any])
    
    inline def setUNSTABLE_extraVariablesUndefined: Self = StObject.set(x, "UNSTABLE_extraVariables", js.undefined)
  }
}
