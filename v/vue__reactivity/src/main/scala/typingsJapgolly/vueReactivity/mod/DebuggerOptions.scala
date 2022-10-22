package typingsJapgolly.vueReactivity.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerOptions extends StObject {
  
  var onTrack: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.undefined
  
  var onTrigger: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.undefined
}
object DebuggerOptions {
  
  inline def apply(): DebuggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebuggerOptions]
  }
  
  extension [Self <: DebuggerOptions](x: Self) {
    
    inline def setOnTrack(value: /* event */ DebuggerEvent => Callback): Self = StObject.set(x, "onTrack", js.Any.fromFunction1((t0: /* event */ DebuggerEvent) => value(t0).runNow()))
    
    inline def setOnTrackUndefined: Self = StObject.set(x, "onTrack", js.undefined)
    
    inline def setOnTrigger(value: /* event */ DebuggerEvent => Callback): Self = StObject.set(x, "onTrigger", js.Any.fromFunction1((t0: /* event */ DebuggerEvent) => value(t0).runNow()))
    
    inline def setOnTriggerUndefined: Self = StObject.set(x, "onTrigger", js.undefined)
  }
}
