package typingsJapgolly.doubleclickGpt.googletag

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandArray extends js.Object {
  def push(f: js.Function0[Unit]): Double
}

object CommandArray {
  @scala.inline
  def apply(push: js.Function0[Unit] => CallbackTo[Double]): CommandArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => push(t0).runNow()))
    __obj.asInstanceOf[CommandArray]
  }
}

