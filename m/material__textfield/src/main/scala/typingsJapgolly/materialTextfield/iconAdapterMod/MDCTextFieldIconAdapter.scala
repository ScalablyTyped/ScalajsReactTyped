package typingsJapgolly.materialTextfield.iconAdapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTextFieldIconAdapter extends js.Object {
  /**
    * Deregisters an event listener on the icon element for a given event.
    */
  def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Gets the value of an attribute on the icon element.
    */
  def getAttr(attr: String): String
  /**
    * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
    */
  def notifyIconAction(): Unit
  /**
    * Registers an event listener on the icon element for a given event.
    */
  def registerInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes an attribute from the icon element.
    */
  def removeAttr(attr: String): Unit
  /**
    * Sets an attribute on the icon element.
    */
  def setAttr(attr: String, value: String): Unit
}

object MDCTextFieldIconAdapter {
  @scala.inline
  def apply(
    deregisterInteractionHandler: (String, EventListener) => Callback,
    getAttr: String => CallbackTo[String],
    notifyIconAction: Callback,
    registerInteractionHandler: (String, EventListener) => Callback,
    removeAttr: String => Callback,
    setAttr: (String, String) => Callback
  ): MDCTextFieldIconAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("getAttr")(js.Any.fromFunction1((t0: java.lang.String) => getAttr(t0).runNow()))
    __obj.updateDynamic("notifyIconAction")(notifyIconAction.toJsFn)
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeAttr")(js.Any.fromFunction1((t0: java.lang.String) => removeAttr(t0).runNow()))
    __obj.updateDynamic("setAttr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttr(t0, t1).runNow()))
    __obj.asInstanceOf[MDCTextFieldIconAdapter]
  }
}

