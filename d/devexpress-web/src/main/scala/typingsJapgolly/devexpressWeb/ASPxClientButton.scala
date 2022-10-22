package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxButton control.
  */
trait ASPxClientButton
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]
  
  /**
    * Occurs on the client side after a button is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]
  
  /**
    * Simulates a mouse click action on the button control.
    */
  def DoClick(): Unit
  
  /**
    * Sets input focus to the button.
    */
  def Focus(): Unit
  
  /**
    * Returns a value indicating whether the button is checked.
    */
  def GetChecked(): Boolean
  
  /**
    * Returns a value indicating whether the button is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  def GetImageUrl(): String
  
  /**
    * Returns the text displayed within the button.
    */
  def GetText(): String
  
  /**
    * Fires on the client side when the button receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  
  /**
    * Fires on the client side when the button loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit
  
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  def SetEnabled(value: Boolean): Unit
  
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  def SetImageUrl(value: String): Unit
  
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  def SetText(value: String): Unit
}
object ASPxClientButton {
  
  inline def apply(
    AdjustControl: Callback,
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: Callback,
    Focus: Callback,
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
    SetChecked: Boolean => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetImageUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, CheckedChanged = CheckedChanged.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], DoClick = DoClick.toJsFn, Focus = Focus.toJsFn, GetChecked = GetChecked.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetChecked = js.Any.fromFunction1((t0: Boolean) => SetChecked(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButton]
  }
  
  extension [Self <: ASPxClientButton](x: Self) {
    
    inline def setCheckedChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]): Self = StObject.set(x, "CheckedChanged", value.asInstanceOf[js.Any])
    
    inline def setClick(value: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
    
    inline def setDoClick(value: Callback): Self = StObject.set(x, "DoClick", value.toJsFn)
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "Focus", value.toJsFn)
    
    inline def setGetChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetChecked", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetImageUrl", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setGotFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]): Self = StObject.set(x, "GotFocus", value.asInstanceOf[js.Any])
    
    inline def setLostFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]): Self = StObject.set(x, "LostFocus", value.asInstanceOf[js.Any])
    
    inline def setSetChecked(value: Boolean => Callback): Self = StObject.set(x, "SetChecked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
