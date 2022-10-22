package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientButtonEditClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCalendarCellClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCalendarCustomDisabledDateEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCancelEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEditKeyEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEditValidationEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientParseDateEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientProcessingModeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxDateEdit control.
  */
@JSGlobal("ASPxClientDateEdit")
@js.native
open class ASPxClientDateEdit ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDateEdit {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Modifies the size of the drop down window in accordance with its content.
    */
  /* CompleteClass */
  override def AdjustDropDownWindow(): Unit = js.native
  
  /**
    * Occurs on the client side after an editor button is clicked.
    */
  /* CompleteClass */
  var ButtonClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientButtonEditClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientButtonEditBase]
  ] = js.native
  
  /**
    * Occurs when an end user clicks a calendar date cell.
    */
  /* CompleteClass */
  var CalendarCellClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCalendarCellClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDateEdit]
  ] = js.native
  
  /**
    * Allows you to disable the calendar's days.
    */
  /* CompleteClass */
  var CalendarCustomDisabledDate: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCalendarCustomDisabledDateEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDateEdit]
  ] = js.native
  
  /**
    * Occurs on the client side when the drop down window is closed.
    */
  /* CompleteClass */
  var CloseUp: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDropDownEditBase]] = js.native
  
  /**
    * Occurs on the client after a user changes the selected date in the date editor.
    */
  /* CompleteClass */
  var DateChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDateEdit]
  ] = js.native
  
  /**
    * Occurs on the client-side when the drop down window is opened by the dropdown button click.
    */
  /* CompleteClass */
  var DropDown: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDropDownEditBase]] = js.native
  
  /**
    * Sets input focus to the editor.
    */
  /* CompleteClass */
  override def Focus(): Unit = js.native
  
  /**
    * Returns a button by its index in the button collection. A button.
    * @param number A button index.
    */
  /* CompleteClass */
  override def GetButton(number: Double): Any = js.native
  
  /**
    * Returns a value specifying whether a button is displayed. true, if the button visible; otherwise, false.
    * @param number An integer value specifying the button's index within the ASPxButtonEditBase.Buttons collection.
    */
  /* CompleteClass */
  override def GetButtonVisible(number: Double): Boolean = js.native
  
  /**
    * Returns the calendar of the date editor.
    */
  /* CompleteClass */
  override def GetCalendar(): typingsJapgolly.devexpressWeb.ASPxClientCalendar = js.native
  
  /**
    * Returns the text displayed in the editor caption.
    */
  /* CompleteClass */
  override def GetCaption(): String = js.native
  
  /**
    * Obtains the caret position within the edited text.
    */
  /* CompleteClass */
  override def GetCaretPosition(): Double = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Gets the date that is the editor's value.
    */
  /* CompleteClass */
  override def GetDate(): js.Date = js.native
  
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  /* CompleteClass */
  override def GetErrorText(): String = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the control's input element.
    */
  /* CompleteClass */
  override def GetInputElement(): Any = js.native
  
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  /* CompleteClass */
  override def GetIsValid(): Boolean = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Gets the maximum date of the editor.
    */
  /* CompleteClass */
  override def GetMaxDate(): js.Date = js.native
  
  /**
    * Gets the minimum date of the editor.
    */
  /* CompleteClass */
  override def GetMinDate(): js.Date = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns the number of days in a range selected within a date edit.
    */
  /* CompleteClass */
  override def GetRangeDayCount(): Double = js.native
  
  /**
    * Gets the range's length.
    */
  /* CompleteClass */
  override def GetRangeLength(): Double = js.native
  
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  
  /**
    * Returns the text displayed within the editor.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  
  /**
    * Returns the built-in time edit control.
    */
  /* CompleteClass */
  override def GetTimeEdit(): typingsJapgolly.devexpressWeb.ASPxClientTimeEdit = js.native
  
  /**
    * Returns the editor's value.
    */
  /* CompleteClass */
  override def GetValue(): Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Fires on the client side when the editor receives input focus.
    */
  /* CompleteClass */
  var GotFocus: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Closes the opened drop down window of the editor.
    */
  /* CompleteClass */
  override def HideDropDown(): Unit = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Occurs on the client-side when an end-user presses a key while the editor has focus.
    */
  /* CompleteClass */
  var KeyDown: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEditKeyEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTextEdit]] = js.native
  
  /**
    * Occurs on the client-side when an end-user presses and releases a key while the editor has focus.
    */
  /* CompleteClass */
  var KeyPress: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEditKeyEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTextEdit]] = js.native
  
  /**
    * Occurs on the client-side when an end-user releases a pressed key while the editor has focus.
    */
  /* CompleteClass */
  var KeyUp: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEditKeyEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTextEdit]] = js.native
  
  /**
    * Fires on the client side when the editor loses input focus.
    */
  /* CompleteClass */
  var LostFocus: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
    */
  /* CompleteClass */
  var ParseDate: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientParseDateEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDateEdit]
  ] = js.native
  
  /**
    * Occurs on the client side before the drop down window is closed and allows you to cancel the operation.
    */
  /* CompleteClass */
  var QueryCloseUp: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCancelEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDropDownEditBase]
  ] = js.native
  
  /**
    * Selects all text in the text editor.
    */
  /* CompleteClass */
  override def SelectAll(): Unit = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Specifies whether the button is visible.
    * @param number An integer value specifying the button's index within the ASPxButtonEditBase.Buttons collection.
    * @param value true, to make the button visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetButtonVisible(number: Double, value: Boolean): Unit = js.native
  
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  /* CompleteClass */
  override def SetCaption(caption: String): Unit = js.native
  
  /**
    * Sets the caret position within the edited text.
    * @param position An integer value that specifies the zero-based index of a text character that shall precede the caret.
    */
  /* CompleteClass */
  override def SetCaretPosition(position: Double): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the date for the editor.
    * @param date The date.
    */
  /* CompleteClass */
  override def SetDate(date: js.Date): Unit = js.native
  
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  /* CompleteClass */
  override def SetErrorText(errorText: String): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  /* CompleteClass */
  override def SetIsValid(isValid: Boolean): Unit = js.native
  
  /**
    * Sets the maximum date of the editor.
    * @param date A DateTime object representing the maximum date.
    */
  /* CompleteClass */
  override def SetMaxDate(date: js.Date): Unit = js.native
  
  /**
    * Sets the minimum date of the editor.
    * @param date A DateTime object representing the minimum date.
    */
  /* CompleteClass */
  override def SetMinDate(date: js.Date): Unit = js.native
  
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  /* CompleteClass */
  override def SetReadOnly(readOnly: Boolean): Unit = js.native
  
  /**
    * Selects the specified portion of the editor's text.
    * @param startPos A zero-based integer value specifying the selection's starting position.
    * @param endPos A zero-based integer value specifying the selection's ending position.
    * @param scrollToSelection true to scroll the editor's contents to make the selection visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetSelection(startPos: Double, endPos: Double, scrollToSelection: Boolean): Unit = js.native
  
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  /* CompleteClass */
  override def SetText(text: String): Unit = js.native
  
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  /* CompleteClass */
  override def SetValue(value: Any): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Invokes the editor's drop down window.
    */
  /* CompleteClass */
  override def ShowDropDown(): Unit = js.native
  
  /**
    * Occurs on the client when a user changes the editor's text and the editor loses focus.
    */
  /* CompleteClass */
  var TextChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTextEdit]
  ] = js.native
  /**
    * This event is not in effect for the ASPxClientDateEdit. Use the ASPxClientDateEdit.DateChanged event instead.
    */
  /* CompleteClass */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDateEdit]
  ] = js.native
  
  /**
    * Fires on the client each time a user changes an editor's input value.
    */
  /* CompleteClass */
  var UserInput: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTextEdit]] = js.native
  
  /**
    * Performs the editor's validation.
    */
  /* CompleteClass */
  override def Validate(): Unit = js.native
  
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  /* CompleteClass */
  var Validation: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientEditValidationEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]
  ] = js.native
  
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  /* CompleteClass */
  var ValueChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientEdit]
  ] = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object ASPxClientDateEdit {
  
  @JSGlobal("ASPxClientDateEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientDateEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typingsJapgolly.devexpressWeb.ASPxClientDateEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devexpressWeb.ASPxClientDateEdit]
}
