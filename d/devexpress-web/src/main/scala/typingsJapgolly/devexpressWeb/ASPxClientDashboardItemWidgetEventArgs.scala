package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to client widgets used to visualize data in dashboard items.
  */
trait ASPxClientDashboardItemWidgetEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns an underlying widget corresponding to the current dashboard item.
    */
  def GetWidget(): Any
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
}
object ASPxClientDashboardItemWidgetEventArgs {
  
  inline def apply(GetWidget: CallbackTo[Any], ItemName: String): ASPxClientDashboardItemWidgetEventArgs = {
    val __obj = js.Dynamic.literal(GetWidget = GetWidget.toJsFn, ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemWidgetEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemWidgetEventArgs](x: Self) {
    
    inline def setGetWidget(value: CallbackTo[Any]): Self = StObject.set(x, "GetWidget", value.toJsFn)
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
