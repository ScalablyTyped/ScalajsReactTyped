package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for the ASPxClientMenu and ASPxClientPopupMenu objects.
  */
trait ASPxClientMenuBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs on the client side when a submenu closes.
    */
  var CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]
  
  /**
    * Returns the menu's root menu item specified by its index. An ASPxClientMenuItem object representing the root item located at the specified index within the menu's ASPxMenuBase.Items collection.
    * @param index An integer value specifying the zero-based index of the root menu item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientMenuItem
  
  /**
    * Returns a menu item specified by its name. An ASPxClientMenuItem object that represents the menu item with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: String): ASPxClientMenuItem
  
  /**
    * Returns the number of menu items at the root menu level.
    */
  def GetItemCount(): Double
  
  /**
    * Returns a root menu item.
    */
  def GetRootItem(): ASPxClientMenuItem
  
  /**
    * Returns the selected item within the menu control.
    */
  def GetSelectedItem(): ASPxClientMenuItem
  
  /**
    * Fires after a menu item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]]
  
  /**
    * Occurs on the client side when the mouse cursor moves outside a menu item.
    */
  var ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]
  
  /**
    * Occurs on the client side when the mouse cursor is moved into a menu item.
    */
  var ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]
  
  /**
    * Occurs on the client side when a submenu pops up.
    */
  var PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]
  
  /**
    * Selects the specified menu item within a menu control on the client side.
    * @param item An ASPxClientMenuItem object specifying the menu item to select.
    */
  def SetSelectedItem(item: ASPxClientMenuItem): Unit
}
object ASPxClientMenuBase {
  
  inline def apply(
    AdjustControl: Callback,
    CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
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
    SetSelectedItem: ASPxClientMenuItem => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientMenuBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, CloseUp = CloseUp.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = GetItemCount.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetRootItem = GetRootItem.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], PopUp = PopUp.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: ASPxClientMenuItem) => SetSelectedItem(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuBase]
  }
  
  extension [Self <: ASPxClientMenuBase](x: Self) {
    
    inline def setCloseUp(value: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]): Self = StObject.set(x, "CloseUp", value.asInstanceOf[js.Any])
    
    inline def setGetItem(value: Double => ASPxClientMenuItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => ASPxClientMenuItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetItemCount", value.toJsFn)
    
    inline def setGetRootItem(value: CallbackTo[ASPxClientMenuItem]): Self = StObject.set(x, "GetRootItem", value.toJsFn)
    
    inline def setGetSelectedItem(value: CallbackTo[ASPxClientMenuItem]): Self = StObject.set(x, "GetSelectedItem", value.toJsFn)
    
    inline def setItemClick(value: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]]): Self = StObject.set(x, "ItemClick", value.asInstanceOf[js.Any])
    
    inline def setItemMouseOut(value: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]): Self = StObject.set(x, "ItemMouseOut", value.asInstanceOf[js.Any])
    
    inline def setItemMouseOver(value: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]): Self = StObject.set(x, "ItemMouseOver", value.asInstanceOf[js.Any])
    
    inline def setPopUp(value: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]): Self = StObject.set(x, "PopUp", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedItem(value: ASPxClientMenuItem => Callback): Self = StObject.set(x, "SetSelectedItem", js.Any.fromFunction1((t0: ASPxClientMenuItem) => value(t0).runNow()))
  }
}
