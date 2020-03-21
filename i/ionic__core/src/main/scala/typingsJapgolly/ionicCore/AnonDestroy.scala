package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit
  def setDisabled(disabled: Boolean): Unit
  def stop(): Unit
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: Callback, setDisabled: Boolean => Callback, stop: Callback): AnonDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisabled(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[AnonDestroy]
  }
}

