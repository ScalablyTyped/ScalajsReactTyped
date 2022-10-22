package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.TimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimePicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TimePicker
  
  /* static member */
  var fn: TimePicker
}
object TypeofTimePicker {
  
  inline def apply(extend: js.Object => TimePicker, fn: TimePicker): TypeofTimePicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimePicker]
  }
  
  extension [Self <: TypeofTimePicker](x: Self) {
    
    inline def setExtend(value: js.Object => TimePicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
