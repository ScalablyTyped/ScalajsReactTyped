package typingsJapgolly.brorand.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rand extends js.Object {
  def getByte(): Double
}

object rand {
  @scala.inline
  def apply(getByte: CallbackTo[Double]): rand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getByte")(getByte.toJsFn)
    __obj.asInstanceOf[rand]
  }
}

