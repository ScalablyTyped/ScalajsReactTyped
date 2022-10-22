package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapMenu control.
  */
trait BootstrapClientMenu
  extends StObject
     with ASPxClientMenu {
  
  /**
    * Selects the specified menu item within the Menu control on the client side.
    * @param item A BootstrapClientMenuItem object specifying the menu item to select.
    */
  def SetSelectedItem(item: BootstrapClientMenuItem): Unit
}
object BootstrapClientMenu {
  
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
    SetSelectedItem: BootstrapClientMenuItem => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ToggleSideMenu: Callback,
    name: String
  ): BootstrapClientMenu = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, CloseUp = CloseUp.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = GetItemCount.toJsFn, GetMainElement = GetMainElement.toJsFn, GetOrientation = GetOrientation.toJsFn, GetParentControl = GetParentControl.toJsFn, GetRootItem = GetRootItem.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], PopUp = PopUp.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetOrientation = js.Any.fromFunction1((t0: String) => SetOrientation(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: BootstrapClientMenuItem) => SetSelectedItem(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ToggleSideMenu = ToggleSideMenu.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenu]
  }
  
  extension [Self <: BootstrapClientMenu](x: Self) {
    
    inline def setSetSelectedItem(value: BootstrapClientMenuItem => Callback): Self = StObject.set(x, "SetSelectedItem", js.Any.fromFunction1((t0: BootstrapClientMenuItem) => value(t0).runNow()))
  }
}
