package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the propertyChanged event.
  */
trait INotifyPropertyChange extends StObject {
  
  //#region Events
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def add_propertyChanged(handler: js.Function): Unit
  
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def remove_propertyChanged(handler: js.Function): Unit
}
object INotifyPropertyChange {
  
  inline def apply(add_propertyChanged: js.Function => Callback, remove_propertyChanged: js.Function => Callback): INotifyPropertyChange = {
    val __obj = js.Dynamic.literal(add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()))
    __obj.asInstanceOf[INotifyPropertyChange]
  }
  
  extension [Self <: INotifyPropertyChange](x: Self) {
    
    inline def setAdd_propertyChanged(value: js.Function => Callback): Self = StObject.set(x, "add_propertyChanged", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setRemove_propertyChanged(value: js.Function => Callback): Self = StObject.set(x, "remove_propertyChanged", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
  }
}
