package typingsJapgolly.fullcalendarCommon.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarInteraction extends StObject {
  
  def destroy(): Unit
}
object CalendarInteraction {
  
  inline def apply(destroy: Callback): CalendarInteraction = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[CalendarInteraction]
  }
  
  extension [Self <: CalendarInteraction](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
