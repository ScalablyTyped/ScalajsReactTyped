package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the base class for the Control and Behavior classes, and for any other object whose lifetime should be managed by the ASP.NET AJAX client library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397516(v=vs.100).aspx}
  */
trait Component extends StObject {
  
  //#endregion
  //#region Events
  /**
    * Raised when the dispose method is called for a component.
    */
  def add_disposing(handler: js.Function): Unit
  
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  def add_propertyChanged(handler: js.Function): Unit
  
  //#endregion
  //#region Methods
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has begun.
    */
  def beginUpdate(): Unit
  
  /**
    * Raises the disposing event of the current Component and removes the component from the application.
    */
  def dispose(): Unit
  
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has finished.
    * This method is called by the create method ($create).
    * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
    */
  def endUpdate(): Unit
  
  //#endregion
  //#region Properties
  /**
    * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
    * This member supports the client-script infrastructure and is not intended to be used directly from your code.
    * @return
    *      An EventHandlerList object that contains references to all the events and handlers for this component.
    */
  def get_events(): Any
  
  /**
    * Gets the ID of the current Component object.
    * @return
    *       The id
    */
  def get_id(): String
  
  /**
    * Gets a value indicating whether the current Component object is initialized.
    * @return
    *      true if the current Component is initialized; otherwise, false.
    */
  def get_isInitialized(): Boolean
  
  /**
    * Gets a value indicating whether the current Component object is updating.
    * @return
    *      true if the current Component object is updating; otherwise, false.
    */
  def get_isUpdating(): Boolean
  
  /**
    * Initializes the current Component object.
    * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
    */
  def initialize(): Unit
  
  /**
    * Raises the propertyChanged event for the specified property.
    * @param propertyName
    *               The name of the property that changed.
    */
  def raisePropertyChanged(propertyName: String): Unit
  
  /**
    * Raised when the dispose method is called for a component.
    */
  def remove_disposing(handler: js.Function): Unit
  
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  def remove_propertyChanged(handler: js.Function): Unit
  
  /**
    * Sets the ID of the current Component object.
    * @param value A string that contains the ID of the component.
    */
  def set_id(value: String): Unit
  
  /**
    * Called by the endUpdate method as a placeholder for additional logic in derived classes.
    * Override the updated method in a derived class to add custom post-update logic.
    */
  def updated(): Unit
}
object Component {
  
  inline def apply(
    add_disposing: js.Function => Callback,
    add_propertyChanged: js.Function => Callback,
    beginUpdate: Callback,
    dispose: Callback,
    endUpdate: Callback,
    get_events: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    initialize: Callback,
    raisePropertyChanged: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    set_id: String => Callback,
    updated: Callback
  ): Component = {
    val __obj = js.Dynamic.literal(add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, initialize = initialize.toJsFn, raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), updated = updated.toJsFn)
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setAdd_disposing(value: js.Function => Callback): Self = StObject.set(x, "add_disposing", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setAdd_propertyChanged(value: js.Function => Callback): Self = StObject.set(x, "add_propertyChanged", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setBeginUpdate(value: Callback): Self = StObject.set(x, "beginUpdate", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setEndUpdate(value: Callback): Self = StObject.set(x, "endUpdate", value.toJsFn)
    
    inline def setGet_events(value: CallbackTo[Any]): Self = StObject.set(x, "get_events", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_isInitialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isInitialized", value.toJsFn)
    
    inline def setGet_isUpdating(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isUpdating", value.toJsFn)
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setRaisePropertyChanged(value: String => Callback): Self = StObject.set(x, "raisePropertyChanged", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemove_disposing(value: js.Function => Callback): Self = StObject.set(x, "remove_disposing", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setRemove_propertyChanged(value: js.Function => Callback): Self = StObject.set(x, "remove_propertyChanged", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setSet_id(value: String => Callback): Self = StObject.set(x, "set_id", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdated(value: Callback): Self = StObject.set(x, "updated", value.toJsFn)
  }
}
