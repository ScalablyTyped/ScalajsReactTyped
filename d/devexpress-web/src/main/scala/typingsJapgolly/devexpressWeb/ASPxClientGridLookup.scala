package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxGridLookup control.
  */
trait ASPxClientGridLookup
  extends StObject
     with ASPxClientDropDownEditBase {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]]
  
  /**
    * Confirms the current selection made by an end-user within the editor's dropdown grid.
    */
  def ConfirmCurrentSelection(): Unit
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]]
  
  /**
    * Returns a client object representing the built-in dropdown grid.
    */
  def GetGridView(): ASPxClientGridView
  
  /**
    * Cancels the current selection made by an end-user within the editor's dropdown grid and rolls back to the last confirmed selection. The selection can be confirmed by either pressing the Enter key or calling the ASPxClientGridLookup.ConfirmCurrentSelection method.
    */
  def RollbackToLastConfirmedSelection(): Unit
  
  /**
    * Fires on the client when a data row is clicked within the built-in dropdown grid.
    */
  var RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]]
}
object ASPxClientGridLookup {
  
  inline def apply(
    AdjustControl: Callback,
    AdjustDropDownWindow: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]],
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    ConfirmCurrentSelection: Callback,
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]],
    Focus: Callback,
    GetButton: Double => Any,
    GetButtonVisible: Double => Boolean,
    GetCaption: CallbackTo[String],
    GetCaretPosition: CallbackTo[Double],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetErrorText: CallbackTo[String],
    GetGridView: CallbackTo[ASPxClientGridView],
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
    HideDropDown: Callback,
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    RollbackToLastConfirmedSelection: Callback,
    RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]],
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
    ShowDropDown: Callback,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTextEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientGridLookup = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, AdjustDropDownWindow = AdjustDropDownWindow.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], ButtonClick = ButtonClick.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], ConfirmCurrentSelection = ConfirmCurrentSelection.toJsFn, DropDown = DropDown.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = GetCaption.toJsFn, GetCaretPosition = GetCaretPosition.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetGridView = GetGridView.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetText = GetText.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = HideDropDown.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], RollbackToLastConfirmedSelection = RollbackToLastConfirmedSelection.toJsFn, RowClick = RowClick.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetButtonVisible = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetButtonVisible(t0, t1)).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetCaretPosition = js.Any.fromFunction1((t0: Double) => SetCaretPosition(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelection = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetSelection(t0, t1, t2)).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ShowDropDown = ShowDropDown.toJsFn, TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridLookup]
  }
  
  extension [Self <: ASPxClientGridLookup](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setConfirmCurrentSelection(value: Callback): Self = StObject.set(x, "ConfirmCurrentSelection", value.toJsFn)
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGetGridView(value: CallbackTo[ASPxClientGridView]): Self = StObject.set(x, "GetGridView", value.toJsFn)
    
    inline def setRollbackToLastConfirmedSelection(value: Callback): Self = StObject.set(x, "RollbackToLastConfirmedSelection", value.toJsFn)
    
    inline def setRowClick(value: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]]): Self = StObject.set(x, "RowClick", value.asInstanceOf[js.Any])
  }
}
