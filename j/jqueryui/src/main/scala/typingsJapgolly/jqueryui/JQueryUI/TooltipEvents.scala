package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipEvents extends StObject {
  
  var close: js.UndefOr[TooltipEvent] = js.undefined
  
  var open: js.UndefOr[TooltipEvent] = js.undefined
}
object TooltipEvents {
  
  inline def apply(): TooltipEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipEvents]
  }
  
  extension [Self <: TooltipEvents](x: Self) {
    
    inline def setClose(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Callback): Self = StObject.set(x, "close", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ TooltipUIParams) => (value(t0, t1)).runNow()))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction2((t0: /* event */ JQueryEventObject, t1: /* ui */ TooltipUIParams) => (value(t0, t1)).runNow()))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
