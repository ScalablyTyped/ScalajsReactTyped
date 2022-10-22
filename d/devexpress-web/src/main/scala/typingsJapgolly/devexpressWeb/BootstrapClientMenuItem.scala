package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the menu's BootstrapMenuItem object.
  */
trait BootstrapClientMenuItem
  extends StObject
     with ASPxClientMenuItem {
  
  /**
    * Gets the CSS class of the icon displayed within the menu item badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the menu item badge.
    */
  def GetBadgeText(): String
  
  /**
    * Gets the CSS class of the icon displayed by the menu item.
    */
  def GetIconCssClass(): String
  
  /**
    * Sets the CSS class of the icon displayed within the menu item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the menu item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed by the menu item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit
  
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  @JSName("parent")
  var parent_BootstrapClientMenuItem: BootstrapClientMenuItem
}
object BootstrapClientMenuItem {
  
  inline def apply(
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetChecked: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetIconCssClass: CallbackTo[String],
    GetImageUrl: CallbackTo[String],
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: CallbackTo[Double],
    GetNavigateUrl: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetChecked: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetIconCssClass: String => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    indexPath: String,
    menu: ASPxClientMenuBase,
    name: String,
    parent: BootstrapClientMenuItem
  ): BootstrapClientMenuItem = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetChecked = GetChecked.toJsFn, GetEnabled = GetEnabled.toJsFn, GetIconCssClass = GetIconCssClass.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = GetItemCount.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetChecked = js.Any.fromFunction1((t0: Boolean) => SetChecked(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetIconCssClass = js.Any.fromFunction1((t0: String) => SetIconCssClass(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItem]
  }
  
  extension [Self <: BootstrapClientMenuItem](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setGetIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetIconCssClass", value.toJsFn)
    
    inline def setParent(value: BootstrapClientMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetIconCssClass(value: String => Callback): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
