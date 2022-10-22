package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates that the type that implements the interface provides disposing notifications.
  * Implement this interface if the class must notify other objects when it is releasing resources. The base component class already implements this interface. Therefore, typically this interface is already available.
  */
trait INotifyDisposing extends StObject {
  
  //#region Events
  /**
    * Occurs when an object's resources are released.
    * @param handler
    *       The name of the event handler for the disposing event.
    */
  def add_disposing(handler: js.Function): Unit
  
  /**
    * Occurs when an object's resources are released.
    * @param handler
    *       The name of the event handler for the disposing event.
    */
  def remove_disposing(handler: js.Function): Unit
}
object INotifyDisposing {
  
  inline def apply(add_disposing: js.Function => Callback, remove_disposing: js.Function => Callback): INotifyDisposing = {
    val __obj = js.Dynamic.literal(add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()))
    __obj.asInstanceOf[INotifyDisposing]
  }
  
  extension [Self <: INotifyDisposing](x: Self) {
    
    inline def setAdd_disposing(value: js.Function => Callback): Self = StObject.set(x, "add_disposing", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setRemove_disposing(value: js.Function => Callback): Self = StObject.set(x, "remove_disposing", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
  }
}
