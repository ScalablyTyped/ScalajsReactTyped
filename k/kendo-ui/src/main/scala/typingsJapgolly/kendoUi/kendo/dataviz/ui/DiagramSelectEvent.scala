package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramSelectEvent
  extends StObject
     with DiagramEvent {
  
  var deselected: js.UndefOr[Any] = js.undefined
  
  var selected: js.UndefOr[Any] = js.undefined
}
object DiagramSelectEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Diagram): DiagramSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramSelectEvent]
  }
  
  extension [Self <: DiagramSelectEvent](x: Self) {
    
    inline def setDeselected(value: Any): Self = StObject.set(x, "deselected", value.asInstanceOf[js.Any])
    
    inline def setDeselectedUndefined: Self = StObject.set(x, "deselected", js.undefined)
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
