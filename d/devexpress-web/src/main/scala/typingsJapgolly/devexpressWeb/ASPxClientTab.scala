package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a tab control's Tab or a page control's TabPage object.
  */
trait ASPxClientTab extends StObject {
  
  /**
    * Returns the URL pointing to the image displayed within the active tab.
    */
  def GetActiveImageUrl(): String
  
  /**
    * Returns a value specifying whether a tab is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns the URL pointing to the image displayed within the tab.
    */
  def GetImageUrl(): String
  
  /**
    * Gets an URL which defines the navigation location for the tab.
    */
  def GetNavigateUrl(): String
  
  /**
    * Returns text displayed within the tab.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether a tab is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies the URL which points to the image displayed within the active tab.
    * @param value A string value that is the URL to the image displayed within the active tab.
    */
  def SetActiveImageUrl(value: String): Unit
  
  /**
    * Specifies whether the tab is enabled.
    * @param value true to enable the tab; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit
  
  /**
    * Specifies the URL which points to the image displayed within the tab.
    * @param value A string value that is the URL to the image displayed within the tab.
    */
  def SetImageUrl(value: String): Unit
  
  /**
    * Specifies a URL which defines the navigation location for the tab.
    * @param value A string value which is a URL to where the client web browser will navigate when the tab is clicked.
    */
  def SetNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text displayed within the tab.
    * @param value A string value that is the text displayed within the tab.
    */
  def SetText(value: String): Unit
  
  /**
    * Specifies whether the tab is visible.
    * @param value true is the tab is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the index of the current tab (tabbed page) within the control's collection of tabs (tabbed pages).
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the current tab.
    */
  var name: String
  
  /**
    * Gets the tab control to which the current tab belongs.
    */
  var tabControl: ASPxClientTabControlBase
}
object ASPxClientTab {
  
  inline def apply(
    GetActiveImageUrl: CallbackTo[String],
    GetEnabled: CallbackTo[Boolean],
    GetImageUrl: CallbackTo[String],
    GetNavigateUrl: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetActiveImageUrl: String => Callback,
    SetEnabled: Boolean => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    name: String,
    tabControl: ASPxClientTabControlBase
  ): ASPxClientTab = {
    val __obj = js.Dynamic.literal(GetActiveImageUrl = GetActiveImageUrl.toJsFn, GetEnabled = GetEnabled.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetActiveImageUrl = js.Any.fromFunction1((t0: String) => SetActiveImageUrl(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabControl = tabControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTab]
  }
  
  extension [Self <: ASPxClientTab](x: Self) {
    
    inline def setGetActiveImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetActiveImageUrl", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetImageUrl", value.toJsFn)
    
    inline def setGetNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetNavigateUrl", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetActiveImageUrl(value: String => Callback): Self = StObject.set(x, "SetActiveImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetNavigateUrl(value: String => Callback): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setTabControl(value: ASPxClientTabControlBase): Self = StObject.set(x, "tabControl", value.asInstanceOf[js.Any])
  }
}
