package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgChartCollapseEvent
  extends StObject
     with OrgChartEvent {
  
  var dataItems: js.UndefOr[Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object OrgChartCollapseEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: OrgChart): OrgChartCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgChartCollapseEvent]
  }
  
  extension [Self <: OrgChartCollapseEvent](x: Self) {
    
    inline def setDataItems(value: Any): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
