package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemVisualInteractivity event.
  */
trait ASPxClientDashboardItemVisualInteractivityEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Enables highlighting for the current dashboard item.
    * @param enableHighlighting true, to enable highlighting; otherwise, false.
    */
  def EnableHighlighting(enableHighlighting: Boolean): Unit
  
  /**
    * Gets the default selection for the current dashboard item.
    */
  def GetDefaultSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple]
  
  /**
    * Gets the selection mode for dashboard item elements.
    */
  def GetSelectionMode(): String
  
  /**
    * Gets data axes used to perform custom interactivity actions.
    */
  def GetTargetAxes(): js.Array[String]
  
  /**
    * Returns whether highlighting is enabled for the current dashboard item.
    */
  def IsHighlightingEnabled(): Boolean
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
  
  /**
    * Sets the default selection for the current dashboard item.
    * @param values An array of ASPxClientDashboardItemDataAxisPointTuple objects specifying axis point tuples used to select default elements.
    */
  def SetDefaultSelection(values: js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Unit
  
  /**
    * Sets the selection mode for dashboard item elements.
    * @param selectionMode A DashboardSelectionMode value that specifies the selection mode.
    */
  def SetSelectionMode(selectionMode: String): Unit
  
  /**
    * Sets data axes used to perform custom interactivity actions.
    * @param targetAxes An array of String objects that specify names of data axes.
    */
  def SetTargetAxes(targetAxes: js.Array[String]): Unit
}
object ASPxClientDashboardItemVisualInteractivityEventArgs {
  
  inline def apply(
    EnableHighlighting: Boolean => Callback,
    GetDefaultSelection: CallbackTo[js.Array[ASPxClientDashboardItemDataAxisPointTuple]],
    GetSelectionMode: CallbackTo[String],
    GetTargetAxes: CallbackTo[js.Array[String]],
    IsHighlightingEnabled: CallbackTo[Boolean],
    ItemName: String,
    SetDefaultSelection: js.Array[ASPxClientDashboardItemDataAxisPointTuple] => Callback,
    SetSelectionMode: String => Callback,
    SetTargetAxes: js.Array[String] => Callback
  ): ASPxClientDashboardItemVisualInteractivityEventArgs = {
    val __obj = js.Dynamic.literal(EnableHighlighting = js.Any.fromFunction1((t0: Boolean) => EnableHighlighting(t0).runNow()), GetDefaultSelection = GetDefaultSelection.toJsFn, GetSelectionMode = GetSelectionMode.toJsFn, GetTargetAxes = GetTargetAxes.toJsFn, IsHighlightingEnabled = IsHighlightingEnabled.toJsFn, ItemName = ItemName.asInstanceOf[js.Any], SetDefaultSelection = js.Any.fromFunction1((t0: js.Array[ASPxClientDashboardItemDataAxisPointTuple]) => SetDefaultSelection(t0).runNow()), SetSelectionMode = js.Any.fromFunction1((t0: String) => SetSelectionMode(t0).runNow()), SetTargetAxes = js.Any.fromFunction1((t0: js.Array[String]) => SetTargetAxes(t0).runNow()))
    __obj.asInstanceOf[ASPxClientDashboardItemVisualInteractivityEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemVisualInteractivityEventArgs](x: Self) {
    
    inline def setEnableHighlighting(value: Boolean => Callback): Self = StObject.set(x, "EnableHighlighting", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetDefaultSelection(value: CallbackTo[js.Array[ASPxClientDashboardItemDataAxisPointTuple]]): Self = StObject.set(x, "GetDefaultSelection", value.toJsFn)
    
    inline def setGetSelectionMode(value: CallbackTo[String]): Self = StObject.set(x, "GetSelectionMode", value.toJsFn)
    
    inline def setGetTargetAxes(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "GetTargetAxes", value.toJsFn)
    
    inline def setIsHighlightingEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsHighlightingEnabled", value.toJsFn)
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultSelection(value: js.Array[ASPxClientDashboardItemDataAxisPointTuple] => Callback): Self = StObject.set(x, "SetDefaultSelection", js.Any.fromFunction1((t0: js.Array[ASPxClientDashboardItemDataAxisPointTuple]) => value(t0).runNow()))
    
    inline def setSetSelectionMode(value: String => Callback): Self = StObject.set(x, "SetSelectionMode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTargetAxes(value: js.Array[String] => Callback): Self = StObject.set(x, "SetTargetAxes", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
  }
}
