package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxCalendar control.
  */
trait ASPxClientCalendar
  extends StObject
     with ASPxClientEdit {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientCalendar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]]
  
  /**
    * Occurs when an end user clicks a date cell.
    */
  var CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]]
  
  /**
    * Deselects all the selected dates within the calendar.
    */
  def ClearSelection(): Unit
  
  /**
    * Allows you to disable the calendar's days.
    */
  var CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]
  
  /**
    * Deselects the specified date within the calendar.
    * @param date A date-time value that specifies the date to deselect.
    */
  def DeselectDate(date: js.Date): Unit
  
  /**
    * Deselects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def DeselectRange(start: js.Date, end: js.Date): Unit
  
  /**
    * Occurs on the client side after the callback server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]
  
  /**
    * Gets the maximum date on the calendar.
    */
  def GetMaxDate(): js.Date
  
  /**
    * Gets the minimum date on the calendar.
    */
  def GetMinDate(): js.Date
  
  /**
    * Returns the calendar's selected date.
    */
  def GetSelectedDate(): js.Date
  
  /**
    * Returns a list of dates which are selected within the calendar.
    */
  def GetSelectedDates(): js.Array[js.Date]
  
  /**
    * Gets the date that determines the month and year that are currently displayed in the calendar.
    */
  def GetVisibleDate(): js.Date
  
  /**
    * Tests whether the specified date is selected. true if the specified date is selected; otherwise, false.
    * @param date A date-time value that specifies the date to test.
    */
  def IsDateSelected(date: js.Date): Boolean
  
  /**
    * Occurs on the client-side when an end-user presses a key while the editor has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]
  
  /**
    * Occurs on the client-side when an end-user presses and releases a key while the editor has focus.
    */
  var KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]
  
  /**
    * Occurs on the client-side when an end-user releases a pressed key while the editor has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]
  
  /**
    * Selects the specified date within the calendar.
    * @param date A date-time value that specifies the selected date.
    */
  def SelectDate(date: js.Date): Unit
  
  /**
    * Selects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def SelectRange(start: js.Date, end: js.Date): Unit
  
  /**
    * Occurs on the client after a user changes the selected date in the calendar.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]
  
  /**
    * Sets the maximum date of the calendar.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: js.Date): Unit
  
  /**
    * Sets the minimum date of the calendar.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: js.Date): Unit
  
  /**
    * Sets the calendar's selected date.
    * @param date A date object that specifies the calendar's selected date.
    */
  def SetSelectedDate(date: js.Date): Unit
  
  /**
    * Sets the date that specifies the month and year to be displayed in the calendar.
    * @param date The date that specifies calendar's visible month and year.
    */
  def SetVisibleDate(date: js.Date): Unit
  
  /**
    * Occurs on the client when a user changes the month in the calendar.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]
}
object ASPxClientCalendar {
  
  inline def apply(
    AdjustControl: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]],
    CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]],
    ClearSelection: Callback,
    CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]],
    DeselectDate: js.Date => Callback,
    DeselectRange: (js.Date, js.Date) => Callback,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]],
    Focus: Callback,
    GetCaption: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetErrorText: CallbackTo[String],
    GetHeight: CallbackTo[Double],
    GetInputElement: CallbackTo[Any],
    GetIsValid: CallbackTo[Boolean],
    GetMainElement: CallbackTo[Any],
    GetMaxDate: CallbackTo[js.Date],
    GetMinDate: CallbackTo[js.Date],
    GetParentControl: CallbackTo[Any],
    GetReadOnly: CallbackTo[Boolean],
    GetSelectedDate: CallbackTo[js.Date],
    GetSelectedDates: CallbackTo[js.Array[js.Date]],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetVisibleDate: CallbackTo[js.Date],
    GetWidth: CallbackTo[Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsDateSelected: js.Date => Boolean,
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectDate: js.Date => Callback,
    SelectRange: (js.Date, js.Date) => Callback,
    SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetCaption: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetErrorText: String => Callback,
    SetHeight: Double => Callback,
    SetIsValid: Boolean => Callback,
    SetMaxDate: js.Date => Callback,
    SetMinDate: js.Date => Callback,
    SetReadOnly: Boolean => Callback,
    SetSelectedDate: js.Date => Callback,
    SetValue: Any => Callback,
    SetVisible: Boolean => Callback,
    SetVisibleDate: js.Date => Callback,
    SetWidth: Double => Callback,
    Validate: Callback,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    name: String
  ): ASPxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CellClick = CellClick.asInstanceOf[js.Any], ClearSelection = ClearSelection.toJsFn, CustomDisabledDate = CustomDisabledDate.asInstanceOf[js.Any], DeselectDate = js.Any.fromFunction1((t0: js.Date) => DeselectDate(t0).runNow()), DeselectRange = js.Any.fromFunction2((t0: js.Date, t1: js.Date) => (DeselectRange(t0, t1)).runNow()), EndCallback = EndCallback.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetCaption = GetCaption.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEnabled = GetEnabled.toJsFn, GetErrorText = GetErrorText.toJsFn, GetHeight = GetHeight.toJsFn, GetInputElement = GetInputElement.toJsFn, GetIsValid = GetIsValid.toJsFn, GetMainElement = GetMainElement.toJsFn, GetMaxDate = GetMaxDate.toJsFn, GetMinDate = GetMinDate.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetSelectedDate = GetSelectedDate.toJsFn, GetSelectedDates = GetSelectedDates.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetVisibleDate = GetVisibleDate.toJsFn, GetWidth = GetWidth.toJsFn, GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], IsDateSelected = js.Any.fromFunction1(IsDateSelected), KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectDate = js.Any.fromFunction1((t0: js.Date) => SelectDate(t0).runNow()), SelectRange = js.Any.fromFunction2((t0: js.Date, t1: js.Date) => (SelectRange(t0, t1)).runNow()), SelectionChanged = SelectionChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetErrorText = js.Any.fromFunction1((t0: String) => SetErrorText(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetIsValid = js.Any.fromFunction1((t0: Boolean) => SetIsValid(t0).runNow()), SetMaxDate = js.Any.fromFunction1((t0: js.Date) => SetMaxDate(t0).runNow()), SetMinDate = js.Any.fromFunction1((t0: js.Date) => SetMinDate(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetSelectedDate = js.Any.fromFunction1((t0: js.Date) => SetSelectedDate(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetVisibleDate = js.Any.fromFunction1((t0: js.Date) => SetVisibleDate(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Validate = Validate.toJsFn, Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], VisibleMonthChanged = VisibleMonthChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendar]
  }
  
  extension [Self <: ASPxClientCalendar](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "CellClick", value.asInstanceOf[js.Any])
    
    inline def setClearSelection(value: Callback): Self = StObject.set(x, "ClearSelection", value.toJsFn)
    
    inline def setCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "CustomDisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDeselectDate(value: js.Date => Callback): Self = StObject.set(x, "DeselectDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setDeselectRange(value: (js.Date, js.Date) => Callback): Self = StObject.set(x, "DeselectRange", js.Any.fromFunction2((t0: js.Date, t1: js.Date) => (value(t0, t1)).runNow()))
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGetMaxDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetMaxDate", value.toJsFn)
    
    inline def setGetMinDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetMinDate", value.toJsFn)
    
    inline def setGetSelectedDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetSelectedDate", value.toJsFn)
    
    inline def setGetSelectedDates(value: CallbackTo[js.Array[js.Date]]): Self = StObject.set(x, "GetSelectedDates", value.toJsFn)
    
    inline def setGetVisibleDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetVisibleDate", value.toJsFn)
    
    inline def setIsDateSelected(value: js.Date => Boolean): Self = StObject.set(x, "IsDateSelected", js.Any.fromFunction1(value))
    
    inline def setKeyDown(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "KeyDown", value.asInstanceOf[js.Any])
    
    inline def setKeyPress(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "KeyPress", value.asInstanceOf[js.Any])
    
    inline def setKeyUp(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "KeyUp", value.asInstanceOf[js.Any])
    
    inline def setSelectDate(value: js.Date => Callback): Self = StObject.set(x, "SelectDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSelectRange(value: (js.Date, js.Date) => Callback): Self = StObject.set(x, "SelectRange", js.Any.fromFunction2((t0: js.Date, t1: js.Date) => (value(t0, t1)).runNow()))
    
    inline def setSelectionChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "SelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSetMaxDate(value: js.Date => Callback): Self = StObject.set(x, "SetMaxDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetMinDate(value: js.Date => Callback): Self = StObject.set(x, "SetMinDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetSelectedDate(value: js.Date => Callback): Self = StObject.set(x, "SetSelectedDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetVisibleDate(value: js.Date => Callback): Self = StObject.set(x, "SetVisibleDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setVisibleMonthChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "VisibleMonthChanged", value.asInstanceOf[js.Any])
  }
}
