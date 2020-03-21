package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstatsc extends js.Object {
  def statsc_reset(): Double
}

object Typeofstatsc {
  @scala.inline
  def apply(statsc_reset: CallbackTo[Double]): Typeofstatsc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statsc_reset")(statsc_reset.toJsFn)
    __obj.asInstanceOf[Typeofstatsc]
  }
}

