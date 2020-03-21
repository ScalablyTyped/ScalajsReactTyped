package typingsJapgolly.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import typingsJapgolly.winjs.AnonNone
import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays a modal dialog which can display arbitrary HTML content.
  **/
@JSGlobal("WinJS.UI.ContentDialog")
@js.native
/**
  * Creates a new ContentDialog control.
  * @constructor
  * @param The DOM element that hosts the ContentDialog control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class ContentDialog () extends js.Object {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  /**
    * Gets the DOM element that hosts the ContentDialog control.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the ContentDialog's visibility.
    **/
  var hidden: Boolean = js.native
  /**
    * Indicates whether the button representing the primary command is currently disabled.
    **/
  var primaryCommandDisabled: Boolean = js.native
  /**
    * The text displayed on the primary command's button.
    **/
  var primaryCommandText: String = js.native
  /**
    * Indicates whether the button representing the secondary command is currently disabled.
    **/
  var secondaryCommandDisabled: Boolean = js.native
  /**
    * The text displayed on the secondary command's button.
    **/
  var secondaryCommandText: String = js.native
  /**
    * The text displayed as the title of the dialog.
    **/
  var title: String = js.native
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Disposes this control.
    **/
  def dispose(): Unit = js.native
  /**
    * Hides the ContentDialog.
    * @param result A value indicating why the dialog is being hidden. The promise returned by show will be fulfilled with this value.
    **/
  def hide(): Unit = js.native
  def hide(result: js.Any): Unit = js.native
  /**
    * Raised immediately after a dialog is fully hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterhide(eventInfo: ContentDialogHideEvent): Unit = js.native
  /**
    * Raised immediately after a dialog is fully shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onaftershow(eventInfo: Event_): Unit = js.native
  /**
    * Raised just before hiding a dialog. Call preventDefault on this event to stop the dialog from being hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforehide(eventInfo: ContentDialogHideEvent): Unit = js.native
  /**
    * Raised just before showing a dialog. Call preventDefault on this event to stop the dialog from being shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeshow(eventInfo: Event_): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Shows the ContentDialog. Only one ContentDialog may be shown at a time. If another ContentDialog is already shown, this ContentDialog will remain hidden.
    * @returns  A promise which is successfully fulfilled when the dialog is dismissed. The completion value indicates the dialog's dismissal result. This may be 'primary', 'secondary', 'none', or whatever custom value was passed to hide. If this ContentDialog cannot be shown because a ContentDialog is already showing or the ContentDialog is disposed, then the return value is a promise which is in an error state. If preventDefault() is called on the beforeshow event, then this promise will be canceled.
    **/
  def show(): Promise[ContentDialogHideInfo] = js.native
}

/* static members */
@JSGlobal("WinJS.UI.ContentDialog")
@js.native
object ContentDialog extends js.Object {
  /**
    * Specifies the result of dismissing the ContentDialog.
    **/
  var DismissalResult: AnonNone = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

