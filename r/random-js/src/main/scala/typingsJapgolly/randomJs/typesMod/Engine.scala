package typingsJapgolly.randomJs.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  def next(): Double
}

object Engine {
  @scala.inline
  def apply(next: CallbackTo[Double]): Engine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Engine]
  }
}

