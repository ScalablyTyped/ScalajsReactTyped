package typingsJapgolly.googleCloudPreciseDate.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Long extends js.Object {
  def toNumber(): Double
}

object Long {
  @scala.inline
  def apply(toNumber: CallbackTo[Double]): Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toNumber")(toNumber.toJsFn)
    __obj.asInstanceOf[Long]
  }
}

