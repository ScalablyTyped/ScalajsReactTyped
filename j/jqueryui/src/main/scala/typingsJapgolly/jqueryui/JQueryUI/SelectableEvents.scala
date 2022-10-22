package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryui.anon.Selected
import typingsJapgolly.jqueryui.anon.Selecting
import typingsJapgolly.jqueryui.anon.Unselected
import typingsJapgolly.jqueryui.anon.Unselecting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectableEvents extends StObject {
  
  var selected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selected, Unit]] = js.undefined
  
  var selecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selecting, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Any, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Any, Unit]] = js.undefined
  
  var unselected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselected, Unit]] = js.undefined
  
  var unselecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselecting, Unit]] = js.undefined
}
object SelectableEvents {
  
  inline def apply(): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableEvents]
  }
  
  extension [Self <: SelectableEvents](x: Self) {
    
    inline def setSelected(value: (/* event */ JQueryEventObject, /* ui */ Selected) => Callback): Self = StObject.set(x, "selected", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ Selected) => (value(t0, t1)).runNow()))
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelecting(value: (/* event */ JQueryEventObject, /* ui */ Selecting) => Callback): Self = StObject.set(x, "selecting", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ Selecting) => (value(t0, t1)).runNow()))
    
    inline def setSelectingUndefined: Self = StObject.set(x, "selecting", js.undefined)
    
    inline def setStart(value: (/* event */ JQueryEventObject, /* ui */ Any) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ JQueryEventObject, /* ui */ Any) => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setUnselected(value: (/* event */ JQueryEventObject, /* ui */ Unselected) => Callback): Self = StObject.set(x, "unselected", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ Unselected) => (value(t0, t1)).runNow()))
    
    inline def setUnselectedUndefined: Self = StObject.set(x, "unselected", js.undefined)
    
    inline def setUnselecting(value: (/* event */ JQueryEventObject, /* ui */ Unselecting) => Callback): Self = StObject.set(x, "unselecting", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ Unselecting) => (value(t0, t1)).runNow()))
    
    inline def setUnselectingUndefined: Self = StObject.set(x, "unselecting", js.undefined)
  }
}
