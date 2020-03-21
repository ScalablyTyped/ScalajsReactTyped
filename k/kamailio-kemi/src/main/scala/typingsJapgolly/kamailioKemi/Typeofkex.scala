package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkex extends js.Object {
  def resetdebug(): Double
  def setdebug(lval: Double): Double
}

object Typeofkex {
  @scala.inline
  def apply(resetdebug: CallbackTo[Double], setdebug: Double => CallbackTo[Double]): Typeofkex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resetdebug")(resetdebug.toJsFn)
    __obj.updateDynamic("setdebug")(js.Any.fromFunction1((t0: scala.Double) => setdebug(t0).runNow()))
    __obj.asInstanceOf[Typeofkex]
  }
}

