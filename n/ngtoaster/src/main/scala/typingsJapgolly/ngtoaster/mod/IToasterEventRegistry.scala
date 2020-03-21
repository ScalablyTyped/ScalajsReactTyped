package typingsJapgolly.ngtoaster.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterEventRegistry extends js.Object {
  def setup(): Unit
  def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit
  def subscribeToNewToastEvent(onNewToast: IToastEventListener): Unit
  def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit
  def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): Unit
}

object IToasterEventRegistry {
  @scala.inline
  def apply(
    setup: Callback,
    subscribeToClearToastsEvent: IToastEventListener => Callback,
    subscribeToNewToastEvent: IToastEventListener => Callback,
    unsubscribeToClearToastsEvent: IToastEventListener => Callback,
    unsubscribeToNewToastEvent: IToastEventListener => Callback
  ): IToasterEventRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setup")(setup.toJsFn)
    __obj.updateDynamic("subscribeToClearToastsEvent")(js.Any.fromFunction1((t0: typingsJapgolly.ngtoaster.mod.IToastEventListener) => subscribeToClearToastsEvent(t0).runNow()))
    __obj.updateDynamic("subscribeToNewToastEvent")(js.Any.fromFunction1((t0: typingsJapgolly.ngtoaster.mod.IToastEventListener) => subscribeToNewToastEvent(t0).runNow()))
    __obj.updateDynamic("unsubscribeToClearToastsEvent")(js.Any.fromFunction1((t0: typingsJapgolly.ngtoaster.mod.IToastEventListener) => unsubscribeToClearToastsEvent(t0).runNow()))
    __obj.updateDynamic("unsubscribeToNewToastEvent")(js.Any.fromFunction1((t0: typingsJapgolly.ngtoaster.mod.IToastEventListener) => unsubscribeToNewToastEvent(t0).runNow()))
    __obj.asInstanceOf[IToasterEventRegistry]
  }
}

