package typingsJapgolly.microsoftAjax.Sys.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a base class for all ASP.NET AJAX client behaviors.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311020(v=vs.100).aspx}
  */
trait Behavior
  extends StObject
     with Component {
  
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Behavior object is associated with.
    * @return The DOM element that the current Behavior object is associated with.
    */
  def get_element(): HTMLElement
  
  /**
    * Gets or sets the name of the Sys.UI.Behavior object.
    */
  def get_name(): String
  
  /*
    * Gets or sets the name of the Sys.UI.Behavior object.
    * If you do not explicitly set the name property, getting the property value sets it to its default value, which is equal to the type of the Behavior object. The name property remains null until it is accessed.
    * @param value
    *           A string value to use as the name.
    */
  def set_name(value: String): Unit
}
object Behavior {
  
  inline def apply(
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
    get_name: CallbackTo[String],
    initialize: Callback,
    raisePropertyChanged: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    set_id: String => Callback,
    set_name: String => Callback,
    updated: Callback
  ): Behavior = {
    val __obj = js.Dynamic.literal(add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_name = get_name.toJsFn, initialize = initialize.toJsFn, raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_name = js.Any.fromFunction1((t0: String) => set_name(t0).runNow()), updated = updated.toJsFn)
    __obj.asInstanceOf[Behavior]
  }
  
  extension [Self <: Behavior](x: Self) {
    
    inline def setGet_element(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "get_element", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setSet_name(value: String => Callback): Self = StObject.set(x, "set_name", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
