package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxSpinEdit control.
  */
trait ASPxClientSpinEdit
  extends StObject
     with ASPxClientSpinEditBase {
  
  /**
    * Gets the maximum value of the editor.
    */
  def GetMaxValue(): Double
  
  /**
    * Gets the minimum value of the editor.
    */
  def GetMinValue(): Double
  
  /**
    * Gets a number which represents the spin editor's value.
    */
  def GetNumber(): Double
  
  /**
    * Occurs on the client when a user changes the editor's value.
    */
  var NumberChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]]
  
  /**
    * Sets the maximum value of the editor.
    * @param value A decimal value specifying the maximum value of the editor.
    */
  def SetMaxValue(value: Double): Unit
  
  /**
    * Sets the minimum value of the editor.
    * @param value A decimal value specifying the minimum value of the editor.
    */
  def SetMinValue(value: Double): Unit
  
  /**
    * Sets the spin editor's value.
    * @param number A decimal number specifying the value to assign to the spin editor.
    */
  def SetNumber(number: Double): Unit
  
  /**
    * Specifies the value of the spin edit control on the client side.
    * @param number A Decimal value specifying the control value.
    */
  def SetValue(number: Double): Unit
}
object ASPxClientSpinEdit {
  
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
    GetMaxValue: CallbackTo[Double],
    GetMinValue: CallbackTo[Double],
    GetNumber: CallbackTo[Double],
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
    NumberChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]],
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
    SetMaxValue: Double => Callback,
    SetMinValue: Double => Callback,
    SetNumber: Double => Callback,
    SetReadOnly: Boolean => Callback,
    SetSelection: (Double, Double, Boolean) => Callback,
    SetText: String => Callback,
    SetValue: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientSpinEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, ButtonClick = ButtonClick.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = GetCaption.toJsFn, GetCaretPosition = GetCaretPosition.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetMaxValue = GetMaxValue.toJsFn, GetMinValue = GetMinValue.toJsFn, GetNumber = GetNumber.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetText = GetText.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], NumberChanged = NumberChanged.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetButtonVisible = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetButtonVisible(t0, t1)).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetCaretPosition = js.Any.fromFunction1((t0: Double) => SetCaretPosition(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetMaxValue = js.Any.fromFunction1((t0: Double) => SetMaxValue(t0).runNow()), SetMinValue = js.Any.fromFunction1((t0: Double) => SetMinValue(t0).runNow()), SetNumber = js.Any.fromFunction1((t0: Double) => SetNumber(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelection = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetSelection(t0, t1, t2)).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Double) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpinEdit]
  }
  
  extension [Self <: ASPxClientSpinEdit](x: Self) {
    
    inline def setGetMaxValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaxValue", value.toJsFn)
    
    inline def setGetMinValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetMinValue", value.toJsFn)
    
    inline def setGetNumber(value: CallbackTo[Double]): Self = StObject.set(x, "GetNumber", value.toJsFn)
    
    inline def setNumberChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]]): Self = StObject.set(x, "NumberChanged", value.asInstanceOf[js.Any])
    
    inline def setSetMaxValue(value: Double => Callback): Self = StObject.set(x, "SetMaxValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinValue(value: Double => Callback): Self = StObject.set(x, "SetMinValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetNumber(value: Double => Callback): Self = StObject.set(x, "SetNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
