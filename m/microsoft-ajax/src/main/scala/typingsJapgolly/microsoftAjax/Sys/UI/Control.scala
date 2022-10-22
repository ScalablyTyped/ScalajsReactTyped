package typingsJapgolly.microsoftAjax.Sys.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the base class for all all ASP.NET AJAX client controls.
  */
trait Control
  extends StObject
     with Component {
  
  //#endregion
  //#region Methods
  /**
    * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
    * @param className
    *          A string that contains the name of the CSS class to add.
    */
  def addCssClass(className: String): Unit
  
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
    * @return The DOM element that the current Control object is associated with.
    */
  def get_element(): HTMLElement
  
  /**
    * Called when an event is raised by the raiseBubbleEvent method.
    *
    * The onBubbleEvent method returns false to make sure that unhandled events propagate (bubble) to the parent control.
    * In derived classes, you should override the onBubbleEvent method and return true when events are handled to prevent the events from bubbling further.
    * For an explanation of bubbling, see Sys.UI.Control raiseBubbleEvent Method.
    *
    * @param source
    *          The object that triggered the event.
    * @param args
    *          The event arguments.
    * @return
    *      false in all cases.
    */
  def onBubbleEvent(source: Any, args: Any): Boolean
  
  /**
    * Calls the onBubbleEvent method of the parent control.
    *
    * When the raiseBubbleEvent method is called, the source object and args values are sent to the onBubbleEvent handler of the current control.
    * If onBubbleEvent returns false, they are sent to the onBubbleEvent handler of the parent control.
    * This process continues until an onBubbleEvent event handler returns true, which indicates that the event has been handled.
    * Any event that bubbles to the Sys.Application instance without being handled is ignored.
    *
    * @param source
    *          The object that triggered the event.
    * @param args
    *          The event arguments.
    */
  def raiseBubbleEvent(source: Any, args: Any): Unit
  
  /**
    * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
    *
    * @param className
    *          A string that contains the name of the CSS class to remove.
    */
  def removeCssClass(className: String): Unit
  
  /**
    * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
    * @param className
    *          A string that contains the name of the CSS class to toggle.
    */
  def toggleCssClass(className: String): Unit
}
object Control {
  
  inline def apply(
    addCssClass: String => Callback,
    add_disposing: js.Function => Callback,
    add_propertyChanged: js.Function => Callback,
    beginUpdate: Callback,
    dispose: Callback,
    endUpdate: Callback,
    get_element: CallbackTo[HTMLElement],
    get_events: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    initialize: Callback,
    onBubbleEvent: (Any, Any) => Boolean,
    raiseBubbleEvent: (Any, Any) => Callback,
    raisePropertyChanged: String => Callback,
    removeCssClass: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    set_id: String => Callback,
    toggleCssClass: String => Callback,
    updated: Callback
  ): Control = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, initialize = initialize.toJsFn, onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updated = updated.toJsFn)
    __obj.asInstanceOf[Control]
  }
  
  extension [Self <: Control](x: Self) {
    
    inline def setAddCssClass(value: String => Callback): Self = StObject.set(x, "addCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGet_element(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "get_element", value.toJsFn)
    
    inline def setOnBubbleEvent(value: (Any, Any) => Boolean): Self = StObject.set(x, "onBubbleEvent", js.Any.fromFunction2(value))
    
    inline def setRaiseBubbleEvent(value: (Any, Any) => Callback): Self = StObject.set(x, "raiseBubbleEvent", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemoveCssClass(value: String => Callback): Self = StObject.set(x, "removeCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToggleCssClass(value: String => Callback): Self = StObject.set(x, "toggleCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
