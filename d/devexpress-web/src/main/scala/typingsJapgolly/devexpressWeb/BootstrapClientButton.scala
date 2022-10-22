package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapButton control.
  */
trait BootstrapClientButton
  extends StObject
     with ASPxClientButton {
  
  /**
    * Gets the CSS class of the icon displayed within the button badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the button badge.
    */
  def GetBadgeText(): String
  
  /**
    * Sets the CSS class of the icon displayed within the button badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the button badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
}
object BootstrapClientButton {
  
  inline def apply(
    AdjustControl: Callback,
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: Callback,
    Focus: Callback,
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetChecked: CallbackTo[Boolean],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetImageUrl: CallbackTo[String],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetChecked: Boolean => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetImageUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): BootstrapClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, CheckedChanged = CheckedChanged.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], DoClick = DoClick.toJsFn, Focus = Focus.toJsFn, GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetChecked = GetChecked.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetChecked = js.Any.fromFunction1((t0: Boolean) => SetChecked(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientButton]
  }
  
  extension [Self <: BootstrapClientButton](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
