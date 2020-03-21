package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstatistics extends js.Object {
  def reset_stat(sname: String): Double
  def update_stat(sname: String, sval: Double): Double
}

object Typeofstatistics {
  @scala.inline
  def apply(reset_stat: String => CallbackTo[Double], update_stat: (String, Double) => CallbackTo[Double]): Typeofstatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset_stat")(js.Any.fromFunction1((t0: java.lang.String) => reset_stat(t0).runNow()))
    __obj.updateDynamic("update_stat")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => update_stat(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofstatistics]
  }
}

