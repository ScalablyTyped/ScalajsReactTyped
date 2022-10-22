package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client ASPxGridView.
  */
trait ASPxClientGridBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Fires when a user changes the summary item value.
    */
  var BatchEditSummaryDisplayText: ASPxClientEvent[ASPxClientGridBatchEditSummaryDisplayTextEventHandler[ASPxClientGridBase]]
  
  /**
    * Returns a grid's toolbar specified by its index. An ASPxClientMenu object that is the toolbar located at the specified index within the control's Toolbars collection.
    * @param index An integer value specifying the zero-based index of the toolbar object to retrieve.
    */
  def GetToolbar(index: Double): ASPxClientMenu
  
  /**
    * Returns a toolbar specified by its name. An ASPxClientMenu object that is the toolbar with the specified name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: String): ASPxClientMenu
  
  /**
    * Fires after a toolbar item has been clicked.
    */
  var ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]]
}
object ASPxClientGridBase {
  
  inline def apply(
    AdjustControl: Callback,
    BatchEditSummaryDisplayText: ASPxClientEvent[ASPxClientGridBatchEditSummaryDisplayTextEventHandler[ASPxClientGridBase]],
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetToolbar: Double => ASPxClientMenu,
    GetToolbarByName: String => ASPxClientMenu,
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]],
    name: String
  ): ASPxClientGridBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, BatchEditSummaryDisplayText = BatchEditSummaryDisplayText.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetToolbar = js.Any.fromFunction1(GetToolbar), GetToolbarByName = js.Any.fromFunction1(GetToolbarByName), GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ToolbarItemClick = ToolbarItemClick.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridBase]
  }
  
  extension [Self <: ASPxClientGridBase](x: Self) {
    
    inline def setBatchEditSummaryDisplayText(value: ASPxClientEvent[ASPxClientGridBatchEditSummaryDisplayTextEventHandler[ASPxClientGridBase]]): Self = StObject.set(x, "BatchEditSummaryDisplayText", value.asInstanceOf[js.Any])
    
    inline def setGetToolbar(value: Double => ASPxClientMenu): Self = StObject.set(x, "GetToolbar", js.Any.fromFunction1(value))
    
    inline def setGetToolbarByName(value: String => ASPxClientMenu): Self = StObject.set(x, "GetToolbarByName", js.Any.fromFunction1(value))
    
    inline def setToolbarItemClick(value: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]]): Self = StObject.set(x, "ToolbarItemClick", value.asInstanceOf[js.Any])
  }
}
