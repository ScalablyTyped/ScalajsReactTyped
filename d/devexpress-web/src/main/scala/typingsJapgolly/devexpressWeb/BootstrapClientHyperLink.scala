package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapHyperLink control.
  */
trait BootstrapClientHyperLink
  extends StObject
     with ASPxClientHyperLink {
  
  /**
    * Gets the CSS class of the icon displayed within the hyperlink badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the hyperlink badge.
    */
  def GetBadgeText(): String
  
  /**
    * Sets the CSS class of the icon displayed within the hyperlink badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the hyperlink badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
}
object BootstrapClientHyperLink {
  
  inline def apply(
    AdjustControl: Callback,
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetCaption: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetNavigateUrl: CallbackTo[String],
    GetParentControl: CallbackTo[Any],
    GetText: CallbackTo[String],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): BootstrapClientHyperLink = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Click = Click.asInstanceOf[js.Any], GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetParentControl = GetParentControl.toJsFn, GetText = GetText.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientHyperLink]
  }
  
  extension [Self <: BootstrapClientHyperLink](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
