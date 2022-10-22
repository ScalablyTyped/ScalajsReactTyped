package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventController extends StObject {
  
  var onStartListening: js.UndefOr[js.Function2[/* events */ IEventManager[js.Object], /* type */ String, Unit]] = js.undefined
  
  var onStopListening: js.UndefOr[js.Function2[/* events */ IEventManager[js.Object], /* type */ String, Unit]] = js.undefined
}
object IEventController {
  
  inline def apply(): IEventController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventController]
  }
  
  extension [Self <: IEventController](x: Self) {
    
    inline def setOnStartListening(value: (/* events */ IEventManager[js.Object], /* type */ String) => Callback): Self = StObject.set(x, "onStartListening", js.Any.fromFunction2((t0: /* events */ IEventManager[js.Object], t1: /* type */ String) => (value(t0, t1)).runNow()))
    
    inline def setOnStartListeningUndefined: Self = StObject.set(x, "onStartListening", js.undefined)
    
    inline def setOnStopListening(value: (/* events */ IEventManager[js.Object], /* type */ String) => Callback): Self = StObject.set(x, "onStopListening", js.Any.fromFunction2((t0: /* events */ IEventManager[js.Object], t1: /* type */ String) => (value(t0, t1)).runNow()))
    
    inline def setOnStopListeningUndefined: Self = StObject.set(x, "onStopListening", js.undefined)
  }
}
