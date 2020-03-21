package typingsJapgolly.leapmotionts.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  def onConnect(controller: Controller): Unit
  def onDisconnect(controller: Controller): Unit
  def onExit(controller: Controller): Unit
  def onFrame(controller: Controller, frame: Frame): Unit
  def onInit(controller: Controller): Unit
}

object Listener {
  @scala.inline
  def apply(
    onConnect: Controller => Callback,
    onDisconnect: Controller => Callback,
    onExit: Controller => Callback,
    onFrame: (Controller, Frame) => Callback,
    onInit: Controller => Callback
  ): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onConnect")(js.Any.fromFunction1((t0: typingsJapgolly.leapmotionts.mod.Controller) => onConnect(t0).runNow()))
    __obj.updateDynamic("onDisconnect")(js.Any.fromFunction1((t0: typingsJapgolly.leapmotionts.mod.Controller) => onDisconnect(t0).runNow()))
    __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: typingsJapgolly.leapmotionts.mod.Controller) => onExit(t0).runNow()))
    __obj.updateDynamic("onFrame")(js.Any.fromFunction2((t0: typingsJapgolly.leapmotionts.mod.Controller, t1: typingsJapgolly.leapmotionts.mod.Frame) => onFrame(t0, t1).runNow()))
    __obj.updateDynamic("onInit")(js.Any.fromFunction1((t0: typingsJapgolly.leapmotionts.mod.Controller) => onInit(t0).runNow()))
    __obj.asInstanceOf[Listener]
  }
}

