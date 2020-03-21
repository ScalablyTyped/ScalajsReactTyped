package typingsJapgolly.materialFormField.adapterMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFormFieldAdapter extends js.Object {
  def activateInputRipple(): Unit
  def deactivateInputRipple(): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
}

object MDCFormFieldAdapter {
  @scala.inline
  def apply(
    activateInputRipple: Callback,
    deactivateInputRipple: Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    registerInteractionHandler: (String, EventListener) => Callback
  ): MDCFormFieldAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateInputRipple")(activateInputRipple.toJsFn)
    __obj.updateDynamic("deactivateInputRipple")(deactivateInputRipple.toJsFn)
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.asInstanceOf[MDCFormFieldAdapter]
  }
}

