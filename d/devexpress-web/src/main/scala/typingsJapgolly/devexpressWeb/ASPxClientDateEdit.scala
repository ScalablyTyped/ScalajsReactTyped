package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxDateEdit control.
  */
trait ASPxClientDateEdit
  extends StObject
     with ASPxClientDropDownEditBase {
  
  /**
    * Occurs when an end user clicks a calendar date cell.
    */
  var CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]]
  
  /**
    * Allows you to disable the calendar's days.
    */
  var CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]
  
  /**
    * Occurs on the client after a user changes the selected date in the date editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
  
  /**
    * Returns the calendar of the date editor.
    */
  def GetCalendar(): ASPxClientCalendar
  
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): js.Date
  
  /**
    * Gets the maximum date of the editor.
    */
  def GetMaxDate(): js.Date
  
  /**
    * Gets the minimum date of the editor.
    */
  def GetMinDate(): js.Date
  
  /**
    * Returns the number of days in a range selected within a date edit.
    */
  def GetRangeDayCount(): Double
  
  /**
    * Gets the range's length.
    */
  def GetRangeLength(): Double
  
  /**
    * Returns the built-in time edit control.
    */
  def GetTimeEdit(): ASPxClientTimeEdit
  
  /**
    * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
    */
  var ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]
  
  /**
    * Specifies the date for the editor.
    * @param date The date.
    */
  def SetDate(date: js.Date): Unit
  
  /**
    * Sets the maximum date of the editor.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: js.Date): Unit
  
  /**
    * Sets the minimum date of the editor.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: js.Date): Unit
  
  /**
    * This event is not in effect for the ASPxClientDateEdit. Use the ASPxClientDateEdit.DateChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
}
object ASPxClientDateEdit {
  
  inline def apply(
    AdjustControl: Callback,
    AdjustDropDownWindow: Callback,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]],
    CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    Focus: Callback,
    GetButton: Double => Any,
    GetButtonVisible: Double => Boolean,
    GetCalendar: CallbackTo[ASPxClientCalendar],
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
    GetMaxDate: CallbackTo[js.Date],
    GetMinDate: CallbackTo[js.Date],
    GetParentControl: CallbackTo[Any],
    GetRangeDayCount: CallbackTo[Double],
    GetRangeLength: CallbackTo[Double],
    GetReadOnly: CallbackTo[Boolean],
    GetText: CallbackTo[String],
    GetTimeEdit: CallbackTo[ASPxClientTimeEdit],
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
    ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
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
    SetMaxDate: js.Date => Callback,
    SetMinDate: js.Date => Callback,
    SetReadOnly: Boolean => Callback,
    SetSelection: (Double, Double, Boolean) => Callback,
    SetText: String => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ShowDropDown: Callback,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientDateEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, AdjustDropDownWindow = AdjustDropDownWindow.toJsFn, ButtonClick = ButtonClick.asInstanceOf[js.Any], CalendarCellClick = CalendarCellClick.asInstanceOf[js.Any], CalendarCustomDisabledDate = CalendarCustomDisabledDate.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], DateChanged = DateChanged.asInstanceOf[js.Any], DropDown = DropDown.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCalendar = GetCalendar.toJsFn, GetCaption = GetCaption.toJsFn, GetCaretPosition = GetCaretPosition.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetDate = GetDate.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetMaxDate = GetMaxDate.toJsFn, GetMinDate = GetMinDate.toJsFn, GetParentControl = GetParentControl.toJsFn, GetRangeDayCount = GetRangeDayCount.toJsFn, GetRangeLength = GetRangeLength.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetText = GetText.toJsFn, GetTimeEdit = GetTimeEdit.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = HideDropDown.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], ParseDate = ParseDate.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetButtonVisible = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetButtonVisible(t0, t1)).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetCaretPosition = js.Any.fromFunction1((t0: Double) => SetCaretPosition(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetDate = js.Any.fromFunction1((t0: js.Date) => SetDate(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetMaxDate = js.Any.fromFunction1((t0: js.Date) => SetMaxDate(t0).runNow()), SetMinDate = js.Any.fromFunction1((t0: js.Date) => SetMinDate(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelection = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetSelection(t0, t1, t2)).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ShowDropDown = ShowDropDown.toJsFn, TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateEdit]
  }
  
  extension [Self <: ASPxClientDateEdit](x: Self) {
    
    inline def setCalendarCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "CalendarCellClick", value.asInstanceOf[js.Any])
    
    inline def setCalendarCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "CalendarCustomDisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDateChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "DateChanged", value.asInstanceOf[js.Any])
    
    inline def setGetCalendar(value: CallbackTo[ASPxClientCalendar]): Self = StObject.set(x, "GetCalendar", value.toJsFn)
    
    inline def setGetDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetDate", value.toJsFn)
    
    inline def setGetMaxDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetMaxDate", value.toJsFn)
    
    inline def setGetMinDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetMinDate", value.toJsFn)
    
    inline def setGetRangeDayCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetRangeDayCount", value.toJsFn)
    
    inline def setGetRangeLength(value: CallbackTo[Double]): Self = StObject.set(x, "GetRangeLength", value.toJsFn)
    
    inline def setGetTimeEdit(value: CallbackTo[ASPxClientTimeEdit]): Self = StObject.set(x, "GetTimeEdit", value.toJsFn)
    
    inline def setParseDate(value: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "ParseDate", value.asInstanceOf[js.Any])
    
    inline def setSetDate(value: js.Date => Callback): Self = StObject.set(x, "SetDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetMaxDate(value: js.Date => Callback): Self = StObject.set(x, "SetMaxDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetMinDate(value: js.Date => Callback): Self = StObject.set(x, "SetMinDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setTextChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "TextChanged", value.asInstanceOf[js.Any])
  }
}
