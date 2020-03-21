package typingsJapgolly.tweenJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNone extends js.Object {
  def None(k: Double): Double
}

object AnonNone {
  @scala.inline
  def apply(None: Double => CallbackTo[Double]): AnonNone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("None")(js.Any.fromFunction1((t0: scala.Double) => None(t0).runNow()))
    __obj.asInstanceOf[AnonNone]
  }
}

