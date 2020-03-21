package typingsJapgolly.betterScroll

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var style: String
  def fn(t: Double): Double
}

object AnonFn {
  @scala.inline
  def apply(fn: Double => CallbackTo[Double], style: String): AnonFn = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction1((t0: scala.Double) => fn(t0).runNow()))
    __obj.asInstanceOf[AnonFn]
  }
}

