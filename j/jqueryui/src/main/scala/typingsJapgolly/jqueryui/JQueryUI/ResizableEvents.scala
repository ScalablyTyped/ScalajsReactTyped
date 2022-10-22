package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizableEvents extends StObject {
  
  var create: js.UndefOr[ResizableEvent] = js.undefined
  
  var resize: js.UndefOr[ResizableEvent] = js.undefined
  
  var start: js.UndefOr[ResizableEvent] = js.undefined
  
  var stop: js.UndefOr[ResizableEvent] = js.undefined
}
object ResizableEvents {
  
  inline def apply(): ResizableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableEvents]
  }
  
  extension [Self <: ResizableEvents](x: Self) {
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ResizableUIParams) => (value(t0, t1)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setResize(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ResizableUIParams) => (value(t0, t1)).runNow()))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setStart(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ResizableUIParams) => (value(t0, t1)).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ResizableUIParams) => (value(t0, t1)).runNow()))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
