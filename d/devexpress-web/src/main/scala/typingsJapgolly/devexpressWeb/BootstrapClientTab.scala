package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of a tab control's BootstrapTab or a page control's BootstrapTabPage object.
  */
trait BootstrapClientTab
  extends StObject
     with ASPxClientTab {
  
  /**
    * Gets the CSS class of an icon displayed by the tab when it is active.
    */
  def GetActiveIconCssClass(): String
  
  /**
    * Gets the CSS class of the icon displayed within the tab badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the tab badge.
    */
  def GetBadgeText(): String
  
  /**
    * Gets the CSS class of the icon displayed by the tab.
    */
  def GetIconCssClass(): String
  
  /**
    * Sets the CSS class of an icon displayed by the tab when it is active.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetActiveIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed within the tab badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the tab badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed by the tab.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit
}
object BootstrapClientTab {
  
  inline def apply(
    GetActiveIconCssClass: CallbackTo[String],
    GetActiveImageUrl: CallbackTo[String],
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetEnabled: CallbackTo[Boolean],
    GetIconCssClass: CallbackTo[String],
    GetImageUrl: CallbackTo[String],
    GetNavigateUrl: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetActiveIconCssClass: String => Callback,
    SetActiveImageUrl: String => Callback,
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetEnabled: Boolean => Callback,
    SetIconCssClass: String => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    name: String,
    tabControl: ASPxClientTabControlBase
  ): BootstrapClientTab = {
    val __obj = js.Dynamic.literal(GetActiveIconCssClass = GetActiveIconCssClass.toJsFn, GetActiveImageUrl = GetActiveImageUrl.toJsFn, GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetEnabled = GetEnabled.toJsFn, GetIconCssClass = GetIconCssClass.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetActiveIconCssClass = js.Any.fromFunction1((t0: String) => SetActiveIconCssClass(t0).runNow()), SetActiveImageUrl = js.Any.fromFunction1((t0: String) => SetActiveImageUrl(t0).runNow()), SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetIconCssClass = js.Any.fromFunction1((t0: String) => SetIconCssClass(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabControl = tabControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTab]
  }
  
  extension [Self <: BootstrapClientTab](x: Self) {
    
    inline def setGetActiveIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetActiveIconCssClass", value.toJsFn)
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setGetIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetIconCssClass", value.toJsFn)
    
    inline def setSetActiveIconCssClass(value: String => Callback): Self = StObject.set(x, "SetActiveIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetIconCssClass(value: String => Callback): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
