package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsst extends js.Object {
  def sst_check_min(flag: Double): Double
}

object Typeofsst {
  @scala.inline
  def apply(sst_check_min: Double => CallbackTo[Double]): Typeofsst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sst_check_min")(js.Any.fromFunction1((t0: scala.Double) => sst_check_min(t0).runNow()))
    __obj.asInstanceOf[Typeofsst]
  }
}

