package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgChartCancelEvent
  extends StObject
     with OrgChartEvent {
  
  var dataItem: js.UndefOr[Any] = js.undefined
}
object OrgChartCancelEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: OrgChart): OrgChartCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgChartCancelEvent]
  }
  
  extension [Self <: OrgChartCancelEvent](x: Self) {
    
    inline def setDataItem(value: Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
  }
}
