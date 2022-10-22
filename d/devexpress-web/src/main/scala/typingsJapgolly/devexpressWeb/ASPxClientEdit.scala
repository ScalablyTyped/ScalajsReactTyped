package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base object for all the editors that support validation.
  */
trait ASPxClientEdit
  extends StObject
     with ASPxClientEditBase {
  
  /**
    * Sets input focus to the editor.
    */
  def Focus(): Unit
  
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  def GetErrorText(): String
  
  /**
    * Returns an HTML element that is the control's input element.
    */
  def GetInputElement(): Any
  
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  def GetIsValid(): Boolean
  
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  def GetReadOnly(): Boolean
  
  /**
    * Fires on the client side when the editor receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  
  /**
    * Fires on the client side when the editor loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  def SetErrorText(errorText: String): Unit
  
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  def SetIsValid(isValid: Boolean): Unit
  
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  def SetReadOnly(readOnly: Boolean): Unit
  
  /**
    * Performs the editor's validation.
    */
  def Validate(): Unit
  
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  var Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]]
  
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  var ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]]
}
object ASPxClientEdit {
  
  inline def apply(
    AdjustControl: Callback,
    Focus: Callback,
    GetCaption: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetErrorText: CallbackTo[String],
    GetHeight: CallbackTo[Double],
    GetInputElement: CallbackTo[Any],
    GetIsValid: CallbackTo[Boolean],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetReadOnly: CallbackTo[Boolean],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetErrorText: String => Callback,
    SetHeight: Double => Callback,
    SetIsValid: Boolean => Callback,
    SetReadOnly: Boolean => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Focus = Focus.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEdit]
  }
  
  extension [Self <: ASPxClientEdit](x: Self) {
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "Focus", value.toJsFn)
    
    inline def setGetErrorText(value: CallbackTo[String]): Self = StObject.set(x, "GetErrorText", value.toJsFn)
    
    inline def setGetInputElement(value: CallbackTo[Any]): Self = StObject.set(x, "GetInputElement", value.toJsFn)
    
    inline def setGetIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIsValid", value.toJsFn)
    
    inline def setGetReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetReadOnly", value.toJsFn)
    
    inline def setGotFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "GotFocus", value.asInstanceOf[js.Any])
    
    inline def setLostFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "LostFocus", value.asInstanceOf[js.Any])
    
    inline def setSetErrorText(value: String => Callback): Self = StObject.set(x, "SetErrorText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetIsValid(value: Boolean => Callback): Self = StObject.set(x, "SetIsValid", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetReadOnly(value: Boolean => Callback): Self = StObject.set(x, "SetReadOnly", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setValidate(value: Callback): Self = StObject.set(x, "Validate", value.toJsFn)
    
    inline def setValidation(value: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]]): Self = StObject.set(x, "ValueChanged", value.asInstanceOf[js.Any])
  }
}
