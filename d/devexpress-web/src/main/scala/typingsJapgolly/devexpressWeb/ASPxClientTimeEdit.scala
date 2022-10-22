package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxTimeEdit control.
  */
trait ASPxClientTimeEdit
  extends StObject
     with ASPxClientSpinEditBase {
  
  /**
    * Fires after the selected date has been changed within the time editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimeEdit]]
  
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): js.Date
  
  /**
    * Specifies the date for the editor.
    * @param date A DateTime object that is the date.
    */
  def SetDate(date: js.Date): Unit
}
object ASPxClientTimeEdit {
  
  inline def apply(
    AdjustControl: Callback,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimeEdit]],
    Focus: Callback,
    GetButton: Double => Any,
    GetButtonVisible: Double => Boolean,
    GetCaption: CallbackTo[String],
    GetCaretPosition: CallbackTo[Double],
    GetClientVisible: CallbackTo[Boolean],
    GetDate: CallbackTo[js.Date],
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
    SetDate: js.Date => Callback,
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
  ): ASPxClientTimeEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, ButtonClick = ButtonClick.asInstanceOf[js.Any], DateChanged = DateChanged.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = GetCaption.toJsFn, GetCaretPosition = GetCaretPosition.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetDate = GetDate.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetText = GetText.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetButtonVisible = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetButtonVisible(t0, t1)).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetCaretPosition = js.Any.fromFunction1((t0: Double) => SetCaretPosition(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetDate = js.Any.fromFunction1((t0: js.Date) => SetDate(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelection = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetSelection(t0, t1, t2)).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTimeEdit]
  }
  
  extension [Self <: ASPxClientTimeEdit](x: Self) {
    
    inline def setDateChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimeEdit]]): Self = StObject.set(x, "DateChanged", value.asInstanceOf[js.Any])
    
    inline def setGetDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetDate", value.toJsFn)
    
    inline def setSetDate(value: js.Date => Callback): Self = StObject.set(x, "SetDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
  }
}
