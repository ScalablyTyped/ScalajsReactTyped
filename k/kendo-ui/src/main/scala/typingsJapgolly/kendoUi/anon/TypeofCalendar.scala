package typingsJapgolly.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCalendar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Calendar
  
  /* static member */
  var fn: typingsJapgolly.kendoUi.kendo.ui.Calendar
}
object TypeofCalendar {
  
  inline def apply(
    extend: js.Object => typingsJapgolly.kendoUi.kendo.ui.Calendar,
    fn: typingsJapgolly.kendoUi.kendo.ui.Calendar
  ): TypeofCalendar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalendar]
  }
  
  extension [Self <: TypeofCalendar](x: Self) {
    
    inline def setExtend(value: js.Object => typingsJapgolly.kendoUi.kendo.ui.Calendar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: typingsJapgolly.kendoUi.kendo.ui.Calendar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
