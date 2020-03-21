package typingsJapgolly.winjs.WinJS.UI

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows users to select time values.
  **/
@JSGlobal("WinJS.UI.TimePicker")
@js.native
//#region Constructors
/**
  * Initializes a new instance of a TimePicker control.
  * @constructor
  * @param element The DOM element associated with the TimePicker control.
  * @param options The set of options to be applied initially to the TimePicker control. The options are the following: clock.
  **/
class TimePicker () extends js.Object {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the type of clock to display (12HourClock or 24HourClock). It defaults to the user setting.
    **/
  var clock: String = js.native
  /**
    * Gets or sets the current time of the TimePicker. Note that the date value is always July 15, 2011.
    **/
  var current: js.Date = js.native
  /**
    * Specifies whether the TimePicker is disabled.
    **/
  var disabled: Boolean = js.native
  /**
    * Gets the DOM element for the TimePicker.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the display pattern for the hour. The default hour pattern is hour.integer(2). You can change the hour pattern by changing the number of integers displayed.
    **/
  var hourPattern: String = js.native
  /**
    * Gets or sets the minute increment. For example, 15 specifies that the TimePicker minute control should display only the choices 00, 15, 30, 45.
    **/
  var minuteIncrement: Double = js.native
  /**
    * Gets or sets the display pattern for the minute. The default minute pattern is minute.integer(2). You can change the minute pattern by changing the number of integers displayed.
    **/
  var minutePattern: String = js.native
  /**
    * Gets or sets the display pattern for the period. The default period pattern is period.abbreviated(2). You can change the period pattern by changing the number of integers displayed.
    **/
  var periodPattern: String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Adds an event listener.
    * @param type The type (name) of the event.
    * @param listener The function that handles the event.
    * @param capture If true, specifies that capture should be initiated, otherwise false.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, capture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Releases resources held by this TimePicker. Call this method when the TimePicker is no longer needed. After calling this method, the TimePicker becomes unusable.
    **/
  def dispose(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when any of the controls are changed by the user.
    * @param eventInfo An object that contains information about the event.
    **/
  def onchange(eventInfo: CustomEvent): Unit = js.native
  /**
    * Removes a listener for the specified event.
    * @param type The name of the event for which to remove a listener.
    * @param listener The listener.
    * @param useCapture Optional. The same value that was passed to addEventListener for this listener. It may be omitted if it was omitted when calling addEventListener.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.TimePicker")
@js.native
object TimePicker extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  def getInformation(clock: js.Any, minuteIncrement: js.Any): js.Any = js.native
  def getInformation(clock: js.Any, minuteIncrement: js.Any, timerPatterns: js.Any): js.Any = js.native
}

