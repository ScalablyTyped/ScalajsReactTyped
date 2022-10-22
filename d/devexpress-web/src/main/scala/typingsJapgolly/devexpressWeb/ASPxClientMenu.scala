package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxMenu object.
  */
trait ASPxClientMenu
  extends StObject
     with ASPxClientMenuBase {
  
  /**
    * Gets a value specifying the menu orientation.
    */
  def GetOrientation(): String
  
  /**
    * Sets the menu orientation.
    * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
    */
  def SetOrientation(orientation: String): Unit
  
  /**
    * Expands or collapses the side menu.
    */
  def ToggleSideMenu(): Unit
}
object ASPxClientMenu {
  
  inline def apply(
    AdjustControl: Callback,
    CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetOrientation: CallbackTo[String],
    GetParentControl: CallbackTo[Any],
    GetRootItem: CallbackTo[ASPxClientMenuItem],
    GetSelectedItem: CallbackTo[ASPxClientMenuItem],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]],
    ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetOrientation: String => Callback,
    SetSelectedItem: ASPxClientMenuItem => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ToggleSideMenu: Callback,
    name: String
  ): ASPxClientMenu = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, CloseUp = CloseUp.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = GetItemCount.toJsFn, GetMainElement = GetMainElement.toJsFn, GetOrientation = GetOrientation.toJsFn, GetParentControl = GetParentControl.toJsFn, GetRootItem = GetRootItem.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], PopUp = PopUp.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetOrientation = js.Any.fromFunction1((t0: String) => SetOrientation(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: ASPxClientMenuItem) => SetSelectedItem(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ToggleSideMenu = ToggleSideMenu.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenu]
  }
  
  extension [Self <: ASPxClientMenu](x: Self) {
    
    inline def setGetOrientation(value: CallbackTo[String]): Self = StObject.set(x, "GetOrientation", value.toJsFn)
    
    inline def setSetOrientation(value: String => Callback): Self = StObject.set(x, "SetOrientation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToggleSideMenu(value: Callback): Self = StObject.set(x, "ToggleSideMenu", value.toJsFn)
  }
}
