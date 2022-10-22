package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var slidestart: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var slidestop: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object SliderEvents {
  
  inline def apply(): SliderEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEvents]
  }
  
  extension [Self <: SliderEvents](x: Self) {
    
    inline def setCreate(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setSlidestart(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "slidestart", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setSlidestartUndefined: Self = StObject.set(x, "slidestart", js.undefined)
    
    inline def setSlidestop(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "slidestop", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setSlidestopUndefined: Self = StObject.set(x, "slidestop", js.undefined)
  }
}
