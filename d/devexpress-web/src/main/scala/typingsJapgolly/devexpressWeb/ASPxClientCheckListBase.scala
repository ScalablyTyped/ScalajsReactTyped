package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for the ASPxClientCheckBoxList and ASPxClientRadioButtonList objects.
  */
trait ASPxClientCheckListBase
  extends StObject
     with ASPxClientListEdit {
  
  /**
    * Returns the editor's item specified by its index. An ASPxClientListEditItem object that is the item located at the specified index.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientListEditItem
  
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  def GetItemCount(): Double
}
object ASPxClientCheckListBase {
  
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
    GetItem: Double => ASPxClientListEditItem,
    GetItemCount: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetReadOnly: CallbackTo[Boolean],
    GetSelectedIndex: CallbackTo[Double],
    GetSelectedItem: CallbackTo[ASPxClientListEditItem],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetErrorText: String => Callback,
    SetHeight: Double => Callback,
    SetIsValid: Boolean => Callback,
    SetReadOnly: Boolean => Callback,
    SetSelectedIndex: Double => Callback,
    SetSelectedItem: ASPxClientListEditItem => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientCheckListBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Focus = Focus.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemCount = GetItemCount.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetSelectedIndex = GetSelectedIndex.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectedIndexChanged = SelectedIndexChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelectedIndex = js.Any.fromFunction1((t0: Double) => SetSelectedIndex(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: ASPxClientListEditItem) => SetSelectedItem(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCheckListBase]
  }
  
  extension [Self <: ASPxClientCheckListBase](x: Self) {
    
    inline def setGetItem(value: Double => ASPxClientListEditItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetItemCount", value.toJsFn)
  }
}
