package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the menu's MenuItem object.
  */
trait ASPxClientMenuItem extends StObject {
  
  /**
    * Indicates whether the menu item is checked.
    */
  def GetChecked(): Boolean
  
  /**
    * Returns a value specifying whether a menu item is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns the URL pointing to the image displayed within the menu item.
    */
  def GetImageUrl(): String
  
  /**
    * Returns the current menu item's immediate subitem specified by its index. An ASPxClientMenuItem object representing the menu item's immediate subitem located at the specified index within the menu item's MenuItem.Items collection.
    * @param index An integer value specifying the zero-based index of the submenu item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientMenuItem
  
  /**
    * Returns the current menu item's subitem specified by its name. An ASPxClientMenuItem object that represents the current menu item's subitem with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: String): ASPxClientMenuItem
  
  /**
    * Returns the number of the current menu item's immediate child items.
    */
  def GetItemCount(): Double
  
  /**
    * Gets a URL which defines the navigation location for the menu item.
    */
  def GetNavigateUrl(): String
  
  /**
    * Returns text displayed within the menu item.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether a menu item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies whether the menu item is checked.
    * @param value true if the menu item is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit
  
  /**
    * Specifies whether the menu item is enabled.
    * @param value true to enable the menu item; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit
  
  /**
    * Sets the URL which points to the image displayed within the menu item.
    * @param value A string value specifying the URL to the image displayed within the menu item.
    */
  def SetImageUrl(value: String): Unit
  
  /**
    * Specifies a URL which defines the navigation location for the menu item.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the menu item is clicked.
    */
  def SetNavigateUrl(value: String): Unit
  
  /**
    * Sets the text to be displayed within the menu item.
    * @param value A string value specifying the text to be displayed within the menu item.
    */
  def SetText(value: String): Unit
  
  /**
    * Specifies the menu item's visibility.
    * @param value true if the menu item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the item's index within the parent's collection of items.
    */
  var index: Double
  
  /**
    * For internal use only.
    */
  var indexPath: String
  
  /**
    * Gets the menu object to which the current item belongs.
    */
  var menu: ASPxClientMenuBase
  
  /**
    * Gets the name that uniquely identifies the menu item.
    */
  var name: String
  
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  var parent: ASPxClientMenuItem
}
object ASPxClientMenuItem {
  
  inline def apply(
    GetChecked: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetImageUrl: CallbackTo[String],
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: CallbackTo[Double],
    GetNavigateUrl: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetChecked: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    indexPath: String,
    menu: ASPxClientMenuBase,
    name: String,
    parent: ASPxClientMenuItem
  ): ASPxClientMenuItem = {
    val __obj = js.Dynamic.literal(GetChecked = GetChecked.toJsFn, GetEnabled = GetEnabled.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = GetItemCount.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetChecked = js.Any.fromFunction1((t0: Boolean) => SetChecked(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItem]
  }
  
  extension [Self <: ASPxClientMenuItem](x: Self) {
    
    inline def setGetChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetChecked", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetImageUrl", value.toJsFn)
    
    inline def setGetItem(value: Double => ASPxClientMenuItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => ASPxClientMenuItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetItemCount", value.toJsFn)
    
    inline def setGetNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetNavigateUrl", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexPath(value: String): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: ASPxClientMenuBase): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ASPxClientMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetChecked(value: Boolean => Callback): Self = StObject.set(x, "SetChecked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetNavigateUrl(value: String => Callback): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
