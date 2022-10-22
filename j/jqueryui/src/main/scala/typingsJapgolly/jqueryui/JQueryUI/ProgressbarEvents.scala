package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressbarEvents extends StObject {
  
  var change: js.UndefOr[ProgressbarEvent] = js.undefined
  
  var complete: js.UndefOr[ProgressbarEvent] = js.undefined
  
  var create: js.UndefOr[ProgressbarEvent] = js.undefined
}
object ProgressbarEvents {
  
  inline def apply(): ProgressbarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressbarEvents]
  }
  
  extension [Self <: ProgressbarEvents](x: Self) {
    
    inline def setChange(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback): Self = StObject.set(x, "change", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ProgressbarUIParams) => (value(t0, t1)).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setComplete(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ProgressbarUIParams) => (value(t0, t1)).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ ProgressbarUIParams) => (value(t0, t1)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
