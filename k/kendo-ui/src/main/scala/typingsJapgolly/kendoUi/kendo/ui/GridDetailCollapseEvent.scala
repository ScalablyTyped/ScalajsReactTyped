package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridDetailCollapseEvent
  extends StObject
     with GridEvent {
  
  var detailRow: js.UndefOr[JQuery] = js.undefined
  
  var masterRow: js.UndefOr[JQuery] = js.undefined
}
object GridDetailCollapseEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Grid): GridDetailCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailCollapseEvent]
  }
  
  extension [Self <: GridDetailCollapseEvent](x: Self) {
    
    inline def setDetailRow(value: JQuery): Self = StObject.set(x, "detailRow", value.asInstanceOf[js.Any])
    
    inline def setDetailRowUndefined: Self = StObject.set(x, "detailRow", js.undefined)
    
    inline def setMasterRow(value: JQuery): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
    
    inline def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
  }
}
