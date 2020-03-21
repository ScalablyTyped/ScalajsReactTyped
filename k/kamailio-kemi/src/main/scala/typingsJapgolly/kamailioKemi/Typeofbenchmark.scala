package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbenchmark extends js.Object {
  def bm_log_timer(tname: String): Double
  def bm_start_timer(tname: String): Double
}

object Typeofbenchmark {
  @scala.inline
  def apply(bm_log_timer: String => CallbackTo[Double], bm_start_timer: String => CallbackTo[Double]): Typeofbenchmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bm_log_timer")(js.Any.fromFunction1((t0: java.lang.String) => bm_log_timer(t0).runNow()))
    __obj.updateDynamic("bm_start_timer")(js.Any.fromFunction1((t0: java.lang.String) => bm_start_timer(t0).runNow()))
    __obj.asInstanceOf[Typeofbenchmark]
  }
}

