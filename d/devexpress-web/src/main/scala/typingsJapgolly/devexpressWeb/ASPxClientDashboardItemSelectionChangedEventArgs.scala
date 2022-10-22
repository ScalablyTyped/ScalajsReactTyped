package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
trait ASPxClientDashboardItemSelectionChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets currently selected elements.
    */
  def GetCurrentSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple]
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
}
object ASPxClientDashboardItemSelectionChangedEventArgs {
  
  inline def apply(
    GetCurrentSelection: CallbackTo[js.Array[ASPxClientDashboardItemDataAxisPointTuple]],
    ItemName: String
  ): ASPxClientDashboardItemSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(GetCurrentSelection = GetCurrentSelection.toJsFn, ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemSelectionChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemSelectionChangedEventArgs](x: Self) {
    
    inline def setGetCurrentSelection(value: CallbackTo[js.Array[ASPxClientDashboardItemDataAxisPointTuple]]): Self = StObject.set(x, "GetCurrentSelection", value.toJsFn)
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
