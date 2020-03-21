package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates that the type that implements the interface provides disposing notifications.
  * Implement this interface if the class must notify other objects when it is releasing resources. The base component class already implements this interface. Therefore, typically this interface is already available.
  */
trait INotifyDisposing extends js.Object {
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
  @scala.inline
  def apply(add_disposing: js.Function => Callback, remove_disposing: js.Function => Callback): INotifyDisposing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_disposing")(js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()))
    __obj.updateDynamic("remove_disposing")(js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()))
    __obj.asInstanceOf[INotifyDisposing]
  }
}

