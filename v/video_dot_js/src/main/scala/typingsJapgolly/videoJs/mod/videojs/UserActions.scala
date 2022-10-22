package typingsJapgolly.videoJs.mod.videojs

import japgolly.scalajs.react.Callback
import typingsJapgolly.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserActions extends StObject {
  
  var click: js.UndefOr[Boolean | (js.Function1[/* event */ Event, Unit])] = js.undefined
  
  var doubleClick: js.UndefOr[Boolean | (js.Function1[/* event */ Event, Unit])] = js.undefined
  
  var hotkeys: js.UndefOr[Boolean | (js.Function1[/* event */ KeyboardEvent, Unit]) | UserActionHotkeys] = js.undefined
}
object UserActions {
  
  inline def apply(): UserActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActions]
  }
  
  extension [Self <: UserActions](x: Self) {
    
    inline def setClick(value: Boolean | (js.Function1[/* event */ Event, Unit])): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickFunction1(value: /* event */ Event => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDoubleClick(value: Boolean | (js.Function1[/* event */ Event, Unit])): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickFunction1(value: /* event */ Event => Callback): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
    
    inline def setHotkeys(value: Boolean | (js.Function1[/* event */ KeyboardEvent, Unit]) | UserActionHotkeys): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
    
    inline def setHotkeysFunction1(value: /* event */ KeyboardEvent => Callback): Self = StObject.set(x, "hotkeys", js.Any.fromFunction1((t0: /* event */ KeyboardEvent) => value(t0).runNow()))
    
    inline def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
  }
}
