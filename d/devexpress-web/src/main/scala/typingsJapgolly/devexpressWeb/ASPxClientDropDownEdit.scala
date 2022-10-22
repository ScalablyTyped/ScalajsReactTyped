package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a base for client editor objects realizing the dropdown editor functionality.
  */
trait ASPxClientDropDownEdit
  extends StObject
     with ASPxClientDropDownEditBase {
  
  /**
    * Allows you to handle a click on 'Ok' and 'Cancel' buttons in the drop-down window.
    */
  var DropDownCommandButtonClick: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]]
  
  /**
    * Obtains the key value associated with the text displayed within the editor's edit box.
    */
  def GetKeyValue(): String
  
  /**
    * Specifies the key value associated with the text displayed within the editor's edit box.
    * @param keyValue A string specifying the key value associated with the editor's value (displayed text).
    */
  def SetKeyValue(keyValue: String): Unit
}
object ASPxClientDropDownEdit {
  
  inline def apply(
    AdjustControl: Callback,
    AdjustDropDownWindow: Callback,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DropDownCommandButtonClick: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]],
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
    GetKeyValue: CallbackTo[String],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetReadOnly: CallbackTo[Boolean],
    GetText: CallbackTo[String],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    HideDropDown: Callback,
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
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
    SetKeyValue: String => Callback,
    SetReadOnly: Boolean => Callback,
    SetSelection: (Double, Double, Boolean) => Callback,
    SetText: String => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ShowDropDown: Callback,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTextEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientDropDownEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, AdjustDropDownWindow = AdjustDropDownWindow.toJsFn, ButtonClick = ButtonClick.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], DropDown = DropDown.asInstanceOf[js.Any], DropDownCommandButtonClick = DropDownCommandButtonClick.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = GetCaption.toJsFn, GetCaretPosition = GetCaretPosition.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetKeyValue = GetKeyValue.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetText = GetText.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = HideDropDown.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetButtonVisible = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetButtonVisible(t0, t1)).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetCaretPosition = js.Any.fromFunction1((t0: Double) => SetCaretPosition(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetKeyValue = js.Any.fromFunction1((t0: String) => SetKeyValue(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelection = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetSelection(t0, t1, t2)).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ShowDropDown = ShowDropDown.toJsFn, TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDropDownEdit]
  }
  
  extension [Self <: ASPxClientDropDownEdit](x: Self) {
    
    inline def setDropDownCommandButtonClick(value: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]]): Self = StObject.set(x, "DropDownCommandButtonClick", value.asInstanceOf[js.Any])
    
    inline def setGetKeyValue(value: CallbackTo[String]): Self = StObject.set(x, "GetKeyValue", value.toJsFn)
    
    inline def setSetKeyValue(value: String => Callback): Self = StObject.set(x, "SetKeyValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
