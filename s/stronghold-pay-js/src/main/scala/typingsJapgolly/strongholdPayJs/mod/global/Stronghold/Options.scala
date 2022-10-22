package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var onError: js.UndefOr[OnError] = js.undefined
  
  var onEvent: js.UndefOr[OnEvent] = js.undefined
  
  var onExit: js.UndefOr[OnExit] = js.undefined
  
  var onReady: js.UndefOr[OnReady] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOnError(value: /* error */ StrongholdPayError => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ StrongholdPayError) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnEvent(value: /* event */ StrongholdMessageEvent => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction1((t0: /* event */ StrongholdMessageEvent) => value(t0).runNow()))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExit(value: Callback): Self = StObject.set(x, "onExit", value.toJsFn)
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
  }
}
