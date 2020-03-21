package typingsJapgolly.flatpickr.globalsMod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  def fp_incr(n: Double): Date
}

object Date {
  @scala.inline
  def apply(fp_incr: Double => CallbackTo[Date]): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fp_incr")(js.Any.fromFunction1((t0: scala.Double) => fp_incr(t0).runNow()))
    __obj.asInstanceOf[Date]
  }
}

