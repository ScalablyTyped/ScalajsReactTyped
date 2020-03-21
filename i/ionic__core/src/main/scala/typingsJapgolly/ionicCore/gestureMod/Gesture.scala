package typingsJapgolly.ionicCore.gestureMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gesture extends js.Object {
  def destroy(): Unit
  def setDisabled(disabled: Boolean): Unit
}

object Gesture {
  @scala.inline
  def apply(destroy: Callback, setDisabled: Boolean => Callback): Gesture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisabled(t0).runNow()))
    __obj.asInstanceOf[Gesture]
  }
}

