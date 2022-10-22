package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleEvents extends StObject {
  
  var collapse: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var expand: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object CollapsibleEvents {
  
  inline def apply(): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleEvents]
  }
  
  extension [Self <: CollapsibleEvents](x: Self) {
    
    inline def setCollapse(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCreate(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setExpand(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "expand", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
