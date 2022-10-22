package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxCheckBoxList object.
  */
trait ASPxClientCheckBoxList
  extends StObject
     with ASPxClientCheckListBase {
  
  /**
    * Returns an array of the check box list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[Double]
  
  /**
    * Returns an array of the check box list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem]
  
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[Any]
  
  /**
    * Selects all check box list items.
    */
  def SelectAll(): Unit
  
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def SelectIndices(indices: js.Array[Double]): Unit
  
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): Unit
  
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def SelectValues(values: js.Array[Any]): Unit
  
  /**
    * Occurs on the client side after a different item in the check box list has been selected (focus has been moved from one item to another).
    */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientCheckBoxList: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]]
  
  /**
    * Unselects all check box list items.
    */
  def UnselectAll(): Unit
  
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def UnselectIndices(indices: js.Array[Double]): Unit
  
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): Unit
  
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def UnselectValues(values: js.Array[Any]): Unit
}
object ASPxClientCheckBoxList {
  
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
    GetSelectedIndices: CallbackTo[js.Array[Double]],
    GetSelectedItem: CallbackTo[ASPxClientListEditItem],
    GetSelectedItems: CallbackTo[js.Array[ASPxClientListEditItem]],
    GetSelectedValues: CallbackTo[js.Array[Any]],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: Callback,
    SelectIndices: js.Array[Double] => Callback,
    SelectItems: js.Array[ASPxClientListEditItem] => Callback,
    SelectValues: js.Array[Any] => Callback,
    SelectedIndexChanged: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]],
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
    UnselectAll: Callback,
    UnselectIndices: js.Array[Double] => Callback,
    UnselectItems: js.Array[ASPxClientListEditItem] => Callback,
    UnselectValues: js.Array[Any] => Callback,
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientCheckBoxList = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Focus = Focus.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetItem = js.Any.fromFunction1(GetItem), GetItemCount = GetItemCount.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetSelectedIndex = GetSelectedIndex.toJsFn, GetSelectedIndices = GetSelectedIndices.toJsFn, GetSelectedItem = GetSelectedItem.toJsFn, GetSelectedItems = GetSelectedItems.toJsFn, GetSelectedValues = GetSelectedValues.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SelectIndices = js.Any.fromFunction1((t0: js.Array[Double]) => SelectIndices(t0).runNow()), SelectItems = js.Any.fromFunction1((t0: js.Array[ASPxClientListEditItem]) => SelectItems(t0).runNow()), SelectValues = js.Any.fromFunction1((t0: js.Array[Any]) => SelectValues(t0).runNow()), SelectedIndexChanged = SelectedIndexChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelectedIndex = js.Any.fromFunction1((t0: Double) => SetSelectedIndex(t0).runNow()), SetSelectedItem = js.Any.fromFunction1((t0: ASPxClientListEditItem) => SetSelectedItem(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), UnselectAll = UnselectAll.toJsFn, UnselectIndices = js.Any.fromFunction1((t0: js.Array[Double]) => UnselectIndices(t0).runNow()), UnselectItems = js.Any.fromFunction1((t0: js.Array[ASPxClientListEditItem]) => UnselectItems(t0).runNow()), UnselectValues = js.Any.fromFunction1((t0: js.Array[Any]) => UnselectValues(t0).runNow()), Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCheckBoxList]
  }
  
  extension [Self <: ASPxClientCheckBoxList](x: Self) {
    
    inline def setGetSelectedIndices(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "GetSelectedIndices", value.toJsFn)
    
    inline def setGetSelectedItems(value: CallbackTo[js.Array[ASPxClientListEditItem]]): Self = StObject.set(x, "GetSelectedItems", value.toJsFn)
    
    inline def setGetSelectedValues(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetSelectedValues", value.toJsFn)
    
    inline def setSelectAll(value: Callback): Self = StObject.set(x, "SelectAll", value.toJsFn)
    
    inline def setSelectIndices(value: js.Array[Double] => Callback): Self = StObject.set(x, "SelectIndices", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSelectItems(value: js.Array[ASPxClientListEditItem] => Callback): Self = StObject.set(x, "SelectItems", js.Any.fromFunction1((t0: js.Array[ASPxClientListEditItem]) => value(t0).runNow()))
    
    inline def setSelectValues(value: js.Array[Any] => Callback): Self = StObject.set(x, "SelectValues", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setSelectedIndexChanged(value: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]]): Self = StObject.set(x, "SelectedIndexChanged", value.asInstanceOf[js.Any])
    
    inline def setUnselectAll(value: Callback): Self = StObject.set(x, "UnselectAll", value.toJsFn)
    
    inline def setUnselectIndices(value: js.Array[Double] => Callback): Self = StObject.set(x, "UnselectIndices", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setUnselectItems(value: js.Array[ASPxClientListEditItem] => Callback): Self = StObject.set(x, "UnselectItems", js.Any.fromFunction1((t0: js.Array[ASPxClientListEditItem]) => value(t0).runNow()))
    
    inline def setUnselectValues(value: js.Array[Any] => Callback): Self = StObject.set(x, "UnselectValues", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
