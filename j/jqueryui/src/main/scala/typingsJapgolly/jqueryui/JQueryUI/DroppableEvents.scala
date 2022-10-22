package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableEvents extends StObject {
  
  var activate: js.UndefOr[DroppableEvent] = js.undefined
  
  var create: js.UndefOr[DroppableEvent] = js.undefined
  
  var deactivate: js.UndefOr[DroppableEvent] = js.undefined
  
  var drop: js.UndefOr[DroppableEvent] = js.undefined
  
  var out: js.UndefOr[DroppableEvent] = js.undefined
  
  var over: js.UndefOr[DroppableEvent] = js.undefined
}
object DroppableEvents {
  
  inline def apply(): DroppableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableEvents]
  }
  
  extension [Self <: DroppableEvents](x: Self) {
    
    inline def setActivate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ DroppableEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ DroppableEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback): Self = StObject.set(x, "deactivate", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ DroppableEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setDrop(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ DroppableEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setOut(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback): Self = StObject.set(x, "out", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ DroppableEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setOver(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback): Self = StObject.set(x, "over", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ DroppableEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
  }
}
