package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a base class for the ASPxClientSpinEdit object.
  */
trait ASPxClientSpinEditBase
  extends StObject
     with ASPxClientButtonEditBase {
  
  /**
    * This event is not in effect for the ASPxClientSpinEditBase. Use the ASPxClientEdit.ValueChanged event instead. Alternatively, use an editor type specific event, such as ASPxClientSpinEdit.NumberChanged for an ASPxClientSpinEdit or ASPxClientTimeEdit.DateChanged for an ASPxClientTimeEdit.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientSpinEditBase: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]]
}
object ASPxClientSpinEditBase {
  
  inline def apply(
    AdjustControl: Callback,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    Focus: Callback,
    GetButton: Double => Any,
    GetButtonVisible: Double => Boolean,
    GetCaption: CallbackTo[String],
    GetCaretPosition: CallbackTo[Double],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetErrorText: CallbackTo[String],
    GetHeight: CallbackTo[Double],
    GetInputElement: CallbackTo[Any],
    GetIsValid: CallbackTo[Boolean],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetReadOnly: CallbackTo[Boolean],
    GetText: CallbackTo[String],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    SetButtonVisible: (Double, Boolean) => Callback,
    SetCaption: String => Callback,
    SetCaretPosition: Double => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetErrorText: String => Callback,
    SetHeight: Double => Callback,
    SetIsValid: Boolean => Callback,
    SetReadOnly: Boolean => Callback,
    SetSelection: (Double, Double, Boolean) => Callback,
    SetText: String => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientSpinEditBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, ButtonClick = ButtonClick.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = GetCaption.toJsFn, GetCaretPosition = GetCaretPosition.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetText = GetText.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetButtonVisible = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetButtonVisible(t0, t1)).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetCaretPosition = js.Any.fromFunction1((t0: Double) => SetCaretPosition(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelection = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetSelection(t0, t1, t2)).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpinEditBase]
  }
  
  extension [Self <: ASPxClientSpinEditBase](x: Self) {
    
    inline def setTextChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]]): Self = StObject.set(x, "TextChanged", value.asInstanceOf[js.Any])
  }
}
