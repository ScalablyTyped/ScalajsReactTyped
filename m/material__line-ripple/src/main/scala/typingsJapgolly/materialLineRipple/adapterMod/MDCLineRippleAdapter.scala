package typingsJapgolly.materialLineRipple.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCLineRippleAdapter extends js.Object {
  /**
    * Adds a class to the line ripple element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event listener on the line ripple element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit
  def hasClass(className: String): Boolean
  /**
    * Registers an event listener on the line ripple element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes a class from the line ripple element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the style property with propertyName to value on the root element.
    */
  def setStyle(propertyName: String, value: String): Unit
}

object MDCLineRippleAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterEventHandler: (String, EventListener) => Callback,
    hasClass: String => CallbackTo[Boolean],
    registerEventHandler: (String, EventListener) => Callback,
    removeClass: String => Callback,
    setStyle: (String, String) => Callback
  ): MDCLineRippleAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterEventHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("registerEventHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyle(t0, t1).runNow()))
    __obj.asInstanceOf[MDCLineRippleAdapter]
  }
}

