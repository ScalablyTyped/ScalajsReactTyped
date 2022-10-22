package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxRadioEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object CheckboxRadioEvents {
  
  inline def apply(): CheckboxRadioEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxRadioEvents]
  }
  
  extension [Self <: CheckboxRadioEvents](x: Self) {
    
    inline def setCreate(value: (/* event */ Event, /* ui */ Any) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
