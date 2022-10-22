package typingsJapgolly.jqueryGridster

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.jqueryGridster.anon.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterResizable extends StObject {
  
  var axes: js.UndefOr[js.Array[String]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var handle_append_to: js.UndefOr[String] = js.undefined
  
  var handle_class: js.UndefOr[String] = js.undefined
  
  var max_size: js.UndefOr[js.Array[Double]] = js.undefined
  
  var min_size: js.UndefOr[js.Array[Double]] = js.undefined
  
  var resize: js.UndefOr[js.Function3[/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Helper, /* $el */ JQuery, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function3[/* event */ Event, /* ui */ Helper, /* $el */ JQuery, Unit]] = js.undefined
}
object GridsterResizable {
  
  inline def apply(): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterResizable]
  }
  
  extension [Self <: GridsterResizable](x: Self) {
    
    inline def setAxes(value: js.Array[String]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setAxesVarargs(value: String*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHandle_append_to(value: String): Self = StObject.set(x, "handle_append_to", value.asInstanceOf[js.Any])
    
    inline def setHandle_append_toUndefined: Self = StObject.set(x, "handle_append_to", js.undefined)
    
    inline def setHandle_class(value: String): Self = StObject.set(x, "handle_class", value.asInstanceOf[js.Any])
    
    inline def setHandle_classUndefined: Self = StObject.set(x, "handle_class", js.undefined)
    
    inline def setMax_size(value: js.Array[Double]): Self = StObject.set(x, "max_size", value.asInstanceOf[js.Any])
    
    inline def setMax_sizeUndefined: Self = StObject.set(x, "max_size", js.undefined)
    
    inline def setMax_sizeVarargs(value: Double*): Self = StObject.set(x, "max_size", js.Array(value*))
    
    inline def setMin_size(value: js.Array[Double]): Self = StObject.set(x, "min_size", value.asInstanceOf[js.Any])
    
    inline def setMin_sizeUndefined: Self = StObject.set(x, "min_size", js.undefined)
    
    inline def setMin_sizeVarargs(value: Double*): Self = StObject.set(x, "min_size", js.Array(value*))
    
    inline def setResize(value: (/* event */ Event, /* ui */ GridsterUi, /* $el */ JQuery) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction3((t0: /* event */ Event, t1: /* ui */ GridsterUi, t2: /* $el */ JQuery) => (value(t0, t1, t2)).runNow()))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setStart(value: (/* event */ Event, /* ui */ Helper, /* $el */ JQuery) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction3((t0: /* event */ Event, t1: /* ui */ Helper, t2: /* $el */ JQuery) => (value(t0, t1, t2)).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ Event, /* ui */ Helper, /* $el */ JQuery) => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction3((t0: /* event */ Event, t1: /* ui */ Helper, t2: /* $el */ JQuery) => (value(t0, t1, t2)).runNow()))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
