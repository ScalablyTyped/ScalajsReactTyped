package typingsJapgolly.materialTab.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Returns whether the root element has the given className.
    */
  def hasClass(className: String): Boolean
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes the given className from the root element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the given attrName of the root element to the given value.
    */
  def setAttr(attr: String, value: String): Unit
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterEventHandler: (String, EventListener) => Callback,
    hasClass: String => CallbackTo[Boolean],
    registerEventHandler: (String, EventListener) => Callback,
    removeClass: String => Callback,
    setAttr: (String, String) => Callback
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterEventHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("registerEventHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setAttr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttr(t0, t1).runNow()))
    __obj.asInstanceOf[MDCTabAdapter]
  }
}

