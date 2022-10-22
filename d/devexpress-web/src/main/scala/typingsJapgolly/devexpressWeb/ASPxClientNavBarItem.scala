package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
trait ASPxClientNavBarItem extends StObject {
  
  /**
    * Returns a value indicating whether an item is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  def GetImageUrl(): String
  
  /**
    * Gets an URL which defines the item's navigation location.
    */
  def GetNavigateUrl(): String
  
  /**
    * Returns text displayed within the item.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether an item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit
  
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  def SetImageUrl(value: String): Unit
  
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  def SetNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  def SetText(value: String): Unit
  
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the group to which the current item belongs.
    */
  var group: ASPxClientNavBarGroup
  
  /**
    * Gets the item's index within a collection of a group's items.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the item.
    */
  var name: String
  
  /**
    * Gets the navbar to which the current item belongs.
    */
  var navBar: ASPxClientNavBar
}
object ASPxClientNavBarItem {
  
  inline def apply(
    GetEnabled: CallbackTo[Boolean],
    GetImageUrl: CallbackTo[String],
    GetNavigateUrl: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetEnabled: Boolean => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    group: ASPxClientNavBarGroup,
    index: Double,
    name: String,
    navBar: ASPxClientNavBar
  ): ASPxClientNavBarItem = {
    val __obj = js.Dynamic.literal(GetEnabled = GetEnabled.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItem]
  }
  
  extension [Self <: ASPxClientNavBarItem](x: Self) {
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetImageUrl", value.toJsFn)
    
    inline def setGetNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetNavigateUrl", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setGroup(value: ASPxClientNavBarGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavBar(value: ASPxClientNavBar): Self = StObject.set(x, "navBar", value.asInstanceOf[js.Any])
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetNavigateUrl(value: String => Callback): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
