package typingsJapgolly.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import typingsJapgolly.winjs.WinJS.Binding.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tab control that displays multiple items.
  **/
@JSGlobal("WinJS.UI.Pivot")
@js.native
//#region Constructors
/**
  * Creates a new Pivot.
  * @constructor
  * @param element The DOM element hosts the new Pivot.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the cancel event, add a property named "oncancel" to the options object and set its value to the event handler.
  **/
class Pivot () extends js.Object {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  /**
    * Gets or sets the left custom header.
    **/
  var customLeftHeader: HTMLElement = js.native
  /**
    * Gets or sets the right custom header.
    **/
  var customRightHeader: HTMLElement = js.native
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the Pivot control.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the Binding.List that contains the PivotItem objects that belong to this Pivot.
    **/
  var items: List[PivotItem] = js.native
  /**
    * Gets or sets a value that specifies whether the Pivot control is locked to the current item.
    **/
  var locked: Boolean = js.native
  /**
    * Gets or sets the index of the PivotItem control in view.
    **/
  var selectedIndex: Double = js.native
  /**
    * Gets or sets the PivotItem control in view within the Pivot control.
    **/
  var selectedItem: PivotItem = js.native
  /**
    * Gets or sets the title displayed above the PivotItem controls.
    **/
  var title: String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Releases resources held by this Pivot. Call this method when the Pivot is no longer needed. After calling this method, the Pivot becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Forces the control to relayout its content. This function is expected to be called
    * when the pivot element is manually resized.
    **/
  def forceLayout(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised when a PivotItem control's animation ends.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemanimationend(eventInfo: Event_): Unit = js.native
  /**
    * Raised when a PivotItem control's animation starts.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemanimationstart(eventInfo: Event_): Unit = js.native
  /**
    * Raised when the user navigates to a different PivotItem.
    * @param eventInfo An object that contains information about the event.
    **/
  def onselectionchanged(eventInfo: Event_): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.Pivot")
@js.native
object Pivot extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

