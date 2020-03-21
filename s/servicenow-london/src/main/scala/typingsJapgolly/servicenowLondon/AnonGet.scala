package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(index: Double): String
  def size(): Double
}

object AnonGet {
  @scala.inline
  def apply(get: Double => CallbackTo[String], size: CallbackTo[Double]): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[AnonGet]
  }
}

