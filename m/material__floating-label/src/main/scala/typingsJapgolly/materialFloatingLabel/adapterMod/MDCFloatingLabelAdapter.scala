package typingsJapgolly.materialFloatingLabel.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFloatingLabelAdapter extends js.Object {
  /**
    * Adds a class to the label element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Returns the width of the label element.
    */
  def getWidth(): Double
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes a class from the label element.
    */
  def removeClass(className: String): Unit
}

object MDCFloatingLabelAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    getWidth: CallbackTo[Double],
    registerInteractionHandler: (String, EventListener) => Callback,
    removeClass: String => Callback
  ): MDCFloatingLabelAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.asInstanceOf[MDCFloatingLabelAdapter]
  }
}

