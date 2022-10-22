package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupEvents extends StObject {
  
  var popupafterclose: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var popupafteropen: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var popupbeforeposition: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object PopupEvents {
  
  inline def apply(): PopupEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupEvents]
  }
  
  extension [Self <: PopupEvents](x: Self) {
    
    inline def setPopupafterclose(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "popupafterclose", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setPopupaftercloseUndefined: Self = StObject.set(x, "popupafterclose", js.undefined)
    
    inline def setPopupafteropen(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "popupafteropen", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setPopupafteropenUndefined: Self = StObject.set(x, "popupafteropen", js.undefined)
    
    inline def setPopupbeforeposition(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "popupbeforeposition", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setPopupbeforepositionUndefined: Self = StObject.set(x, "popupbeforeposition", js.undefined)
  }
}
