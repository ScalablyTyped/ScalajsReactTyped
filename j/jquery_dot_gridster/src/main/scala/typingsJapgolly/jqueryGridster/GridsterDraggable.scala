package typingsJapgolly.jqueryGridster

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.jqueryGridster.anon.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterDraggable extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var drag: js.UndefOr[js.Function2[/* event */ Event, /* ui */ GridsterUi, Unit]] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[Any] = js.undefined
  
  var limit: js.UndefOr[Boolean] = js.undefined
  
  var offset_left: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function2[/* event */ Event, /* ui */ Helper, Unit]] = js.undefined
}
object GridsterDraggable {
  
  inline def apply(): GridsterDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterDraggable]
  }
  
  extension [Self <: GridsterDraggable](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDrag(value: (/* event */ Event, /* ui */ GridsterUi) => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ GridsterUi) => (value(t0, t1)).runNow()))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setLimit(value: Boolean): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset_left(value: Double): Self = StObject.set(x, "offset_left", value.asInstanceOf[js.Any])
    
    inline def setOffset_leftUndefined: Self = StObject.set(x, "offset_left", js.undefined)
    
    inline def setStart(value: (/* event */ Event, /* ui */ Helper) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Helper) => (value(t0, t1)).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ Event, /* ui */ Helper) => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Helper) => (value(t0, t1)).runNow()))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
