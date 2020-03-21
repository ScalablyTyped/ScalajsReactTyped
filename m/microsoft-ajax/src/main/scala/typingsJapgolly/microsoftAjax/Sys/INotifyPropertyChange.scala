package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the propertyChanged event.
  */
trait INotifyPropertyChange extends js.Object {
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
  @scala.inline
  def apply(add_propertyChanged: js.Function => Callback, remove_propertyChanged: js.Function => Callback): INotifyPropertyChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_propertyChanged")(js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()))
    __obj.updateDynamic("remove_propertyChanged")(js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()))
    __obj.asInstanceOf[INotifyPropertyChange]
  }
}

